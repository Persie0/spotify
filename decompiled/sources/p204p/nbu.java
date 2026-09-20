package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nbu {

    /* JADX INFO: renamed from: a */
    public final String f152350a;

    /* JADX INFO: renamed from: b */
    public final String f152351b;

    public nbu(String str, String str2) {
        this.f152350a = str;
        this.f152351b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbu)) {
            return false;
        }
        nbu nbuVar = (nbu) obj;
        return wj50.m88271j(this.f152350a, nbuVar.f152350a) && wj50.m88271j(this.f152351b, nbuVar.f152351b);
    }

    public final int hashCode() {
        return this.f152351b.hashCode() + (this.f152350a.hashCode() * 961);
    }
}
