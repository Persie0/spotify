package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z2s {

    /* JADX INFO: renamed from: a */
    public final String f278659a;

    public z2s(String str) {
        this.f278659a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2s) && wj50.m88271j(this.f278659a, ((z2s) obj).f278659a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + mt60.m62800g(0, this.f278659a.hashCode() * 31, 31);
    }
}
