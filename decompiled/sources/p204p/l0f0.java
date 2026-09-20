package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class l0f0 extends n0f0 {

    /* JADX INFO: renamed from: a */
    public final Button f128417a;

    /* JADX INFO: renamed from: b */
    public final DismissType f128418b;

    /* JADX INFO: renamed from: c */
    public final Bundle f128419c;

    public l0f0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f128417a = button;
        this.f128418b = actionDeterminedDismiss;
        this.f128419c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0f0)) {
            return false;
        }
        l0f0 l0f0Var = (l0f0) obj;
        return wj50.m88271j(this.f128417a, l0f0Var.f128417a) && wj50.m88271j(this.f128418b, l0f0Var.f128418b) && wj50.m88271j(this.f128419c, l0f0Var.f128419c);
    }

    public final int hashCode() {
        return this.f128419c.hashCode() + ((this.f128418b.hashCode() + (this.f128417a.hashCode() * 31)) * 31);
    }
}
