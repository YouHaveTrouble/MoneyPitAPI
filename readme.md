# MoneyPitAPI

## What's different from Vault?

MoneyPitAPI allows economy plugins to implement economy handling methods that fully support async operations. This
means economy plugin developers can easily handle database operations without having to worry about blocking the main
server thread. This, being an overall benefit to performance and lessening the amount of data needing to be cached and
less burden on handling cases like player being offline, comes with a disadvantage of being more difficult to manage.
Developers are advised to excerise caution when implementing this api, in both economy provider and user plugins.
Basic knowledge about concurrency and its pitfalls is required to use this api.

## How to use

[See the wiki](https://github.com/YouHaveTrouble/MoneyPitAPI/wiki)