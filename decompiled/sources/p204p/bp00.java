package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class bp00 implements ep00 {

    /* JADX INFO: renamed from: a */
    public final String f29288a;

    /* JADX INFO: renamed from: b */
    public final List f29289b;

    /* JADX INFO: renamed from: c */
    public final d850 f29290c;

    public bp00(String str, List list, d850 d850Var) {
        this.f29288a = str;
        this.f29289b = list;
        this.f29290c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp00)) {
            return false;
        }
        bp00 bp00Var = (bp00) obj;
        return wj50.m88271j(this.f29288a, bp00Var.f29288a) && wj50.m88271j(this.f29289b, bp00Var.f29289b) && wj50.m88271j(this.f29290c, bp00Var.f29290c);
    }

    public final int hashCode() {
        return this.f29290c.hashCode() + s571.m77244c(this.f29288a.hashCode() * 31, 31, this.f29289b);
    }
}
