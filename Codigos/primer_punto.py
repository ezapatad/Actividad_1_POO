'''
A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su
edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es
la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro.
'''
edJuan=int(input())
edAlber=(2/3)*edJuan
edAna=(4/3)*edJuan
edMama=edJuan+edAlber+edAna
print('LAS EDADES SON:')
print(f'Alberto: {int(edAlber)}, Juan: {int(edJuan)}, Ana: {int(edAna)}, Mamá {int(edMama)}')
