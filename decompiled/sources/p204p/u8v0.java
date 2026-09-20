package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u8v0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f228020a;

    /* JADX INFO: renamed from: b */
    public final int f228021b;

    /* JADX INFO: renamed from: c */
    public final b450 f228022c;

    /* JADX INFO: renamed from: d */
    public final Object f228023d;

    public u8v0(ArrayList arrayList, int i, b450 b450Var, List list) {
        this.f228020a = arrayList;
        this.f228021b = i;
        this.f228022c = b450Var;
        this.f228023d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8v0)) {
            return false;
        }
        u8v0 u8v0Var = (u8v0) obj;
        return this.f228020a.equals(u8v0Var.f228020a) && this.f228021b == u8v0Var.f228021b && this.f228022c.equals(u8v0Var.f228022c) && this.f228023d.equals(u8v0Var.f228023d);
    }

    public final int hashCode() {
        return this.f228023d.hashCode() + stz0.m79353g(mt60.m62800g(this.f228021b, this.f228020a.hashCode() * 31, 31), 31, this.f228022c);
    }
}
