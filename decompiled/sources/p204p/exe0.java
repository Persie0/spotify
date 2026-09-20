package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class exe0 extends ixe0 {

    /* JADX INFO: renamed from: a */
    public final Button f63749a;

    /* JADX INFO: renamed from: b */
    public final DismissType f63750b;

    /* JADX INFO: renamed from: c */
    public final Bundle f63751c;

    public exe0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f63749a = button;
        this.f63750b = actionDeterminedDismiss;
        this.f63751c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exe0)) {
            return false;
        }
        exe0 exe0Var = (exe0) obj;
        return wj50.m88271j(this.f63749a, exe0Var.f63749a) && wj50.m88271j(this.f63750b, exe0Var.f63750b) && wj50.m88271j(this.f63751c, exe0Var.f63751c);
    }

    public final int hashCode() {
        return this.f63751c.hashCode() + ((this.f63750b.hashCode() + (this.f63749a.hashCode() * 31)) * 31);
    }
}
