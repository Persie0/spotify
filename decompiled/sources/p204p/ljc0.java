package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ljc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mjc0 f134056b;

    /* JADX INFO: renamed from: c */
    public int f134057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljc0(mjc0 mjc0Var, fbk fbkVar) {
        super(fbkVar);
        this.f134056b = mjc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134055a = obj;
        this.f134057c |= Integer.MIN_VALUE;
        this.f134056b.collect(null, this);
        return yuk.f276404a;
    }
}
