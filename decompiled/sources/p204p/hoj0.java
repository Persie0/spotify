package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hoj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f93551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ioj0 f93552b;

    /* JADX INFO: renamed from: c */
    public int f93553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoj0(ioj0 ioj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f93552b = ioj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93551a = obj;
        this.f93553c |= Integer.MIN_VALUE;
        return this.f93552b.m51207b(null, this);
    }
}
