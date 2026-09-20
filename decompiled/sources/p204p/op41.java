package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class op41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f167754a;

    /* JADX INFO: renamed from: b */
    public int f167755b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pp41 f167756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op41(pp41 pp41Var, fbk fbkVar) {
        super(fbkVar);
        this.f167756c = pp41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167754a = obj;
        this.f167755b |= Integer.MIN_VALUE;
        return this.f167756c.emit(null, this);
    }
}
