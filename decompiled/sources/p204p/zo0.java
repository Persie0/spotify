package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284606a;

    /* JADX INFO: renamed from: b */
    public int f284607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f284608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo0(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f284608c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284606a = obj;
        this.f284607b |= Integer.MIN_VALUE;
        return this.f284608c.emit(null, this);
    }
}
