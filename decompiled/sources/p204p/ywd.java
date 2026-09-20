package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ywd implements bxd {

    /* JADX INFO: renamed from: a */
    public final String f276948a;

    /* JADX INFO: renamed from: b */
    public final String f276949b;

    public ywd(String str, String str2) {
        this.f276948a = str;
        this.f276949b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywd)) {
            return false;
        }
        ywd ywdVar = (ywd) obj;
        return wj50.m88271j(this.f276948a, ywdVar.f276948a) && wj50.m88271j(this.f276949b, ywdVar.f276949b);
    }

    public final int hashCode() {
        return this.f276949b.hashCode() + (this.f276948a.hashCode() * 31);
    }
}
