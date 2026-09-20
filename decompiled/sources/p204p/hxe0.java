package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class hxe0 extends ixe0 {

    /* JADX INFO: renamed from: a */
    public final Button f96205a;

    /* JADX INFO: renamed from: b */
    public final DismissType f96206b;

    /* JADX INFO: renamed from: c */
    public final Bundle f96207c;

    public hxe0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f96205a = button;
        this.f96206b = actionDeterminedDismiss;
        this.f96207c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxe0)) {
            return false;
        }
        hxe0 hxe0Var = (hxe0) obj;
        return wj50.m88271j(this.f96205a, hxe0Var.f96205a) && wj50.m88271j(this.f96206b, hxe0Var.f96206b) && wj50.m88271j(this.f96207c, hxe0Var.f96207c);
    }

    public final int hashCode() {
        return this.f96207c.hashCode() + ((this.f96206b.hashCode() + (this.f96205a.hashCode() * 31)) * 31);
    }
}
