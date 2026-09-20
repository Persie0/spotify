package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mfv0 extends qfv0 {

    /* JADX INFO: renamed from: a */
    public final String f143207a;

    public mfv0(String str) {
        this.f143207a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfv0) && wj50.m88271j(this.f143207a, ((mfv0) obj).f143207a);
    }

    public final int hashCode() {
        return this.f143207a.hashCode();
    }
}
