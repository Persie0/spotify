package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class u290 {

    /* JADX INFO: renamed from: a */
    public final List f226035a;

    /* JADX INFO: renamed from: b */
    public final bg61 f226036b;

    /* JADX INFO: renamed from: c */
    public final boolean f226037c;

    /* JADX INFO: renamed from: d */
    public final int f226038d;

    public u290(List list, bg61 bg61Var, boolean z, int i) {
        this.f226035a = list;
        this.f226036b = bg61Var;
        this.f226037c = z;
        this.f226038d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u290)) {
            return false;
        }
        u290 u290Var = (u290) obj;
        return wj50.m88271j(this.f226035a, u290Var.f226035a) && this.f226036b == u290Var.f226036b && this.f226037c == u290Var.f226037c && this.f226038d == u290Var.f226038d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f226038d) + s571.m77245d((this.f226036b.hashCode() + (this.f226035a.hashCode() * 31)) * 31, 31, this.f226037c);
    }
}
