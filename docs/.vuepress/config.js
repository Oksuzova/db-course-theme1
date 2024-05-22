module.exports = {
    plugins: [
        "@vuepress/back-to-top",
        "@vuepress/pwa",
        {
            serviceWorker: true,
            updatePopup: true,
        },
        [
            "container",
            {
                type: "vue",
                before: '<pre class="vue-container"><code>',
                after: "</code></pre>",
            },
        ],
    ],
    port: 3030,
    base: "/db-course-theme1/",
    theme: "cool",
    head: [
        ["link", { rel: "icon", href: "/favicon.ico" }],
        [
            "link",
            {
                rel: "stylesheet",
                href: "https://cdnjs.cloudflare.com/ajax/libs/KaTeX/0.5.1/katex.min.css",
            },
        ],
        [
            "link",
            {
                href: "https://fonts.googleapis.com/icon?family=Material+Icons",
                rel: "stylesheet",
            },
        ],
    ],
    themeConfig: {
        sidebar: [
            {
                title: "Вступ",
                path: "/intro/",
            },
            {
                title: "Розроблення загальних вимог до системи",
                path: "/requirements/",
                children: [
                    "/requirements/state-of-the-art",
                    "/requirements/stakeholders-needs",
                ],
            },
            {
                title: 'Розроблення вимог до функціональности системи',
                path:"/use cases/"
            },
            {
                title: "Проектування інформаційного забезпечення",
                path: "/design/",
            },
            {
                title: "Реалізація інформаційного та програмного забезпечення",
                path: "/software/",
            },
            {
                title: "Тестування працездатності системи",
                path: "/test/",
            },
            {
                title: "Висновки",
                path: "/conclusion/",
            },
        ],
        sidebarDepth: 2,
        displayAllHeaders: true,
        nav: [{ text: "Початок", link: "/" }],
        lastUpdated: "Останнє оновлення",
        repo: "https://github.com/Oksuzova/db-course-theme1",
        repoLabel: "Github",
        docsDir: "docs",
        docsBranch: "master",
    },
    title: "4. Система управління проектами",
    description: 'Лабораторні роботи з дисципліни "Розподілені інформаційні системи"',
    configureWebpack: {
        resolve: {
            alias: {
                "@alias": "../img",
            },
        },
    },
    markdown: {
        extendMarkdown: (md) => {
            md.set({ html: true });
            md.use(require("markdown-it-katex"));
            md.use(require("markdown-it-plantuml"));
            md.use(require("markdown-it-admonition"));
        },
    },
};