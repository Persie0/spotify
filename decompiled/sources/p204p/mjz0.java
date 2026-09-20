package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mjz0 {

    /* JADX INFO: renamed from: a */
    public final Object f144432a;

    /* JADX INFO: renamed from: b */
    public final vh00 f144433b;

    /* JADX INFO: renamed from: c */
    public final vh00 f144434c;

    /* JADX INFO: renamed from: d */
    public final Object f144435d;

    /* JADX INFO: renamed from: e */
    public final mb61 f144436e;

    /* JADX INFO: renamed from: f */
    public final vh00 f144437f;

    /* JADX INFO: renamed from: g */
    public Object f144438g;

    /* JADX INFO: renamed from: h */
    public int f144439h = -1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ojz0 f144440i;

    public mjz0(ojz0 ojz0Var, Object obj, vh00 vh00Var, vh00 vh00Var2, C2617yl c2617yl, mb61 mb61Var, vh00 vh00Var3) {
        this.f144440i = ojz0Var;
        this.f144432a = obj;
        this.f144433b = vh00Var;
        this.f144434c = vh00Var2;
        this.f144435d = c2617yl;
        this.f144436e = mb61Var;
        this.f144437f = vh00Var3;
    }

    /* JADX INFO: renamed from: a */
    public final void m62050a() {
        Object obj = this.f144438g;
        if (obj instanceof ffz0) {
            ((ffz0) obj).mo41559h(this.f144439h, this.f144440i.f166189a);
            return;
        }
        hwr hwrVar = obj instanceof hwr ? (hwr) obj : null;
        if (hwrVar != null) {
            hwrVar.dispose();
        }
    }
}
