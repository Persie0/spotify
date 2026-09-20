package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ojc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f166036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mjc0 f166037b;

    /* JADX INFO: renamed from: c */
    public int f166038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojc0(mjc0 mjc0Var, fbk fbkVar) {
        super(fbkVar);
        this.f166037b = mjc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f166036a = obj;
        this.f166038c |= Integer.MIN_VALUE;
        this.f166037b.collect(null, this);
        return yuk.f276404a;
    }
}
