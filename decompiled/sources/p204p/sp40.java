package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sp40 {

    /* JADX INFO: renamed from: a */
    public final String f212726a;

    /* JADX INFO: renamed from: b */
    public final Object f212727b;

    /* JADX INFO: renamed from: c */
    public final int f212728c;

    /* JADX INFO: renamed from: d */
    public final int f212729d;

    public sp40(String str, int i, int i2, List list) {
        this.f212726a = str;
        this.f212727b = list;
        this.f212728c = i;
        this.f212729d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp40)) {
            return false;
        }
        sp40 sp40Var = (sp40) obj;
        return this.f212726a.equals(sp40Var.f212726a) && this.f212727b.equals(sp40Var.f212727b) && this.f212728c == sp40Var.f212728c && this.f212729d == sp40Var.f212729d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f212729d) + mt60.m62800g(this.f212728c, dq60.m36604d(this.f212726a.hashCode() * 31, 31, this.f212727b), 31);
    }
}
