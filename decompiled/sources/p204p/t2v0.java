package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class t2v0 implements v2v0 {

    /* JADX INFO: renamed from: a */
    public final int f216631a;

    /* JADX INFO: renamed from: b */
    public final List f216632b;

    public /* synthetic */ t2v0(int i) {
        this(i, lau.f131415a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2v0)) {
            return false;
        }
        t2v0 t2v0Var = (t2v0) obj;
        return this.f216631a == t2v0Var.f216631a && wj50.m88271j(this.f216632b, t2v0Var.f216632b);
    }

    public final int hashCode() {
        return this.f216632b.hashCode() + (Integer.hashCode(this.f216631a) * 31);
    }

    public t2v0(int i, List list) {
        this.f216631a = i;
        this.f216632b = list;
    }
}
