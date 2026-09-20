package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class oi40 implements ri40 {

    /* JADX INFO: renamed from: a */
    public final String f165696a;

    public oi40(String str) {
        this.f165696a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi40) && wj50.m88271j(this.f165696a, ((oi40) obj).f165696a);
    }

    public final int hashCode() {
        String str = this.f165696a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
