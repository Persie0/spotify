package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y7t0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final List f270132a;

    /* JADX INFO: renamed from: b */
    public final k4k0 f270133b;

    /* JADX INFO: renamed from: c */
    public final long f270134c;

    public y7t0(ae50 ae50Var, k4k0 k4k0Var, long j) {
        this.f270132a = ae50Var;
        this.f270133b = k4k0Var;
        this.f270134c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7t0)) {
            return false;
        }
        y7t0 y7t0Var = (y7t0) obj;
        return wj50.m88271j(this.f270132a, y7t0Var.f270132a) && wj50.m88271j(this.f270133b, y7t0Var.f270133b) && this.f270134c == y7t0Var.f270134c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f270134c) + ((this.f270133b.hashCode() + (this.f270132a.hashCode() * 31)) * 31);
    }
}
