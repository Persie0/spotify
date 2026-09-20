package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rlu implements slu {

    /* JADX INFO: renamed from: a */
    public final ulu f200371a;

    public rlu(ulu uluVar) {
        this.f200371a = uluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlu) && wj50.m88271j(this.f200371a, ((rlu) obj).f200371a);
    }

    public final int hashCode() {
        return this.f200371a.hashCode();
    }
}
