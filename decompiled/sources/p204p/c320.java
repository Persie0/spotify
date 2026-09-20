package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c320 {

    /* JADX INFO: renamed from: a */
    public final List f33526a;

    /* JADX INFO: renamed from: b */
    public final g220 f33527b;

    public c320(List list, g220 g220Var) {
        this.f33526a = list;
        this.f33527b = g220Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c320)) {
            return false;
        }
        c320 c320Var = (c320) obj;
        return wj50.m88271j(this.f33526a, c320Var.f33526a) && wj50.m88271j(this.f33527b, c320Var.f33527b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33527b.f75820a) + (this.f33526a.hashCode() * 31);
    }
}
