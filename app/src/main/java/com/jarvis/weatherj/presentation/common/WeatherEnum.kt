package com.jarvis.weatherj.presentation.common

import com.jarvis.weatherj.R

enum class WeatherEnum(val code: Int, val nameWeather: Int, val image: Int) {
    Sunny(113, R.string.sunny, R.drawable.ic_sunny),
    PartlyCloudy(
        116,
        R.string.partly_cloudy,
        R.drawable.ic_party_cloudy
    ),
    Cloudy(
        119,
        R.string.cloudy,
        R.drawable.ic_cloudy
    ),
    VeryCloudy(
        122,
        R.string.very_cloudy,
        R.drawable.ic_idc_very_cloud
    ),
    Fog(143, R.string.fog, R.drawable.ic_fog),
    LightShowers(
        176,
        R.string.lightShowers,
        R.drawable.ic_light_shower
    ),
    LightSleetShowers(
        179,
        R.string.lightShowers,
        R.drawable.ic_light_shower
    ),
    LightSleet(
        182,
        R.string.lightSleet,
        R.drawable.ic_light_sleet
    ),
    LightSleet2(
        185,
        R.string.lightSleet,
        R.drawable.ic_light_sleet
    ),
    ThunderyShowers(
        200,
        R.string.thunderyShowers,
        R.drawable.ic_thunder_shower
    ),
    LightSnow(
        227,
        R.string.lightSnow,
        R.drawable.ic_light_snow
    ),
    HeavySnow(
        230,
        R.string.heavy_snow,
        R.drawable.ic_heavy_snow
    ),
    Fog2(248, R.string.fog, R.drawable.ic_fog),
    Fog3(260, R.string.fog, R.drawable.ic_fog),
    LightShowers2(
        263,
        R.string.lightShowers,
        R.drawable.ic_light_shower
    ),
    LightRain(
        266,
        R.string.lightRain,
        R.drawable.ic_light_rain
    ),
    LightSleet3(
        281,
        R.string.lightSleet,
        R.drawable.ic_light_sleet
    ),
    LightSleet4(
        284,
        R.string.lightSleet,
        R.drawable.ic_light_sleet
    ),
    LightRain2(
        293,
        R.string.lightRain,
        R.drawable.ic_light_rain
    ),
    LightRain3(
        296,
        R.string.lightRain,
        R.drawable.ic_light_rain
    ),
    HeavyShowers2(
        299,
        R.string.heavy_showers,
        R.drawable.ic_heavy_shower
    ),
    HeavyRain2(
        302,
        R.string.heavy_rain,
        R.drawable.ic_heavy_rain
    ),
    HeavyShowers3(
        305,
        R.string.heavy_showers,
        R.drawable.ic_heavy_shower
    ),
    HeavyRain3(
        308,
        R.string.heavy_rain,
        R.drawable.ic_heavy_rain
    ),
    LightSleet5(
        311,
        R.string.lightSleet,
        R.drawable.ic_light_sleet
    ),
    LightSleet6(
        314,
        R.string.lightSleet,
        R.drawable.ic_light_sleet
    ),
    LightSleet7(
        317,
        R.string.lightSleet,
        R.drawable.ic_light_sleet
    ),
    LightSnow2(
        320,
        R.string.lightSnow,
        R.drawable.ic_light_snow
    ),
    LightSnowShowers2(
        323,
        R.string.light_snow_showers,
        R.drawable.ic_light_snow_shower
    ),
    LightSnowShowers3(
        326,
        R.string.light_snow_showers,
        R.drawable.ic_light_snow_shower
    ),
    HeavySnow2(
        329,
        R.string.heavy_snow,
        R.drawable.ic_heavy_snow
    ),
    HeavySnow3(
        332,
        R.string.heavy_snow,
        R.drawable.ic_heavy_snow
    ),
    HeavySnowShowers2(
        335,
        R.string.heavySnowShowers,
        R.drawable.ic_heavy_snow_showder
    ),
    HeavySnow4(
        338,
        R.string.heavy_snow,
        R.drawable.ic_heavy_snow
    ),
    LightSleet8(
        350,
        R.string.lightSleet,
        R.drawable.ic_light_sleet
    ),
    LightShowers3(
        353,
        R.string.lightShowers,
        R.drawable.ic_light_shower
    ),
    HeavyShowers(
        356,
        R.string.heavy_showers,
        R.drawable.ic_heavy_shower
    ),
    HeavyRain(
        359,
        R.string.heavy_rain,
        R.drawable.ic_heavy_rain
    ),
    LightSleetShowers2(
        362,
        R.string.lightRain,
        R.drawable.ic_light_rain
    ),
    LightSleetShowers3(
        365,
        R.string.lightRain,
        R.drawable.ic_light_rain
    ),
    LightSnowShowers(
        368,
        R.string.light_snow_showers,
        R.drawable.ic_light_snow_shower
    ),
    HeavySnowShowers3(
        371,
        R.string.heavySnowShowers,
        R.drawable.ic_heavy_snow_showder
    ),
    LightSleetShowers4(
        374,
        R.string.thundery_heavy_rain,
        R.drawable.ic_thunder_heavy_rain
    ),
    LightSleet9(
        377,
        R.string.lightSleet,
        R.drawable.ic_light_sleet
    ),
    ThunderyShowers2(
        386,
        R.string.thunderyShowers,
        R.drawable.ic_thunder_shower
    ),
    ThunderyHeavyRain(
        389,
        R.string.thundery_heavy_rain,
        R.drawable.ic_thunder_heavy_rain
    ),
    ThunderySnowShowers(
        392,
        R.string.thundery_snow_showers,
        R.drawable.ic_thunder_snow_shower
    ),
    HeavySnowShowers(
        395,
        R.string.heavySnowShowers,
        R.drawable.ic_heavy_snow_showder
    )
}