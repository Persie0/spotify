package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class ff0 implements gf0 {

    /* JADX INFO: renamed from: a */
    public final Class f68869a;

    /* JADX INFO: renamed from: b */
    public final Bundle f68870b;

    public ff0(Bundle bundle, Class cls) {
        this.f68869a = cls;
        this.f68870b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff0)) {
            return false;
        }
        ff0 ff0Var = (ff0) obj;
        return wj50.m88271j(this.f68869a, ff0Var.f68869a) && wj50.m88271j(this.f68870b, ff0Var.f68870b);
    }

    public final int hashCode() {
        return this.f68870b.hashCode() + (this.f68869a.hashCode() * 31);
    }
}
