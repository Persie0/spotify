package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sy81 extends ty81 {

    /* JADX INFO: renamed from: a */
    public final String f215189a;

    public sy81(String str) {
        this.f215189a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy81) && wj50.m88271j(this.f215189a, ((sy81) obj).f215189a);
    }

    public final int hashCode() {
        return this.f215189a.hashCode();
    }
}
