package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h441 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87425a;

    /* JADX INFO: renamed from: b */
    public int f87426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f87427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h441(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f87427c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87425a = obj;
        this.f87426b |= Integer.MIN_VALUE;
        return this.f87427c.emit(null, this);
    }
}
