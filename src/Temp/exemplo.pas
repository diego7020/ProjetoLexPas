program TROCA;
var
    a, b, auxiliar: integer;
    base, altura, area: real;
begin
    writeln ('insira o valor de a: ');
    readln(a);
    writeln('insira o valor de b: ');
    readln(b);
    auxiliar := a;
    a := b;
    b := auxiliar;
    writeln(' o valor de A.:',a);
    writeln(' o valor de B.:',b);
    readln();
    writeln('--- Calculadora de Area ---');
    write('Digite o valor da base: ');
    readln(base);
    write('Digite o valor da altura: ');
    readln(altura);
    area := base * altura;
    writeln('---------------------------');
    writeln('A area do retangulo e: ', area:0:2);
    readln;
end.
