package br.com.renner.OMSBase;



import java.util.Properties;

public class OMSBody {

    private static Properties properties;


    public String bodyCriarOrderOMS(String brokerID, int externalID){
        String jsonBodyCriarOrder = "{\n" +
                "    \"externalId\":" + "\"" + externalID + "\"" + "," +
                "    \"originBranchId\": \"13\",\n" +
                "    \"externalCreatedDate\": \"2022-02-07T20:18:14.000788\",\n" +
                "    \"locationTimezone\": \"America/Sao Paulo\",\n" +
                "    \"customer\": {\n" +
                "        \"firstName\": \"Sandro\",\n" +
                "        \"lastName\": \"Steinmetz\",\n" +
                "        \"email\": \"sandro.steinmetz@dbccompany.com.br\",\n" +
                "        \"cellPhone\": \"+55-51-999999999\",\n" +
                "        \"documentNumber\": \"5997682226408\",\n" +
                "        \"documentType\": \"CPF\"\n" +
                "    },\n" +
                "    \"partOrders\": [\n" +
                "        {\n" +
                "            \"company\": \"001\",\n" +
                "            \"destinationBranchId\": \"13\",\n" +
                "            \"externalId\":" + "\"" + externalID + "-1\"" + "," +
                "            \"items\": [\n" +
                "                {\n" +
                "                    \"attributes\": \"48,Marrom\",\n" +
                "                    \"code\": \"540558152\",\n" +
                "                    \"productCategory\": \"Sarja\",\n" +
                "                    \"shortDesc\": \"Calca Skinny Masculina em Sarja\",\n" +
                "                    \"quantity\": 1,\n" +
                "                    \"listPrice\": 99.9,\n" +
                "                    \"salePrice\": 0.0,\n" +
                "                    \"currency\": \"BRL\",\n" +
                "                    \"giftPackaging\": {\n" +
                "                        \"quantity\": 0\n" +
                "                    },\n" +
                "                    \"discountValue\": 0.0,\n" +
                "                    \"orderDiscountShare\": 0.0,\n" +
                "                    \"finalPrice\": 99.9,\n" +
                "                    \"finalUnitPrice\": 99.9,\n" +
                "                    \"height\": \"1.0\",\n" +
                "                    \"length\": \"1.0\",\n" +
                "                    \"subTotalPrice\": 99.9,\n" +
                "                    \"weight\": \"0.5\",\n" +
                "                    \"width\": \"1.0\",\n" +
                "                    \"product\": {\n" +
                "                        \"code\": \"540558152\",\n" +
                "                        \"shortDesc\": \"Cal├ºa Skinny em Sarja\"\n" +
                "                    },\n" +
                "                    \"splitPayment\": [\n" +
                "                        {\n" +
                "                            \"paymentGroupId\": \"9041128206\",\n" +
                "                            \"flagOneClick\": false,\n" +
                "                            \"paymentValue\": 9.39\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"paymentGroupId\": \"9041128207\",\n" +
                "                            \"flagOneClick\": false,\n" +
                "                            \"paymentValue\": 90.51\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ],\n" +
                "            \"shipping\": {\n" +
                "                \"address\": {\n" +
                "                    \"name\": \"Casa\",\n" +
                "                    \"postalCode\": \"90040-001\",\n" +
                "                    \"address\": \"Av ABCD\",\n" +
                "                    \"number\": \"1234\",\n" +
                "                    \"complement\": \"Nada\",\n" +
                "                    \"neighborhood\": \"Bairro A\",\n" +
                "                    \"city\": \"Porto Alegre\",\n" +
                "                    \"state\": \"RS\",\n" +
                "                    \"country\": \"BR\",\n" +
                "                    \"cityCode\": \"4314902\"\n" +
                "                },\n" +
                "                \"carrierName\": \"Correios Sedex 40436 Standard\",\n" +
                "                \"date\": \"2022-02-07T20:18:14.000788\",\n" +
                "                \"estimatedDate\": \"2021-11-01T00:00:00\",\n" +
                "                \"freightValue\": 6.54,\n" +
                "                \"freightDiscountValue\": 0.0,\n" +
                "                \"freightFinalValue\": 6.54,\n" +
                "                \"method\": \"STANDARD\",\n" +
                "                \"quantityItems\": 1,\n" +
                "                \"quotation\": {\n" +
                "                    \"id\":" + "\"" + brokerID + "\"" + "," +
                "                    \"modalId\": \"STORE-STANDARD-3-659-13\",\n" +
                "                    \"deliveryModeId\": \"STORE-STANDARD-3-659-13\",\n" +
                "                    \"fulfillmentMethod\": \"STORE\",\n" +
                "                    \"freightGateway\": \"BROKER\"\n" +
                "                },\n" +
                "                \"receiver\": \"sandro steinmetz\",\n" +
                "                \"type\": \"ENTREGA_ENDERECO\",\n" +
                "                \"splitPayment\": [\n" +
                "                    {\n" +
                "                        \"paymentGroupId\": \"9041128206\",\n" +
                "                        \"flagOneClick\": false,\n" +
                "                        \"paymentValue\": 0.61\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"paymentGroupId\": \"9041128207\",\n" +
                "                        \"flagOneClick\": false,\n" +
                "                        \"paymentValue\": 5.83\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"type\": \"PEDIDO\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        return jsonBodyCriarOrder;
    }

