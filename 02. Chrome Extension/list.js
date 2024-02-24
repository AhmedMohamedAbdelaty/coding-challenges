const listElement = document.getElementById('pr-list');
const countElement = document.querySelector('.pr-count');

async function displayPullRequests() {
	const response = await fetch('https://api.github.com/repos/CodingChallegesFYI/SharedSolutions/pulls');
	const pullRequests = await response.json();
	const count = pullRequests.length;
	countElement.textContent = `There are ${count} PRs open for Shared Solutions:`;

	const titles = pullRequests.map(pr => pr.title);
	const listItems = titles.map(title => `<li>${title}</li>`);
	const listHTML = listItems.join('');
	listElement.innerHTML = listHTML;
}

displayPullRequests();