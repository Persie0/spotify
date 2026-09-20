package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qjc {

    /* JADX INFO: renamed from: a */
    public final String f189212a;

    public qjc(String str) {
        this.f189212a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjc) && wj50.m88271j(this.f189212a, ((qjc) obj).f189212a);
    }

    public final int hashCode() {
        return this.f189212a.hashCode();
    }
}
