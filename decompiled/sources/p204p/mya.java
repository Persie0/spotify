package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;

/* JADX INFO: loaded from: classes2.dex */
public final class mya extends vya {

    /* JADX INFO: renamed from: a */
    public final String f148373a;

    /* JADX INFO: renamed from: b */
    public final DismissReason f148374b;

    public mya(String str, DismissReason dismissReason) {
        this.f148373a = str;
        this.f148374b = dismissReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mya)) {
            return false;
        }
        mya myaVar = (mya) obj;
        return wj50.m88271j(this.f148373a, myaVar.f148373a) && wj50.m88271j(this.f148374b, myaVar.f148374b);
    }

    public final int hashCode() {
        return this.f148374b.hashCode() + (this.f148373a.hashCode() * 31);
    }
}
