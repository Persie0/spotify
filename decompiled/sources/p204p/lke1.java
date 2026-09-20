package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lke1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134339a;

    /* JADX INFO: renamed from: b */
    public int f134340b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eyi f134341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lke1(eyi eyiVar, fbk fbkVar) {
        super(fbkVar);
        this.f134341c = eyiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134339a = obj;
        this.f134340b |= Integer.MIN_VALUE;
        return this.f134341c.emit(null, this);
    }
}
