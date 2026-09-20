package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y0s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f268048a;

    /* JADX INFO: renamed from: b */
    public int f268049b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f268050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0s(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f268050c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268048a = obj;
        this.f268049b |= Integer.MIN_VALUE;
        return this.f268050c.emit(null, this);
    }
}
