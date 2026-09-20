package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class o2f0 extends r2f0 {

    /* JADX INFO: renamed from: a */
    public final Button f161039a;

    /* JADX INFO: renamed from: b */
    public final DismissType f161040b;

    /* JADX INFO: renamed from: c */
    public final Bundle f161041c;

    public o2f0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f161039a = button;
        this.f161040b = actionDeterminedDismiss;
        this.f161041c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2f0)) {
            return false;
        }
        o2f0 o2f0Var = (o2f0) obj;
        return wj50.m88271j(this.f161039a, o2f0Var.f161039a) && wj50.m88271j(this.f161040b, o2f0Var.f161040b) && wj50.m88271j(this.f161041c, o2f0Var.f161041c);
    }

    public final int hashCode() {
        return this.f161041c.hashCode() + ((this.f161040b.hashCode() + (this.f161039a.hashCode() * 31)) * 31);
    }
}
