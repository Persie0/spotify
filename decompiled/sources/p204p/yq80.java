package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yq80 extends br80 {

    /* JADX INFO: renamed from: a */
    public final int f275162a;

    /* JADX INFO: renamed from: b */
    public final dw50 f275163b;

    public yq80(int i, dw50 dw50Var) {
        this.f275162a = i;
        this.f275163b = dw50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq80)) {
            return false;
        }
        yq80 yq80Var = (yq80) obj;
        return this.f275162a == yq80Var.f275162a && wj50.m88271j(this.f275163b, yq80Var.f275163b);
    }

    public final int hashCode() {
        return this.f275163b.hashCode() + (Integer.hashCode(this.f275162a) * 31);
    }
}
