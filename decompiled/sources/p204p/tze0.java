package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class tze0 extends vze0 {

    /* JADX INFO: renamed from: a */
    public final Button f225229a;

    /* JADX INFO: renamed from: b */
    public final DismissType f225230b;

    /* JADX INFO: renamed from: c */
    public final Bundle f225231c;

    public tze0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f225229a = button;
        this.f225230b = actionDeterminedDismiss;
        this.f225231c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tze0)) {
            return false;
        }
        tze0 tze0Var = (tze0) obj;
        return wj50.m88271j(this.f225229a, tze0Var.f225229a) && wj50.m88271j(this.f225230b, tze0Var.f225230b) && wj50.m88271j(this.f225231c, tze0Var.f225231c);
    }

    public final int hashCode() {
        return this.f225231c.hashCode() + ((this.f225230b.hashCode() + (this.f225229a.hashCode() * 31)) * 31);
    }
}
