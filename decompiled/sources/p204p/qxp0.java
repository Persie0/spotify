package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qxp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f193723a;

    /* JADX INFO: renamed from: b */
    public int f193724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f193725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f193725c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193723a = obj;
        this.f193724b |= Integer.MIN_VALUE;
        return this.f193725c.emit(null, this);
    }
}
