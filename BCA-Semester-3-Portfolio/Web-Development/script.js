// Adds a small interaction to the portfolio page.
const helloButton = document.querySelector("#helloButton");
const message = document.querySelector("#message");

helloButton.addEventListener("click", () => {
  message.textContent = "Thanks for visiting my portfolio!";
});
