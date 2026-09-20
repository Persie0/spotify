package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class s1j0 extends v1j0 {

    /* JADX INFO: renamed from: a */
    public final Class f204726a;

    /* JADX INFO: renamed from: b */
    public final Bundle f204727b;

    public s1j0(Bundle bundle, Class cls) {
        this.f204726a = cls;
        this.f204727b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1j0)) {
            return false;
        }
        s1j0 s1j0Var = (s1j0) obj;
        if (!this.f204726a.equals(s1j0Var.f204726a)) {
            return false;
        }
        Object obj2 = kaz.f121002c;
        return obj2.equals(obj2) && wj50.m88271j(this.f204727b, s1j0Var.f204727b);
    }

    public final int hashCode() {
        int iHashCode = (kaz.f121002c.hashCode() + (this.f204726a.hashCode() * 31)) * 31;
        Bundle bundle = this.f204727b;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }
}
