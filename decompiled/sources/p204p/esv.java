package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class esv implements gsv {

    /* JADX INFO: renamed from: a */
    public final String f62497a;

    /* JADX INFO: renamed from: b */
    public final boolean f62498b;

    public esv(String str, boolean z) {
        this.f62497a = str;
        this.f62498b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esv)) {
            return false;
        }
        esv esvVar = (esv) obj;
        return wj50.m88271j(this.f62497a, esvVar.f62497a) && this.f62498b == esvVar.f62498b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62498b) + (this.f62497a.hashCode() * 31);
    }
}
