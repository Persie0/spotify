package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qes0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f188019a;

    public qes0(String str) {
        this.f188019a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qes0) && wj50.m88271j(this.f188019a, ((qes0) obj).f188019a);
    }

    public final int hashCode() {
        return this.f188019a.hashCode();
    }
}
