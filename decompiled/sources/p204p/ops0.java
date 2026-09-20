package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ops0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168015a;

    /* JADX INFO: renamed from: b */
    public int f168016b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f168017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ops0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f168017c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168015a = obj;
        this.f168016b |= Integer.MIN_VALUE;
        return this.f168017c.emit(null, this);
    }
}
