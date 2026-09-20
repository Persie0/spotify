package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y370 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f268770a;

    /* JADX INFO: renamed from: b */
    public Boolean f268771b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f268772c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e470 f268773d;

    /* JADX INFO: renamed from: e */
    public int f268774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y370(e470 e470Var, ibk ibkVar) {
        super(ibkVar);
        this.f268773d = e470Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268772c = obj;
        this.f268774e |= Integer.MIN_VALUE;
        return this.f268773d.m37759b(null, null, this);
    }
}
