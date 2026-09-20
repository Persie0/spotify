package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r930 implements t930 {

    /* JADX INFO: renamed from: a */
    public final String f196892a;

    public r930(String str) {
        this.f196892a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r930) && wj50.m88271j(this.f196892a, ((r930) obj).f196892a);
    }

    public final int hashCode() {
        String str = this.f196892a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
