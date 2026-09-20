package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cf7 extends ff7 {

    /* JADX INFO: renamed from: a */
    public final String f37280a;

    public cf7(String str) {
        this.f37280a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf7) && wj50.m88271j(this.f37280a, ((cf7) obj).f37280a);
    }

    public final int hashCode() {
        String str = this.f37280a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
