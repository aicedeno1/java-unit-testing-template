package ec.espe.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PropinaTest {

  @Test
  void totalConPropina_calculaPropinaNormal() {
    double obtenido = Propina.totalConPropina(100.0, 10.0);
    assertEquals(110.0, obtenido, 0.000001);
  }

  @Test
  void totalConPropina_subtotalNegativo_lanzaExcepcion() {
    assertThrows(IllegalArgumentException.class,
        () -> Propina.totalConPropina(-1.0, 10.0));
  }

  @Test
  void totalConPropina_porcentajeCero_devuelveSubtotal() {
    double obtenido = Propina.totalConPropina(100.0, 0.0);
    assertEquals(100.0, obtenido, 0.000001);
  }

  @Test
  void totalConPropina_porcentajeCien_duplicaSubtotal() {
    double obtenido = Propina.totalConPropina(50.0, 100.0);
    assertEquals(100.0, obtenido, 0.000001);
  }
}
