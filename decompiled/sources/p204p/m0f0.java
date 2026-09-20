package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class m0f0 extends n0f0 {

    /* JADX INFO: renamed from: a */
    public final Button f138663a;

    /* JADX INFO: renamed from: b */
    public final DismissType f138664b;

    /* JADX INFO: renamed from: c */
    public final Bundle f138665c;

    public m0f0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f138663a = button;
        this.f138664b = actionDeterminedDismiss;
        this.f138665c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0f0)) {
            return false;
        }
        m0f0 m0f0Var = (m0f0) obj;
        return wj50.m88271j(this.f138663a, m0f0Var.f138663a) && wj50.m88271j(this.f138664b, m0f0Var.f138664b) && wj50.m88271j(this.f138665c, m0f0Var.f138665c);
    }

    public final int hashCode() {
        return this.f138665c.hashCode() + ((this.f138664b.hashCode() + (this.f138663a.hashCode() * 31)) * 31);
    }
}