    public String bodyCriarOrderOMSS(String brokerID, String externalID, String modalId){
        String jsonBodyCriarOrder = "{\n" +
                "    \"externalId\":" + "\"" + externalID + "\"" + "," +
                "    \"originBranchId\": \"13\",\n" +
                "    \"externalCreatedDate\": \"2022-08-25T17:12:38.962\",\n" +
                "    \"locationTimezone\": \"America/Sao Paulo\",\n" +
                "    \"customer\": {\n" +
                "        \"firstName\": \"Sandro\",\n" +
                "        \"lastName\": \"Steinmetz\",\n" +
                "        \"email\": \"sandro.steinmetz@dbccompany.com.br\",\n" +
                "        \"cellPhone\": \"+55-51-999999999\",\n" +
                "        \"documentNumber\": \"3766233122266\",\n" +
                "        \"documentType\": \"CPF\",\n" +
                "        \"gender\": \"F\"\n" +
                "    },\n" +
                "    \"partOrders\": [\n" +
                "        {\n" +
                "            \"company\": \"001\",\n" +
                "            \"destinationBranchId\": \"13\",\n" +
                "            \"externalId\":" + "\"" + externalID + "-1\"" + "," +
                "            \"items\": [\n" +
                "                {\n" +
                "                    \"attributes\": \"48,Marrom\",\n" +
                "                    \"code\": \"542222361\",\n" +
                "                    \"productCategory\": \"Sarja\",\n" +
                "                    \"shortDesc\": \"Calca Skinny Masculina em Sarja\",\n" +
                "                    \"quantity\": 1,\n" +
                "                    \"listPrice\": 99.9,\n" +
                "                    \"salePrice\": 0.0,\n" +
                "                    \"currency\": \"BRL\",\n" +
                "                    \"giftPackaging\": {\n" +
                "                        \"quantity\": 0\n" +
                "                    },\n" +
                "                    \"discountValue\": 0.0,\n" +
                "                    \"orderDiscountShare\": 0.0,\n" +
                "                    \"finalPrice\": 99.9,\n" +
                "                    \"finalUnitPrice\": 99.9,\n" +
                "                    \"height\": \"1.0\",\n" +
                "                    \"length\": \"1.0\",\n" +
                "                    \"subTotalPrice\": 99.9,\n" +
                "                    \"weight\": \"0.5\",\n" +
                "                    \"width\": \"1.0\",\n" +
                "                    \"product\": {\n" +
                "                        \"code\": \"542222361\",\n" +
                "                        \"shortDesc\": \"Cal├ºa Skinny em Sarja\"\n" +
                "                    },\n" +
                "                    \"splitPayment\": [\n" +
                "                        {\n" +
                "                            \"paymentGroupId\": \"9041128206\",\n" +
                "                            \"flagOneClick\": false,\n" +
                "                            \"paymentValue\": 9.39\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"paymentGroupId\": \"9041128207\",\n" +
                "                            \"flagOneClick\": false,\n" +
                "                            \"paymentValue\": 90.51\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ],\n" +
                "            \"shipping\": {\n" +
                "                \"address\": {\n" +
                "                    \"name\": \"Casa\",\n" +
                "                    \"postalCode\": \"90040-001\",\n" +
                "                    \"address\": \"Av ABCD\",\n" +
                "                    \"number\": \"1234\",\n" +
                "                    \"complement\": \"Nada\",\n" +
                "                    \"neighborhood\": \"Bairro A\",\n" +
                "                    \"city\": \"Porto Alegre\",\n" +
                "                    \"state\": \"RS\",\n" +
                "                    \"country\": \"BR\",\n" +
                "                    \"cityCode\": \"4314902\"\n" +
                "                },\n" +
                "                \"carrierName\": \"Loggi Ship From Store\",\n" +
                "                \"date\": \"2022-07-04T23:30:31.778355\",\n" +
                "                \"estimatedDate\": \"2022-07-07T00:00:00\",\n" +
                "                \"freightValue\": 7.01,\n" +
                "                \"freightDiscountValue\": 0.0,\n" +
                "                \"freightFinalValue\": 7.01,\n" +
                "                \"method\": \"STANDARD\",\n" +
                "                \"quantityItems\": 1,\n" +
                "                \"quotation\": {\n" +
                "                    \"id\":" + "\"" + brokerID + "\"" + "," +
                "                    \"modalId\":" + "\"" + modalId + "\"" + "," +
                "                    \"deliveryModeId\":" + "\"" + modalId + "\"" + "," +
                "                    \"fulfillmentMethod\": \"STORE\",\n" +
                "                    \"freightGateway\": \"BROKER\"\n" +
                "                },\n" +
                "                \"receiver\": \"sandro steinmetz\",\n" +
                "                \"type\": \"ENTREGA_ENDERECO\",\n" +
                "                \"splitPayment\": [\n" +
                "                    {\n" +
                "                        \"paymentGroupId\": \"9041128206\",\n" +
                "                        \"flagOneClick\": false,\n" +
                "                        \"paymentValue\": 0.61\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"paymentGroupId\": \"9041128207\",\n" +
                "                        \"flagOneClick\": false,\n" +
                "                        \"paymentValue\": 5.83\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            \"type\": \"PEDIDO\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        return jsonBodyCriarOrder;
    }

