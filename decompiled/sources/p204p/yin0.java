package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yin0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f273171a;

    /* JADX INFO: renamed from: b */
    public int f273172b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f273173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yin0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f273173c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273171a = obj;
        this.f273172b |= Integer.MIN_VALUE;
        return this.f273173c.emit(null, this);
    }
}
