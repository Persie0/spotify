package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l841 implements r841 {

    /* JADX INFO: renamed from: a */
    public final String f130799a;

    public l841(String str) {
        this.f130799a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l841) && wj50.m88271j(this.f130799a, ((l841) obj).f130799a);
    }

    public final int hashCode() {
        String str = this.f130799a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
