package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;

/* JADX INFO: loaded from: classes8.dex */
public final class fsr {

    /* JADX INFO: renamed from: a */
    public final String f72922a;

    /* JADX INFO: renamed from: b */
    public final DismissReason f72923b;

    public fsr(String str, DismissReason dismissReason) {
        this.f72922a = str;
        this.f72923b = dismissReason;
    }

    /* JADX INFO: renamed from: a */
    public final DismissReason m42570a() {
        return this.f72923b;
    }

    /* JADX INFO: renamed from: b */
    public final String m42571b() {
        return this.f72922a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsr)) {
            return false;
        }
        fsr fsrVar = (fsr) obj;
        return wj50.m88271j(this.f72922a, fsrVar.f72922a) && wj50.m88271j(this.f72923b, fsrVar.f72923b);
    }

    public final int hashCode() {
        return this.f72923b.hashCode() + (this.f72922a.hashCode() * 31);
    }
}
