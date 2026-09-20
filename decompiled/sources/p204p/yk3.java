package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yk3 {

    /* JADX INFO: renamed from: a */
    public final String f273560a;

    /* JADX INFO: renamed from: b */
    public final String f273561b;

    public yk3(String str, String str2) {
        this.f273560a = str;
        this.f273561b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk3)) {
            return false;
        }
        yk3 yk3Var = (yk3) obj;
        return wj50.m88271j(this.f273560a, yk3Var.f273560a) && wj50.m88271j(this.f273561b, yk3Var.f273561b);
    }

    public final int hashCode() {
        return this.f273561b.hashCode() + (this.f273560a.hashCode() * 31);
    }
}
