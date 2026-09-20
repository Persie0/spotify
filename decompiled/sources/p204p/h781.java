package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h781 implements j781 {

    /* JADX INFO: renamed from: a */
    public final int f88380a;

    /* JADX INFO: renamed from: b */
    public final String f88381b;

    public h781(int i, String str) {
        this.f88380a = i;
        this.f88381b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h781)) {
            return false;
        }
        h781 h781Var = (h781) obj;
        return this.f88380a == h781Var.f88380a && wj50.m88271j(this.f88381b, h781Var.f88381b);
    }

    public final int hashCode() {
        return this.f88381b.hashCode() + (Integer.hashCode(this.f88380a) * 31);
    }
}
