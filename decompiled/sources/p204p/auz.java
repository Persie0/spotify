package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class auz {

    /* JADX INFO: renamed from: a */
    public final String f20050a;

    public auz(String str) {
        this.f20050a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof auz) && wj50.m88271j(this.f20050a, ((auz) obj).f20050a);
    }

    public final int hashCode() {
        return this.f20050a.hashCode();
    }
}
