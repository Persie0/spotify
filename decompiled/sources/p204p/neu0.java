package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class neu0 implements oeu0 {

    /* JADX INFO: renamed from: a */
    public final String f153114a;

    public neu0(String str) {
        this.f153114a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof neu0) && wj50.m88271j(this.f153114a, ((neu0) obj).f153114a);
    }

    public final int hashCode() {
        return this.f153114a.hashCode();
    }
}