    public String bodyBrokerOms(){
        String jsonBodyBroker = "{\n" +
                "    \"items\": [\n" +
                "        {\n" +
                "            \"costOfGoods\": \"25.90\",\n" +
                "            \"productCategory\": \"Roupas\",\n" +
                "            \"weight\": \"0.003\",\n" +
                "            \"width\": \"1\",\n" +
                "            \"height\": \"1\",\n" +
                "            \"length\": \"1\",\n" +
                "            \"canGroup\": true,\n" +
                "            \"sku\": \"542222361\",\n" +
                "            \"quantity\": \"1\",\n" +
                "            \"branchOfficeId\": 0,\n" +
                "            \"stockStatus\": \"INOMNISTOCK\",\n" +
                "            \"productType\": \"DEFAULT\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"containsRestrictedOriginItems\": false,\n" +
                "    \"destination\": {\n" +
                "        \"zipcode\": \"90040-001\"\n" +
                "    },\n" +
                "    \"extraIdentification\": {\n" +
                "        \"session\": \"string\",\n" +
                "        \"ip\": \"string\",\n" +
                "        \"pageName\": \"string\",\n" +
                "        \"url\": \"string\",\n" +
                "        \"extOrderCode\": \"string\"\n" +
                "    }\n" +
                "}";
        return jsonBodyBroker;
    }

