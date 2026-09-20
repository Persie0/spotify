package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class ffa extends uxg1 {

    /* JADX INFO: renamed from: b */
    public final MessageResponseToken f68957b;

    /* JADX INFO: renamed from: c */
    public final DismissReason f68958c;

    static {
        int i = MessageResponseToken.$stable;
    }

    public ffa(MessageResponseToken messageResponseToken, DismissReason dismissReason) {
        this.f68957b = messageResponseToken;
        this.f68958c = dismissReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffa)) {
            return false;
        }
        ffa ffaVar = (ffa) obj;
        return wj50.m88271j(this.f68957b, ffaVar.f68957b) && wj50.m88271j(this.f68958c, ffaVar.f68958c);
    }

    public final int hashCode() {
        return this.f68958c.hashCode() + (this.f68957b.hashCode() * 31);
    }
}
