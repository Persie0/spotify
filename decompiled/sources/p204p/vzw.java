package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vzw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f246559a;

    /* JADX INFO: renamed from: b */
    public final Throwable f246560b;

    public vzw(String str, Throwable th) {
        this.f246559a = str;
        this.f246560b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzw)) {
            return false;
        }
        vzw vzwVar = (vzw) obj;
        return wj50.m88271j(this.f246559a, vzwVar.f246559a) && wj50.m88271j(this.f246560b, vzwVar.f246560b);
    }

    public final int hashCode() {
        return this.f246560b.hashCode() + (this.f246559a.hashCode() * 31);
    }
}
