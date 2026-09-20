package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gu80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84404a;

    /* JADX INFO: renamed from: b */
    public int f84405b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hu80 f84406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu80(hu80 hu80Var, fbk fbkVar) {
        super(fbkVar);
        this.f84406c = hu80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84404a = obj;
        this.f84405b |= Integer.MIN_VALUE;
        return this.f84406c.emit(null, this);
    }
}
