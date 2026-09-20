package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class k840 implements l840 {

    /* JADX INFO: renamed from: a */
    public final String f120246a;

    /* JADX INFO: renamed from: b */
    public final boolean f120247b;

    public k840(String str, boolean z) {
        this.f120246a = str;
        this.f120247b = z;
    }

    @Override // p204p.l840
    /* JADX INFO: renamed from: a */
    public final String mo43945a() {
        return this.f120246a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k840)) {
            return false;
        }
        k840 k840Var = (k840) obj;
        return wj50.m88271j(this.f120246a, k840Var.f120246a) && this.f120247b == k840Var.f120247b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120247b) + (this.f120246a.hashCode() * 31);
    }
}
