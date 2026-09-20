package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88582a;

    /* JADX INFO: renamed from: b */
    public int f88583b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i80 f88584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(i80 i80Var, fbk fbkVar) {
        super(fbkVar);
        this.f88584c = i80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88582a = obj;
        this.f88583b |= Integer.MIN_VALUE;
        return this.f88584c.emit(null, this);
    }
}
