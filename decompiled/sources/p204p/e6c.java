package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e6c extends i6c {

    /* JADX INFO: renamed from: a */
    public final String f56615a;

    /* JADX INFO: renamed from: b */
    public final int f56616b;

    public e6c(String str, int i) {
        this.f56615a = str;
        this.f56616b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6c)) {
            return false;
        }
        e6c e6cVar = (e6c) obj;
        return wj50.m88271j(this.f56615a, e6cVar.f56615a) && this.f56616b == e6cVar.f56616b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56616b) + (this.f56615a.hashCode() * 31);
    }
}
