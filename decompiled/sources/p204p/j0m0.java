package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class j0m0 {

    /* JADX INFO: renamed from: a */
    public final Class f107485a;

    /* JADX INFO: renamed from: b */
    public final Bundle f107486b;

    public j0m0(Bundle bundle, Class cls) {
        this.f107485a = cls;
        this.f107486b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0m0)) {
            return false;
        }
        j0m0 j0m0Var = (j0m0) obj;
        return wj50.m88271j(this.f107485a, j0m0Var.f107485a) && wj50.m88271j(this.f107486b, j0m0Var.f107486b);
    }

    public final int hashCode() {
        return this.f107486b.hashCode() + (this.f107485a.hashCode() * 31);
    }
}
