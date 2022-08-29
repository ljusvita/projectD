FROM node:18-alpine

RUN npm install -g http-server

WORKDIR /app
ENV PATH /app/node_modules/.bin:$PATH
COPY package*.json ./
RUN npm install --slient
COPY . .
RUN npm run build

EXPOSE 8081

CMD [ "http-server", "dist", "--port", "8081" ]
