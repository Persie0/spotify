package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ab2 implements hb2 {

    /* JADX INFO: renamed from: a */
    public final String f13969a;

    public ab2(String str) {
        this.f13969a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab2) && wj50.m88271j(this.f13969a, ((ab2) obj).f13969a);
    }

    public final int hashCode() {
        return this.f13969a.hashCode();
    }
}
