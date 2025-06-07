# Lección: Manejo de Excepciones en Java (`try`, `catch`, `finally`)

## 🎯 Objetivo

Comprender cómo funcionan los bloques `try`, `catch` y `finally` en Java, y cómo interactúan con `return` y excepciones.

---

## 🧠 Reglas Clave

| Situación                               | Resultado                                                         |
|----------------------------------------|-------------------------------------------------------------------|
| `return` en `try`, sin `return` en `finally` | Se ejecuta `finally`, luego se devuelve el valor del `try`        |
| `return` en `try` y en `finally`       | Gana el `return` del `finally` (anula el del `try`)              |
| Excepción en `try`, `return` en `finally` | El `return` en `finally` oculta la excepción                     |
| `return` en `try`, `throw` en `finally` | Se lanza la excepción de `finally`, anulando el `return`         |

---

## 🧪 Ejemplos clave

### ✅ Ejemplo 1: `return` en `try`, sin `return` en `finally`

```java
public static int ejemplo1() {
    try {
        return 1;
    } finally {
        System.out.println("En finally");
    }
}
Salida:

En finally
1
---
❗ Ejemplo 2: return en try y en finally


public static int ejemplo2() {
    try {
        return 1;
    } finally {
        return 2;
    }
}
Salida:

2
---
🚫 Ejemplo 3: return en try, throw en finally
java
Copy
Edit
public static int ejemplo3() {
    try {
        return 1;
    } finally {
        throw new RuntimeException("Error en finally");
    }
}
Salida:

Exception: Error en finally

---
🔁 Ejemplo 4: Excepción en try, return en finally

public static int ejemplo4() {
    try {
        int x = 10 / 0;
        return 5;
    } finally {
        return 100;
    }
}
Salida:

100

---
🧨 Tres Excepciones Comunes

1. ArrayIndexOutOfBoundsException

int[] arr = new int[2];
System.out.println(arr[5]); // índice fuera de rango
2. NumberFormatException
---
int num = Integer.parseInt("abc"); // texto no convertible
3. NullPointerException

---
String s = null;
System.out.println(s.length()); // acceso a null
🔷 Ejemplo Completo: Propagación de Excepciones

---
public class PropagaExcepcion {
    private static void metodo2() throws ArrayIndexOutOfBoundsException {
        try {
            System.out.println("2.1");
            int[] arr = new int[2];
            System.out.println(arr[5]); // Lanza excepción
            System.out.println("2.2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2.3");
            throw e; // se propaga
        } catch (Exception e) {
            System.out.println("2.4");
        } finally {
            System.out.println("2.5");
        }
    }

    public static void metodo1() {
        try {
            System.out.println("1.1");
            metodo2();
            System.out.println("1.2");
        } catch (Exception e) {
            System.out.println("1.3");
        } finally {
            System.out.println("1.4");
        }
    }
}
# Preguntas sobre Propagación de Excepciones

## 🧩 Pregunta a)

### ❓ ¿Qué ocurre al ejecutar `PropagaExcepcion.metodo1();`
(lanzando `ArrayIndexOutOfBoundsException` en `metodo2()`)

### ✅ Ejecución paso a paso

1. `metodo1()` comienza:
    - Imprime: `1.1`
2. Llama a `metodo2()`:
    - Imprime: `2.1`
    - Se lanza `ArrayIndexOutOfBoundsException` en `arr[5]`
    - Va al primer `catch`: imprime `2.3`
    - Lanza la excepción nuevamente: `throw e`
    - Ejecuta `finally`: imprime `2.5`
3. Regresa a `metodo1()`:
    - Captura la excepción en `catch (Exception e)`: imprime `1.3`
    - Ejecuta `finally`: imprime `1.4`

### 🖨️ Salida esperada

1.1
2.1
2.3
2.5
1.3
1.4


---

## 🧩 Pregunta a.2)

### ❓ ¿Qué pasa si en lugar de `ArrayIndexOutOfBoundsException` se lanza `NumberFormatException`?

> Reemplazamos la instrucción por:
```java
int x = Integer.parseInt("abc"); // Lanza NumberFormatException
✅ Ejecución paso a paso
metodo1() comienza:

Imprime: 1.1

Llama a metodo2():

Imprime: 2.1

Se lanza NumberFormatException

Va al segundo catch (Exception e): imprime 2.4

Ejecuta finally: imprime 2.5

Regresa a metodo1():

Captura la excepción: imprime 1.3

Ejecuta finally: imprime 1.4

🖨️ Salida esperada

1.1  
2.1  
2.4  
2.5  
1.3  
1.4

## 🧩 Pregunta b)
❓ ¿Qué pasa si no se lanza ninguna excepción?
Quitamos la instrucción que lanza la excepción en metodo2().

✅ Ejecución paso a paso
metodo1() comienza:

Imprime: 1.1

Llama a metodo2():

Imprime: 2.1

Imprime: 2.2 (no hay excepción)

No entra en ningún catch

Ejecuta finally: imprime 2.5

Regresa a metodo1():

Imprime: 1.2

Ejecuta finally: imprime 1.4

🖨️ Salida esperada

1.1  
2.1  
2.2  
2.5  
1.2  
1.4



---
🧩 Ejercicio Final
Enunciado

public class ExcepcionEjemplo {
    public static int test() {
        try {
            int x = Integer.parseInt("abc");
            return 1;
        } catch (NumberFormatException e) {
            System.out.println("¡Formato inválido!");
            return 2;
        } finally {
            System.out.println("Bloque finally ejecutado");
        }
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + test());
    }
}

✅ Salida esperada

¡Formato inválido!
Bloque finally ejecutado
Resultado: 2
---
📝 Conclusiones
El bloque finally siempre se ejecuta.

Si finally tiene return o throw, anula lo anterior.

Usar return en finally puede ocultar errores.