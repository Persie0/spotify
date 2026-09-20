package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kv9 implements nv9 {

    /* JADX INFO: renamed from: a */
    public final String f126799a;

    public kv9(String str) {
        this.f126799a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv9) && wj50.m88271j(this.f126799a, ((kv9) obj).f126799a);
    }

    public final int hashCode() {
        return this.f126799a.hashCode();
    }
}
