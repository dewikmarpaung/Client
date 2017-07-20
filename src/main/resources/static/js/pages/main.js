$(document).ready(function(){
    var WTAPI = "http://localhost:8080/API/Quiz/getAllQuiz";
    $.getJSON(WTAPI, function (data) {
        console.log(data);
    });
    /*$.getJSON( WTAPI, function (data) {
  		$.each(data.items, function(i, item) {
  			console.log(item)
			 $("<img>").attr("src", item.imageurl).css('height','50px').css('width','50px').appendTo($('<div>').appendTo($("#images")));

  		}); 
  	});*/
})

/*$(document).ready(function(){
	$.each(dummydata, function(i, item) {
		console.log(item)
		if (i==0) {
			$("<img>").attr("src", item.picture).css('height','200px').css('width','715px').css('padding','10px').appendTo($('<div>').appendTo($("#images")));
		}
		else {
			$("<img>").attr("src", item.picture).css('height','170px').css('width','250px').css('padding','10px').addClass('','').appendTo($('<div>').appendTo($("#images")));
		}
	});
	
	trend_quiz1();
	trend_quiz2();
	trend_quiz3();
})*/

function trend_quiz1() {
	var trend_quiz1 = dummydata[0].name;
	//console.log(trend_quiz1)
	$('#trending_quiz1').append(trend_quiz1);
}

function trend_quiz2() {
	var trend_quiz2 = dummydata[1].name;
	//console.log(trend_quiz2)
	$('#trending_quiz2').append(trend_quiz2);
}

function trend_quiz3() {
	var trend_quiz3 = dummydata[2].name;
	//console.log(trend_quiz3)
	$('#trending_quiz3').append(trend_quiz3);
}

