package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class j0f0 extends n0f0 {

    /* JADX INFO: renamed from: a */
    public final Button f107448a;

    /* JADX INFO: renamed from: b */
    public final DismissType f107449b;

    /* JADX INFO: renamed from: c */
    public final Bundle f107450c;

    public j0f0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f107448a = button;
        this.f107449b = actionDeterminedDismiss;
        this.f107450c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0f0)) {
            return false;
        }
        j0f0 j0f0Var = (j0f0) obj;
        return wj50.m88271j(this.f107448a, j0f0Var.f107448a) && wj50.m88271j(this.f107449b, j0f0Var.f107449b) && wj50.m88271j(this.f107450c, j0f0Var.f107450c);
    }

    public final int hashCode() {
        return this.f107450c.hashCode() + ((this.f107449b.hashCode() + (this.f107448a.hashCode() * 31)) * 31);
    }
}
