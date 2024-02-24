const dateElement = document.getElementById('date');
const timeElement = document.getElementById('time');

function updateTime() {
	const now = new Date();

	const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };
	const date = now.toLocaleDateString('en-US', options);
	const time = now.toLocaleTimeString('en-US', { hour: '2-digit', minute: '2-digit' });

	dateElement.textContent = date;
	timeElement.textContent = time;
}

setInterval(updateTime, 1000);

updateTime();