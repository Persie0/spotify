package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class zze0 extends b0f0 {

    /* JADX INFO: renamed from: a */
    public final Button f287957a;

    public zze0(Button button) {
        this.f287957a = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zze0) && wj50.m88271j(this.f287957a, ((zze0) obj).f287957a);
    }

    public final int hashCode() {
        return this.f287957a.hashCode();
    }
}
