package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rp20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201402a;

    /* JADX INFO: renamed from: b */
    public int f201403b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f201404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f201404c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201402a = obj;
        this.f201403b |= Integer.MIN_VALUE;
        return this.f201404c.emit(null, this);
    }
}
