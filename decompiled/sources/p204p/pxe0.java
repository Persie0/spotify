package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class pxe0 extends sxe0 {

    /* JADX INFO: renamed from: a */
    public final Button f182292a;

    /* JADX INFO: renamed from: b */
    public final DismissType f182293b;

    /* JADX INFO: renamed from: c */
    public final Bundle f182294c;

    public pxe0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f182292a = button;
        this.f182293b = actionDeterminedDismiss;
        this.f182294c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxe0)) {
            return false;
        }
        pxe0 pxe0Var = (pxe0) obj;
        return wj50.m88271j(this.f182292a, pxe0Var.f182292a) && wj50.m88271j(this.f182293b, pxe0Var.f182293b) && wj50.m88271j(this.f182294c, pxe0Var.f182294c);
    }

    public final int hashCode() {
        return this.f182294c.hashCode() + ((this.f182293b.hashCode() + (this.f182292a.hashCode() * 31)) * 31);
    }
}
