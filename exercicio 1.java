
function operacao(a, b) {
    
    var operacao = '-';

    switch (operacao) {
        case '+':
            var resul = (a + b);
            console.log('O Resultado da soma Ã© = ' + resul);
            break;

        case '-':
            var resul = (a - b);
            console.log('O Resultado da subtraÃ§Ã£o Ã© = ' + resul);
            break;

        case '*':
            var resul = (a * b);
            console.log('O Resultado da multiplicaÃ§Ã£o Ã© = ' + resul);
            break;

        case '/':
            var resul = (a / b);
            console.log('O Resultado da divisÃ£o Ã© = ' + resul);
            break;

        default:
            console.log("Selecione uma operaÃ§Ã£o vÃ¡lida");
            break;
    }
}