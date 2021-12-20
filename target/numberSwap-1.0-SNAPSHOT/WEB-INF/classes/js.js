

function main() {
    fetch("http://localhost:55211/number-swap/")
        .then(response => response.json())
        .then(convertedNumber => showNumber(convertedNumber));
}

function showNumber(convertedNumber) {

    const divOutput = document.getElementById("divOutput");

    divOutput.innerHTML = convertedNumber;


}