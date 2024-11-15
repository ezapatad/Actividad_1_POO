'''
Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud
de la circunferencia.
'''
import math
def circunference(r):
    area=math.pi*(r**2)
    perimeter=2*math.pi*r
    print(f'Perímetro: {perimeter}, Área: {area}')

number=float(input('Ingrese un número: '))
while number<0:
    number=float(input('Ingrese un número válido: ' ))

circunference(number)