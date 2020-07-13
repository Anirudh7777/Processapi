
async function callAllUsers(){
			let url = 'http://localhost:8080/api/customer/';
			let response = await fetch(url);

			let commits = await response.json(); // read response body and
													// parse as JSON
			var option="<table border=1><tr><th>First Name</th><th>Last Name</th>"
			for (var i=0; i <commits.length; i++) {
				option+="<tr><td>"+commits[i].firstName+"</td><td>"+commits[i].lastName+"</td><tr>";
			}

			/*option+="</table>"
			response = fetch('http://localhost:8080/user/')
			.then(response => response.json())
			.then(data => console.log(data));
			console.log(response);*/
			document.getElementById('result').innerHTML=option;
		}