    public String bodyAprovarPedidoOms(){
        String jsonBodyAprovar = "{\n" +
                "    \"payment\": [\n" +
                "        {\n" +
                "            \"paymentGroupId\": \"11181084\",\n" +
                "            \"flagOneClick\": true,\n" +
                "            \"methodCode\": \"01\",\n" +
                "            \"methodDescription\": \"Credit Card\",\n" +
                "            \"paymentSubtype\": \"MasterCard\",\n" +
                "            \"paymentValue\": 41.1,\n" +
                "            \"numberOfInstallments\": 2,\n" +
                "            \"cardNumber\": \"**** **** **** 1234\",\n" +
                "            \"tenderTypeId\": \"01\",\n" +
                "            \"tenderTypeGroup\": \"02\",\n" +
                "            \"voucherNumber\": \"3423423423432\",\n" +
                "            \"approvedDate\": \"2022-06-09T13:59:55.827832\",\n" +
                "            \"address\": {\n" +
                "                \"number\": \"9999\",\n" +
                "                \"country\": \"BR\",\n" +
                "                \"address\": \"Rua Anonima\",\n" +
                "                \"city\": \"Porto Alegre\",\n" +
                "                \"postalCode\": \"90040-001\",\n" +
                "                \"name\": \"Casa\",\n" +
                "                \"neighborhood\": \"Bairro\",\n" +
                "                \"state\": \"RS\",\n" +
                "                \"complement\": \"Casa\"\n" +
                "            },\n" +
                "            \"cardGroup\": {\n" +
                "                \"cnpj\": \"73748066000138\",\n" +
                "                \"cAut\": \"1111111111111\" ,\n" +
                "                \"tpIntegra\": 1,\n" +
                "                \"tBand\": 1,\n" +
                "                \"vTroco\": 0.0\n" +
                "            },\n" +
                "            \"intermed\": {\n" +
                "                \"presenceIndicator\": 2,\n" +
                "                \"indIntermed\": 1,\n" +
                "                \"cnpj\": 8922191000150,\n" +
                "                \"idCadIntTran\": \"abc\"\n" +
                "            }\n" +
                "        }\n" +
                "    ],\n" +
                "    \"estimatedShippingDate\": \"2022-06-21T00:00:00\"\n" +
                "}";
        return jsonBodyAprovar;
    }

    public String bodyAprovarPedidoPendenteImpressaoNota(){
        String jsonBodyAprovar = "{\n" +
                "    \"payment\": [\n" +
                "        {\n" +
                "            \"paymentGroupId\": \"11181084\",\n" +
                "            \"flagOneClick\": true,\n" +
                "            \"methodCode\": \"01\",\n" +
                "            \"methodDescription\": \"Credit Card\",\n" +
                "            \"paymentSubtype\": \"MasterCard\",\n" +
                "            \"paymentValue\": 41.1,\n" +
                "            \"numberOfInstallments\": 2,\n" +
                "            \"cardNumber\": \"**** **** **** 1234\",\n" +
                "            \"tenderTypeId\": \"01\",\n" +
                "            \"tenderTypeGroup\": \"02\",\n" +
                "            \"voucherNumber\": \"3423423423432\",\n" +
                "            \"approvedDate\": \"2022-06-09T13:59:55.827832\",\n" +
                "            \"address\": {\n" +
                "                \"number\": \"9999\",\n" +
                "                \"country\": \"BR\",\n" +
                "                \"address\": \"Rua Anonima\",\n" +
                "                \"city\": \"Porto Alegre\",\n" +
                "                \"postalCode\": \"90040-001\",\n" +
                "                \"name\": \"Casa\",\n" +
                "                \"neighborhood\": \"Bairro\",\n" +
                "                \"state\": \"RS\",\n" +
                "                \"complement\": \"Casa\"\n" +
                "            },\n" +
                "            \"cardGroup\": {\n" +
                "                \"cnpj\": \"73748066000138\",\n" +
                "                \"cAut\": \"1111111111111\" ,\n" +
                "                \"tpIntegra\": 1,\n" +
                "                \"tBand\": 1,\n" +
                "                \"vTroco\": 0.0\n" +
                "            },\n" +
                "            \"intermed\": {\n" +
                "                \"presenceIndicator\": 2,\n" +
                "                \"indIntermed\": 1,\n" +
                "                \"cnpj\": 8922191000150,\n" +
                "                \"idCadIntTran\": \"abc\"\n" +
                "            }\n" +
                "        }\n" +
                "    ],\n" +
                "    \"estimatedShippingDate\": \"2022-06-21T00:00:00\"\n" +
                "}";
        return jsonBodyAprovar;
    }

