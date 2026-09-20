package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class qnp0 {

    /* JADX INFO: renamed from: a */
    public final kfe0 f190676a;

    /* JADX INFO: renamed from: b */
    public final String f190677b;

    /* JADX INFO: renamed from: c */
    public final boolean f190678c;

    /* JADX INFO: renamed from: d */
    public final List f190679d;

    public qnp0(kfe0 kfe0Var, String str, boolean z, List list) {
        this.f190676a = kfe0Var;
        this.f190677b = str;
        this.f190678c = z;
        this.f190679d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnp0)) {
            return false;
        }
        qnp0 qnp0Var = (qnp0) obj;
        return wj50.m88271j(this.f190676a, qnp0Var.f190676a) && wj50.m88271j(this.f190677b, qnp0Var.f190677b) && this.f190678c == qnp0Var.f190678c && wj50.m88271j(this.f190679d, qnp0Var.f190679d);
    }

    public final int hashCode() {
        return this.f190679d.hashCode() + s571.m77245d(s571.m77243b(this.f190676a.hashCode() * 31, 31, this.f190677b), 31, this.f190678c);
    }
}
