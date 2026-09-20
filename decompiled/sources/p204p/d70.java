package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d70 implements e70 {

    /* JADX INFO: renamed from: a */
    public final String f45941a;

    /* JADX INFO: renamed from: b */
    public final String f45942b;

    public d70(String str, String str2) {
        this.f45941a = str;
        this.f45942b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d70)) {
            return false;
        }
        d70 d70Var = (d70) obj;
        return wj50.m88271j(this.f45941a, d70Var.f45941a) && wj50.m88271j(this.f45942b, d70Var.f45942b);
    }

    public final int hashCode() {
        return this.f45942b.hashCode() + (this.f45941a.hashCode() * 31);
    }
}
