package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259396a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fal0 f259397b;

    /* JADX INFO: renamed from: c */
    public int f259398c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9l0(fal0 fal0Var, ibk ibkVar) {
        super(ibkVar);
        this.f259397b = fal0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259396a = obj;
        this.f259398c |= Integer.MIN_VALUE;
        return this.f259397b.m41181a(this);
    }
}
