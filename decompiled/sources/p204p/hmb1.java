package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hmb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f92883a;

    /* JADX INFO: renamed from: b */
    public int f92884b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f92885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f92885c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92883a = obj;
        this.f92884b |= Integer.MIN_VALUE;
        return this.f92885c.emit(null, this);
    }
}
