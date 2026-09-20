package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes7.dex */
public final class xve0 extends yve0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f266375a;

    /* JADX INFO: renamed from: b */
    public final String f266376b;

    /* JADX INFO: renamed from: c */
    public final String f266377c;

    /* JADX INFO: renamed from: d */
    public final String f266378d;

    static {
        int i = MessageResponseToken.$stable;
    }

    public xve0(MessageResponseToken messageResponseToken, String str, String str2, String str3) {
        this.f266375a = messageResponseToken;
        this.f266376b = str;
        this.f266377c = str2;
        this.f266378d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xve0)) {
            return false;
        }
        xve0 xve0Var = (xve0) obj;
        return wj50.m88271j(this.f266375a, xve0Var.f266375a) && wj50.m88271j(this.f266376b, xve0Var.f266376b) && wj50.m88271j(this.f266377c, xve0Var.f266377c) && wj50.m88271j(this.f266378d, xve0Var.f266378d);
    }

    public final int hashCode() {
        return this.f266378d.hashCode() + s571.m77243b(s571.m77243b(this.f266375a.hashCode() * 31, 31, this.f266376b), 31, this.f266377c);
    }
}
