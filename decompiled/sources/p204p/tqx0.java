package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class tqx0 implements zqx0 {

    /* JADX INFO: renamed from: a */
    public final int f222907a;

    /* JADX INFO: renamed from: b */
    public final String f222908b;

    /* JADX INFO: renamed from: c */
    public final int f222909c;

    /* JADX INFO: renamed from: d */
    public final int f222910d;

    /* JADX INFO: renamed from: e */
    public final String f222911e;

    /* JADX INFO: renamed from: f */
    public final f271 f222912f;

    /* JADX INFO: renamed from: g */
    public final boolean f222913g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f222914h;

    public tqx0(int i, String str, int i2, int i3, String str2, f271 f271Var, boolean z, ArrayList arrayList) {
        this.f222907a = i;
        this.f222908b = str;
        this.f222909c = i2;
        this.f222910d = i3;
        this.f222911e = str2;
        this.f222912f = f271Var;
        this.f222913g = z;
        this.f222914h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqx0)) {
            return false;
        }
        tqx0 tqx0Var = (tqx0) obj;
        return this.f222907a == tqx0Var.f222907a && wj50.m88271j(this.f222908b, tqx0Var.f222908b) && this.f222909c == tqx0Var.f222909c && this.f222910d == tqx0Var.f222910d && wj50.m88271j(this.f222911e, tqx0Var.f222911e) && this.f222912f.equals(tqx0Var.f222912f) && this.f222913g == tqx0Var.f222913g && this.f222914h.equals(tqx0Var.f222914h);
    }

    public final int hashCode() {
        return this.f222914h.hashCode() + s571.m77245d((this.f222912f.hashCode() + s571.m77243b(mt60.m62800g(this.f222910d, mt60.m62800g(this.f222909c, s571.m77243b(Integer.hashCode(this.f222907a) * 31, 31, this.f222908b), 31), 31), 31, this.f222911e)) * 31, 31, this.f222913g);
    }

    @Override // p204p.zqx0
    /* JADX INFO: renamed from: s */
    public final int mo30282s() {
        return this.f222907a;
    }
}
