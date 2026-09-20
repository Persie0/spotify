package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cb70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f36030a;

    /* JADX INFO: renamed from: b */
    public int f36031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f36032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb70(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f36032c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f36030a = obj;
        this.f36031b |= Integer.MIN_VALUE;
        return this.f36032c.emit(null, this);
    }
}
