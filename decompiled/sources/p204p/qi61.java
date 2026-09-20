package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qi61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188948a;

    /* JADX INFO: renamed from: b */
    public int f188949b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oi61 f188950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi61(oi61 oi61Var, fbk fbkVar) {
        super(fbkVar);
        this.f188950c = oi61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188948a = obj;
        this.f188949b |= Integer.MIN_VALUE;
        return this.f188950c.emit(null, this);
    }
}
