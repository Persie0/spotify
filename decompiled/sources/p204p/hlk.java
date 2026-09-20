package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hlk {

    /* JADX INFO: renamed from: a */
    public final String f92704a;

    /* JADX INFO: renamed from: b */
    public final long f92705b;

    public hlk(String str, long j) {
        this.f92704a = str;
        this.f92705b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlk)) {
            return false;
        }
        hlk hlkVar = (hlk) obj;
        if (!wj50.m88271j(this.f92704a, hlkVar.f92704a)) {
            return false;
        }
        long j = hlkVar.f92705b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f92705b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f92704a.hashCode() * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f92705b) + iHashCode;
    }
}
