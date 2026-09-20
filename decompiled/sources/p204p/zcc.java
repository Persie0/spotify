package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zcc {

    /* JADX INFO: renamed from: a */
    public final List f281495a;

    /* JADX INFO: renamed from: b */
    public final hh70 f281496b;

    /* JADX INFO: renamed from: c */
    public final boolean f281497c;

    public zcc(List list, hh70 hh70Var, boolean z) {
        this.f281495a = list;
        this.f281496b = hh70Var;
        this.f281497c = z;
    }

    /* JADX INFO: renamed from: a */
    public static zcc m95905a(zcc zccVar, List list, hh70 hh70Var, int i) {
        if ((i & 1) != 0) {
            list = zccVar.f281495a;
        }
        if ((i & 2) != 0) {
            hh70Var = zccVar.f281496b;
        }
        boolean z = zccVar.f281497c;
        zccVar.getClass();
        return new zcc(list, hh70Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcc)) {
            return false;
        }
        zcc zccVar = (zcc) obj;
        return wj50.m88271j(this.f281495a, zccVar.f281495a) && wj50.m88271j(this.f281496b, zccVar.f281496b) && this.f281497c == zccVar.f281497c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281497c) + ((this.f281496b.hashCode() + (this.f281495a.hashCode() * 31)) * 31);
    }
}
