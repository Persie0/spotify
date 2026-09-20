package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pok0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f179726a;

    /* JADX INFO: renamed from: b */
    public int f179727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f179728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pok0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f179728c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f179726a = obj;
        this.f179727b |= Integer.MIN_VALUE;
        return this.f179728c.emit(null, this);
    }
}
