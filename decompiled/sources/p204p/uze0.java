package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class uze0 extends vze0 {

    /* JADX INFO: renamed from: a */
    public final Button f235539a;

    /* JADX INFO: renamed from: b */
    public final DismissType f235540b;

    /* JADX INFO: renamed from: c */
    public final Bundle f235541c;

    public uze0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f235539a = button;
        this.f235540b = actionDeterminedDismiss;
        this.f235541c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uze0)) {
            return false;
        }
        uze0 uze0Var = (uze0) obj;
        return wj50.m88271j(this.f235539a, uze0Var.f235539a) && wj50.m88271j(this.f235540b, uze0Var.f235540b) && wj50.m88271j(this.f235541c, uze0Var.f235541c);
    }

    public final int hashCode() {
        return this.f235541c.hashCode() + ((this.f235540b.hashCode() + (this.f235539a.hashCode() * 31)) * 31);
    }
}
