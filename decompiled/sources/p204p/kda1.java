package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kda1 extends ibk {

    /* JADX INFO: renamed from: a */
    public pn1 f121648a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f121649b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i391 f121650c;

    /* JADX INFO: renamed from: d */
    public int f121651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kda1(i391 i391Var, ibk ibkVar) {
        super(ibkVar);
        this.f121650c = i391Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121649b = obj;
        this.f121651d |= Integer.MIN_VALUE;
        return this.f121650c.m49581b(null, this);
    }
}
