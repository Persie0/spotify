package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: classes8.dex */
public final class c0f0 {

    /* JADX INFO: renamed from: a */
    public final MessageResponseToken f32771a;

    /* JADX INFO: renamed from: b */
    public final xze0 f32772b;

    /* JADX INFO: renamed from: c */
    public final String f32773c;

    public c0f0(MessageResponseToken messageResponseToken, xze0 xze0Var, String str) {
        this.f32771a = messageResponseToken;
        this.f32772b = xze0Var;
        this.f32773c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0f0)) {
            return false;
        }
        c0f0 c0f0Var = (c0f0) obj;
        return wj50.m88271j(this.f32771a, c0f0Var.f32771a) && wj50.m88271j(this.f32772b, c0f0Var.f32772b) && wj50.m88271j(this.f32773c, c0f0Var.f32773c);
    }

    public final int hashCode() {
        int iHashCode = (this.f32772b.hashCode() + (this.f32771a.hashCode() * 31)) * 31;
        String str = this.f32773c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
