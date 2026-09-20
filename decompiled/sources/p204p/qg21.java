package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qg21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188351a;

    /* JADX INFO: renamed from: b */
    public int f188352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f188353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f188353c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188351a = obj;
        this.f188352b |= Integer.MIN_VALUE;
        return this.f188353c.emit(null, this);
    }
}
