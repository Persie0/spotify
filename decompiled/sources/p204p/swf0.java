package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class swf0 implements cxf0 {

    /* JADX INFO: renamed from: a */
    public final int f214662a;

    public swf0(int i) {
        this.f214662a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swf0) && this.f214662a == ((swf0) obj).f214662a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f214662a);
    }
}
