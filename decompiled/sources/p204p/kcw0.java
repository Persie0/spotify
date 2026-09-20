package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kcw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121556a;

    /* JADX INFO: renamed from: b */
    public int f121557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f121558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcw0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f121558c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121556a = obj;
        this.f121557b |= Integer.MIN_VALUE;
        return this.f121558c.emit(null, this);
    }
}
