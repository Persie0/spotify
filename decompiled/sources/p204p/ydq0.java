package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ydq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271803a;

    /* JADX INFO: renamed from: b */
    public int f271804b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ beq0 f271805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydq0(beq0 beq0Var, ibk ibkVar) {
        super(ibkVar);
        this.f271805c = beq0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271803a = obj;
        this.f271804b |= Integer.MIN_VALUE;
        return this.f271805c.mo15629a(null, null, this);
    }
}
