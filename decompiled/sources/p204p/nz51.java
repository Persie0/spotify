package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class nz51 {

    /* JADX INFO: renamed from: a */
    public final String f160000a;

    /* JADX INFO: renamed from: b */
    public final boolean f160001b;

    /* JADX INFO: renamed from: c */
    public final boolean f160002c;

    /* JADX INFO: renamed from: d */
    public final List f160003d;

    public nz51(List list, boolean z, String str, boolean z2) {
        this.f160000a = str;
        this.f160001b = z;
        this.f160002c = z2;
        this.f160003d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz51)) {
            return false;
        }
        nz51 nz51Var = (nz51) obj;
        return wj50.m88271j(this.f160000a, nz51Var.f160000a) && this.f160001b == nz51Var.f160001b && this.f160002c == nz51Var.f160002c && wj50.m88271j(this.f160003d, nz51Var.f160003d);
    }

    public final int hashCode() {
        return this.f160003d.hashCode() + s571.m77245d(s571.m77245d(this.f160000a.hashCode() * 31, 31, this.f160001b), 31, this.f160002c);
    }
}
