package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class l2f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f129000a;

    /* JADX INFO: renamed from: b */
    public final boolean f129001b;

    public l2f0(MessageResponseToken messageResponseToken, boolean z) {
        this.f129000a = messageResponseToken;
        this.f129001b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2f0)) {
            return false;
        }
        l2f0 l2f0Var = (l2f0) obj;
        return wj50.m88271j(this.f129000a, l2f0Var.f129000a) && this.f129001b == l2f0Var.f129001b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129001b) + (this.f129000a.hashCode() * 31);
    }
}
