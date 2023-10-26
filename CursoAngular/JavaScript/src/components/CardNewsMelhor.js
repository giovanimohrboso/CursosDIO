class CarNewsMelhor extends HTMLElement{

    constructor(){
        super();

        const shadow = this.attachShadow({mode:"open"});
        shadow.appendChild(this.build());
        shadow.appendChild(this.styles());

    }

    build(){
        const componentRoot = document.createElement("div");
        componentRoot.setAttribute("class","card");

        const cardLeft      = document.createElement("div");
        cardLeft.setAttribute("class","card___left");

        const autor         = document.createElement("span");
        autor.textContent   = "Autor "+(this.getAttribute("autor") || "Anônimo");

        const linkTitle     = document.createElement("a");
        linkTitle.textContent= this.getAttribute("titulo");
        linkTitle.href      = this.getAttribute("url-link");

        const newsContent   = document.createElement("p");
        newsContent.textContent = this.getAttribute("noticia");

        cardLeft.appendChild(autor);
        cardLeft.appendChild(linkTitle);
        cardLeft.appendChild(newsContent);

        const cardRight     = document.createElement("div");
        cardRight.setAttribute("class","card___left");

        const newImage      = document.createElement("img");
        cardRight.appendChild(newImage);
        newImage.src = (this.getAttribute("foto") || "assets/foto-default.png");

        componentRoot.appendChild(cardLeft);
        componentRoot.appendChild(cardRight);

        return componentRoot;
    }

    styles(){
        const estilo = document.createElement("style");

        estilo.textContent = `

        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        
        .card{
            width: 90%;
            display: flex;
            flex-direction: row;
            box-shadow: 10px 10px 19px -1px rgba(0,0,0,0.75);
            -webkit-box-shadow: 10px 10px 19px -1px rgba(0,0,0,0.75);
            -moz-box-shadow: 10px 10px 19px -1px rgba(0,0,0,0.75);
            justify-content: space-between;
        }
        
        .card___left{
            display: flex;
            flex-direction: column;
            justify-content: center;
            padding: 10px;
        }
        
        .card___left > span{
            font-weight: 400;
        }
        
        .card___left > a{
            margin-top: 15px;
            font-size: 25px;
            text-decoration: none;
            color: black;
            font-weight: 600;
        }
        
        .card___left > p{
            color: rgb(101, 99, 99);
        }`  

        return estilo;

    }

}

customElements.define('card-news-melhor',CarNewsMelhor);