package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mdt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f142495a;

    /* JADX INFO: renamed from: b */
    public int f142496b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f142497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdt0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f142497c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142495a = obj;
        this.f142496b |= Integer.MIN_VALUE;
        return this.f142497c.emit(null, this);
    }
}
