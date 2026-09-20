package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v781 implements z781 {

    /* JADX INFO: renamed from: a */
    public final int f238099a;

    /* JADX INFO: renamed from: b */
    public final String f238100b;

    public v781(int i, String str) {
        this.f238099a = i;
        this.f238100b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v781)) {
            return false;
        }
        v781 v781Var = (v781) obj;
        return this.f238099a == v781Var.f238099a && wj50.m88271j(this.f238100b, v781Var.f238100b);
    }

    public final int hashCode() {
        return this.f238100b.hashCode() + (Integer.hashCode(this.f238099a) * 31);
    }
}
