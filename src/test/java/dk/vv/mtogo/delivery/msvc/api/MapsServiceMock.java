package dk.vv.mtogo.delivery.msvc.api;

import io.quarkus.test.Mock;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Mock
@RestClient
@ApplicationScoped
public class MapsServiceMock implements MapsService{
    @Override
    public Response getInformation(String SupplierAddress, String customerAddress, String outputFormat, String key) {
        return Response.ok("{\n" +
                "    \"authenticationResultCode\": \"ValidCredentials\",\n" +
                "    \"brandLogoUri\": \"https://dev.virtualearth.net/Branding/logo_powered_by.png\",\n" +
                "    \"copyright\": \"Copyright © 2023 Microsoft and its suppliers. All rights reserved. This API cannot be accessed and the content and any results may not be used, reproduced or transmitted in any manner without express written permission from Microsoft Corporation.\",\n" +
                "    \"resourceSets\": [\n" +
                "        {\n" +
                "            \"estimatedTotal\": 1,\n" +
                "            \"resources\": [\n" +
                "                {\n" +
                "                    \"__type\": \"Route:http://schemas.microsoft.com/search/local/ws/rest/v1\",\n" +
                "                    \"bbox\": [\n" +
                "                        55.614038,\n" +
                "                        12.422303,\n" +
                "                        55.764791,\n" +
                "                        12.635003\n" +
                "                    ],\n" +
                "                    \"id\": \"v70,h989857031,i0,a0,cen-US,dAAAAAAAAAAA1,y0,s1,m1,o1,t4,w1bSLaabRS0CTOZZ31UMpQA2~ALT33ZaJtOtrAADgAfUo8z4A0~U2tvdHRlZ8OlcmRlbiAzNywgMjc3MCBLYXN0cnVwLCBEZW5tYXJr0~~~~~~~~v12,wOKPmq-ThS0Drq6sCtQApQA2~ALT33ZYpPthrAADgAYBLCT8A0~VWxyaWtrZW5ib3JnIEFsbGUgMzMsIDI4MDAgS29uZ2VucyBMeW5nYnksIERlbm1hcms1~~~~~~~~v12,k1\",\n" +
                "                    \"distanceUnit\": \"Kilometer\",\n" +
                "                    \"durationUnit\": \"Second\",\n" +
                "                    \"routeLegs\": [\n" +
                "                        {\n" +
                "                            \"actualEnd\": {\n" +
                "                                \"type\": \"Point\",\n" +
                "                                \"coordinates\": [\n" +
                "                                    55.764791,\n" +
                "                                    12.501381\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            \"actualStart\": {\n" +
                "                                \"type\": \"Point\",\n" +
                "                                \"coordinates\": [\n" +
                "                                    55.637891,\n" +
                "                                    12.632488\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            \"alternateVias\": [],\n" +
                "                            \"description\": \"e20, E55\",\n" +
                "                            \"endLocation\": {\n" +
                "                                \"bbox\": [\n" +
                "                                    55.760895,\n" +
                "                                    12.492535,\n" +
                "                                    55.76862,\n" +
                "                                    12.510843\n" +
                "                                ],\n" +
                "                                \"name\": \"Ulrikkenborg Alle 33, 2800 Kongens Lyngby, Denmark\",\n" +
                "                                \"point\": {\n" +
                "                                    \"type\": \"Point\",\n" +
                "                                    \"coordinates\": [\n" +
                "                                        55.764758,\n" +
                "                                        12.501689\n" +
                "                                    ]\n" +
                "                                },\n" +
                "                                \"address\": {\n" +
                "                                    \"addressLine\": \"Ulrikkenborg Alle 33\",\n" +
                "                                    \"adminDistrict\": \"Capital Region of Denmark\",\n" +
                "                                    \"adminDistrict2\": \"Lyngby-Taarbæk Municipality\",\n" +
                "                                    \"countryRegion\": \"Denmark\",\n" +
                "                                    \"formattedAddress\": \"Ulrikkenborg Alle 33, 2800 Kongens Lyngby, Denmark\",\n" +
                "                                    \"locality\": \"Kongens Lyngby\",\n" +
                "                                    \"postalCode\": \"2800\"\n" +
                "                                },\n" +
                "                                \"confidence\": \"High\",\n" +
                "                                \"entityType\": \"Address\",\n" +
                "                                \"geocodePoints\": [\n" +
                "                                    {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.764758,\n" +
                "                                            12.501689\n" +
                "                                        ],\n" +
                "                                        \"calculationMethod\": \"Rooftop\",\n" +
                "                                        \"usageTypes\": [\n" +
                "                                            \"Display\"\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.764791,\n" +
                "                                            12.501381\n" +
                "                                        ],\n" +
                "                                        \"calculationMethod\": \"Rooftop\",\n" +
                "                                        \"usageTypes\": [\n" +
                "                                            \"Route\"\n" +
                "                                        ]\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"matchCodes\": [\n" +
                "                                    \"Good\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            \"endTime\": \"/Date(1701209480564-0800)/\",\n" +
                "                            \"itineraryItems\": [\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"northwest\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 337,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                1\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"DepartStart\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Skottegården\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Street\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                0\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"DepartStart\",\n" +
                "                                        \"text\": \"Depart and head northwest on Skottegården\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.637891,\n" +
                "                                            12.632488\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.047,\n" +
                "                                    \"travelDuration\": 33,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"east\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 85,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                3\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"TurnToStayRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Skottegården\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Street\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                1\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"TurnToStayRight\",\n" +
                "                                        \"text\": \"Turn right to stay on Skottegården\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.638304,\n" +
                "                                            12.632315\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.125,\n" +
                "                                    \"travelDuration\": 44,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"southeast\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 144,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                5\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"TurnToStayRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Skottegården\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Street\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                3\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"TurnToStayRight\",\n" +
                "                                        \"text\": \"Turn right to stay on Skottegården\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.638654,\n" +
                "                                            12.634212\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.133,\n" +
                "                                    \"travelDuration\": 31,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"west\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 262,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                7\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"TurnRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Saltværksvej\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Arterial\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                5\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"TurnRight\",\n" +
                "                                        \"text\": \"Turn right onto Saltværksvej\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.637543,\n" +
                "                                            12.635003\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.991,\n" +
                "                                    \"travelDuration\": 99,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"west\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 262,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                10\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"RoadNameChange\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Tårnbyvej\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Arterial\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                7\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"RoadNameChange\",\n" +
                "                                        \"text\": \"Road name changes to Tårnbyvej\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.63542,\n" +
                "                                            12.619684\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 1.116,\n" +
                "                                    \"travelDuration\": 130,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"south\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 289,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                13\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"BearRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"roadType\": \"Arterial\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                10\n" +
                "                                            ]\n" +
                "                                        },\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 181,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                19\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"KeepRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Englandsvej\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Arterial\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                13\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"BearThenKeep\",\n" +
                "                                        \"text\": \"Bear right onto Englandsvej\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.633208,\n" +
                "                                            12.602415\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.431,\n" +
                "                                    \"travelDuration\": 70,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"south\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 170,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                21\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"TakeRampRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"e20\",\n" +
                "                                                \"Øresundsmotorvejen\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Ramp\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                19\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"TakeRampRight\",\n" +
                "                                        \"text\": \"Take the ramp on the right for E 20 and head toward København / motorway\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.629812,\n" +
                "                                            12.602689\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"signs\": [\n" +
                "                                        \"København\",\n" +
                "                                        \"motorway\",\n" +
                "                                        \"E 20\"\n" +
                "                                    ],\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.013,\n" +
                "                                    \"travelDuration\": 5,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"southwest\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 238,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                51\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"BearRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"e20\",\n" +
                "                                                \"Øresundsmotorvejen\"\n" +
                "                                            ],\n" +
                "                                            \"roadShieldRequestParameters\": {\n" +
                "                                                \"bucket\": 6357633,\n" +
                "                                                \"shields\": [\n" +
                "                                                    {\n" +
                "                                                        \"labels\": [\n" +
                "                                                            \"e20\"\n" +
                "                                                        ],\n" +
                "                                                        \"roadShieldType\": 1\n" +
                "                                                    }\n" +
                "                                                ]\n" +
                "                                            },\n" +
                "                                            \"roadType\": \"Ramp\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                21\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"BearRight\",\n" +
                "                                        \"text\": \"Bear right onto e20 / Øresundsmotorvejen\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.629698,\n" +
                "                                            12.602674\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 7.106,\n" +
                "                                    \"travelDuration\": 257,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"west\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 274,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                69\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"KeepToStayStraight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Amagermotorvejen\"\n" +
                "                                            ],\n" +
                "                                            \"roadShieldRequestParameters\": {\n" +
                "                                                \"bucket\": 6357633,\n" +
                "                                                \"shields\": [\n" +
                "                                                    {\n" +
                "                                                        \"labels\": [\n" +
                "                                                            \"e20\"\n" +
                "                                                        ],\n" +
                "                                                        \"roadShieldType\": 1\n" +
                "                                                    }\n" +
                "                                                ]\n" +
                "                                            },\n" +
                "                                            \"roadType\": \"LimitedAccessHighway\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                51\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"KeepToStayStraight\",\n" +
                "                                        \"text\": \"Keep straight to stay on e20 / Amagermotorvejen\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.614528,\n" +
                "                                            12.503115\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 4.797,\n" +
                "                                    \"travelDuration\": 156,\n" +
                "                                    \"travelMode\": \"Driving\",\n" +
                "                                    \"warnings\": [\n" +
                "                                        {\n" +
                "                                            \"severity\": \"None\",\n" +
                "                                            \"text\": \"Entering Capital Region of Denmark\",\n" +
                "                                            \"warningType\": \"AdminDivisionChange\"\n" +
                "                                        }\n" +
                "                                    ]\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"northwest\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 317,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                91\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"KeepRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Motorring 3\"\n" +
                "                                            ],\n" +
                "                                            \"roadShieldRequestParameters\": {\n" +
                "                                                \"bucket\": 6357633,\n" +
                "                                                \"shields\": [\n" +
                "                                                    {\n" +
                "                                                        \"labels\": [\n" +
                "                                                            \"E47\"\n" +
                "                                                        ],\n" +
                "                                                        \"roadShieldType\": 1\n" +
                "                                                    }\n" +
                "                                                ]\n" +
                "                                            },\n" +
                "                                            \"roadType\": \"LimitedAccessHighway\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                69\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"KeepRight\",\n" +
                "                                        \"text\": \"Keep right, heading toward Helsingør / København N-V / Sjællands Odde / Ferry\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.62662,\n" +
                "                                            12.437528\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"signs\": [\n" +
                "                                        \"21\",\n" +
                "                                        \"Helsingør\",\n" +
                "                                        \"København N-V\",\n" +
                "                                        \"Sjællands Odde\",\n" +
                "                                        \"Ferry\",\n" +
                "                                        \"21\",\n" +
                "                                        \"E 47\",\n" +
                "                                        \"E 55\",\n" +
                "                                        \"E47\",\n" +
                "                                        \"E55\"\n" +
                "                                    ],\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 6.528,\n" +
                "                                    \"travelDuration\": 215,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"northeast\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 36,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                137\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"KeepToStayRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"E55\",\n" +
                "                                                \"E47\"\n" +
                "                                            ],\n" +
                "                                            \"roadShieldRequestParameters\": {\n" +
                "                                                \"bucket\": 6357633,\n" +
                "                                                \"shields\": [\n" +
                "                                                    {\n" +
                "                                                        \"labels\": [\n" +
                "                                                            \"E55\"\n" +
                "                                                        ],\n" +
                "                                                        \"roadShieldType\": 1\n" +
                "                                                    }\n" +
                "                                                ]\n" +
                "                                            },\n" +
                "                                            \"roadType\": \"LimitedAccessHighway\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                91\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"KeepToStayRight\",\n" +
                "                                        \"text\": \"Keep right to stay on E55 / E47\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.682633,\n" +
                "                                            12.428936\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"signs\": [\n" +
                "                                        \"Helsingør\",\n" +
                "                                        \"Jyllingevej\",\n" +
                "                                        \"Ferry\",\n" +
                "                                        \"E 47\"\n" +
                "                                    ],\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 10.63,\n" +
                "                                    \"travelDuration\": 354,\n" +
                "                                    \"travelMode\": \"Driving\",\n" +
                "                                    \"warnings\": [\n" +
                "                                        {\n" +
                "                                            \"origin\": \"55.756235,12.501059\",\n" +
                "                                            \"severity\": \"Minor\",\n" +
                "                                            \"text\": \"Minor congestion\",\n" +
                "                                            \"to\": \"55.756323,12.501982\",\n" +
                "                                            \"warningType\": \"TrafficFlow\"\n" +
                "                                        }\n" +
                "                                    ]\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"east\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 90,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                141\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"TakeRampRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"roadType\": \"Ramp\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                137\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"TakeRampRight\",\n" +
                "                                        \"text\": \"Take the ramp on the right for 19s / 201 / O 4 and head toward Birkerød / København / Nybrovej / Vangede\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.756633,\n" +
                "                                            12.507037\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"signs\": [\n" +
                "                                        \"19s\",\n" +
                "                                        \"201\",\n" +
                "                                        \"Birkerød\",\n" +
                "                                        \"København\",\n" +
                "                                        \"Nybrovej\",\n" +
                "                                        \"Vangede\",\n" +
                "                                        \"O 4\"\n" +
                "                                    ],\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.131,\n" +
                "                                    \"travelDuration\": 5,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"east\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 87,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                145\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"KeepRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"roadType\": \"Ramp\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                141\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"KeepRight\",\n" +
                "                                        \"text\": \"Keep right, heading toward København / Nybrovej / Vangede\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.756709,\n" +
                "                                            12.509114\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"signs\": [\n" +
                "                                        \"19 s\",\n" +
                "                                        \"København\",\n" +
                "                                        \"Nybrovej\",\n" +
                "                                        \"Vangede\",\n" +
                "                                        \"O 4\"\n" +
                "                                    ],\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.172,\n" +
                "                                    \"travelDuration\": 13,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"east\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 110,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                147\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"Merge\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"roadType\": \"Arterial\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                145\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"Merge\",\n" +
                "                                        \"text\": \"Merge toward Lagergårdsvej\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.756647,\n" +
                "                                            12.511763\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"signs\": [\n" +
                "                                        \"København\",\n" +
                "                                        \"Vangede\",\n" +
                "                                        \"19s\",\n" +
                "                                        \"O4\"\n" +
                "                                    ],\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.029,\n" +
                "                                    \"travelDuration\": 5,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"southwest\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 216,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                149\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"TurnRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Lagergårdsvej\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Arterial\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                147\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"TurnRight\",\n" +
                "                                        \"text\": \"Turn right onto Lagergårdsvej\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.7565,\n" +
                "                                            12.512141\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.101,\n" +
                "                                    \"travelDuration\": 17,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"west\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 273,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                153\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"EnterRoundabout\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"roadType\": \"Arterial\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                149\n" +
                "                                            ]\n" +
                "                                        },\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 279,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                156\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"ExitRoundabout\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Nybrovej\"\n" +
                "                                            ],\n" +
                "                                            \"roadShieldRequestParameters\": {\n" +
                "                                                \"bucket\": 6357660,\n" +
                "                                                \"shields\": [\n" +
                "                                                    {\n" +
                "                                                        \"labels\": [\n" +
                "                                                            \"O4\"\n" +
                "                                                        ],\n" +
                "                                                        \"roadShieldType\": 2\n" +
                "                                                    }\n" +
                "                                                ]\n" +
                "                                            },\n" +
                "                                            \"roadType\": \"MajorRoad\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                153\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"1\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"EnterThenExitRoundabout\",\n" +
                "                                        \"text\": \"At the roundabout, take the 1st exit for O4 / Nybrovej\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.755665,\n" +
                "                                            12.511524\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 1.169,\n" +
                "                                    \"travelDuration\": 118,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"northeast\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 65,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                158\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"TurnRight\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Lyngby Rosenvænge\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Street\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                156\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"TurnRight\",\n" +
                "                                        \"text\": \"Turn right onto Lyngby Rosenvænge\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.761806,\n" +
                "                                            12.496564\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.357,\n" +
                "                                    \"travelDuration\": 66,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"north\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 16,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                160\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"BearLeft\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Ulrikkenborg Alle\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Street\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                158\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"BearLeft\",\n" +
                "                                        \"text\": \"Bear left onto Ulrikkenborg Alle\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.763784,\n" +
                "                                            12.501058\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0.114,\n" +
                "                                    \"travelDuration\": 46,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                },\n" +
                "                                {\n" +
                "                                    \"compassDirection\": \"north\",\n" +
                "                                    \"details\": [\n" +
                "                                        {\n" +
                "                                            \"compassDegrees\": 18,\n" +
                "                                            \"endPathIndices\": [\n" +
                "                                                160\n" +
                "                                            ],\n" +
                "                                            \"maneuverType\": \"ArriveFinish\",\n" +
                "                                            \"mode\": \"Driving\",\n" +
                "                                            \"names\": [\n" +
                "                                                \"Ulrikkenborg Alle\"\n" +
                "                                            ],\n" +
                "                                            \"roadType\": \"Street\",\n" +
                "                                            \"startPathIndices\": [\n" +
                "                                                160\n" +
                "                                            ]\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"exit\": \"\",\n" +
                "                                    \"hints\": [\n" +
                "                                        {\n" +
                "                                            \"hintType\": \"PreviousIntersection\",\n" +
                "                                            \"text\": \"The last intersection before your destination is Christian X's Alle\"\n" +
                "                                        },\n" +
                "                                        {\n" +
                "                                            \"hintType\": \"NextIntersection\",\n" +
                "                                            \"text\": \"If you reach Johan Wilmanns Vej, you've gone too far\"\n" +
                "                                        }\n" +
                "                                    ],\n" +
                "                                    \"iconType\": \"Auto\",\n" +
                "                                    \"instruction\": {\n" +
                "                                        \"formattedText\": null,\n" +
                "                                        \"maneuverType\": \"ArriveFinish\",\n" +
                "                                        \"text\": \"Arrive at Ulrikkenborg Alle 33, 2800 Kongens Lyngby, Denmark\"\n" +
                "                                    },\n" +
                "                                    \"isRealTimeTransit\": false,\n" +
                "                                    \"maneuverPoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.764791,\n" +
                "                                            12.501381\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    \"realTimeTransitDelay\": 0,\n" +
                "                                    \"sideOfStreet\": \"Unknown\",\n" +
                "                                    \"tollZone\": \"\",\n" +
                "                                    \"transitTerminus\": \"\",\n" +
                "                                    \"travelDistance\": 0,\n" +
                "                                    \"travelDuration\": 0,\n" +
                "                                    \"travelMode\": \"Driving\"\n" +
                "                                }\n" +
                "                            ],\n" +
                "                            \"routeRegion\": \"WWMX\",\n" +
                "                            \"routeSubLegs\": [\n" +
                "                                {\n" +
                "                                    \"endWaypoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.764791,\n" +
                "                                            12.501381\n" +
                "                                        ],\n" +
                "                                        \"description\": \"Ulrikkenborg Alle 33, 2800 Kongens Lyngby, Denmark\",\n" +
                "                                        \"isVia\": false,\n" +
                "                                        \"locationIdentifier\": \"0|180|247|221|150|41|62|216|107|0|0|224|1|128|75|9|63|0|55.764791,12.501381\",\n" +
                "                                        \"routePathIndex\": 160\n" +
                "                                    },\n" +
                "                                    \"startWaypoint\": {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.637891,\n" +
                "                                            12.632488\n" +
                "                                        ],\n" +
                "                                        \"description\": \"Skottegården 37, 2770 Kastrup, Denmark\",\n" +
                "                                        \"isVia\": false,\n" +
                "                                        \"locationIdentifier\": \"0|180|247|221|150|137|180|235|107|0|0|224|1|245|40|243|62|0|55.637891,12.632488\",\n" +
                "                                        \"routePathIndex\": 0\n" +
                "                                    },\n" +
                "                                    \"travelDistance\": 33.99,\n" +
                "                                    \"travelDuration\": 1676\n" +
                "                                }\n" +
                "                            ],\n" +
                "                            \"startLocation\": {\n" +
                "                                \"bbox\": [\n" +
                "                                    55.634011,\n" +
                "                                    12.623236,\n" +
                "                                    55.641737,\n" +
                "                                    12.641484\n" +
                "                                ],\n" +
                "                                \"name\": \"Skottegården 37, 2770 Kastrup, Denmark\",\n" +
                "                                \"point\": {\n" +
                "                                    \"type\": \"Point\",\n" +
                "                                    \"coordinates\": [\n" +
                "                                        55.637874,\n" +
                "                                        12.63236\n" +
                "                                    ]\n" +
                "                                },\n" +
                "                                \"address\": {\n" +
                "                                    \"addressLine\": \"Skottegården 37\",\n" +
                "                                    \"adminDistrict\": \"Capital Region of Denmark\",\n" +
                "                                    \"adminDistrict2\": \"Tårnby Kommune\",\n" +
                "                                    \"countryRegion\": \"Denmark\",\n" +
                "                                    \"formattedAddress\": \"Skottegården 37, 2770 Kastrup, Denmark\",\n" +
                "                                    \"locality\": \"Kastrup\",\n" +
                "                                    \"postalCode\": \"2770\"\n" +
                "                                },\n" +
                "                                \"confidence\": \"High\",\n" +
                "                                \"entityType\": \"Address\",\n" +
                "                                \"geocodePoints\": [\n" +
                "                                    {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.637874,\n" +
                "                                            12.63236\n" +
                "                                        ],\n" +
                "                                        \"calculationMethod\": \"Rooftop\",\n" +
                "                                        \"usageTypes\": [\n" +
                "                                            \"Display\"\n" +
                "                                        ]\n" +
                "                                    },\n" +
                "                                    {\n" +
                "                                        \"type\": \"Point\",\n" +
                "                                        \"coordinates\": [\n" +
                "                                            55.637891,\n" +
                "                                            12.632488\n" +
                "                                        ],\n" +
                "                                        \"calculationMethod\": \"Rooftop\",\n" +
                "                                        \"usageTypes\": [\n" +
                "                                            \"Route\"\n" +
                "                                        ]\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"matchCodes\": [\n" +
                "                                    \"Good\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            \"startTime\": \"/Date(1701207804564-0800)/\",\n" +
                "                            \"travelDistance\": 33.99,\n" +
                "                            \"travelDuration\": 1676,\n" +
                "                            \"travelMode\": \"Driving\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"trafficCongestion\": \"None\",\n" +
                "                    \"trafficDataUsed\": \"None\",\n" +
                "                    \"travelDistance\": 33.99,\n" +
                "                    \"travelDuration\": 1676,\n" +
                "                    \"travelDurationTraffic\": 1795,\n" +
                "                    \"travelMode\": \"Driving\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"statusCode\": 200,\n" +
                "    \"statusDescription\": \"OK\",\n" +
                "    \"traceId\": \"6fe6a492f9ec4b809d4509b7510312d7|DU0000305E|0.0.0.0|DUB00092A0, Leg0-DUB000928D|Ref A: E7BBE02E14CD4451B8FAD2BBDD7C09F1 Ref B: DB3EDGE3205 Ref C: 2023-11-28T12:43:24Z|Ref A: 01538F6A9DA64714ADE5F2A999131C38 Ref B: DB3EDGE3210 Ref C: 2023-11-28T12:43:24Z\"\n" +
                "}").build();
    }
}
