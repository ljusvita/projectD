FROM nginx:stable-alpine

COPY ./dist /app/dist
COPY project-d.conf /etc/nginx/conf.d/

EXPOSE 8081

CMD [ "nginx", "-g", "daemon off;"]
