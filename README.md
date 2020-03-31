# GiveRestrict
A simple Spigot plugin adding a permission to `/give` for each Minecraft block and item.

Allow your users to harness the power of `/give`, but limit what they can get.
Each and every Minecraft block and item (as of 1.15.2) has a permission assigned to it.
Using a permissions plugin, you can permit users to `/give` themselves (or others) a specific block or item, such as food or a tool, but not others, like an enchanted golden apple.



## Permissions
Each Minecraft block and item has a permission assigned to it with the format `giverestrict.$ID`, where `$ID` is the block/item ID assigned by Minecraft (See [Minecraft Java Edition Data Values](https://minecraft.gamepedia.com/Java_Edition_data_values)).

In addition, there are groups that simplify granting permissions to certain related blocks and items.
The group `giverestrict.*` gives access to all items and blocks.
Other smaller groups exist as follows:


### Food

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

### Tools

<details><summary><code>giverestrict.all_tools</code></summary>
  <p>
    
  |Groups|
  |:-|
  |`all_axe`|
  |`all_bow`|
  |`all_hoe`|
  |`all_lights`|
  |`all_pickaxe`|
  |`all_shovel`|
  |`all_sword`|
  
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

#### Tools by Type

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

<details><summary><code>giverestrict.all_bow</code></summary>
  <p>
    
  |Items|
  |:-|
  |`bow`|
  |`crossbow`|
  |`arrow`|
  </p>
</details>

<details><summary><code>giverestrict.all_lights</code></summary>
  <p>
    
  |Items|
  |:-|
  |`lantern`|
  |`torch`|
  </p>
</details>

#### Tools by Material

<details><summary><code>giverestrict.all_wooden_tools</code></summary>
  <p>
    
  |Items|
  |:-|
  |`wooden_axe`|
  |`wooden_hoe`|
  |`wooden_pickaxe`|
  |`wooden_shovel`|
  |`wooden_sword`|
  </p>
</details>

<details><summary><code>giverestrict.all_stone_tools</code></summary>
  <p>
    
  |Items|
  |:-|
  |`stone_axe`|
  |`stone_hoe`|
  |`stone_pickaxe`|
  |`stone_shovel`|
  |`stone_sword`|
  </p>
</details>

<details><summary><code>giverestrict.all_iron_tools</code></summary>
  <p>
    
  |Items|
  |:-|
  |`iron_axe`|
  |`iron_hoe`|
  |`iron_pickaxe`|
  |`iron_shovel`|
  |`iron_sword`|
  </p>
</details>

<details><summary><code>giverestrict.all_gold_tools</code></summary>
  <p>
    
  |Items|
  |:-|
  |`gold_axe`|
  |`gold_hoe`|
  |`gold_pickaxe`|
  |`gold_shovel`|
  |`gold_sword`|
  </p>
</details>

<details><summary><code>giverestrict.all_diamond_tools</code></summary>
  <p>
    
  |Items|
  |:-|
  |`diamond_axe`|
  |`diamond_hoe`|
  |`diamond_pickaxe`|
  |`diamond_shovel`|
  |`diamond_sword`|
  </p>
</details>

### Armor

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

### Spawn Eggs

<details><summary><code>giverestrict.all_spawn_egg</code></summary>
  <p>
    
  |Groups|
  |:-|
  |`all_passive_spawn_egg`|
  |`all_neutral_spawn_egg`|
  |`all_hostile_spawn_egg`|
  </p>
</details>

<details><summary><code>giverestrict.all_passive_spawn_egg</code></summary>
  <p>
    
  |Items|
  |:-|
  |`bat_spawn_egg`|
  |`cat_spawn_egg`|
  |`chicken_spawn_egg`|
  |`cod_spawn_egg`|
  |`cow_spawn_egg`|
  |`donkey_spawn_egg`|
  |`fox_spawn_egg`|
  |`horse_spawn_egg`|
  |`mooshroom_spawn_egg`|
  |`mule_spawn_egg`|
  |`ocelot_spawn_egg`|
  |`parrot_spawn_egg`|
  |`pig_spawn_egg`|
  |`pufferfish_spawn_egg`|
  |`rabbit_spawn_egg`|
  |`salmon_spawn_egg`|
  |`sheep_spawn_egg`|
  |`skeleton_horse_spawn_egg`|
  |`squid_spawn_egg`|
  |`tropical_fish_spawn_egg`|
  |`turtle_spawn_egg`|
  |`villager_spawn_egg`|
  |`wandering_trader_spawn_egg`|
  |`zombie_horse_spawn_egg`|
  </p>
</details>

<details><summary><code>giverestrict.all_neutral_spawn_egg</code></summary>
  <p>
    
  |Items|
  |:-|
  |`bee_spawn_egg`|
  |`cave_spider_spawn_egg`|
  |`dolphin_spawn_egg`|
  |`enderman_spawn_egg`|
  |`llama_spawn_egg`|
  |`panda_spawn_egg`|
  |`polar_bear_spawn_egg`|
  |`spider_spawn_egg`|
  |`trader_llama_spawn_egg`|
  |`wolf_spawn_egg`|
  |`zombie_pigman_spawn_egg`|
  </p>
</details>

<details><summary><code>giverestrict.all_neutral_spawn_egg</code></summary>
  <p>
    
  |Items|
  |:-|
  |`blaze_spawn_egg`|
  |`creeper_spawn_egg`|
  |`drowned_spawn_egg`|
  |`elder_guardian_spawn_egg`|
  |`endermite_spawn_egg`|
  |`evoker_spawn_egg`|
  |`ghast_spawn_egg`|
  |`guardian_spawn_egg`|
  |`husk_spawn_egg`|
  |`magma_cube_spawn_egg`|
  |`phantom_spawn_egg`|
  |`pillager_spawn_egg`|
  |`ravager_spawn_egg`|
  |`shulker_spawn_egg`|
  |`silverfish_spawn_egg`|
  |`skeleton_spawn_egg`|
  |`slime_spawn_egg`|
  |`stray_spawn_egg`|
  |`vex_spawn_egg`|
  |`vindicator_spawn_egg`|
  |`witch_spawn_egg`|
  |`wither_skeleton_spawn_egg`|
  |`zombie_spawn_egg`|
  |`zombie_villager_spawn_egg`|
  </p>
</details>
