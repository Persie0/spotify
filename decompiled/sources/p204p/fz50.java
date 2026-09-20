package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fz50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f74912a;

    /* JADX INFO: renamed from: b */
    public int f74913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f74914c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f74914c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f74912a = obj;
        this.f74913b |= Integer.MIN_VALUE;
        return this.f74914c.emit(null, this);
    }
}
