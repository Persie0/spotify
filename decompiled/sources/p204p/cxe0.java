package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class cxe0 extends ixe0 {

    /* JADX INFO: renamed from: a */
    public final Button f43016a;

    public cxe0(Button button) {
        this.f43016a = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxe0) && wj50.m88271j(this.f43016a, ((cxe0) obj).f43016a);
    }

    public final int hashCode() {
        return this.f43016a.hashCode();
    }
}
