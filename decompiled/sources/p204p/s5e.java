package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s5e {

    /* JADX INFO: renamed from: a */
    public final Object f205783a;

    /* JADX INFO: renamed from: b */
    public final fyf f205784b;

    public s5e(Object obj, fyf fyfVar) {
        this.f205783a = obj;
        this.f205784b = fyfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5e)) {
            return false;
        }
        s5e s5eVar = (s5e) obj;
        return wj50.m88271j(this.f205783a, s5eVar.f205783a) && this.f205784b.equals(s5eVar.f205784b);
    }

    public final int hashCode() {
        return this.f205784b.hashCode() + (this.f205783a.hashCode() * 31);
    }
}
