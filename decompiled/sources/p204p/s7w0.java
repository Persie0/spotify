package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s7w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f206488a;

    /* JADX INFO: renamed from: b */
    public int f206489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f206490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7w0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f206490c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206488a = obj;
        this.f206489b |= Integer.MIN_VALUE;
        return this.f206490c.emit(null, this);
    }
}
