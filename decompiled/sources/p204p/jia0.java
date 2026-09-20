package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jia0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f112706a;

    /* JADX INFO: renamed from: b */
    public int f112707b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kia0 f112708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jia0(kia0 kia0Var, ibk ibkVar) {
        super(ibkVar);
        this.f112708c = kia0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f112706a = obj;
        this.f112707b |= Integer.MIN_VALUE;
        return this.f112708c.mo15629a(null, null, this);
    }
}
