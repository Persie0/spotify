package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class dxe0 extends ixe0 {

    /* JADX INFO: renamed from: a */
    public final Button f53940a;

    /* JADX INFO: renamed from: b */
    public final DismissType f53941b;

    /* JADX INFO: renamed from: c */
    public final Bundle f53942c;

    public dxe0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f53940a = button;
        this.f53941b = actionDeterminedDismiss;
        this.f53942c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxe0)) {
            return false;
        }
        dxe0 dxe0Var = (dxe0) obj;
        return wj50.m88271j(this.f53940a, dxe0Var.f53940a) && wj50.m88271j(this.f53941b, dxe0Var.f53941b) && wj50.m88271j(this.f53942c, dxe0Var.f53942c);
    }

    public final int hashCode() {
        return this.f53942c.hashCode() + ((this.f53941b.hashCode() + (this.f53940a.hashCode() * 31)) * 31);
    }
}
