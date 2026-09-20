package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hww implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f96064a;

    /* JADX INFO: renamed from: b */
    public final Throwable f96065b;

    public hww(String str, Throwable th) {
        this.f96064a = str;
        this.f96065b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hww)) {
            return false;
        }
        hww hwwVar = (hww) obj;
        return wj50.m88271j(this.f96064a, hwwVar.f96064a) && wj50.m88271j(this.f96065b, hwwVar.f96065b);
    }

    public final int hashCode() {
        int iHashCode = this.f96064a.hashCode() * 31;
        Throwable th = this.f96065b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }
}
