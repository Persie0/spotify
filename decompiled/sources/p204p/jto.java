package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jto {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2415th f115931a;

    /* JADX INFO: renamed from: b */
    public final int f115932b;

    public jto(InterfaceC2415th interfaceC2415th, int i) {
        this.f115931a = interfaceC2415th;
        this.f115932b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jto)) {
            return false;
        }
        jto jtoVar = (jto) obj;
        return wj50.m88271j(this.f115931a, jtoVar.f115931a) && this.f115932b == jtoVar.f115932b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f115932b) + (this.f115931a.hashCode() * 31);
    }
}
