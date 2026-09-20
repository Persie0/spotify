package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class v4f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f237141a;

    /* JADX INFO: renamed from: b */
    public final wco f237142b;

    static {
        int i = MessageResponseToken.$stable;
    }

    public v4f0(MessageResponseToken messageResponseToken, wco wcoVar) {
        this.f237141a = messageResponseToken;
        this.f237142b = wcoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4f0)) {
            return false;
        }
        v4f0 v4f0Var = (v4f0) obj;
        return wj50.m88271j(this.f237141a, v4f0Var.f237141a) && wj50.m88271j(this.f237142b, v4f0Var.f237142b);
    }

    public final int hashCode() {
        return this.f237142b.hashCode() + (this.f237141a.hashCode() * 31);
    }
}
