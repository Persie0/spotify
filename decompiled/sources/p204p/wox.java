package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wox {

    /* JADX INFO: renamed from: a */
    public final int f253608a;

    /* JADX INFO: renamed from: b */
    public final hjv0 f253609b;

    public wox(int i, hjv0 hjv0Var) {
        this.f253608a = i;
        this.f253609b = hjv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wox)) {
            return false;
        }
        wox woxVar = (wox) obj;
        return this.f253608a == woxVar.f253608a && wj50.m88271j(this.f253609b, woxVar.f253609b);
    }

    public final int hashCode() {
        return this.f253609b.hashCode() + (Integer.hashCode(this.f253608a) * 31);
    }
}
