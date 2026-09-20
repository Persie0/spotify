package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e9d implements kad {

    /* JADX INFO: renamed from: a */
    public final String f57410a;

    /* JADX INFO: renamed from: b */
    public final int f57411b;

    public e9d(String str, int i) {
        this.f57410a = str;
        this.f57411b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9d)) {
            return false;
        }
        e9d e9dVar = (e9d) obj;
        return wj50.m88271j(this.f57410a, e9dVar.f57410a) && this.f57411b == e9dVar.f57411b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57411b) + (this.f57410a.hashCode() * 31);
    }
}
