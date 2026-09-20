package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jx11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116765a;

    /* JADX INFO: renamed from: b */
    public int f116766b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oox f116767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx11(oox ooxVar, fbk fbkVar) {
        super(fbkVar);
        this.f116767c = ooxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116765a = obj;
        this.f116766b |= Integer.MIN_VALUE;
        return this.f116767c.emit(null, this);
    }
}
