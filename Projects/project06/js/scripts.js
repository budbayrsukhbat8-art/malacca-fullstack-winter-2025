const blogs = [
    {
        title: "Test Title",
        body: "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Natus aliquam blanditiis illo inventore iste libero ad, maxime praesentium recusandae, quis sit. Maiores, architecto. Aut ipsum unde recusandae molestiae sed iure"
    },
    {
        title: "Test Title",
        body: "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Natus aliquam blanditiis illo inventore iste libero ad, maxime praesentium recusandae, quis sit. Maiores, architecto. Aut ipsum unde recusandae molestiae sed iure"
    },
    {
        title: "Test Title",
        body: "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Natus aliquam blanditiis illo inventore iste libero ad, maxime praesentium recusandae, quis sit. Maiores, architecto. Aut ipsum unde recusandae molestiae sed iure"
    },
    {
        title: "Test Title",
        body: "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Natus aliquam blanditiis illo inventore iste libero ad, maxime praesentium recusandae, quis sit. Maiores, architecto. Aut ipsum unde recusandae molestiae sed iure"
    }

]

const mainElement = document.getElementsByTagName("main")[0];
const firstBlog = blogs[0];

const blogTitleElement = document.createElement('h1');
blogTitleElement.textContent = firstBlog.title;

const blogBodyElement = document.createElement('p');
blogBodyElement.textContent = firstBlog.body;

mainElement.appendChild(blogTitleElement);
mainElement.appendChild(blogBodyElement);