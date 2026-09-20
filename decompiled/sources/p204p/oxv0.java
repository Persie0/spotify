package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oxv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f171604a;

    /* JADX INFO: renamed from: b */
    public int f171605b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f171606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxv0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f171606c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f171604a = obj;
        this.f171605b |= Integer.MIN_VALUE;
        return this.f171606c.emit(null, this);
    }
}
