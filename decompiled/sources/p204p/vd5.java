package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vd5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f240315a;

    /* JADX INFO: renamed from: b */
    public int f240316b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f240317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd5(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f240317c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240315a = obj;
        this.f240316b |= Integer.MIN_VALUE;
        return this.f240317c.emit(null, this);
    }
}
