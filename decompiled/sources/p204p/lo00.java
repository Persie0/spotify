package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lo00 implements mo00 {

    /* JADX INFO: renamed from: a */
    public final String f135266a;

    public lo00(String str) {
        this.f135266a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo00) && wj50.m88271j(this.f135266a, ((lo00) obj).f135266a);
    }

    public final int hashCode() {
        String str = this.f135266a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
