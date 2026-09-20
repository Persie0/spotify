package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class qxe0 extends sxe0 {

    /* JADX INFO: renamed from: a */
    public final Button f193634a;

    /* JADX INFO: renamed from: b */
    public final DismissType f193635b;

    /* JADX INFO: renamed from: c */
    public final Bundle f193636c;

    public qxe0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f193634a = button;
        this.f193635b = actionDeterminedDismiss;
        this.f193636c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxe0)) {
            return false;
        }
        qxe0 qxe0Var = (qxe0) obj;
        return wj50.m88271j(this.f193634a, qxe0Var.f193634a) && wj50.m88271j(this.f193635b, qxe0Var.f193635b) && wj50.m88271j(this.f193636c, qxe0Var.f193636c);
    }

    public final int hashCode() {
        return this.f193636c.hashCode() + ((this.f193635b.hashCode() + (this.f193634a.hashCode() * 31)) * 31);
    }
}
