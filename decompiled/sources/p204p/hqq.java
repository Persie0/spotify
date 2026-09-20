package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hqq extends lqq {

    /* JADX INFO: renamed from: a */
    public final String f94239a;

    public hqq(String str) {
        this.f94239a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqq) && wj50.m88271j(this.f94239a, ((hqq) obj).f94239a);
    }

    public final int hashCode() {
        return this.f94239a.hashCode();
    }
}
