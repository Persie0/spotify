package p204p;

import io.ably.lib.rest.Auth;

/* JADX INFO: loaded from: classes16.dex */
public final class ec20 extends hc20 implements gc20 {

    /* JADX INFO: renamed from: b */
    public String f58216b = Auth.WILDCARD_CLIENTID;

    /* JADX INFO: renamed from: e */
    public final void m38467e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.f58216b = str;
    }
}
