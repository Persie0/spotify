package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y781 implements z781 {

    /* JADX INFO: renamed from: a */
    public final int f269992a;

    /* JADX INFO: renamed from: b */
    public final String f269993b;

    public y781(int i, String str) {
        this.f269992a = i;
        this.f269993b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y781)) {
            return false;
        }
        y781 y781Var = (y781) obj;
        return this.f269992a == y781Var.f269992a && wj50.m88271j(this.f269993b, y781Var.f269993b);
    }

    public final int hashCode() {
        return this.f269993b.hashCode() + (Integer.hashCode(this.f269992a) * 31);
    }
}
