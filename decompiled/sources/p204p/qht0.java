package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qht0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188851a;

    /* JADX INFO: renamed from: b */
    public int f188852b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f188853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qht0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f188853c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188851a = obj;
        this.f188852b |= Integer.MIN_VALUE;
        return this.f188853c.emit(null, this);
    }
}
