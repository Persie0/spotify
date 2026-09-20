package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b860 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24501a;

    /* JADX INFO: renamed from: b */
    public int f24502b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f24503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b860(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f24503c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24501a = obj;
        this.f24502b |= Integer.MIN_VALUE;
        return this.f24503c.emit(null, this);
    }
}
