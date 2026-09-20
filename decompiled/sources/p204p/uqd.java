package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uqd {

    /* JADX INFO: renamed from: a */
    public final ijb f232979a;

    /* JADX INFO: renamed from: b */
    public final boolean f232980b;

    public uqd(ijb ijbVar, boolean z) {
        this.f232979a = ijbVar;
        this.f232980b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqd)) {
            return false;
        }
        uqd uqdVar = (uqd) obj;
        return this.f232979a == uqdVar.f232979a && this.f232980b == uqdVar.f232980b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232980b) + (this.f232979a.hashCode() * 31);
    }
}
