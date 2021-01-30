# Graficador de Funciones

<img src="./test/prueba_numeros_chicos.png">

<img src="./test/prueba_numeros_grandes.png">

Por cada par de funciones f(n) y g(n), escribir si f(n) = Ω(g(n)) , si f(n) = O(g(n)), o bien si f(n) = Θ(g(n)) o decir si ninguna relaci´on se cumple. Desarrollar de manera a veriﬁcar los resultados obtenidos. Utilizar alguna librer´ıa Java para graﬁcar las funciones, de manera a corroborar las cotas obtenidas.

1. | f(n) | g(n) |
2. | ----------------------- | --------------------- |
3. | n - 100 | n - 200 |
4. | n<sup>2</sup> | n<sup>2/3<sup> |
5. | 10.log(n) | log(n<sup>2</sup>) |
6. | log(n)<sup>log(n)</sup> | n/log(n) |
7. | n<sup> 1/2 </sup> | (log(n))<sup>3</sup> |
8. | n.2<sup> n</sup> | 3<sup> n</sup> |
9. | n! | (n+1)! |
10. | n.log(n) | 10.n.log(10n) |
11. | n<sup>1.01</sup> | (log(n))<sup>3</sup> |
12. | n.2<sup> n</sup> | 5<sup> log(n)</sup> |
13. | n.2<sup> n</sup> | n.log(n)<sup> 2</sup> |

# Observacion:

    Utilizamos la libreria de xchart para poder graficar.
    Para las funciones 8 y 9, obtenemos numero que son extremadamente grande por lo tanto tendra un overflow. Asi que sus graficos no estarian muy bien pero para numeros no muy grandes se notaria mejor.
    Utilizado en VSCode.
