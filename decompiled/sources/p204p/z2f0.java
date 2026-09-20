package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class z2f0 extends b3f0 {

    /* JADX INFO: renamed from: a */
    public final Button f278564a;

    /* JADX INFO: renamed from: b */
    public final DismissType f278565b;

    /* JADX INFO: renamed from: c */
    public final Bundle f278566c;

    public z2f0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f278564a = button;
        this.f278565b = actionDeterminedDismiss;
        this.f278566c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2f0)) {
            return false;
        }
        z2f0 z2f0Var = (z2f0) obj;
        return wj50.m88271j(this.f278564a, z2f0Var.f278564a) && wj50.m88271j(this.f278565b, z2f0Var.f278565b) && wj50.m88271j(this.f278566c, z2f0Var.f278566c);
    }

    public final int hashCode() {
        return this.f278566c.hashCode() + ((this.f278565b.hashCode() + (this.f278564a.hashCode() * 31)) * 31);
    }
}
