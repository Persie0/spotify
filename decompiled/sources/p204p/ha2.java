package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ha2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89092a;

    /* JADX INFO: renamed from: b */
    public int f89093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f89094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f89094c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89092a = obj;
        this.f89093b |= Integer.MIN_VALUE;
        return this.f89094c.emit(null, this);
    }
}
