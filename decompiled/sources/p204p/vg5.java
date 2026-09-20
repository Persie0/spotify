package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vg5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f241142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s1e1 f241143b;

    /* JADX INFO: renamed from: c */
    public int f241144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg5(s1e1 s1e1Var, ibk ibkVar) {
        super(ibkVar);
        this.f241143b = s1e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241142a = obj;
        this.f241144c |= Integer.MIN_VALUE;
        return this.f241143b.m76948c(null, this);
    }
}
