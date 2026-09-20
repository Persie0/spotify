package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class e3f0 extends j3f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f55766a;

    /* JADX INFO: renamed from: b */
    public final DiscardReason.PresentationFailed f55767b;

    public e3f0(MessageResponseToken messageResponseToken, DiscardReason.PresentationFailed presentationFailed) {
        this.f55766a = messageResponseToken;
        this.f55767b = presentationFailed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3f0)) {
            return false;
        }
        e3f0 e3f0Var = (e3f0) obj;
        return wj50.m88271j(this.f55766a, e3f0Var.f55766a) && this.f55767b.equals(e3f0Var.f55767b);
    }

    public final int hashCode() {
        return this.f55767b.hashCode() + (this.f55766a.hashCode() * 31);
    }
}
