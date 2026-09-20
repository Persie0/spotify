package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rnd {

    /* JADX INFO: renamed from: a */
    public final String f200891a;

    /* JADX INFO: renamed from: b */
    public final String f200892b;

    public rnd(String str, String str2) {
        this.f200891a = str;
        this.f200892b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnd)) {
            return false;
        }
        rnd rndVar = (rnd) obj;
        return wj50.m88271j(this.f200891a, rndVar.f200891a) && wj50.m88271j(this.f200892b, rndVar.f200892b);
    }

    public final int hashCode() {
        return this.f200892b.hashCode() + (this.f200891a.hashCode() * 31);
    }
}
