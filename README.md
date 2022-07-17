Public Transport Enabler
========================

This is a Java library allowing you to get data from public transport providers.
Look into [NetworkProvider.java](https://github.com/schildbach/public-transport-enabler/blob/master/src/de/schildbach/pte/NetworkProvider.java) for an overview of the API.

Using providers that require secrets
------------------------------------

For some providers a secret like an API key is required to use their API.
Copy the `secrets.properties.template` file to `secrets.properties` like so:

    $ cp test/de/schildbach/pte/live/secrets.properties.template test/de/schildbach/pte/live/secrets.properties

You need to request the secrets directly from the provider. For Navitia based providers, you can [request a secret here](https://www.navitia.io/register).

How to run live tests?
----------------------

Make sure the test you want to run does not require a secret and if it does, see above for how to get one.
Once you have the secret or if your provider does not need one, you can run the tests in your IDE.
Both IntelliJ and Eclipse have excellent support for JUnit tests.

If you prefer to run tests from the command line, you can comment out the test exclude at the end of
[build.gradle](https://github.com/schildbach/public-transport-enabler/blob/master/build.gradle#L30)
and use this command to only execute a test for a single provider:

    $ ./gradlew test --tests 'ParisProvider*'

This uses the `ParisProvider` as an example.
Just replace it with the provider you want to test.

---

**THIS IS AN UNOFFICIAL FORK**: It is kept in sync with the origin from
[github.com/schildbach/public-transport-enabler](https://github.com/schildbach/public-transport-enabler) and applies selected pull requests until they are merged into upstream:

* [Incofer, Costa Rica](https://github.com/schildbach/public-transport-enabler/pull/146)
  * `NetworkId.CR`
  * [CostaRicaProvider.java](src/de/schildbach/pte/CostaRicaProvider.java)
  * [CostaRicaProviderLiveTest.java](test/de/schildbach/pte/live/CostaRicaProviderLiveTest.java)
* [New York, United States](https://github.com/schildbach/public-transport-enabler/pull/97)
  * `NetworkId.NEWYORK`
  * [NewyorkProvider.java](src/de/schildbach/pte/NewyorkProvider.java)
  * [NewyorkProviderLiveTest.java](test/de/schildbach/pte/live/NewyorkProviderLiveTest.java)
* [Washington DC, United States](https://github.com/schildbach/public-transport-enabler/pull/367)
  * `NetworkId.WASHINGTONDC`
  * [WashingtonDCProvider.java](src/de/schildbach/pte/WashingtonDCProvider.java)
  * [WashingtonDCProviderLiveTest.java](test/de/schildbach/pte/live/WashingtonDCProviderLiveTest.java)
* `NetworkId.BRFLORIPA`
  * [BrFloripaProvider.java](src/de/schildbach/pte/BrFloripaProvider.java)
  * [BrFloripaProviderLiveTest.java](test/de/schildbach/pte/live/BrFloripaProviderLiveTest.java)
* [California, United States](https://github.com/schildbach/public-transport-enabler/pull/164)
  * `NetworkId.CALIFORNIA`
  * [CaliforniaProvider.java](src/de/schildbach/pte/CaliforniaProvider.java)
  * [CaliforniaProviderLiveTest.java](test/de/schildbach/pte/live/CaliforniaProviderLiveTest.java)
* [Hungary](https://github.com/schildbach/public-transport-enabler/pull/195)
  * `NetworkId.HUNGARY`
  * [HungaryProvider.java](src/de/schildbach/pte/HungaryProvider.java)
  * [HungaryProviderLiveTest.java](test/de/schildbach/pte/live/HungaryProviderLiveTest.java)
* [HSL using Navitia](https://github.com/schildbach/public-transport-enabler/pull/208)
  * `NetworkId.FI`
  * [HslProvider.java](src/de/schildbach/pte/HslProvider.java)
  * [HslProviderLiveTest.java](test/de/schildbach/pte/live/HslProviderLiveTest.java)
* [Portugal](https://github.com/schildbach/public-transport-enabler/pull/244)
  * `NetworkId.PT`
  * [PortugalProvider.java](src/de/schildbach/pte/PortugalProvider.java)
  * [PortugalProviderLiveTest.java](test/de/schildbach/pte/live/PortugalProviderLiveTest.java)
* [Switzerland](https://github.com/schildbach/public-transport-enabler/pull/383)
  * `NetworkId.SEARCHCH`
  * [CHSearchProvider.java](src/de/schildbach/pte/CHSearchProvider.java)
  * [CHSearchProviderLiveTest.java](test/de/schildbach/pte/live/CHSearchProviderLiveTest.java)

There is a [mirror on github](https://github.com/opentransitmap/public-transport-enabler/), but for merge request please refer to our [Gitlab repository](https://gitlab.com/opentransitmap/public-transport-enabler).

