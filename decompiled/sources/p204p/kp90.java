package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kp90 extends qp90 {

    /* JADX INFO: renamed from: a */
    public final String f125013a;

    public kp90(String str) {
        this.f125013a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp90) && wj50.m88271j(this.f125013a, ((kp90) obj).f125013a);
    }

    public final int hashCode() {
        return this.f125013a.hashCode();
    }
}
