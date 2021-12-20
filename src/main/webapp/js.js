

function main() {
    fetch("https://shanschrauwen.github.io/numberSwap/")
        .then(response => response.json())
        .then(convertedNumber => showNumber(convertedNumber));
}

function showNumber(convertedNumber) {

    const divOutput = document.getElementById("divOutput");

    divOutput.innerHTML = convertedNumber;


}