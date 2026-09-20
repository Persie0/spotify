package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bnq implements dnq {

    /* JADX INFO: renamed from: a */
    public final String f28912a;

    public bnq(String str) {
        this.f28912a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bnq) && wj50.m88271j(this.f28912a, ((bnq) obj).f28912a);
    }

    public final int hashCode() {
        return this.f28912a.hashCode();
    }
}
