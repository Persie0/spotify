package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class my50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f148309a;

    /* JADX INFO: renamed from: b */
    public int f148310b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f148311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f148311c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f148309a = obj;
        this.f148310b |= Integer.MIN_VALUE;
        return this.f148311c.emit(null, this);
    }
}
