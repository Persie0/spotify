package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zg40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f282477a;

    /* JADX INFO: renamed from: b */
    public int f282478b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f282479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg40(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f282479c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f282477a = obj;
        this.f282478b |= Integer.MIN_VALUE;
        return this.f282479c.emit(null, this);
    }
}