var dummydata = 
[
  {
    "_id": "596c1b367fddb6b36f24c055",
    "index": 0,
    "guid": "a38d9747-1f51-4584-a99e-0d8c5397fa9d",
    "isActive": true,
    "balance": "$2,987.33",
    "picture": "http://placehold.it/32x32",
    "age": 38,
    "eyeColor": "brown",
    "name": "Krystal Weeks",
    "gender": "female",
    "company": "RETROTEX",
    "email": "krystalweeks@retrotex.com",
    "phone": "+1 (810) 577-3075",
    "address": "278 Hope Street, Starks, Pennsylvania, 6233",
    "about": "Tempor aliquip et est ex velit minim. Ipsum mollit aliquip sit esse minim. Ipsum aliqua dolor tempor amet est magna sint cillum Lorem minim ad voluptate veniam. Veniam elit veniam mollit ad culpa.\r\n",
    "registered": "2015-04-13T11:44:55 -07:00",
    "latitude": -81.427082,
    "longitude": 19.556933,
    "tags": [
      "incididunt",
      "laboris",
      "veniam",
      "minim",
      "in",
      "ex",
      "et"
    ],
    "friends": [
      {
        "id": 0,
        "name": "Cherry Frye"
      },
      {
        "id": 1,
        "name": "Nolan Meyer"
      },
      {
        "id": 2,
        "name": "Alfreda Frank"
      }
    ],
    "greeting": "Hello, Krystal Weeks! You have 9 unread messages.",
    "favoriteFruit": "apple"
  },
  {
    "_id": "596c1b36a1593204b5e8571f",
    "index": 1,
    "guid": "70e9c7ab-c455-41c2-9ec3-7633c15a229b",
    "isActive": true,
    "balance": "$3,600.55",
    "picture": "http://placehold.it/32x32",
    "age": 37,
    "eyeColor": "green",
    "name": "Reyna Wong",
    "gender": "female",
    "company": "MAXEMIA",
    "email": "reynawong@maxemia.com",
    "phone": "+1 (892) 423-2964",
    "address": "503 Lefferts Place, Hayes, Oregon, 9350",
    "about": "Officia id amet cupidatat excepteur qui do laborum. Ad anim duis quis adipisicing. Laboris et deserunt exercitation eiusmod. Dolor ex laboris deserunt nulla qui. Nisi ea amet ex culpa quis culpa. Amet est id laborum consectetur voluptate occaecat pariatur. Enim ut culpa nulla dolor dolore ad labore amet ullamco sit.\r\n",
    "registered": "2014-04-09T09:47:49 -07:00",
    "latitude": -30.526985,
    "longitude": 168.416641,
    "tags": [
      "anim",
      "pariatur",
      "cillum",
      "commodo",
      "officia",
      "eu",
      "exercitation"
    ],
    "friends": [
      {
        "id": 0,
        "name": "Odessa Hayden"
      },
      {
        "id": 1,
        "name": "Emily Mccormick"
      },
      {
        "id": 2,
        "name": "Blackwell Richmond"
      }
    ],
    "greeting": "Hello, Reyna Wong! You have 2 unread messages.",
    "favoriteFruit": "apple"
  },
  {
    "_id": "596c1b36f771bb9ef9573e40",
    "index": 2,
    "guid": "b0e019ab-e194-4540-9726-b2fb274649db",
    "isActive": false,
    "balance": "$1,451.13",
    "picture": "http://placehold.it/32x32",
    "age": 28,
    "eyeColor": "green",
    "name": "Ayers Douglas",
    "gender": "male",
    "company": "ACCUPHARM",
    "email": "ayersdouglas@accupharm.com",
    "phone": "+1 (956) 588-2928",
    "address": "902 Lloyd Court, Rockbridge, Montana, 6891",
    "about": "Sit magna ullamco ut proident deserunt Lorem aliqua proident. Veniam Lorem cillum officia mollit nulla nostrud est sunt quis. Excepteur aute labore nostrud occaecat exercitation tempor. Pariatur esse mollit non labore dolore sint. Minim exercitation occaecat culpa eu enim. Ipsum dolore ut Lorem ad ex do occaecat. Lorem elit eiusmod ut Lorem et adipisicing est aliquip aliqua id ipsum.\r\n",
    "registered": "2015-12-11T08:31:10 -07:00",
    "latitude": -29.8493,
    "longitude": 93.761447,
    "tags": [
      "Lorem",
      "ipsum",
      "officia",
      "sunt",
      "tempor",
      "minim",
      "cupidatat"
    ],
    "friends": [
      {
        "id": 0,
        "name": "Dixon Mueller"
      },
      {
        "id": 1,
        "name": "Haynes Key"
      },
      {
        "id": 2,
        "name": "Villarreal Thompson"
      }
    ],
    "greeting": "Hello, Ayers Douglas! You have 8 unread messages.",
    "favoriteFruit": "strawberry"
  },
  {
    "_id": "596c1b3626128c6e51c84bc5",
    "index": 3,
    "guid": "f3f6da65-af98-45b2-9c15-8ab8f9e05400",
    "isActive": false,
    "balance": "$1,788.55",
    "picture": "http://placehold.it/32x32",
    "age": 37,
    "eyeColor": "green",
    "name": "Alba Wood",
    "gender": "female",
    "company": "INTERFIND",
    "email": "albawood@interfind.com",
    "phone": "+1 (870) 413-3475",
    "address": "418 Wilson Avenue, Jacksonburg, Minnesota, 7111",
    "about": "Magna consequat id reprehenderit ullamco ea dolore exercitation elit eu. Pariatur incididunt irure esse cupidatat commodo minim esse. Aute mollit ea nulla amet adipisicing sit veniam est. Aliqua aliqua ad adipisicing cupidatat occaecat. Magna pariatur ipsum esse sint laborum incididunt aute pariatur velit quis et laborum ut. Occaecat minim est aliqua sint aliquip sint aliqua nulla elit aute. Aliqua cillum laboris et duis.\r\n",
    "registered": "2015-09-09T03:32:19 -07:00",
    "latitude": -45.884637,
    "longitude": -86.765849,
    "tags": [
      "irure",
      "fugiat",
      "aliquip",
      "Lorem",
      "laboris",
      "ullamco",
      "aliqua"
    ],
    "friends": [
      {
        "id": 0,
        "name": "Bush Price"
      },
      {
        "id": 1,
        "name": "Jennifer Watson"
      },
      {
        "id": 2,
        "name": "Leta Dodson"
      }
    ],
    "greeting": "Hello, Alba Wood! You have 8 unread messages.",
    "favoriteFruit": "banana"
  },
  {
    "_id": "596c1b36a4d9c029e4273443",
    "index": 4,
    "guid": "a3f5edd8-96fe-435a-896f-7bcfb06ff741",
    "isActive": true,
    "balance": "$3,771.77",
    "picture": "http://placehold.it/32x32",
    "age": 26,
    "eyeColor": "blue",
    "name": "Casandra Hewitt",
    "gender": "female",
    "company": "ANIXANG",
    "email": "casandrahewitt@anixang.com",
    "phone": "+1 (834) 440-3973",
    "address": "879 Mill Lane, Somerset, Kansas, 4812",
    "about": "Fugiat occaecat anim laboris aute. Qui tempor sunt ipsum elit cupidatat exercitation adipisicing ex deserunt reprehenderit incididunt. Sint ea nulla elit eiusmod nostrud quis nostrud tempor elit sint aliquip. Labore dolor anim non exercitation nostrud nisi fugiat esse velit aliquip eu. Ipsum ipsum occaecat exercitation sunt aute.\r\n",
    "registered": "2016-05-25T11:50:31 -07:00",
    "latitude": 22.077978,
    "longitude": -90.638193,
    "tags": [
      "dolore",
      "ut",
      "ea",
      "excepteur",
      "tempor",
      "enim",
      "officia"
    ],
    "friends": [
      {
        "id": 0,
        "name": "Lillian Hughes"
      },
      {
        "id": 1,
        "name": "Flossie Morse"
      },
      {
        "id": 2,
        "name": "Millicent Andrews"
      }
    ],
    "greeting": "Hello, Casandra Hewitt! You have 9 unread messages.",
    "favoriteFruit": "banana"
  },
  {
    "_id": "596c1b36fb49b7f0a044374e",
    "index": 5,
    "guid": "9ffd4c5e-3e59-46a2-af0a-41fd6940b39f",
    "isActive": false,
    "balance": "$1,487.00",
    "picture": "http://placehold.it/32x32",
    "age": 38,
    "eyeColor": "brown",
    "name": "Valeria Holcomb",
    "gender": "female",
    "company": "ZANYMAX",
    "email": "valeriaholcomb@zanymax.com",
    "phone": "+1 (817) 404-2156",
    "address": "454 Hendrickson Street, Courtland, California, 3246",
    "about": "Ut labore duis velit labore dolor fugiat id nisi labore velit magna tempor veniam proident. Aliqua laboris magna ex aliqua ad deserunt consectetur id dolor dolore. Reprehenderit incididunt eu id exercitation et et id fugiat aute.\r\n",
    "registered": "2014-11-01T07:26:56 -07:00",
    "latitude": 8.145649,
    "longitude": -6.988943,
    "tags": [
      "deserunt",
      "quis",
      "aute",
      "et",
      "est",
      "do",
      "incididunt"
    ],
    "friends": [
      {
        "id": 0,
        "name": "Baker Dyer"
      },
      {
        "id": 1,
        "name": "Dillard Case"
      },
      {
        "id": 2,
        "name": "Oneal Kennedy"
      }
    ],
    "greeting": "Hello, Valeria Holcomb! You have 9 unread messages.",
    "favoriteFruit": "strawberry"
  }
]