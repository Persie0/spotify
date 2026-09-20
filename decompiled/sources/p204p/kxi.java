package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kxi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f127493a;

    /* JADX INFO: renamed from: b */
    public int f127494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f127495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxi(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f127495c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f127493a = obj;
        this.f127494b |= Integer.MIN_VALUE;
        return this.f127495c.emit(null, this);
    }
}
