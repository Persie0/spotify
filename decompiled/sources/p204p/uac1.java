package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uac1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228449a;

    /* JADX INFO: renamed from: b */
    public int f228450b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f228451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uac1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f228451c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228449a = obj;
        this.f228450b |= Integer.MIN_VALUE;
        return this.f228451c.emit(null, this);
    }
}
