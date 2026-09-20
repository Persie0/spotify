package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class yte0 extends zte0 {

    /* JADX INFO: renamed from: a */
    public final v2a1 f276108a;

    /* JADX INFO: renamed from: b */
    public final Message f276109b;

    public yte0(v2a1 v2a1Var, Message.CreativeMessage creativeMessage) {
        this.f276108a = v2a1Var;
        this.f276109b = creativeMessage;
    }

    @Override // p204p.zte0
    /* JADX INFO: renamed from: a */
    public final v2a1 mo79239a() {
        return this.f276108a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yte0)) {
            return false;
        }
        yte0 yte0Var = (yte0) obj;
        return wj50.m88271j(this.f276108a, yte0Var.f276108a) && wj50.m88271j(this.f276109b, yte0Var.f276109b);
    }

    public final int hashCode() {
        return this.f276109b.hashCode() + (this.f276108a.hashCode() * 31);
    }
}
