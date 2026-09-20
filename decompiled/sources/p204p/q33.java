package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q33 implements s33 {

    /* JADX INFO: renamed from: a */
    public final String f184782a;

    public q33(String str) {
        this.f184782a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q33) && wj50.m88271j(this.f184782a, ((q33) obj).f184782a);
    }

    public final int hashCode() {
        String str = this.f184782a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
