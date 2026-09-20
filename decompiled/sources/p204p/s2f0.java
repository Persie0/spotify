package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class s2f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f204999a;

    /* JADX INFO: renamed from: b */
    public final n2f0 f205000b;

    public s2f0(MessageResponseToken messageResponseToken, n2f0 n2f0Var) {
        this.f204999a = messageResponseToken;
        this.f205000b = n2f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2f0)) {
            return false;
        }
        s2f0 s2f0Var = (s2f0) obj;
        return wj50.m88271j(this.f204999a, s2f0Var.f204999a) && wj50.m88271j(this.f205000b, s2f0Var.f205000b);
    }

    public final int hashCode() {
        return this.f205000b.hashCode() + (this.f204999a.hashCode() * 31);
    }
}
