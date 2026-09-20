package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jvc {

    /* JADX INFO: renamed from: a */
    public final int f116298a;

    /* JADX INFO: renamed from: b */
    public final bvc f116299b;

    public jvc(int i, bvc bvcVar) {
        this.f116298a = i;
        this.f116299b = bvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvc)) {
            return false;
        }
        jvc jvcVar = (jvc) obj;
        return this.f116298a == jvcVar.f116298a && this.f116299b == jvcVar.f116299b;
    }

    public final int hashCode() {
        return this.f116299b.hashCode() + (Integer.hashCode(this.f116298a) * 31);
    }
}
