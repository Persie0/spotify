package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wz2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f256439a;

    /* JADX INFO: renamed from: b */
    public int f256440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f256441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f256441c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f256439a = obj;
        this.f256440b |= Integer.MIN_VALUE;
        return this.f256441c.emit(null, this);
    }
}
