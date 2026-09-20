package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zub1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f286402a;

    /* JADX INFO: renamed from: b */
    public int f286403b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f286404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zub1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f286404c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286402a = obj;
        this.f286403b |= Integer.MIN_VALUE;
        return this.f286404c.emit(null, this);
    }
}
