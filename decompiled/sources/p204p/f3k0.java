package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f3k0 extends h3k0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f65524a;

    /* JADX INFO: renamed from: b */
    public final int f65525b;

    /* JADX INFO: renamed from: c */
    public final String f65526c;

    public f3k0(int i, String str, ArrayList arrayList) {
        this.f65524a = arrayList;
        this.f65525b = i;
        this.f65526c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3k0)) {
            return false;
        }
        f3k0 f3k0Var = (f3k0) obj;
        return this.f65524a.equals(f3k0Var.f65524a) && this.f65525b == f3k0Var.f65525b && this.f65526c.equals(f3k0Var.f65526c);
    }

    public final int hashCode() {
        return this.f65526c.hashCode() + mt60.m62800g(this.f65525b, this.f65524a.hashCode() * 31, 31);
    }
}
