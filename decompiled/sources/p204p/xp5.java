package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xp5 {

    /* JADX INFO: renamed from: a */
    public final String f264507a;

    /* JADX INFO: renamed from: b */
    public final String f264508b;

    public xp5(String str, String str2) {
        this.f264507a = str;
        this.f264508b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp5)) {
            return false;
        }
        xp5 xp5Var = (xp5) obj;
        return wj50.m88271j(this.f264507a, xp5Var.f264507a) && wj50.m88271j(this.f264508b, xp5Var.f264508b);
    }

    public final int hashCode() {
        return this.f264508b.hashCode() + (this.f264507a.hashCode() * 31);
    }
}
