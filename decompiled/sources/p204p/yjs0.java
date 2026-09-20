package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yjs0 extends zjs0 {

    /* JADX INFO: renamed from: a */
    public final String f273450a;

    /* JADX INFO: renamed from: b */
    public final String f273451b;

    public yjs0(String str, String str2) {
        this.f273450a = str;
        this.f273451b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjs0)) {
            return false;
        }
        yjs0 yjs0Var = (yjs0) obj;
        return wj50.m88271j(this.f273450a, yjs0Var.f273450a) && wj50.m88271j(this.f273451b, yjs0Var.f273451b);
    }

    public final int hashCode() {
        return this.f273451b.hashCode() + (this.f273450a.hashCode() * 31);
    }
}
