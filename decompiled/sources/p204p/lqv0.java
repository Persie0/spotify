package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lqv0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final boolean f136150a;

    public lqv0(boolean z) {
        this.f136150a = z;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        xr60 xr60Var = (xr60) obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f136150a ? "(raw) " : "");
        sb.append(xr60Var);
        return sb.toString();
    }
}
