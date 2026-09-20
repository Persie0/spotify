package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cz81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f43491a;

    /* JADX INFO: renamed from: b */
    public int f43492b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dz81 f43493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz81(dz81 dz81Var, ibk ibkVar) {
        super(ibkVar);
        this.f43493c = dz81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43491a = obj;
        this.f43492b |= Integer.MIN_VALUE;
        return this.f43493c.mo15629a(null, null, this);
    }
}
