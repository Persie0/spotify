package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kp9 extends np9 {

    /* JADX INFO: renamed from: a */
    public final String f125012a;

    public kp9(String str) {
        this.f125012a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp9) && wj50.m88271j(this.f125012a, ((kp9) obj).f125012a);
    }

    public final int hashCode() {
        String str = this.f125012a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
