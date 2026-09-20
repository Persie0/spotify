package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class vd6 {

    /* JADX INFO: renamed from: a */
    public final zzb f240325a;

    /* JADX INFO: renamed from: b */
    public final List f240326b;

    public vd6(zzb zzbVar, List list) {
        this.f240325a = zzbVar;
        this.f240326b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd6)) {
            return false;
        }
        vd6 vd6Var = (vd6) obj;
        return wj50.m88271j(this.f240325a, vd6Var.f240325a) && wj50.m88271j(this.f240326b, vd6Var.f240326b);
    }

    public final int hashCode() {
        return this.f240326b.hashCode() + (this.f240325a.hashCode() * 31);
    }
}
