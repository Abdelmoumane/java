# CuentaBancaria

`CuentaBancaria` es una **clase abstracta** que representa las operaciones básicas de una cuenta bancaria. Contiene atributos y métodos comunes para distintos tipos de cuentas.

---

## 🧾 Atributos

- `private String iban`: Número de cuenta bancaria internacional.
- `protected int saldo`: Saldo actual de la cuenta.
- `private static final int interesAnualBasico`: Interés anual básico aplicado a todas las cuentas.

---

## 🔧 Métodos

### `public String getIban()`
Devuelve el número IBAN de la cuenta.

### `public int getSaldo()`
Devuelve el saldo actual de la cuenta.

### `public static int getInteresAnualBasico()`
Devuelve el valor del interés anual básico.

### `public void ingresar(int cantidad)`
Suma la cantidad indicada al saldo de la cuenta.

### `public void retirar(int cantidad)`
Resta la cantidad del saldo si hay suficiente dinero.

### `public void traspasar(CuentaBancaria destino, int cantidad)`
Transfiere dinero desde esta cuenta a otra cuenta bancaria.

### `public abstract void calcularIntereses()`
Método abstracto que debe implementarse en las clases hijas para calcular los intereses.

---

## 🧬 Clases hijas

- [`CuentaCorriente`](../cuentacorriente/index.md)
- [`CuentaAhorro`](../cuentaahorro/index.md)

---

## 📌 Notas

- No se puede crear una instancia directamente de `CuentaBancaria`.
- Cada subclase debe definir cómo se calculan los intereses, dependiendo de sus reglas específicas.

