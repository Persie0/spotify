package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lv9 implements nv9 {

    /* JADX INFO: renamed from: a */
    public final String f137260a;

    public lv9(String str) {
        this.f137260a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv9) && wj50.m88271j(this.f137260a, ((lv9) obj).f137260a);
    }

    public final int hashCode() {
        return this.f137260a.hashCode();
    }
}
