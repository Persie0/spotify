package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cax0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35943a;

    /* JADX INFO: renamed from: b */
    public int f35944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f35945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cax0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f35945c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35943a = obj;
        this.f35944b |= Integer.MIN_VALUE;
        return this.f35945c.emit(null, this);
    }
}
