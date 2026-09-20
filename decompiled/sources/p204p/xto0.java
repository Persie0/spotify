package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xto0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265902a;

    /* JADX INFO: renamed from: b */
    public int f265903b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f265904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xto0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f265904c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265902a = obj;
        this.f265903b |= Integer.MIN_VALUE;
        return this.f265904c.emit(null, this);
    }
}
