//package com.example.springpjweb.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
//
//@Configuration
//public class SpringMongoConfig{
//
//    public @Bean
//    MongoDbFactory mongoDbFactory() throws Exception {
//        return new SimpleMongoDbFactory(new Mongo(), "database");
//    }
//
//    public @Bean
//    MongoTemplate mongoTemplate() throws Exception {
//
//        //remove _class
//        MongoTemplate mongoTemplate = new MongoTemplate(getMongoClient(), dbName);
//        ((MappingMongoConverter)mongoTemplate.getConverter()).setTypeMapper(new DefaultMongoTypeMapper(null));
//
//        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory(), converter);
//
//        return mongoTemplate;
//
//    }
//
//}
