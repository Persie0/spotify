package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class q8d0 {

    /* JADX INFO: renamed from: a */
    public final zvm0 f186305a;

    /* JADX INFO: renamed from: b */
    public final Bundle f186306b;

    public q8d0(zvm0 zvm0Var, Bundle bundle) {
        this.f186305a = zvm0Var;
        this.f186306b = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m72325a() {
        return this.f186306b;
    }

    /* JADX INFO: renamed from: b */
    public final zvm0 m72326b() {
        return this.f186305a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8d0)) {
            return false;
        }
        q8d0 q8d0Var = (q8d0) obj;
        return wj50.m88271j(this.f186305a, q8d0Var.f186305a) && wj50.m88271j(this.f186306b, q8d0Var.f186306b);
    }

    public final int hashCode() {
        return this.f186306b.hashCode() + (this.f186305a.f286742a.hashCode() * 31);
    }
}
