package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uvv extends wvv {

    /* JADX INFO: renamed from: a */
    public final z0r f234509a;

    public uvv(z0r z0rVar) {
        this.f234509a = z0rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvv) && wj50.m88271j(this.f234509a, ((uvv) obj).f234509a);
    }

    public final int hashCode() {
        return this.f234509a.hashCode();
    }
}
