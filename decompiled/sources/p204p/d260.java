package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d260 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f44484a;

    /* JADX INFO: renamed from: b */
    public int f44485b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f44486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d260(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f44486c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f44484a = obj;
        this.f44485b |= Integer.MIN_VALUE;
        return this.f44486c.emit(null, this);
    }
}