    public String bodyCriarPicking(){
        String jsonBodyPicking ="{\n" +
                "    \"employeeId\": \"TesteQA\",\n" +
                "    \"branchId\": \"13\",\n" +
                "    \"maxPartOrders\": 5,\n" +
                "    \"maxItens\": 5\n" +
                "}";
        return jsonBodyPicking;
    }

    public String bodyAtualizaPicking(String pickingId, String partOrderId){
        String jsonBodyAtualiza = "{\n" +
                "    \"employeeId\": \"TesteQA\",\n" +
                "    \"id\":" + "\"" + pickingId + "\"" + ",\n" +
                "    \"partOrders\": [\n" +
                "        {\n" +
                "            \"destinationBranchId\": \"13\",\n" +
                "            \"id\":" + "\"" + partOrderId + "\"" + ",\n" +
                "            \"items\": [\n" +
                "                {\n" +
                "                    \"code\": 542222361,\n" +
                "                    \"quantityFound\": 1\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        return jsonBodyAtualiza;
    }

    public String bodyAtualizaPickingReatendimentoLojaCommerce(String pickingId, String partOrderId){
        String jsonBodyAtualiza = "{\n" +
                "    \"employeeId\": \"TesteQA\",\n" +
                "    \"id\":" + "\"" + pickingId + "\"" + ",\n" +
                "    \"partOrders\": [\n" +
                "        {\n" +
                "            \"destinationBranchId\": \"13\",\n" +
                "            \"id\":" + "\"" + partOrderId + "\"" + ",\n" +
                "            \"items\": [\n" +
                "                {\n" +
                "                    \"code\": 542222361,\n" +
                "                    \"quantityFound\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        return jsonBodyAtualiza;
    }

    public String bodyPendenteGeracaoNota(String partOrderId){
        String jsonBodyAtualiza = "{\n" +
                "    \"partOrderId\":" + "\"" + partOrderId + "\"" + ",\n" +
                "    \"pendingType\": \"GERACAO\"\n" +
                "}";
        return jsonBodyAtualiza;

    }

    public String bodyPendenteImpressaoNota(String partOrderId){
        String jsonBodyAtualiza = "{\n" +
                "  \"billingInvoiceRequest\": {\n" +
                "    \"currencyCode\": \"BRL\",\n" +
                "    \"invoiceDate\": \"2022-07-25T23:15:36.28936\",\n" +
                "    \"pdvId\": \"501\",\n" +
                "    \"trn\": \"12345\"\n" +
                "  },\n" +
                "    \"partOrderId\":" + "\"" + partOrderId + "\"" + ",\n" +
                "  \"pendingType\": \"IMPRESSAO\"\n" +
                "}";
        return jsonBodyAtualiza;

    }

    public String bodyAtualizaPickingCanceladoNaoLocalizado(String pickingId, String partOrderId){
        String jsonBodyAtualiza = "{\n" +
                "    \"employeeId\": \"TesteQA\",\n" +
                "    \"id\":" + "\"" + pickingId + "\"" + ",\n" +
                "    \"partOrders\": [\n" +
                "        {\n" +
                "            \"destinationBranchId\": \"13\",\n" +
                "            \"id\":" + "\"" + partOrderId + "\"" + ",\n" +
                "            \"items\": [\n" +
                "                {\n" +
                "                    \"code\": 542222361,\n" +
                "                    \"quantityFound\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        return jsonBodyAtualiza;
    }

