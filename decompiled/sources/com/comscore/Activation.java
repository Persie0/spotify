package com.comscore;

import com.comscore.util.CrossPublisherIdUtil;
import com.comscore.util.setup.Setup;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p196j$.net.URLEncoder;

/* JADX INFO: loaded from: classes3.dex */
public class Activation {

    /* JADX INFO: renamed from: a */
    private static final String f1504a = "https://segment-data-us-east.zqtk.net/%s?url=%s&c2=%s&c12=%s&ns_ap_bi=%s&ns_ap_sv=%s&ns_ap_an=%s&ns_ap_ver=%s&ns_ap_pn=android";

    /* JADX INFO: renamed from: b */
    private static final String f1505b = "\\{\\s*\".*\"\\s*:\\s*[^\\}]*\\s*\\}";

    /* JADX INFO: renamed from: c */
    private static final Integer f1506c = 60000;

    /* JADX INFO: renamed from: d */
    private static final Integer f1507d = 60000;

    public interface ActivationListener {
        void onReceivedCategories(List<String> list);
    }

    /* JADX INFO: renamed from: com.comscore.Activation$a */
    public class C0115a implements CrossPublisherIdUtil.Listener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f1508a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f1509b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f1510c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f1511d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ActivationListener f1512e;

        /* JADX INFO: renamed from: com.comscore.Activation$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f1513a;

            public a(String str) {
                this.f1513a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0115a c0115a = C0115a.this;
                C0115a.this.f1512e.onReceivedCategories(Activation.m1190a(c0115a.f1508a, c0115a.f1509b, c0115a.f1510c, c0115a.f1511d, this.f1513a));
            }
        }

        public C0115a(String str, String str2, String str3, String str4, ActivationListener activationListener) {
            this.f1508a = str;
            this.f1509b = str2;
            this.f1510c = str3;
            this.f1511d = str4;
            this.f1512e = activationListener;
        }

        @Override // com.comscore.util.CrossPublisherIdUtil.Listener
        public void onCrossPublisherIdRequested(String str, boolean z) {
            new Thread(new a(str)).start();
        }
    }

    /* JADX INFO: renamed from: com.comscore.Activation$b */
    public class C0116b implements Configuration.ConfigurationListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f1515a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f1516b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f1517c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f1518d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ActivationListener f1519e;

        public C0116b(String str, String str2, String str3, String str4, ActivationListener activationListener) {
            this.f1515a = str;
            this.f1516b = str2;
            this.f1517c = str3;
            this.f1518d = str4;
            this.f1519e = activationListener;
        }

        @Override // com.comscore.Configuration.ConfigurationListener
        public void onConfigurationChanged(int i) {
            if (i != 20307) {
                return;
            }
            Activation.m1191a(this.f1515a, this.f1516b, this.f1517c, this.f1518d, this.f1519e);
            Analytics.getConfiguration().m1203b(this);
        }
    }

    private Activation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static List<String> m1190a(String str, String str2, String str3, String str4, String str5) {
        int i;
        JSONArray jSONArray;
        if (!Setup.isSetUpFinished() || str3 == null || str4 == null) {
            return new ArrayList();
        }
        String applicationId = Setup.getJniComScoreHelper().getApplicationId();
        String version = Analytics.getVersion();
        String applicationName = Setup.getJniComScoreHelper().getApplicationName();
        String applicationVersion = Setup.getJniComScoreHelper().getApplicationVersion();
        if (applicationId == null || version == null || applicationName == null || applicationVersion == null || str3.isEmpty() || str4.isEmpty() || applicationId.isEmpty() || version.isEmpty() || applicationName.isEmpty() || applicationVersion.isEmpty()) {
            return new ArrayList();
        }
        try {
            String str6 = "https://segment-data-us-east.zqtk.net/" + URLEncoder.encode(str, "UTF-8") + "?url=" + URLEncoder.encode(str2, "UTF-8") + "&c2=" + URLEncoder.encode(str3, "UTF-8") + "&c12=" + URLEncoder.encode(str4, "UTF-8") + "&ns_ap_bi=" + URLEncoder.encode(applicationId, "UTF-8") + "&ns_ap_sv=" + URLEncoder.encode(version, "UTF-8") + "&ns_ap_an=" + URLEncoder.encode(applicationName, "UTF-8") + "&ns_ap_ver=" + URLEncoder.encode(applicationVersion, "UTF-8") + "&ns_ap_pn=android";
            if (str5 != null && !str5.isEmpty()) {
                str6 = str6 + "&ns_ak=" + URLEncoder.encode(str5, "UTF-8");
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str6).openConnection();
                httpURLConnection.setConnectTimeout(f1506c.intValue());
                httpURLConnection.setReadTimeout(f1507d.intValue());
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = bufferedInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i2);
                        return new ArrayList();
                    }
                    httpURLConnection.disconnect();
                    Matcher matcher = Pattern.compile(f1505b).matcher(byteArrayOutputStream.toString("UTF-8"));
                    if (!matcher.find()) {
                        return new ArrayList();
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(matcher.group(0));
                        try {
                            jSONArray = jSONObject.getJSONArray("data");
                        } catch (JSONException unused) {
                            jSONArray = jSONObject.getJSONArray("errors");
                        }
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (i = 0; i < length; i++) {
                            arrayList.add(jSONArray.optString(i));
                        }
                        return arrayList;
                    } catch (JSONException unused2) {
                        return new ArrayList();
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    byteArrayOutputStream.toString("UTF-8");
                    throw th;
                }
            } catch (IOException unused3) {
                return new ArrayList();
            }
        } catch (UnsupportedEncodingException unused4) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1191a(String str, String str2, String str3, String str4, ActivationListener activationListener) {
        if (Analytics.getConfiguration().m1205d()) {
            CrossPublisherIdUtil.requestCrossPublisherId(new C0115a(str, str2, str3, str4, activationListener));
        } else {
            Analytics.getConfiguration().m1200a(new C0116b(str, str2, str3, str4, activationListener));
        }
    }
}
