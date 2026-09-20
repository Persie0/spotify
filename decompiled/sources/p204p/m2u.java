package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m2u extends fn1 {

    /* JADX INFO: renamed from: c */
    public final String f139462c;

    /* JADX INFO: renamed from: d */
    public final int f139463d;

    public m2u(String str, int i) {
        this.f139462c = str;
        this.f139463d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2u)) {
            return false;
        }
        m2u m2uVar = (m2u) obj;
        return wj50.m88271j(this.f139462c, m2uVar.f139462c) && this.f139463d == m2uVar.f139463d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139463d) + (this.f139462c.hashCode() * 31);
    }
}
