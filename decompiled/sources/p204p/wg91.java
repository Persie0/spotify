package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wg91 {

    /* JADX INFO: renamed from: a */
    public final int f251009a;

    /* JADX INFO: renamed from: b */
    public final Integer f251010b;

    public wg91(int i, Integer num) {
        this.f251009a = i;
        this.f251010b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg91)) {
            return false;
        }
        wg91 wg91Var = (wg91) obj;
        return this.f251009a == wg91Var.f251009a && wj50.m88271j(this.f251010b, wg91Var.f251010b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f251009a) * 31;
        Integer num = this.f251010b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
