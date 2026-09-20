package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vgf0 {

    /* JADX INFO: renamed from: a */
    public final int f241235a;

    /* JADX INFO: renamed from: b */
    public final List f241236b;

    public vgf0(int i, List list) {
        this.f241235a = i;
        this.f241236b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgf0)) {
            return false;
        }
        vgf0 vgf0Var = (vgf0) obj;
        return this.f241235a == vgf0Var.f241235a && wj50.m88271j(this.f241236b, vgf0Var.f241236b);
    }

    public final int hashCode() {
        return this.f241236b.hashCode() + (Integer.hashCode(this.f241235a) * 31);
    }
}
