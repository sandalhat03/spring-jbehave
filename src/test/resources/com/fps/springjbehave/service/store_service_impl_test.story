Scenario: Retrieve store details by ID
Given store ID is <storeId>
When store is retrieved
Then store details are '<name>', '<description>', '<placeId>', '<floorNo>' and '<storePos>'

Examples:
|storeId		|name			|description								|placeId		|floorNo|storePos	|
|mnginasal00001	|Mang Inasal	|Chicken Inasal, Unlimited Rice				|SMNORTHANNEXQC	|0001	|0001		|
|brickovenl00001|Brick Oven		|Steak and pork chop cooked on brick oven	|SMNORTHANNEXQC	|0001	|0002		|
|persianave00001|Persian Avenue	|Beef wraps and more						|SMNORTHANNEXQC	|0001	|0020		|
|pizzahut00001	|Pizza Hut		|Freshly cooked pizza for family			|SMNORTHANNEXQC	|0001	|0010		|
|test00001		|Test Only		|For Testing Purposes						|SMNORTHANNEXQC	|0002	|0099		|