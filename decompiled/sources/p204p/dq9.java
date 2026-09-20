package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dq9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51906a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fq9 f51907b;

    /* JADX INFO: renamed from: c */
    public int f51908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq9(fq9 fq9Var, ibk ibkVar) {
        super(ibkVar);
        this.f51907b = fq9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51906a = obj;
        this.f51908c |= Integer.MIN_VALUE;
        return this.f51907b.m42402a(this);
    }
}
