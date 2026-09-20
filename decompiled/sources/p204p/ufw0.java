package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ufw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f229886a;

    /* JADX INFO: renamed from: b */
    public int f229887b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f229888c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufw0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f229888c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f229886a = obj;
        this.f229887b |= Integer.MIN_VALUE;
        return this.f229888c.emit(null, this);
    }
}
