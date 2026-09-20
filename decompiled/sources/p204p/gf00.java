package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gf00 implements jf00 {

    /* JADX INFO: renamed from: a */
    public final String f79244a;

    public gf00(String str) {
        this.f79244a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf00) && wj50.m88271j(this.f79244a, ((gf00) obj).f79244a);
    }

    public final int hashCode() {
        return this.f79244a.hashCode();
    }
}
