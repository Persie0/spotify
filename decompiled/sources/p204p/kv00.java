package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kv00 implements mv00 {

    /* JADX INFO: renamed from: a */
    public final String f126749a;

    /* JADX INFO: renamed from: b */
    public final String f126750b;

    public kv00(String str, String str2) {
        this.f126749a = str;
        this.f126750b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv00)) {
            return false;
        }
        kv00 kv00Var = (kv00) obj;
        return wj50.m88271j(this.f126749a, kv00Var.f126749a) && wj50.m88271j(this.f126750b, kv00Var.f126750b);
    }

    public final int hashCode() {
        return this.f126750b.hashCode() + (this.f126749a.hashCode() * 31);
    }
}
