package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vwm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f245507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a9i0 f245508b;

    /* JADX INFO: renamed from: c */
    public int f245509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwm0(a9i0 a9i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f245508b = a9i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f245507a = obj;
        this.f245509c |= Integer.MIN_VALUE;
        return this.f245508b.m25133o(this);
    }
}
