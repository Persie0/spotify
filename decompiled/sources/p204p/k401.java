package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class k401 extends ibk {

    /* JADX INFO: renamed from: a */
    public l401 f119036a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f119037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l401 f119038c;

    /* JADX INFO: renamed from: d */
    public int f119039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k401(l401 l401Var, ibk ibkVar) {
        super(ibkVar);
        this.f119038c = l401Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119037b = obj;
        this.f119039d |= Integer.MIN_VALUE;
        return this.f119038c.m58034b(this);
    }
}
