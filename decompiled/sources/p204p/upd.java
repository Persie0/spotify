package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class upd {

    /* JADX INFO: renamed from: a */
    public final String f232635a;

    /* JADX INFO: renamed from: b */
    public final boolean f232636b;

    public upd(String str, boolean z) {
        this.f232635a = str;
        this.f232636b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upd)) {
            return false;
        }
        upd updVar = (upd) obj;
        return wj50.m88271j(this.f232635a, updVar.f232635a) && this.f232636b == updVar.f232636b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232636b) + (this.f232635a.hashCode() * 31);
    }
}
