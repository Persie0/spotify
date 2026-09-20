package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ni61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f154188a;

    /* JADX INFO: renamed from: b */
    public int f154189b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oi61 f154190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni61(oi61 oi61Var, fbk fbkVar) {
        super(fbkVar);
        this.f154190c = oi61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f154188a = obj;
        this.f154189b |= Integer.MIN_VALUE;
        return this.f154190c.emit(null, this);
    }
}
