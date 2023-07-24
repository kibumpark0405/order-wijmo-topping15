
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"

import BasicUserManager from "./components/listers/BasicUserCards"
import BasicUserDetail from "./components/listers/BasicUserDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },

            {
                path: '/basics/users',
                name: 'BasicUserManager',
                component: BasicUserManager
            },
            {
                path: '/basics/users/:id',
                name: 'BasicUserDetail',
                component: BasicUserDetail
            },



    ]
})
