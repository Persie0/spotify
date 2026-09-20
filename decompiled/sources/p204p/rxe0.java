package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class rxe0 extends sxe0 {

    /* JADX INFO: renamed from: a */
    public final Button f203579a;

    /* JADX INFO: renamed from: b */
    public final Bundle f203580b;

    public rxe0(Button button) {
        Bundle bundle = new Bundle();
        this.f203579a = button;
        this.f203580b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxe0)) {
            return false;
        }
        rxe0 rxe0Var = (rxe0) obj;
        return wj50.m88271j(this.f203579a, rxe0Var.f203579a) && wj50.m88271j(this.f203580b, rxe0Var.f203580b);
    }

    public final int hashCode() {
        return this.f203580b.hashCode() + (this.f203579a.hashCode() * 31);
    }
}
