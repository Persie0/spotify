package com.google.android.gms.internal.meet_coactivities;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;
import p204p.pka1;

/* JADX INFO: loaded from: classes4.dex */
final class zzama {
    public static final PasswordAuthentication zza(String str, InetAddress inetAddress, int i, String str2, String str3, String str4) {
        URL url;
        try {
            url = new URL(pka1.f178421b, str, i, "");
        } catch (MalformedURLException unused) {
            zzamc.zza.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{pka1.f178421b, str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, pka1.f178421b, "", null, url, Authenticator.RequestorType.PROXY);
    }
}
