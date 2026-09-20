package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;

/* JADX INFO: loaded from: classes8.dex */
public final class d3f0 extends j3f0 {

    /* JADX INFO: renamed from: a */
    public final Button f44873a;

    /* JADX INFO: renamed from: b */
    public final MessageResponseToken f44874b;

    /* JADX INFO: renamed from: c */
    public final Bundle f44875c;

    /* JADX INFO: renamed from: d */
    public final DismissType f44876d;

    public d3f0(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        this.f44873a = button;
        this.f44874b = messageResponseToken;
        this.f44875c = bundle;
        this.f44876d = dismissType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3f0)) {
            return false;
        }
        d3f0 d3f0Var = (d3f0) obj;
        return wj50.m88271j(this.f44873a, d3f0Var.f44873a) && wj50.m88271j(this.f44874b, d3f0Var.f44874b) && wj50.m88271j(this.f44875c, d3f0Var.f44875c) && wj50.m88271j(this.f44876d, d3f0Var.f44876d);
    }

    public final int hashCode() {
        return this.f44876d.hashCode() + ((this.f44875c.hashCode() + ((this.f44874b.hashCode() + (this.f44873a.hashCode() * 31)) * 31)) * 31);
    }
}
