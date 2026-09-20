package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pe30 implements we30 {

    /* JADX INFO: renamed from: a */
    public final String f176622a;

    public pe30(String str) {
        this.f176622a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pe30) && wj50.m88271j(this.f176622a, ((pe30) obj).f176622a);
    }

    public final int hashCode() {
        return this.f176622a.hashCode();
    }
}
