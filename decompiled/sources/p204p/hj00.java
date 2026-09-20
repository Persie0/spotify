package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hj00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f91928a;

    /* JADX INFO: renamed from: b */
    public int f91929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f91930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj00(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f91930c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91928a = obj;
        this.f91929b |= Integer.MIN_VALUE;
        return this.f91930c.emit(null, this);
    }
}
