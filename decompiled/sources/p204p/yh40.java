package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yh40 implements ci40 {

    /* JADX INFO: renamed from: a */
    public final String f272725a;

    public yh40(String str) {
        this.f272725a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh40) && wj50.m88271j(this.f272725a, ((yh40) obj).f272725a);
    }

    public final int hashCode() {
        return this.f272725a.hashCode();
    }
}
