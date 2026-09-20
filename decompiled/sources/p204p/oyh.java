package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oyh implements tyh {

    /* JADX INFO: renamed from: a */
    public final String f171765a;

    /* JADX INFO: renamed from: b */
    public final String f171766b;

    public oyh(String str, String str2) {
        this.f171765a = str;
        this.f171766b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyh)) {
            return false;
        }
        oyh oyhVar = (oyh) obj;
        return wj50.m88271j(this.f171765a, oyhVar.f171765a) && wj50.m88271j(this.f171766b, oyhVar.f171766b);
    }

    public final int hashCode() {
        return this.f171766b.hashCode() + (this.f171765a.hashCode() * 31);
    }
}
