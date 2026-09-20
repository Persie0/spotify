package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class syj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f215264a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f215265b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gzj0 f215266c;

    /* JADX INFO: renamed from: d */
    public int f215267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syj0(gzj0 gzj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f215266c = gzj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f215265b = obj;
        this.f215267d |= Integer.MIN_VALUE;
        return gzj0.m46204a(this.f215266c, false, this);
    }
}
