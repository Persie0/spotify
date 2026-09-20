package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pk3 extends rk3 {

    /* JADX INFO: renamed from: a */
    public final String f178374a;

    public pk3(String str) {
        this.f178374a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pk3) && wj50.m88271j(this.f178374a, ((pk3) obj).f178374a);
    }

    public final int hashCode() {
        return this.f178374a.hashCode();
    }
}
