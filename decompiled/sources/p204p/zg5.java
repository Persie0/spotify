package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zg5 extends ibk {

    /* JADX INFO: renamed from: a */
    public qm1 f282490a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f282491b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s1e1 f282492c;

    /* JADX INFO: renamed from: d */
    public int f282493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg5(s1e1 s1e1Var, ibk ibkVar) {
        super(ibkVar);
        this.f282492c = s1e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f282491b = obj;
        this.f282493d |= Integer.MIN_VALUE;
        return this.f282492c.m76947b(null, this);
    }
}
