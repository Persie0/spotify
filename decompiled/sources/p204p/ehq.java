package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ehq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f59637a;

    /* JADX INFO: renamed from: b */
    public int f59638b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f59639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f59639c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f59637a = obj;
        this.f59638b |= Integer.MIN_VALUE;
        return this.f59639c.emit(null, this);
    }
}
