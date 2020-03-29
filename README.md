# GiveRestrict
A simple Spigot plugin adding a permission to `/give` for each Minecraft block and item.

Allow your users to harness the power of `/give`, but limit what they can get.
Each and every Minecraft block and item (as of 1.15.2) has a permission assigned to it.
Using a permissions plugin, you can permit users to `/give` themself (or others) a specific block or item, such as food or a tool, but not others, like an enchanted golden apple.



## Permissions
Each Minecraft block and item has a permission assigned to it with the format `giverestrict.$ID`, where `$ID` is the block/item ID assigned by Minecraft (See [Minecraft Java Edition Data Values](https://minecraft.gamepedia.com/Java_Edition_data_values))

In addition, there are groups that simplify granting permissions to certain related blocks and items.

### `giverestrict.all_lights`

<details><summary><code>giverestrict.all_lights</code></summary>
  <p>
    
  |Items|
  |:-|
  |`lantern`|
  |`torch`|
  </p>
</details>

### `giverestrict.all_cooked_food`

<details><summary><code>giverestrict.all_cooked_food</code></summary>
  <p>
    
  |Items|
  |:-|
  |`baked_potato`|
  |`beetroot_soup`|
  |`bread`|
  |`cake`|
  |`cooked_beef`|
  |`cooked_chicken`|
  |`cooked_cod`|
  |`cooked_mutton`|
  |`cooked_porkchop`|
  |`cooked_rabbit`|
  |`cooked_salmon`|
  |`cookie`|
  |`mushroom_stew`|
  |`pumpkin_pie`|
  </p>
</details>

### `giverestrict.all_tools`

<details><summary><code>giverestrict.all_tools</code></summary>
  <p>
    
  |Groups|
  |:-|
  |`all_axe`|
  |`all_hoe`|
  |`all_pickaxe`|
  |`all_shovel`|
  |`all_sword`|
  |`all_bow`|
  
  |Items|
  |:-|
  |`carrot_on_a_stick`|
  |`clock`|
  |`compass`|
  |`fishing_rod`|
  |`shears`|
  |`shield`|
  </p>
</details>

### `giverestrict.all_axe`

<details><summary><code>giverestrict.all_axe</code></summary>
  <p>
    
  |Items|
  |:-|
  |`wooden_axe`|
  |`stone_axe`|
  |`iron_axe`|
  |`gold_axe`|
  |`diamond_axe`|
  </p>
</details>

### `giverestrict.all_hoe`

<details><summary><code>giverestrict.all_hoe</code></summary>
  <p>
    
  |Items|
  |:-|
  |`wooden_hoe`|
  |`stone_hoe`|
  |`iron_hoe`|
  |`gold_hoe`|
  |`diamond_hoe`|
  </p>
</details>

### `giverestrict.all_pickaxe`

<details><summary><code>giverestrict.all_pickaxe</code></summary>
  <p>
    
  |Items|
  |:-|
  |`wooden_pickaxe`|
  |`stone_pickaxe`|
  |`iron_pickaxe`|
  |`gold_pickaxe`|
  |`diamond_pickaxe`|
  </p>
</details>

### `giverestrict.all_shovel`

<details><summary><code>giverestrict.all_shovel</code></summary>
  <p>
    
  |Items|
  |:-|
  |`wooden_shovel`|
  |`stone_shovel`|
  |`iron_shovel`|
  |`gold_shovel`|
  |`diamond_shovel`|
  </p>
</details>

### `giverestrict.all_sword`

<details><summary><code>giverestrict.all_sword</code></summary>
  <p>
    
  |Items|
  |:-|
  |`wooden_sword`|
  |`stone_sword`|
  |`iron_sword`|
  |`gold_sword`|
  |`diamond_sword`|
  </p>
</details>

### `giverestrict.all_bow`

<details><summary><code>giverestrict.all_bow</code></summary>
  <p>
    
  |Items|
  |:-|
  |`bow`|
  |`crossbow`|
  |`arrow`|
  </p>
</details>

### `giverestrict.all_armor`

<details><summary><code>giverestrict.all_armor</code></summary>
  <p>
    
  |Groups|
  |:-|
  |`all_leather_armor`|
  |`all_iron_armor`|
  |`all_gold_armor`|
  |`all_diamond_armor`|
  |`all_chainmail_armor`|
  </p>
</details>

### `giverestrict.all_leather_armor`

<details><summary><code>giverestrict.all_leather_armor</code></summary>
  <p>
    
  |Items|
  |:-|
  |`leather_boots`|
  |`leather_chestplate`|
  |`leather_helmet`|
  |`leather_leggings`|
  </p>
</details>

### `giverestrict.all_iron_armor`

<details><summary><code>giverestrict.all_iron_armor</code></summary>
  <p>
    
  |Items|
  |:-|
  |`iron_boots`|
  |`iron_chestplate`|
  |`iron_helmet`|
  |`iron_leggings`|
  </p>
</details>

### `giverestrict.all_gold_armor`

<details><summary><code>giverestrict.all_gold_armor</code></summary>
  <p>
    
  |Items|
  |:-|
  |`gold_boots`|
  |`gold_chestplate`|
  |`gold_helmet`|
  |`gold_leggings`|
  </p>
</details>

### `giverestrict.all_diamond_armor`

<details><summary><code>giverestrict.all_diamond_armor</code></summary>
  <p>
    
  |Items|
  |:-|
  |`diamond_boots`|
  |`diamond_chestplate`|
  |`diamond_helmet`|
  |`diamond_leggings`|
  </p>
</details>

### `giverestrict.all_chainmail_armor`

<details><summary><code>giverestrict.all_chainmail_armor</code></summary>
  <p>
    
  |Items|
  |:-|
  |`chainmail_boots`|
  |`chainmail_chestplate`|
  |`chainmail_helmet`|
  |`chainmail_leggings`|
  </p>
</details>
