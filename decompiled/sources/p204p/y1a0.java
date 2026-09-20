package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class y1a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f268214a;

    /* JADX INFO: renamed from: b */
    public int f268215b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z1a0 f268216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1a0(z1a0 z1a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f268216c = z1a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268214a = obj;
        this.f268215b |= Integer.MIN_VALUE;
        return this.f268216c.emit(null, this);
    }
}
