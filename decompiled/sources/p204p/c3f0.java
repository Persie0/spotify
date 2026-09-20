package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class c3f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f33669a;

    /* JADX INFO: renamed from: b */
    public final y2f0 f33670b;

    public c3f0(MessageResponseToken messageResponseToken, y2f0 y2f0Var) {
        this.f33669a = messageResponseToken;
        this.f33670b = y2f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3f0)) {
            return false;
        }
        c3f0 c3f0Var = (c3f0) obj;
        return wj50.m88271j(this.f33669a, c3f0Var.f33669a) && wj50.m88271j(this.f33670b, c3f0Var.f33670b);
    }

    public final int hashCode() {
        return this.f33670b.hashCode() + (this.f33669a.hashCode() * 31);
    }
}
