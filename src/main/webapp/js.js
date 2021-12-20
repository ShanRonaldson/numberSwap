

function main() {
    fetch("http://localhost:8080/homeServlet/")
        .then(response => response.json())
        .then(convertedNumber => showNumber(convertedNumber));
}

function showNumber(convertedNumber) {

    const divOutput = document.getElementById("divOutput");

    divOutput.innerHTML = convertedNumber;


}

main();