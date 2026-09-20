package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class z3f0 extends b04 {

    /* JADX INFO: renamed from: e */
    public final MessageResponseToken f278884e;

    static {
        int i = MessageResponseToken.$stable;
    }

    public z3f0(MessageResponseToken messageResponseToken) {
        this.f278884e = messageResponseToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3f0) && wj50.m88271j(this.f278884e, ((z3f0) obj).f278884e);
    }

    public final int hashCode() {
        return this.f278884e.hashCode();
    }
}
