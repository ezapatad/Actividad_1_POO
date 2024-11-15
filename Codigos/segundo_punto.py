'''
Hacer un seguimiento (prueba de escritorio) del siguiente grupo de instrucciones.
INICIO
SUMA = 0
X = 20
SUMA = SUMA + X
Y = 40
X = X + Y ** 2
SUMA = SUMA + X / Y
ESCRIBA: “EL VALOR DE LA SUMA ES:”, SUMA
FIN_INICIO
Prueba de escritorio

SUMA X Y
0 20 40
20 1620

60.5
'''
x=20
suma=0
suma+=x
y=40
x+=y**2
suma+=x/y
print(f'EL VALOR DE LA SUMA ES: {suma}')