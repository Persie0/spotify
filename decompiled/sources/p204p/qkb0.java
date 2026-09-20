package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class qkb0 implements rkb0 {

    /* JADX INFO: renamed from: a */
    public final Map f189519a;

    /* JADX INFO: renamed from: b */
    public final xf81 f189520b;

    /* JADX INFO: renamed from: c */
    public final s7f f189521c;

    /* JADX INFO: renamed from: d */
    public final d850 f189522d;

    public qkb0(Map map, xf81 xf81Var, s7f s7fVar, d850 d850Var) {
        this.f189519a = map;
        this.f189520b = xf81Var;
        this.f189521c = s7fVar;
        this.f189522d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkb0)) {
            return false;
        }
        qkb0 qkb0Var = (qkb0) obj;
        return wj50.m88271j(this.f189519a, qkb0Var.f189519a) && wj50.m88271j(this.f189520b, qkb0Var.f189520b) && wj50.m88271j(this.f189521c, qkb0Var.f189521c) && wj50.m88271j(this.f189522d, qkb0Var.f189522d);
    }

    public final int hashCode() {
        int iHashCode = (this.f189521c.hashCode() + ((this.f189520b.hashCode() + (this.f189519a.hashCode() * 31)) * 31)) * 31;
        d850 d850Var = this.f189522d;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
