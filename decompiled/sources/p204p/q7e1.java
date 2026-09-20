package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q7e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r7e1 f186087b;

    /* JADX INFO: renamed from: c */
    public int f186088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7e1(r7e1 r7e1Var, ibk ibkVar) {
        super(ibkVar);
        this.f186087b = r7e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186086a = obj;
        this.f186088c |= Integer.MIN_VALUE;
        return this.f186087b.m74901d(null, null, this);
    }
}
