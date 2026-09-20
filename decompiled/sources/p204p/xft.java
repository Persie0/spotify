package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xft {

    /* JADX INFO: renamed from: a */
    public final String f261093a;

    /* JADX INFO: renamed from: b */
    public final String f261094b;

    public xft(String str, String str2) {
        this.f261093a = str;
        this.f261094b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xft)) {
            return false;
        }
        xft xftVar = (xft) obj;
        return wj50.m88271j(this.f261093a, xftVar.f261093a) && wj50.m88271j(this.f261094b, xftVar.f261094b);
    }

    public final int hashCode() {
        return this.f261094b.hashCode() + (this.f261093a.hashCode() * 31);
    }
}
