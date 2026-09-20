package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class o0f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f160378a;

    /* JADX INFO: renamed from: b */
    public final h0f0 f160379b;

    static {
        int i = MessageResponseToken.$stable;
    }

    public o0f0(MessageResponseToken messageResponseToken, h0f0 h0f0Var) {
        this.f160378a = messageResponseToken;
        this.f160379b = h0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0f0)) {
            return false;
        }
        o0f0 o0f0Var = (o0f0) obj;
        return wj50.m88271j(this.f160378a, o0f0Var.f160378a) && this.f160379b.equals(o0f0Var.f160379b);
    }

    public final int hashCode() {
        return this.f160379b.hashCode() + (this.f160378a.hashCode() * 31);
    }
}
