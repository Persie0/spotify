package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class x2i {

    /* JADX INFO: renamed from: a */
    public final rzd1 f257504a;

    /* JADX INFO: renamed from: b */
    public final Object f257505b;

    /* JADX INFO: renamed from: c */
    public final boolean f257506c;

    /* JADX INFO: renamed from: d */
    public final String f257507d;

    public x2i(rzd1 rzd1Var, List list, boolean z, String str) {
        this.f257504a = rzd1Var;
        this.f257505b = list;
        this.f257506c = z;
        this.f257507d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2i)) {
            return false;
        }
        x2i x2iVar = (x2i) obj;
        return this.f257504a.equals(x2iVar.f257504a) && this.f257505b.equals(x2iVar.f257505b) && this.f257506c == x2iVar.f257506c && wj50.m88271j(this.f257507d, x2iVar.f257507d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(dq60.m36604d((this.f257504a.hashCode() - 1609848761) * 31, 31, this.f257505b), 31, this.f257506c);
        String str = this.f257507d;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
