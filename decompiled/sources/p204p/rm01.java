package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rm01 extends sm01 {

    /* JADX INFO: renamed from: a */
    public final String f200409a;

    public rm01(String str) {
        this.f200409a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm01) && wj50.m88271j(this.f200409a, ((rm01) obj).f200409a);
    }

    public final int hashCode() {
        return this.f200409a.hashCode();
    }
}
