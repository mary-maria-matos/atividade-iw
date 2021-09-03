function tabuadas(a) {
    console.log("");
    do {
        for (let n = 0; n < 11; n++) {
            const conta = a * n
            console.log((a) + ' X ' + (n) + ' = ' + conta);
        }
        var a = a + 1
        console.log("");
    } while (a < 11);
}

