'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'myApp.security',
  'myApp.view1',
  'myApp.view2',
  'myApp.view3'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.otherwise({redirectTo: '/view1'});
}]).
config(function ($httpProvider) {
   $httpProvider.interceptors.push('authInterceptor');
});
