package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mni0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f145431a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f145432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nni0 f145433c;

    /* JADX INFO: renamed from: d */
    public int f145434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mni0(nni0 nni0Var, ibk ibkVar) {
        super(ibkVar);
        this.f145433c = nni0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145432b = obj;
        this.f145434d |= Integer.MIN_VALUE;
        return nni0.m65208g(this.f145433c, null, null, this);
    }
}
