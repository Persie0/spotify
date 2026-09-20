package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zau0 {

    /* JADX INFO: renamed from: a */
    public final boolean f281154a;

    /* JADX INFO: renamed from: b */
    public final Set f281155b;

    /* JADX INFO: renamed from: c */
    public final long f281156c;

    /* JADX INFO: renamed from: d */
    public final String f281157d;

    public zau0(boolean z, Set set, long j, String str) {
        this.f281154a = z;
        this.f281155b = set;
        this.f281156c = j;
        this.f281157d = str;
    }

    /* JADX INFO: renamed from: a */
    public static zau0 m95810a(zau0 zau0Var, Set set, int i) {
        boolean z = zau0Var.f281154a;
        if ((i & 2) != 0) {
            set = zau0Var.f281155b;
        }
        Set set2 = set;
        long j = (i & 4) != 0 ? zau0Var.f281156c : 0L;
        String str = zau0Var.f281157d;
        zau0Var.getClass();
        return new zau0(z, set2, j, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zau0)) {
            return false;
        }
        zau0 zau0Var = (zau0) obj;
        return this.f281154a == zau0Var.f281154a && wj50.m88271j(this.f281155b, zau0Var.f281155b) && this.f281156c == zau0Var.f281156c && wj50.m88271j(this.f281157d, zau0Var.f281157d);
    }

    public final int hashCode() {
        return this.f281157d.hashCode() + dq60.m36605e(klh.m56830b(Boolean.hashCode(this.f281154a) * 31, 31, this.f281155b), this.f281156c, 31);
    }
}
