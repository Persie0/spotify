package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vu61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f244878a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wu61 f244879b;

    /* JADX INFO: renamed from: c */
    public int f244880c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu61(wu61 wu61Var, ibk ibkVar) {
        super(ibkVar);
        this.f244879b = wu61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244878a = obj;
        this.f244880c |= Integer.MIN_VALUE;
        return this.f244879b.m89014a(null, this);
    }
}
