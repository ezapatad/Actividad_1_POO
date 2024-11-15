'''
 Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de
retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,
la retención en la fuente y el salario neto del trabajador.
'''
salario_bruto=48*5000
retencion=salario_bruto*0.125
salario_neto=salario_bruto-retencion
print(f'Salario bruto: {int(salario_bruto)}, Retención: {int(retencion)}, Salario neto: {int(salario_neto)}')