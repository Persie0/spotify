package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ulr {

    /* JADX INFO: renamed from: a */
    public final wwu f231620a;

    /* JADX INFO: renamed from: b */
    public final String f231621b;

    public ulr(String str, wwu wwuVar) {
        this.f231620a = wwuVar;
        this.f231621b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulr)) {
            return false;
        }
        ulr ulrVar = (ulr) obj;
        return wj50.m88271j(this.f231620a, ulrVar.f231620a) && wj50.m88271j(this.f231621b, ulrVar.f231621b);
    }

    public final int hashCode() {
        return this.f231621b.hashCode() + (this.f231620a.hashCode() * 31);
    }
}
