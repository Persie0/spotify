package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uo11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f232308a;

    /* JADX INFO: renamed from: b */
    public int f232309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f232310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo11(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f232310c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232308a = obj;
        this.f232309b |= Integer.MIN_VALUE;
        return this.f232310c.emit(null, this);
    }
}
