package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class d5j {

    /* JADX INFO: renamed from: a */
    public final int f45455a;

    /* JADX INFO: renamed from: b */
    public final c5j f45456b;

    public d5j(int i, c5j c5jVar) {
        this.f45455a = i;
        this.f45456b = c5jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5j)) {
            return false;
        }
        d5j d5jVar = (d5j) obj;
        return this.f45455a == d5jVar.f45455a && this.f45456b.equals(d5jVar.f45456b);
    }

    public final int hashCode() {
        return this.f45456b.hashCode() + (edb.m38547C(this.f45455a) * 31);
    }
}
