package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qaa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ raa1 f186834b;

    /* JADX INFO: renamed from: c */
    public int f186835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qaa1(raa1 raa1Var, ibk ibkVar) {
        super(ibkVar);
        this.f186834b = raa1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186833a = obj;
        this.f186835c |= Integer.MIN_VALUE;
        return this.f186834b.m75106c(null, this);
    }
}
