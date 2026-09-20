package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uey {

    /* JADX INFO: renamed from: a */
    public final wwu f229612a;

    /* JADX INFO: renamed from: b */
    public final String f229613b;

    public uey(String str, wwu wwuVar) {
        this.f229612a = wwuVar;
        this.f229613b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uey)) {
            return false;
        }
        uey ueyVar = (uey) obj;
        return wj50.m88271j(this.f229612a, ueyVar.f229612a) && wj50.m88271j(this.f229613b, ueyVar.f229613b);
    }

    public final int hashCode() {
        return this.f229613b.hashCode() + (this.f229612a.hashCode() * 31);
    }
}
