package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ajn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16293a;

    /* JADX INFO: renamed from: b */
    public int f16294b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f16295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajn0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f16295c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16293a = obj;
        this.f16294b |= Integer.MIN_VALUE;
        return this.f16295c.emit(null, this);
    }
}
