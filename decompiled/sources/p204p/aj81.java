package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aj81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16194a;

    /* JADX INFO: renamed from: b */
    public int f16195b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f16196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj81(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f16196c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16194a = obj;
        this.f16195b |= Integer.MIN_VALUE;
        return this.f16196c.emit(null, this);
    }
}
