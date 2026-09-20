package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lix0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133903a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mix0 f133904b;

    /* JADX INFO: renamed from: c */
    public int f133905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lix0(mix0 mix0Var, ibk ibkVar) {
        super(ibkVar);
        this.f133904b = mix0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133903a = obj;
        this.f133905c |= Integer.MIN_VALUE;
        return this.f133904b.m61919b(null, this);
    }
}
