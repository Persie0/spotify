package p204p;

import android.net.ConnectivityManager;
import android.net.Network;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.chromium.net.impl.NetworkExceptionImpl;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class le60 implements ve60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132472a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ue60 f132473b;

    public /* synthetic */ le60(ue60 ue60Var, int i) {
        this.f132472a = i;
        this.f132473b = ue60Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    @Override // p204p.ve60
    /* JADX INFO: renamed from: run */
    public final void mo98370run() throws IOException {
        List list;
        switch (this.f132472a) {
            case 0:
                ue60 ue60Var = this.f132473b;
                re60 re60Var = ue60Var.f229414a;
                if (ue60Var.f229430q == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                String headerField = "http/1.1";
                int i = 0;
                while (true) {
                    String headerFieldKey = ue60Var.f229430q.getHeaderFieldKey(i);
                    if (headerFieldKey == null) {
                        int responseCode = ue60Var.f229430q.getResponseCode();
                        yka1 yka1Var = new yka1(new ArrayList(ue60Var.f229418e), responseCode, ue60Var.f229430q.getResponseMessage(), Collections.unmodifiableList(arrayList), headerField);
                        if (responseCode >= 300 && responseCode < 400 && (list = (List) yka1Var.f273660g.getAsMap().get("location")) != null) {
                            ue60Var.m82897f(1, 2, new zq4(ue60Var, (String) list.get(0), yka1Var, 24));
                            return;
                        }
                        ue60Var.f229428o = yka1Var;
                        ue60Var.m82895d();
                        if (responseCode < 400) {
                            InputStream inputStream = ue60Var.f229430q.getInputStream();
                            ue60Var.f229427n = inputStream instanceof FileInputStream ? ((FileInputStream) inputStream).getChannel() : new nw40(inputStream);
                            re60Var.getClass();
                            re60Var.m75383b(new yaz(re60Var, 19), "onResponseStarted");
                            return;
                        }
                        InputStream errorStream = ue60Var.f229430q.getErrorStream();
                        ue60Var.f229427n = errorStream == null ? null : errorStream instanceof FileInputStream ? ((FileInputStream) errorStream).getChannel() : new nw40(errorStream);
                        re60Var.getClass();
                        re60Var.m75383b(new yaz(re60Var, 19), "onResponseStarted");
                        return;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        headerField = ue60Var.f229430q.getHeaderField(i);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, ue60Var.f229430q.getHeaderField(i)));
                    }
                    i++;
                }
                break;
            default:
                ue60 ue60Var2 = this.f132473b;
                if (ue60Var2.f229419f.get() == 8) {
                    return;
                }
                URL url = new URL(ue60Var2.f229426m);
                HttpURLConnection httpURLConnection = ue60Var2.f229430q;
                Network network = null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    ue60Var2.f229430q = null;
                }
                long j = ue60Var2.f229435v;
                if (j == -1) {
                    ue60Var2.f229430q = (HttpURLConnection) url.openConnection();
                } else {
                    for (Network network2 : ((ConnectivityManager) ue60Var2.f229432s.f68355g.getSystemService("connectivity")).getAllNetworks()) {
                        if (network2.getNetworkHandle() == j) {
                            network = network2;
                            if (network != null) {
                                throw new NetworkExceptionImpl();
                            }
                            ue60Var2.f229430q = (HttpURLConnection) network.openConnection(url);
                        }
                    }
                    if (network != null) {
                        throw new NetworkExceptionImpl();
                    }
                    ue60Var2.f229430q = (HttpURLConnection) network.openConnection(url);
                }
                ue60Var2.f229430q.setInstanceFollowRedirects(false);
                if (!ue60Var2.f229417d.containsKey("User-Agent")) {
                    ue60Var2.f229417d.put("User-Agent", ue60Var2.f229416c);
                }
                for (Map.Entry entry : ue60Var2.f229417d.entrySet()) {
                    ue60Var2.f229430q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                ue60Var2.f229430q.setRequestMethod(ue60Var2.f229422i);
                lfa1 lfa1Var = ue60Var2.f229423j;
                if (lfa1Var != null) {
                    se60 se60Var = new se60(ue60Var2, ue60Var2.f229424k, ue60Var2.f229415b, ue60Var2.f229430q, lfa1Var);
                    ue60Var2.f229431r = se60Var;
                    se60Var.m53082b(new cqp(se60Var, ue60Var2.f229418e.size() == 1, 1), "start");
                    return;
                } else {
                    ue60Var2.f229425l = 10;
                    ue60Var2.f229430q.connect();
                    ue60Var2.f229425l = 13;
                    ue60Var2.m82894c(new ke60(ue60Var2, new le60(ue60Var2, 0), 2), "fireGetHeaders");
                    return;
                }
        }
    }
}
