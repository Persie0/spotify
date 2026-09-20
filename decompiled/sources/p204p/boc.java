package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class boc {

    /* JADX INFO: renamed from: a */
    public final String f29065a;

    /* JADX INFO: renamed from: b */
    public final String f29066b;

    public boc(String str, String str2) {
        this.f29065a = str;
        this.f29066b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boc)) {
            return false;
        }
        boc bocVar = (boc) obj;
        return wj50.m88271j(this.f29065a, bocVar.f29065a) && wj50.m88271j(this.f29066b, bocVar.f29066b);
    }

    public final int hashCode() {
        return this.f29066b.hashCode() + (this.f29065a.hashCode() * 31);
    }
}
