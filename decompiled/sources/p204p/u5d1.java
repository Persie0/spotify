package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u5d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final String f227004a;

    public u5d1(String str) {
        this.f227004a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5d1) && wj50.m88271j(this.f227004a, ((u5d1) obj).f227004a);
    }

    public final int hashCode() {
        return this.f227004a.hashCode();
    }
}
