package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class j59 {

    /* JADX INFO: renamed from: a */
    public final List f108916a;

    /* JADX INFO: renamed from: b */
    public final List f108917b;

    /* JADX INFO: renamed from: c */
    public final long f108918c;

    /* JADX INFO: renamed from: d */
    public final List f108919d;

    public j59(long j, List list, List list2, List list3) {
        this.f108916a = list;
        this.f108917b = list2;
        this.f108918c = j;
        this.f108919d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j59)) {
            return false;
        }
        j59 j59Var = (j59) obj;
        return wj50.m88271j(this.f108916a, j59Var.f108916a) && wj50.m88271j(this.f108917b, j59Var.f108917b) && this.f108918c == j59Var.f108918c && wj50.m88271j(this.f108919d, j59Var.f108919d);
    }

    public final int hashCode() {
        return this.f108919d.hashCode() + dq60.m36605e(s571.m77244c(this.f108916a.hashCode() * 31, 31, this.f108917b), this.f108918c, 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j59(long j) {
        lau lauVar = lau.f131415a;
        this(j, lauVar, lauVar, lauVar);
    }
}
