package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hzi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96955a;

    /* JADX INFO: renamed from: b */
    public int f96956b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f96957c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzi(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f96957c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96955a = obj;
        this.f96956b |= Integer.MIN_VALUE;
        return this.f96957c.emit(null, this);
    }
}
