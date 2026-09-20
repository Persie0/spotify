package p204p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;

/* JADX INFO: loaded from: classes8.dex */
public final class k3f0 extends r3f0 {

    /* JADX INFO: renamed from: a */
    public final String f118871a;

    /* JADX INFO: renamed from: b */
    public final DismissType f118872b;

    /* JADX INFO: renamed from: c */
    public final Bundle f118873c;

    public k3f0(String str, DismissType dismissType, Bundle bundle) {
        this.f118871a = str;
        this.f118872b = dismissType;
        this.f118873c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3f0)) {
            return false;
        }
        k3f0 k3f0Var = (k3f0) obj;
        return wj50.m88271j(this.f118871a, k3f0Var.f118871a) && wj50.m88271j(this.f118872b, k3f0Var.f118872b) && wj50.m88271j(this.f118873c, k3f0Var.f118873c);
    }

    public final int hashCode() {
        return this.f118873c.hashCode() + ((this.f118872b.hashCode() + (this.f118871a.hashCode() * 31)) * 31);
    }
}
