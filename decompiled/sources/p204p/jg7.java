package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jg7 extends geg1 {

    /* JADX INFO: renamed from: l */
    public final String f112095l;

    /* JADX INFO: renamed from: m */
    public final sg7 f112096m;

    /* JADX INFO: renamed from: n */
    public final og7 f112097n;

    public jg7(String str, sg7 sg7Var, og7 og7Var) {
        this.f112095l = str;
        this.f112096m = sg7Var;
        this.f112097n = og7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg7)) {
            return false;
        }
        jg7 jg7Var = (jg7) obj;
        return wj50.m88271j(this.f112095l, jg7Var.f112095l) && this.f112096m.equals(jg7Var.f112096m) && this.f112097n.equals(jg7Var.f112097n);
    }

    public final int hashCode() {
        return this.f112097n.hashCode() + ((this.f112096m.hashCode() + (this.f112095l.hashCode() * 31)) * 31);
    }
}
