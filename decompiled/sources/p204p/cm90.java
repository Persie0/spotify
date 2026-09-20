package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cm90 extends ibk {

    /* JADX INFO: renamed from: a */
    public s780 f39616a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f39617b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s780 f39618c;

    /* JADX INFO: renamed from: d */
    public int f39619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm90(s780 s780Var, ibk ibkVar) {
        super(ibkVar);
        this.f39618c = s780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f39617b = obj;
        this.f39619d |= Integer.MIN_VALUE;
        return this.f39618c.m77363d(null, this);
    }
}
