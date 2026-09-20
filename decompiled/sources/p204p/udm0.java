package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class udm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f229270a;

    /* JADX INFO: renamed from: b */
    public int f229271b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f229272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udm0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f229272c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f229270a = obj;
        this.f229271b |= Integer.MIN_VALUE;
        return this.f229272c.emit(null, this);
    }
}
