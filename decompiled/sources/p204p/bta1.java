package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bta1 implements eta1 {

    /* JADX INFO: renamed from: a */
    public final String f30541a;

    public bta1(String str) {
        this.f30541a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bta1) && wj50.m88271j(this.f30541a, ((bta1) obj).f30541a);
    }

    public final int hashCode() {
        return this.f30541a.hashCode();
    }
}
