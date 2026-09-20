package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class ex80 implements qt60 {

    /* JADX INFO: renamed from: a */
    public final String f63714a;

    /* JADX INFO: renamed from: b */
    public final i490 f63715b;

    /* JADX INFO: renamed from: c */
    public final Set f63716c;

    /* JADX INFO: renamed from: d */
    public final f5u0 f63717d;

    public ex80(String str, i490 i490Var, Set set, f5u0 f5u0Var) {
        this.f63714a = str;
        this.f63715b = i490Var;
        this.f63716c = set;
        this.f63717d = f5u0Var;
    }

    @Override // p204p.qt60
    /* JADX INFO: renamed from: a */
    public final String mo30113a() {
        return this.f63714a;
    }

    /* JADX INFO: renamed from: b */
    public final Set m40199b() {
        return this.f63716c;
    }

    /* JADX INFO: renamed from: c */
    public final f5u0 m40200c() {
        return this.f63717d;
    }

    /* JADX INFO: renamed from: d */
    public final i490 m40201d() {
        return this.f63715b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex80)) {
            return false;
        }
        ex80 ex80Var = (ex80) obj;
        return wj50.m88271j(this.f63714a, ex80Var.f63714a) && wj50.m88271j(this.f63715b, ex80Var.f63715b) && wj50.m88271j(this.f63716c, ex80Var.f63716c) && wj50.m88271j(this.f63717d, ex80Var.f63717d);
    }

    public final int hashCode() {
        int iHashCode = this.f63714a.hashCode() * 31;
        i490 i490Var = this.f63715b;
        return this.f63717d.hashCode() + klh.m56830b((iHashCode + (i490Var == null ? 0 : i490Var.hashCode())) * 31, 31, this.f63716c);
    }

    public /* synthetic */ ex80(String str, e490 e490Var, Set set, f5u0 f5u0Var, int i) {
        this(str, (i & 2) != 0 ? null : e490Var, (i & 4) != 0 ? gbu.f78413a : set, (i & 8) != 0 ? a5u0.f12598a : f5u0Var);
    }
}
