package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uci0 {

    /* JADX INFO: renamed from: a */
    public final String f229069a;

    /* JADX INFO: renamed from: b */
    public final boolean f229070b;

    public uci0(String str, boolean z) {
        this.f229069a = str;
        this.f229070b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uci0)) {
            return false;
        }
        uci0 uci0Var = (uci0) obj;
        return wj50.m88271j(this.f229069a, uci0Var.f229069a) && this.f229070b == uci0Var.f229070b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f229070b) + (this.f229069a.hashCode() * 31);
    }
}
