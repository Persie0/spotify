package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h9a implements k9a {

    /* JADX INFO: renamed from: a */
    public final Throwable f88905a;

    public h9a(Throwable th) {
        this.f88905a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9a) && wj50.m88271j(this.f88905a, ((h9a) obj).f88905a);
    }

    public final int hashCode() {
        return this.f88905a.hashCode();
    }
}
