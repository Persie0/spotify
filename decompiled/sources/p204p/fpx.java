package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fpx {

    /* JADX INFO: renamed from: a */
    public final String f72009a;

    /* JADX INFO: renamed from: b */
    public final ktx f72010b;

    public fpx(String str, ktx ktxVar) {
        this.f72009a = str;
        this.f72010b = ktxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpx)) {
            return false;
        }
        fpx fpxVar = (fpx) obj;
        return wj50.m88271j(this.f72009a, fpxVar.f72009a) && wj50.m88271j(this.f72010b, fpxVar.f72010b);
    }

    public final int hashCode() {
        return this.f72010b.hashCode() + (this.f72009a.hashCode() * 31);
    }
}
