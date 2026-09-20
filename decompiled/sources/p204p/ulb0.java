package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ulb0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231502a;

    /* JADX INFO: renamed from: b */
    public int f231503b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f231504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulb0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f231504c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231502a = obj;
        this.f231503b |= Integer.MIN_VALUE;
        return this.f231504c.emit(null, this);
    }
}
