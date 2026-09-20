package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t23 implements ktx {

    /* JADX INFO: renamed from: a */
    public final List f216415a;

    public t23(ae50 ae50Var) {
        this.f216415a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t23) && wj50.m88271j(this.f216415a, ((t23) obj).f216415a);
    }

    public final int hashCode() {
        return this.f216415a.hashCode();
    }
}