    public String bodyCriarOndaPacking(){
        String jsonBodyPacking = "{\n" +
                "    \"branchId\": \"13\",\n" +
                "    \"employeeId\": \"TesteQA\",\n" +
                "    \"maxPartOrders\": 5,\n" +
                "    \"maxItens\": 4\n" +
                "}";
        return jsonBodyPacking;
    }

    public String cancelaOndaPacking(){
        String jsonBodyPacking = "{\n" +
                "    \"reason\": \"cancela packing\",\n" +
                "    \"employeeId\": \"TesteQA\"\n" +
                "}";
        return jsonBodyPacking;
    }

    public String cancelaOndaPicking(){
        String jsonBodyPacking = "{\n" +
                "    \"reason\": \"cancela packing\",\n" +
                "    \"employeeId\": \"TesteQA\"\n" +
                "}";
        return jsonBodyPacking;
    }

    public String devolvidoClienteLoja(){
        String jsonBodyPacking = "{\n" +
                "    \"employeeId\": \"TesteQA\",\n" +
                "    \"branchId\": \"13\"\n" +
                "}";
        return jsonBodyPacking;
    }

    public String bodyFinalizaPacking(String packingId, String partrderID){
        String jsonBodyFinalPacking = "{\n" +
                "    \"employeeId\": \"TesteQA\",\n" +
                "    \"id\":" + "\"" + packingId + "\"" + ",\n" +
                "    \"partOrders\": [\n" +
                "        {\n" +
                "            \"destinationBranchId\": \"13\",\n" +
                "            \"id\":" + "\"" + partrderID + "\"" + ",\n" +
                "            \"items\": [\n" +
                "                {\n" +
                "                    \"code\": 542222361,\n" +
                "                    \"giftPackaging\": {\n" +
                "                        \"quantityFound\": 0\n" +
                "                    },\n" +
                "                    \"quantityFound\": 1\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        return jsonBodyFinalPacking;
    }

    public String bodyEntregaOrdem(){
        String jsonBodyEntregaOrdem = "{\n" +
                "    \"shipping\": {\n" +
                "        \"documentType\": \"RG\",\n" +
                "        \"signature\": \"string\",\n" +
                "        \"documentNumber\": \"1234567890\"\n" +
                "    },\n" +
                "    \"deliveryMessage\": \"residencia\",\n" +
                "    \"deliveryStatus\": \"ENTREGUE\",\n" +
                "    \"customer\": {\n" +
                "        \"documentType\": \"RG\",\n" +
                "        \"signature\": \"string\",\n" +
                "        \"documentNumber\": \"1234567890\"\n" +
                "    }\n" +
                "}";
        return jsonBodyEntregaOrdem;
    }

    public String bodyFaturamento(String file, String partOrder){
        String jsonBodyPicking ="{\n" +
                "    \"partOrderId\":" + "\"" + partOrder + "\"" + "," +
                "    \"autorizationKey\": \"35200392754738030312650130000093851477817998\",\n" +
                "    \"documentUrl\" : \"https://www.nfce.fazenda.sp.gov.br/NFCeConsultaPublica/Paginas/ConsultaPublica.aspx?p=35200392754738030312650130000093851477817998\",\n" +
                "    \"currencyCode\": \"BRL\",\n" +
                "    \"totalValue\": 44.2,\n" +
                "    \"pdvId\": \"501\",\n" +
                "    \"trn\": \"19\",\n" +
                "    \"file\":" + "\"" + file + "\"" + "," +
                "    \"sequentialNumber\": \"1234\",\n" +
                "    \"number\": \"1234\",\n" +
                "    \"serie\": \"1\",\n" +
                "    \"invoiceDate\": \"2021-11-17T23:15:36.28936\",\n" +
                "    \"documentType\": \"NFCE\"\n" +
                "}";
        return jsonBodyPicking;
    }

    public String bodyCancelamentoCommerce(String partOrderId){
        String jsonBodyPicking ="{\n" +
                "    \"orderId\":" + "\"" + partOrderId + "\"" + ",\n" +
                "    \"employeeId\": \"TesteOMS\",\n" +
                "    \"reason\": \"Fraude\"\n" +
                "}";
        return jsonBodyPicking;
    }

}