package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tc90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219045a;

    /* JADX INFO: renamed from: b */
    public int f219046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uc90 f219047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc90(uc90 uc90Var, fbk fbkVar) {
        super(fbkVar);
        this.f219047c = uc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219045a = obj;
        this.f219046b |= Integer.MIN_VALUE;
        return this.f219047c.emit(null, this);
    }
}
