package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fw60 implements sw60 {

    /* JADX INFO: renamed from: a */
    public final String f73996a;

    public fw60(String str) {
        this.f73996a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fw60) && wj50.m88271j(this.f73996a, ((fw60) obj).f73996a);
    }

    public final int hashCode() {
        return this.f73996a.hashCode();
    }
}
