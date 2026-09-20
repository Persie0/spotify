package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class yze0 extends b0f0 {

    /* JADX INFO: renamed from: a */
    public final Button f277790a;

    /* JADX INFO: renamed from: b */
    public final DismissType f277791b;

    /* JADX INFO: renamed from: c */
    public final Bundle f277792c;

    public yze0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f277790a = button;
        this.f277791b = actionDeterminedDismiss;
        this.f277792c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yze0)) {
            return false;
        }
        yze0 yze0Var = (yze0) obj;
        return wj50.m88271j(this.f277790a, yze0Var.f277790a) && wj50.m88271j(this.f277791b, yze0Var.f277791b) && wj50.m88271j(this.f277792c, yze0Var.f277792c);
    }

    public final int hashCode() {
        return this.f277792c.hashCode() + ((this.f277791b.hashCode() + (this.f277790a.hashCode() * 31)) * 31);
    }
}
