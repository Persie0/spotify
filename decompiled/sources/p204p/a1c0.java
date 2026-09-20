package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a1c0 extends zlg1 {

    /* JADX INFO: renamed from: c */
    public final String f11381c;

    public a1c0(String str) {
        this.f11381c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1c0) && wj50.m88271j(this.f11381c, ((a1c0) obj).f11381c);
    }

    public final int hashCode() {
        String str = this.f11381c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
