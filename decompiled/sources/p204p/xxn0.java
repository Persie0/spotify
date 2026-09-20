package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xxn0 implements yxn0 {

    /* JADX INFO: renamed from: a */
    public final int f267031a;

    /* JADX INFO: renamed from: b */
    public final String f267032b;

    public xxn0(int i, String str) {
        this.f267031a = i;
        this.f267032b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxn0)) {
            return false;
        }
        xxn0 xxn0Var = (xxn0) obj;
        return this.f267031a == xxn0Var.f267031a && wj50.m88271j(this.f267032b, xxn0Var.f267032b);
    }

    public final int hashCode() {
        return this.f267032b.hashCode() + (Integer.hashCode(this.f267031a) * 31);
    }
}
