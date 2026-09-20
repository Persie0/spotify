package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class vga0 {

    /* JADX INFO: renamed from: a */
    public final vla0 f241188a;

    /* JADX INFO: renamed from: b */
    public final String f241189b;

    /* JADX INFO: renamed from: c */
    public final int f241190c;

    /* JADX INFO: renamed from: d */
    public final o261 f241191d;

    /* JADX INFO: renamed from: e */
    public final List f241192e;

    public vga0(vla0 vla0Var, String str, int i, o261 o261Var, List list) {
        this.f241188a = vla0Var;
        this.f241189b = str;
        this.f241190c = i;
        this.f241191d = o261Var;
        this.f241192e = list;
    }

    /* JADX INFO: renamed from: a */
    public static vga0 m85408a(vga0 vga0Var, vla0 vla0Var, String str, int i, o261 o261Var, List list, int i2) {
        if ((i2 & 1) != 0) {
            vla0Var = vga0Var.f241188a;
        }
        vla0 vla0Var2 = vla0Var;
        if ((i2 & 2) != 0) {
            str = vga0Var.f241189b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i = vga0Var.f241190c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            o261Var = vga0Var.f241191d;
        }
        o261 o261Var2 = o261Var;
        if ((i2 & 16) != 0) {
            list = vga0Var.f241192e;
        }
        vga0Var.getClass();
        return new vga0(vla0Var2, str2, i3, o261Var2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vga0)) {
            return false;
        }
        vga0 vga0Var = (vga0) obj;
        return wj50.m88271j(this.f241188a, vga0Var.f241188a) && wj50.m88271j(this.f241189b, vga0Var.f241189b) && this.f241190c == vga0Var.f241190c && wj50.m88271j(this.f241191d, vga0Var.f241191d) && wj50.m88271j(this.f241192e, vga0Var.f241192e);
    }

    public final int hashCode() {
        vla0 vla0Var = this.f241188a;
        return this.f241192e.hashCode() + ((this.f241191d.hashCode() + f710.m40938f(this.f241190c, s571.m77243b((vla0Var == null ? 0 : vla0Var.hashCode()) * 31, 31, this.f241189b), 31)) * 31);
    }

    public /* synthetic */ vga0(vla0 vla0Var, int i) {
        this((i & 1) != 0 ? null : vla0Var, "", (i & 4) != 0 ? 1 : 3, m261.f139235a, lau.f131415a);
    }
}
