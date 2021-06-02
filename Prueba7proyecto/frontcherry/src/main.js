import { createApp } from 'vue'
import store from './store'

import App from './App.vue'
import router from './router'

import 'bootstrap/dist/css/bootstrap.min.css'

Vue.config.productionTip = false

new Vue({
    router,
    render: h => h(App)
}).$mount('#app')

createApp(App).use(store).use(router).mount('#app')
