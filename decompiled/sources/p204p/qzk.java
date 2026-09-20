package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qzk implements rzk {

    /* JADX INFO: renamed from: a */
    public final String f194217a;

    public qzk(String str) {
        this.f194217a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzk) && wj50.m88271j(this.f194217a, ((qzk) obj).f194217a);
    }

    public final int hashCode() {
        return this.f194217a.hashCode();
    }
}
