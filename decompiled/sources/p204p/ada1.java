package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ada1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14585a;

    /* JADX INFO: renamed from: b */
    public int f14586b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f14587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ada1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f14587c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f14585a = obj;
        this.f14586b |= Integer.MIN_VALUE;
        return this.f14587c.emit(null, this);
    }
}
