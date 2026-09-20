package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class yi41 {

    /* JADX INFO: renamed from: a */
    public final String f273034a;

    /* JADX INFO: renamed from: b */
    public final boolean f273035b;

    /* JADX INFO: renamed from: c */
    public final Boolean f273036c;

    /* JADX INFO: renamed from: d */
    public final boolean f273037d;

    /* JADX INFO: renamed from: e */
    public final Object f273038e;

    public yi41(String str, boolean z, Boolean bool, boolean z2, Map map) {
        this.f273034a = str;
        this.f273035b = z;
        this.f273036c = bool;
        this.f273037d = z2;
        this.f273038e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi41)) {
            return false;
        }
        yi41 yi41Var = (yi41) obj;
        return wj50.m88271j(this.f273034a, yi41Var.f273034a) && this.f273035b == yi41Var.f273035b && wj50.m88271j(this.f273036c, yi41Var.f273036c) && this.f273037d == yi41Var.f273037d && this.f273038e.equals(yi41Var.f273038e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f273034a.hashCode() * 31, 31, this.f273035b);
        Boolean bool = this.f273036c;
        return this.f273038e.hashCode() + s571.m77245d((iM77245d + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f273037d);
    }
}
