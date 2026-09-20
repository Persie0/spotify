package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zm00 extends an00 {

    /* JADX INFO: renamed from: a */
    public final String f284115a;

    public zm00(String str) {
        this.f284115a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm00) && wj50.m88271j(this.f284115a, ((zm00) obj).f284115a);
    }

    public final int hashCode() {
        return this.f284115a.hashCode();
    }
}
