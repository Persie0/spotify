package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kpj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125076a;

    /* JADX INFO: renamed from: b */
    public int f125077b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f125078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpj(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f125078c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125076a = obj;
        this.f125077b |= Integer.MIN_VALUE;
        return this.f125078c.emit(null, this);
    }
}
