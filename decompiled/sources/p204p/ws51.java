package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ws51 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final String f254525a;

    public ws51(String str) {
        this.f254525a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ws51) && wj50.m88271j(this.f254525a, ((ws51) obj).f254525a);
    }

    public final int hashCode() {
        return this.f254525a.hashCode();
    }
}
