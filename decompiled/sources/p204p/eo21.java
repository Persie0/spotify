package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class eo21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61277a;

    /* JADX INFO: renamed from: b */
    public int f61278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f61279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f61279c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61277a = obj;
        this.f61278b |= Integer.MIN_VALUE;
        return this.f61279c.emit(null, this);
    }
}
