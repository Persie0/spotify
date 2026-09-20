package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ooj {

    /* JADX INFO: renamed from: a */
    public final String f167644a;

    /* JADX INFO: renamed from: b */
    public final int f167645b;

    public ooj(String str, int i) {
        this.f167644a = str;
        this.f167645b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ooj)) {
            return false;
        }
        ooj oojVar = (ooj) obj;
        return wj50.m88271j(this.f167644a, oojVar.f167644a) && this.f167645b == oojVar.f167645b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f167645b) + (this.f167644a.hashCode() * 31);
    }
}
