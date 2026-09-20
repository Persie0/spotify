package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ors0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168647a;

    /* JADX INFO: renamed from: b */
    public int f168648b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f168649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ors0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f168649c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168647a = obj;
        this.f168648b |= Integer.MIN_VALUE;
        return this.f168649c.emit(null, this);
    }
}
