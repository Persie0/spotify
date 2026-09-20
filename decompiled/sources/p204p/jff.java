package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jff implements lff {

    /* JADX INFO: renamed from: a */
    public final String f111894a;

    /* JADX INFO: renamed from: b */
    public final String f111895b;

    public jff(String str, String str2) {
        this.f111894a = str;
        this.f111895b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jff)) {
            return false;
        }
        jff jffVar = (jff) obj;
        return wj50.m88271j(this.f111894a, jffVar.f111894a) && wj50.m88271j(this.f111895b, jffVar.f111895b);
    }

    @Override // p204p.lff
    public final String getName() {
        return this.f111894a;
    }

    public final int hashCode() {
        return this.f111895b.hashCode() + (this.f111894a.hashCode() * 31);
    }
}
