package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g1f0 {

    /* JADX INFO: renamed from: a */
    public final Map f75608a;

    /* JADX INFO: renamed from: b */
    public final boolean f75609b;

    /* JADX INFO: renamed from: c */
    public final boolean f75610c;

    public g1f0(Map map, boolean z, boolean z2) {
        this.f75608a = map;
        this.f75609b = z;
        this.f75610c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static g1f0 m43355a(g1f0 g1f0Var, LinkedHashMap linkedHashMap, boolean z, boolean z2, int i) {
        Map map = linkedHashMap;
        if ((i & 1) != 0) {
            map = g1f0Var.f75608a;
        }
        if ((i & 2) != 0) {
            z = g1f0Var.f75609b;
        }
        if ((i & 4) != 0) {
            z2 = g1f0Var.f75610c;
        }
        g1f0Var.getClass();
        return new g1f0(map, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1f0)) {
            return false;
        }
        g1f0 g1f0Var = (g1f0) obj;
        return wj50.m88271j(this.f75608a, g1f0Var.f75608a) && this.f75609b == g1f0Var.f75609b && this.f75610c == g1f0Var.f75610c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75610c) + s571.m77245d(this.f75608a.hashCode() * 31, 31, this.f75609b);
    }
}
