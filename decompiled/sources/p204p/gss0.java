package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gss0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84010a;

    /* JADX INFO: renamed from: b */
    public int f84011b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dss0 f84012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gss0(dss0 dss0Var, fbk fbkVar) {
        super(fbkVar);
        this.f84012c = dss0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84010a = obj;
        this.f84011b |= Integer.MIN_VALUE;
        return this.f84012c.emit(null, this);
    }
}
