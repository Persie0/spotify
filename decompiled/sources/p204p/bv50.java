package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bv50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31280a;

    /* JADX INFO: renamed from: b */
    public int f31281b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f31282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f31282c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31280a = obj;
        this.f31281b |= Integer.MIN_VALUE;
        return this.f31282c.emit(null, this);
    }
}
