package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vo80 {

    /* JADX INFO: renamed from: a */
    public final String f243426a;

    /* JADX INFO: renamed from: b */
    public final Object f243427b;

    /* JADX INFO: renamed from: c */
    public final int f243428c;

    public vo80(String str, int i, List list) {
        this.f243426a = str;
        this.f243427b = list;
        this.f243428c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo80)) {
            return false;
        }
        vo80 vo80Var = (vo80) obj;
        return this.f243426a.equals(vo80Var.f243426a) && this.f243427b.equals(vo80Var.f243427b) && this.f243428c == vo80Var.f243428c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f243428c) + dq60.m36604d(this.f243426a.hashCode() * 31, 31, this.f243427b);
    }
}
