package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k931 {

    /* JADX INFO: renamed from: a */
    public final boolean f120508a;

    /* JADX INFO: renamed from: b */
    public final String f120509b;

    public k931(boolean z, String str) {
        this.f120508a = z;
        this.f120509b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k931)) {
            return false;
        }
        k931 k931Var = (k931) obj;
        return this.f120508a == k931Var.f120508a && wj50.m88271j(this.f120509b, k931Var.f120509b);
    }

    public final int hashCode() {
        return this.f120509b.hashCode() + (Boolean.hashCode(this.f120508a) * 31);
    }
}
