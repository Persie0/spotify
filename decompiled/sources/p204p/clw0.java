package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class clw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39415a;

    /* JADX INFO: renamed from: b */
    public int f39416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f39417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clw0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f39417c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f39415a = obj;
        this.f39416b |= Integer.MIN_VALUE;
        return this.f39417c.emit(null, this);
    }
}
