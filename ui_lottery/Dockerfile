FROM node:18-alpine

WORKDIR /app

ENV PATH /app/node_modules/.bin:$PATH

COPY package.json /app/package.json

RUN npm install --slient

CMD ["npm", "run", "serve"]

EXPOSE 8081