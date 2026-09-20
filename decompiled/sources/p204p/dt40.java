package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;

/* JADX INFO: loaded from: classes8.dex */
public final class dt40 extends ft40 {

    /* JADX INFO: renamed from: a */
    public final DismissReason f52725a;

    public dt40(DismissReason dismissReason) {
        this.f52725a = dismissReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dt40) && wj50.m88271j(this.f52725a, ((dt40) obj).f52725a);
    }

    public final int hashCode() {
        return this.f52725a.hashCode();
    }
}
