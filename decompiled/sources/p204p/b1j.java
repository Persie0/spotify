package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class b1j extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22365a;

    /* JADX INFO: renamed from: b */
    public int f22366b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f22367c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1j(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f22367c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f22365a = obj;
        this.f22366b |= Integer.MIN_VALUE;
        return this.f22367c.emit(null, this);
    }
}
