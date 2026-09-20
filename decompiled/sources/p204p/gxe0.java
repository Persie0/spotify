package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class gxe0 extends ixe0 {

    /* JADX INFO: renamed from: a */
    public final Button f85272a;

    /* JADX INFO: renamed from: b */
    public final DismissType f85273b;

    /* JADX INFO: renamed from: c */
    public final Bundle f85274c;

    public gxe0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f85272a = button;
        this.f85273b = actionDeterminedDismiss;
        this.f85274c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxe0)) {
            return false;
        }
        gxe0 gxe0Var = (gxe0) obj;
        return wj50.m88271j(this.f85272a, gxe0Var.f85272a) && wj50.m88271j(this.f85273b, gxe0Var.f85273b) && wj50.m88271j(this.f85274c, gxe0Var.f85274c);
    }

    public final int hashCode() {
        return this.f85274c.hashCode() + ((this.f85273b.hashCode() + (this.f85272a.hashCode() * 31)) * 31);
    }
}
