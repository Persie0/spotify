package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class rze0 extends vze0 {

    /* JADX INFO: renamed from: a */
    public final Button f204145a;

    /* JADX INFO: renamed from: b */
    public final DismissType f204146b;

    /* JADX INFO: renamed from: c */
    public final Bundle f204147c;

    public rze0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.f204145a = button;
        this.f204146b = actionDeterminedDismiss;
        this.f204147c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rze0)) {
            return false;
        }
        rze0 rze0Var = (rze0) obj;
        return wj50.m88271j(this.f204145a, rze0Var.f204145a) && wj50.m88271j(this.f204146b, rze0Var.f204146b) && wj50.m88271j(this.f204147c, rze0Var.f204147c);
    }

    public final int hashCode() {
        return this.f204147c.hashCode() + ((this.f204146b.hashCode() + (this.f204145a.hashCode() * 31)) * 31);
    }
}
