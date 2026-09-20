package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class a0j extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11092a;

    /* JADX INFO: renamed from: b */
    public int f11093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f11094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0j(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f11094c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11092a = obj;
        this.f11093b |= Integer.MIN_VALUE;
        return this.f11094c.emit(null, this);
    }
}
