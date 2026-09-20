package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qzw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f194324a;

    public qzw(String str) {
        this.f194324a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzw) && wj50.m88271j(this.f194324a, ((qzw) obj).f194324a);
    }

    public final int hashCode() {
        return this.f194324a.hashCode();
    }
}
