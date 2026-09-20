package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kel {

    /* JADX INFO: renamed from: a */
    public final String f121908a;

    /* JADX INFO: renamed from: b */
    public final String f121909b;

    public kel(String str, String str2) {
        this.f121908a = str;
        this.f121909b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kel)) {
            return false;
        }
        kel kelVar = (kel) obj;
        return wj50.m88271j(this.f121908a, kelVar.f121908a) && wj50.m88271j(this.f121909b, kelVar.f121909b);
    }

    public final int hashCode() {
        int iHashCode = this.f121908a.hashCode() * 31;
        String str = this.f121909b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
