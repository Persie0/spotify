package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aax0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13946a;

    /* JADX INFO: renamed from: b */
    public int f13947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f13948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aax0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f13948c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13946a = obj;
        this.f13947b |= Integer.MIN_VALUE;
        return this.f13948c.emit(null, this);
    }
}
