# GiveRestrict
A simple Spigot plugin adding a permission to `/give` for each Minecraft block and item.

Allow your users to harness the power of `/give`, but limit what they can get.
Each and every Minecraft block and item (as of 1.15.2) has a permission assigned to it.
Using a permissions plugin, you can permit users to `/give` themself (or others) a specific block or item, such as food or a tool, but not others, like an enchanted golden apple.



## Permissions
Each Minecraft block and item has a permission assigned to it with the format `giverestrict.$ID`, where `$ID` is the block/item ID assigned by Minecraft (See [Minecraft Java Edition Data Values](https://minecraft.gamepedia.com/Java_Edition_data_values))

In addition, there are groups that simplify granting permissions to certain related blocks and items.

### `giverestrict.all_lights`

<details><summary><b>Items</b></summary>
  <p>
    
  |Item|
  |:-|
  |`lantern`|
  |`torch`|
  </p>
</details>

### `giverestrict.all_cooked_food`

<details><summary><b>Items</b></summary>
  <p>
    
  |Item|
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

### `giverestrict.all_axe`

<details><summary><b>Items</b></summary>
  <p>
    
  |Item|
  |:-|
  |`wooden_axe`|
  |`stone_axe`|
  |`iron_axe`|
  |`gold_axe`|
  |`diamond_axe`|
  </p>
</details>
