package org.chromium.net;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p204p.s571;

/* JADX INFO: loaded from: classes11.dex */
public final class Proxy {
    public static final int HTTP = 0;
    public static final int HTTPS = 1;
    private final Callback mCallback;
    private final String mHost;
    private final int mPort;
    private final int mScheme;

    public static abstract class Callback {
        public abstract List<Map.Entry<String, String>> onBeforeTunnelRequest();

        public abstract boolean onTunnelHeadersReceived(List<Map.Entry<String, String>> list, int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Scheme {
    }

    public Proxy(int i, String str, int i2, Callback callback) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(s571.m77246e(i, "Unknown scheme "));
        }
        this.mScheme = i;
        Objects.requireNonNull(str);
        this.mHost = str;
        this.mPort = i2;
        Objects.requireNonNull(callback);
        this.mCallback = callback;
    }

    public Callback getCallback() {
        return this.mCallback;
    }

    public String getHost() {
        return this.mHost;
    }

    public int getPort() {
        return this.mPort;
    }

    public int getScheme() {
        return this.mScheme;
    }
}
