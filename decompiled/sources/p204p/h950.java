package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h950 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88878a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j950 f88879b;

    /* JADX INFO: renamed from: c */
    public int f88880c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h950(j950 j950Var, ibk ibkVar) {
        super(ibkVar);
        this.f88879b = j950Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88878a = obj;
        this.f88880c |= Integer.MIN_VALUE;
        return this.f88879b.mo52726a(this);
    }
}
