package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mf70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f142980a;

    /* JADX INFO: renamed from: b */
    public int f142981b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ of70 f142982c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf70(of70 of70Var, fbk fbkVar) {
        super(fbkVar);
        this.f142982c = of70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142980a = obj;
        this.f142981b |= Integer.MIN_VALUE;
        return this.f142982c.emit(null, this);
    }
}
