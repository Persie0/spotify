package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q7j extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186140a;

    /* JADX INFO: renamed from: b */
    public int f186141b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f186142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7j(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f186142c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186140a = obj;
        this.f186141b |= Integer.MIN_VALUE;
        return this.f186142c.emit(null, this);
    }
}
