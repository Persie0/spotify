package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qef implements sef {

    /* JADX INFO: renamed from: a */
    public final String f187917a;

    /* JADX INFO: renamed from: b */
    public final String f187918b;

    public qef(String str, String str2) {
        this.f187917a = str;
        this.f187918b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qef)) {
            return false;
        }
        qef qefVar = (qef) obj;
        return wj50.m88271j(this.f187917a, qefVar.f187917a) && wj50.m88271j(this.f187918b, qefVar.f187918b);
    }

    public final int hashCode() {
        return this.f187918b.hashCode() + (this.f187917a.hashCode() * 31);
    }
}
