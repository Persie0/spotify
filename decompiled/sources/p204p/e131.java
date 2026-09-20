package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e131 {

    /* JADX INFO: renamed from: a */
    public final String f55115a;

    public e131(String str) {
        this.f55115a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e131) && wj50.m88271j(this.f55115a, ((e131) obj).f55115a);
    }

    public final int hashCode() {
        return edb.m38547C(1) + (this.f55115a.hashCode() * 31);
    }
}
