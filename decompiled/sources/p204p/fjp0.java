package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fjp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f70335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kjp0 f70336b;

    /* JADX INFO: renamed from: c */
    public int f70337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjp0(kjp0 kjp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f70336b = kjp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70335a = obj;
        this.f70337c |= Integer.MIN_VALUE;
        return kjp0.m56613a(this.f70336b, null, null, this);
    }
}
