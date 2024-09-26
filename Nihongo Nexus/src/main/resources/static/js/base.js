function toggleMenu() {
    const menu = document.querySelector('.menu');
    const openMenuButton = document.querySelector('.open-menu');
    const closeMenuButton = document.querySelector('.close-menu');

    menu.classList.toggle('active');
    openMenuButton.classList.toggle('hidden');
}