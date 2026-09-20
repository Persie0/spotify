package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q411 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185023a;

    /* JADX INFO: renamed from: b */
    public int f185024b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f185025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q411(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f185025c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185023a = obj;
        this.f185024b |= Integer.MIN_VALUE;
        return this.f185025c.emit(null, this);
    }
}
