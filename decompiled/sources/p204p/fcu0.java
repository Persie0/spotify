package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fcu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f68259a;

    /* JADX INFO: renamed from: b */
    public int f68260b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f68261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcu0(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f68261c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f68259a = obj;
        this.f68260b |= Integer.MIN_VALUE;
        return this.f68261c.emit(null, this);
    }
}
