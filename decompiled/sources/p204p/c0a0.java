package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c0a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32724a;

    /* JADX INFO: renamed from: b */
    public int f32725b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f32726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0a0(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f32726c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32724a = obj;
        this.f32725b |= Integer.MIN_VALUE;
        return this.f32726c.emit(null, this);
    }
}
