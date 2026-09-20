package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fgk0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final int f69365a;

    /* JADX INFO: renamed from: b */
    public final List f69366b;

    public fgk0(int i, List list) {
        this.f69365a = i;
        this.f69366b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgk0)) {
            return false;
        }
        fgk0 fgk0Var = (fgk0) obj;
        return this.f69365a == fgk0Var.f69365a && wj50.m88271j(this.f69366b, fgk0Var.f69366b);
    }

    public final int hashCode() {
        return this.f69366b.hashCode() + (edb.m38547C(this.f69365a) * 31);
    }

    public /* synthetic */ fgk0() {
        this(1, lau.f131415a);
    }
}
