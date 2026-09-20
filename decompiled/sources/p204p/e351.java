package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class e351 {

    /* JADX INFO: renamed from: a */
    public final List f55620a;

    /* JADX INFO: renamed from: b */
    public final List f55621b;

    /* JADX INFO: renamed from: c */
    public final Throwable f55622c;

    public /* synthetic */ e351(ArrayList arrayList, ArrayList arrayList2) {
        this(arrayList, arrayList2, null);
    }

    /* JADX INFO: renamed from: a */
    public static e351 m37620a(e351 e351Var, List list, Throwable th, int i) {
        if ((i & 1) != 0) {
            list = e351Var.f55620a;
        }
        List list2 = e351Var.f55621b;
        if ((i & 4) != 0) {
            th = e351Var.f55622c;
        }
        e351Var.getClass();
        return new e351(list, list2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e351)) {
            return false;
        }
        e351 e351Var = (e351) obj;
        return wj50.m88271j(this.f55620a, e351Var.f55620a) && wj50.m88271j(this.f55621b, e351Var.f55621b) && wj50.m88271j(this.f55622c, e351Var.f55622c);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f55620a.hashCode() * 31, 31, this.f55621b);
        Throwable th = this.f55622c;
        return iM77244c + (th == null ? 0 : th.hashCode());
    }

    public e351(List list, List list2, Throwable th) {
        this.f55620a = list;
        this.f55621b = list2;
        this.f55622c = th;
    }
}
