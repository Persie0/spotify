package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class toy {

    /* JADX INFO: renamed from: a */
    public final koy f222340a;

    /* JADX INFO: renamed from: b */
    public final String f222341b;

    /* JADX INFO: renamed from: c */
    public final String f222342c;

    public toy(koy koyVar, String str, String str2) {
        this.f222340a = koyVar;
        this.f222341b = str;
        this.f222342c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toy)) {
            return false;
        }
        toy toyVar = (toy) obj;
        return wj50.m88271j(this.f222340a, toyVar.f222340a) && wj50.m88271j(this.f222341b, toyVar.f222341b) && wj50.m88271j(this.f222342c, toyVar.f222342c);
    }

    public final int hashCode() {
        return this.f222342c.hashCode() + s571.m77243b(this.f222340a.hashCode() * 31, 31, this.f222341b);
    }
}
