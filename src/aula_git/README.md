<div style="display: inline_block" align="center">
  <br>
  <img align="center" alt="Logo Wipro" title="Wipro" height="200"  width="300" src="../../.github/wipro_logo.png">
  <img align="center" alt="Logo Gama Academy" title="Gama Academy" height="70" width="300" src="../../.github/gama_academy_logo.png">
</div>

<br>

<h1 align="center"> Wipro Bootcamp </h1>

<br>

## 📝 O que é Git?

Git é um sistema de controle de versões distribuído, usado principalmente no desenvolvimento de software para registrar o histórico de edições dos arquivos. Foi desenvolvido por Linus Torvalds (criador do Linux).<br>
Com o Git podemos desenvolver projetos colaborativos, com diversas pessoas trabalhando simultaneamente no mesmo código sem risco de perder o que fazemos. O Git guarda um histórico de tudo que foi alterado nos arquivos ao longo do tempo, além de mostrar quem foi o autor da mudança.

## ⚙️ Instalando o GIT

- [Link com os downloads](https://git-scm.com/downloads)

## O que é GitHub?

GitHub é uma plataforma de hospedagem de código-fonte com controle de versão usando o Git.
GitHub é amplamente utilizado por programadores para divulgação de seus trabalhos ou para que outros programadores contribuam com o projeto.

## Como começar

- Crie uma nova pasta no seu PC chamada `wipro`

- Abra sua IDE na pasta criada

- Agora crie um novo arquivo `README.md`

- Escreva dentro dele `Olá, Wipro!`

- Salve seu arquivo


Agora abra o Git Bash que foi instalado na sua máquina dentro da pasta que você criou e siga os próximos passos:

```ps
# Para inicializar use o:
git init
# Para adicionar o arquivo na área de stagging use o:
git add .
# Agora de um commit para registrar e forneça uma descrição.
git commit -m "Meu primeiro commit na Wipro"
# Agora informe o nome da branch use o:
git branch -M main
# Agora informe o seu repositório no github.
git remote add origin https://github.com/SEU_USUARIO/wipro.git
# Tudo pronto, agora é só usar o comando abaixo para enviar o arquivo.
git push -u origin main
```

## Git Flow

É um fluxo de trabalho para o Git criado para facilitar o processo de desenvolvimento com uma série de comandos novos. O nome por trás desse modelo é Vincent Driessen que, em 2010, escreveu em seu blog pessoal a maneira que ele pensou ser a mais simples de se trabalhar com o Git em larga escala.

[Saiba mais...](https://nvie.com/posts/a-successful-git-branching-model/)

### 💻 Atividade no dia 02/04/2022

1. Crie um repositório localmente e inicialize o git
2. Adicione um arquivo markdown chamado README com seu nome e prato favorito e faça um commit
3. Adicione uma curiosidade sobre você e faça outro commit 
4. Publique o repositório no seu GitHub

```
Olá, me chamo Thiago Araujo.

Meu prato favorito é Lasanha.

Sou viciado em chocolate...
```
<br>

---

Todos os conceitos foram retirados do material de apoio da [Aula sobre Git](../aula_git/git.pdf).

