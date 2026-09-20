package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wl61 {

    /* JADX INFO: renamed from: a */
    public final String f252475a;

    /* JADX INFO: renamed from: b */
    public final String f252476b;

    public wl61(String str, String str2) {
        this.f252475a = str;
        this.f252476b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl61)) {
            return false;
        }
        wl61 wl61Var = (wl61) obj;
        return wj50.m88271j(this.f252475a, wl61Var.f252475a) && wj50.m88271j(this.f252476b, wl61Var.f252476b);
    }

    public final int hashCode() {
        return this.f252476b.hashCode() + (this.f252475a.hashCode() * 31);
    }
}
