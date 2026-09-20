package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s83 extends t83 {

    /* JADX INFO: renamed from: a */
    public final String f206529a;

    public s83(String str) {
        this.f206529a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s83) && wj50.m88271j(this.f206529a, ((s83) obj).f206529a);
    }

    public final int hashCode() {
        return this.f206529a.hashCode();
    }
}
