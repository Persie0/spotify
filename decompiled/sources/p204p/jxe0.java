package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class jxe0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f117117a;

    /* JADX INFO: renamed from: b */
    public final bxe0 f117118b;

    public jxe0(MessageResponseToken messageResponseToken, bxe0 bxe0Var) {
        this.f117117a = messageResponseToken;
        this.f117118b = bxe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxe0)) {
            return false;
        }
        jxe0 jxe0Var = (jxe0) obj;
        return wj50.m88271j(this.f117117a, jxe0Var.f117117a) && wj50.m88271j(this.f117118b, jxe0Var.f117118b);
    }

    public final int hashCode() {
        return this.f117118b.hashCode() + (this.f117117a.hashCode() * 31);
    }
}
