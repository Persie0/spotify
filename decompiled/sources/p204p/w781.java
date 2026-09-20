package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w781 implements z781 {

    /* JADX INFO: renamed from: a */
    public final int f248602a;

    /* JADX INFO: renamed from: b */
    public final String f248603b;

    public w781(int i, String str) {
        this.f248602a = i;
        this.f248603b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w781)) {
            return false;
        }
        w781 w781Var = (w781) obj;
        return this.f248602a == w781Var.f248602a && wj50.m88271j(this.f248603b, w781Var.f248603b);
    }

    public final int hashCode() {
        return this.f248603b.hashCode() + (Integer.hashCode(this.f248602a) * 31);
    }
}
