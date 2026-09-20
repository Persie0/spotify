package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i781 implements j781 {

    /* JADX INFO: renamed from: a */
    public final int f99467a;

    /* JADX INFO: renamed from: b */
    public final String f99468b;

    public i781(int i, String str) {
        this.f99467a = i;
        this.f99468b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i781)) {
            return false;
        }
        i781 i781Var = (i781) obj;
        return this.f99467a == i781Var.f99467a && wj50.m88271j(this.f99468b, i781Var.f99468b);
    }

    public final int hashCode() {
        return this.f99468b.hashCode() + (Integer.hashCode(this.f99467a) * 31);
    }
}
