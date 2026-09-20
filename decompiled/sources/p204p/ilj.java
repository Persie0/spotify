package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ilj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103387a;

    /* JADX INFO: renamed from: b */
    public int f103388b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f103389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilj(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f103389c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103387a = obj;
        this.f103388b |= Integer.MIN_VALUE;
        return this.f103389c.emit(null, this);
    }
}
