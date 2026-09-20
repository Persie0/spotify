package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class buj extends huj {

    /* JADX INFO: renamed from: a */
    public final String f31146a;

    /* JADX INFO: renamed from: b */
    public final String f31147b;

    public buj(String str, String str2) {
        this.f31146a = str;
        this.f31147b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buj)) {
            return false;
        }
        buj bujVar = (buj) obj;
        return wj50.m88271j(this.f31146a, bujVar.f31146a) && wj50.m88271j(this.f31147b, bujVar.f31147b);
    }

    public final int hashCode() {
        return this.f31147b.hashCode() + (this.f31146a.hashCode() * 31);
    }
}
