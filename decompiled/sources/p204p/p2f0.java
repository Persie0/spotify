package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class p2f0 extends r2f0 {

    /* JADX INFO: renamed from: a */
    public final Button f173347a;

    public p2f0(Button button) {
        this.f173347a = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2f0) && wj50.m88271j(this.f173347a, ((p2f0) obj).f173347a);
    }

    public final int hashCode() {
        return this.f173347a.hashCode();
    }
}
