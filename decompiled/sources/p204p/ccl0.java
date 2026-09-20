package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class ccl0 {

    /* JADX INFO: renamed from: a */
    public final String f36431a;

    /* JADX INFO: renamed from: b */
    public final z650 f36432b;

    /* JADX INFO: renamed from: c */
    public final Bundle f36433c;

    public ccl0(String str, z650 z650Var, Bundle bundle) {
        this.f36431a = str;
        this.f36432b = z650Var;
        this.f36433c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccl0)) {
            return false;
        }
        ccl0 ccl0Var = (ccl0) obj;
        return wj50.m88271j(this.f36431a, ccl0Var.f36431a) && wj50.m88271j(this.f36432b, ccl0Var.f36432b) && wj50.m88271j(this.f36433c, ccl0Var.f36433c);
    }

    public final int hashCode() {
        return this.f36433c.hashCode() + s571.m77243b(this.f36431a.hashCode() * 31, 31, this.f36432b.f279709a);
    }
}
