package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k4f0 extends n4f0 {

    /* JADX INFO: renamed from: a */
    public final String f119213a;

    public k4f0(String str) {
        this.f119213a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k4f0) && wj50.m88271j(this.f119213a, ((k4f0) obj).f119213a);
    }

    public final int hashCode() {
        return this.f119213a.hashCode();
    }
}
