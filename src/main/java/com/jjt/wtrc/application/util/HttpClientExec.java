package com.jjt.wtrc.application.util;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pengrl on 2015/8/8.
 */
public class HttpClientExec {

    private static final Logger LOGGER = LogManager.getLogger(HttpClientExec.class);

    public static String get(String url) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse httpResponse = null;
        try {
            httpResponse = httpClient.execute(httpGet);
            HttpEntity httpEntity = httpResponse.getEntity();
            String result = EntityUtils.toString(httpEntity);
            return result;
        } catch (IOException e) {
            LOGGER.error("httpClient execute failed...", e);
        } finally {
            try {
                httpResponse.close();
            } catch (IOException e) {
                LOGGER.error("httpClient close failed...", e);
            }
        }
        return null;
    }

    public static String postForm(String url, Map<String, String> params) {
        List<BasicNameValuePair> formparams = new ArrayList<>();
        params.keySet().stream().forEach(key -> formparams.add(new BasicNameValuePair(key, params.get(key))));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(entity);
        httpPost.addHeader("Content-Type", "text/html;charset=UTF-8");
        return exec(httpPost);
    }

    private static String exec(HttpUriRequest httpUriRequest) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse httpResponse = null;
        try {
            httpResponse = httpClient.execute(httpUriRequest);
            HttpEntity httpEntity = httpResponse.getEntity();
            String result = EntityUtils.toString(httpEntity);
            return result;
        } catch (IOException e) {
            LOGGER.error("httpClient execute failed...", e);
        } finally {
            try {
                httpResponse.close();
            } catch (IOException e) {
                LOGGER.error("httpClient close failed...", e);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "¥ÛCΩ¥");
        System.out.println(postForm("http://localhost:8080/WCarRepair/testForm", map));
    }
}
