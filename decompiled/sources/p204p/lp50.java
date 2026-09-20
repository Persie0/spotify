package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lp50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f135629a;

    /* JADX INFO: renamed from: b */
    public int f135630b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f135631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f135631c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f135629a = obj;
        this.f135630b |= Integer.MIN_VALUE;
        return this.f135631c.emit(null, this);
    }
}
