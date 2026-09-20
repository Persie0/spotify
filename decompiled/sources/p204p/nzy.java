package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nzy extends pzy {

    /* JADX INFO: renamed from: a */
    public final String f160184a;

    /* JADX INFO: renamed from: b */
    public final int f160185b;

    public nzy(String str, int i) {
        this.f160184a = str;
        this.f160185b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzy)) {
            return false;
        }
        nzy nzyVar = (nzy) obj;
        return wj50.m88271j(this.f160184a, nzyVar.f160184a) && this.f160185b == nzyVar.f160185b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f160185b) + (this.f160184a.hashCode() * 31);
    }
}
