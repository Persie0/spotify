package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mml0 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f145178a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f145179b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uml0 f145180c;

    /* JADX INFO: renamed from: d */
    public int f145181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mml0(uml0 uml0Var, ibk ibkVar) {
        super(ibkVar);
        this.f145180c = uml0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145179b = obj;
        this.f145181d |= Integer.MIN_VALUE;
        return this.f145180c.m83456c(this);
    }
}
