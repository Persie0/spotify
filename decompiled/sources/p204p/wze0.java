package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class wze0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f256579a;

    /* JADX INFO: renamed from: b */
    public final qze0 f256580b;

    static {
        int i = MessageResponseToken.$stable;
    }

    public wze0(MessageResponseToken messageResponseToken, qze0 qze0Var) {
        this.f256579a = messageResponseToken;
        this.f256580b = qze0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wze0)) {
            return false;
        }
        wze0 wze0Var = (wze0) obj;
        return wj50.m88271j(this.f256579a, wze0Var.f256579a) && this.f256580b.equals(wze0Var.f256580b);
    }

    public final int hashCode() {
        return this.f256580b.hashCode() + (this.f256579a.hashCode() * 31);
    }
}
