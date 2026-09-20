package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qer extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188008a;

    /* JADX INFO: renamed from: b */
    public int f188009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ker f188010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qer(ker kerVar, fbk fbkVar) {
        super(fbkVar);
        this.f188010c = kerVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188008a = obj;
        this.f188009b |= Integer.MIN_VALUE;
        return this.f188010c.emit(null, this);
    }
}
