package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lpz0 {

    /* JADX INFO: renamed from: a */
    public final String f135862a;

    /* JADX INFO: renamed from: b */
    public final th00 f135863b;

    /* JADX INFO: renamed from: c */
    public final boolean f135864c;

    public lpz0(String str, th00 th00Var) {
        this.f135862a = str;
        this.f135863b = th00Var;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f135862a;
    }

    public /* synthetic */ lpz0(String str) {
        this(str, hex0.f90532c);
    }

    public lpz0(String str, int i) {
        this(str);
        this.f135864c = true;
    }

    public lpz0(String str, boolean z, th00 th00Var) {
        this(str, th00Var);
        this.f135864c = z;
    }
}
