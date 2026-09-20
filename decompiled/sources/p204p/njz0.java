package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class njz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f154708a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ojz0 f154709b;

    /* JADX INFO: renamed from: c */
    public int f154710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njz0(ojz0 ojz0Var, ibk ibkVar) {
        super(ibkVar);
        this.f154709b = ojz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f154708a = obj;
        this.f154710c |= Integer.MIN_VALUE;
        return this.f154709b.m67123e(this);
    }
}
