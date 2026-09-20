package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mfe1 extends ofe1 {

    /* JADX INFO: renamed from: a */
    public final String f143062a;

    public mfe1(String str) {
        this.f143062a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfe1) && wj50.m88271j(this.f143062a, ((mfe1) obj).f143062a);
    }

    public final int hashCode() {
        return this.f143062a.hashCode();
    }
}
