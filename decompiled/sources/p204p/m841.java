package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m841 implements r841 {

    /* JADX INFO: renamed from: a */
    public final String f140925a;

    public m841(String str) {
        this.f140925a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m841) && wj50.m88271j(this.f140925a, ((m841) obj).f140925a);
    }

    public final int hashCode() {
        String str = this.f140925a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
