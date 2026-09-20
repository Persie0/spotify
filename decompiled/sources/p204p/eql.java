package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eql extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61914a;

    /* JADX INFO: renamed from: b */
    public int f61915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f61916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eql(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f61916c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61914a = obj;
        this.f61915b |= Integer.MIN_VALUE;
        return this.f61916c.emit(null, this);
    }
}
