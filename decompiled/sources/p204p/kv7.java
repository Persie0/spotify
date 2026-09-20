package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kv7 {

    /* JADX INFO: renamed from: a */
    public final String f126794a;

    /* JADX INFO: renamed from: b */
    public final String f126795b;

    public kv7(String str, String str2) {
        this.f126794a = str;
        this.f126795b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m57446a() {
        return this.f126795b;
    }

    /* JADX INFO: renamed from: b */
    public final String m57447b() {
        return this.f126794a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv7)) {
            return false;
        }
        kv7 kv7Var = (kv7) obj;
        return wj50.m88271j(this.f126794a, kv7Var.f126794a) && wj50.m88271j(this.f126795b, kv7Var.f126795b);
    }

    public final int hashCode() {
        return this.f126795b.hashCode() + (this.f126794a.hashCode() * 31);
    }
}
