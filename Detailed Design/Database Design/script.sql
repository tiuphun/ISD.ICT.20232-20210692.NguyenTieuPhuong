CREATE TABLE `products` (
  `id` integer PRIMARY KEY NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `type` varchar(255) NOT NULL,
  `genre` varchar(255),
  `barcode` blob,
  `description` text,
  `quantity` integer NOT NULL,
  `entry_date` date,
  `dimension` double,
  `weight` double
);

CREATE TABLE `books` (
  `id` integer PRIMARY KEY,
  `author` varchar(255),
  `cover_type` varchar(255),
  `publisher` varchar(255),
  `publication_date` date,
  `page_number` interger,
  `language` varchar(255)
);

CREATE TABLE `CDLPs` (
  `id` integer PRIMARY KEY,
  `artists` list,
  `record_label` varchar(255),
  `tracklist` list
);

CREATE TABLE `DVDs` (
  `id` integer PRIMARY KEY,
  `disc_type` varchar(255),
  `director` varchar(255),
  `runtime` time,
  `studio` varchar(255),
  `language` varchar(255),
  `subtitles` text,
  `release_date` date
);

CREATE TABLE `users` (
  `id` integer PRIMARY KEY NOT NULL,
  `username` varchar(255) UNIQUE NOT NULL,
  `email` varchar(255) NOT NULL,
  `role` varchar(255)
);

CREATE TABLE `orders` (
  `id` integer PRIMARY KEY NOT NULL,
  `product_id` integer NOT NULL,
  `user_id` integer NOT NULL,
  `quantity` integer,
  `status` varchar(255),
  `delivery_fee` double,
  `total_amount` double NOT NULL,
  `placed_date` date,
  `created_at` timestamp
);

CREATE TABLE `cart` (
  `id` integer PRIMARY KEY NOT NULL,
  `product_id` integer NOT NULL,
  `quantity` integer NOT NULL,
  `amount` double NOT NULL
);

CREATE TABLE `deliveryInfo` (
  `order_id` integer NOT NULL,
  `user_id` integer,
  `address` varchar(255) NOT NULL,
  `fee` double NOT NULL,
  `payment_info` varchar(255) NOT NULL,
  `rush_order` bool,
  `delivery_time` datetime,
  `addtional_note` text
);

ALTER TABLE `books` ADD FOREIGN KEY (`id`) REFERENCES `products` (`id`);

ALTER TABLE `CDLPs` ADD FOREIGN KEY (`id`) REFERENCES `products` (`id`);

ALTER TABLE `DVDs` ADD FOREIGN KEY (`id`) REFERENCES `products` (`id`);

ALTER TABLE `orders` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

ALTER TABLE `orders` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `orders` ADD FOREIGN KEY (`delivery_fee`) REFERENCES `deliveryInfo` (`fee`);

ALTER TABLE `cart` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

ALTER TABLE `deliveryInfo` ADD FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`);

ALTER TABLE `deliveryInfo` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
