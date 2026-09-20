package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qf70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188133a;

    /* JADX INFO: renamed from: b */
    public int f188134b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ of70 f188135c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf70(of70 of70Var, fbk fbkVar) {
        super(fbkVar);
        this.f188135c = of70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188133a = obj;
        this.f188134b |= Integer.MIN_VALUE;
        return this.f188135c.emit(null, this);
    }
}
