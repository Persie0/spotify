package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dn5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final String f50691a;

    public dn5(String str) {
        this.f50691a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn5) && wj50.m88271j(this.f50691a, ((dn5) obj).f50691a);
    }

    public final int hashCode() {
        String str = this.f50691a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
