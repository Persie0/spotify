package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bca0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ica0 f25815b;

    /* JADX INFO: renamed from: c */
    public int f25816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bca0(ica0 ica0Var, ibk ibkVar) {
        super(ibkVar);
        this.f25815b = ica0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25814a = obj;
        this.f25816c |= Integer.MIN_VALUE;
        return this.f25815b.m50243a(null, this);
    }
}
