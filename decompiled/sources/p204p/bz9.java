package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bz9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32442a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fz9 f32443b;

    /* JADX INFO: renamed from: c */
    public int f32444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz9(fz9 fz9Var, ibk ibkVar) {
        super(ibkVar);
        this.f32443b = fz9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32442a = obj;
        this.f32444c |= Integer.MIN_VALUE;
        return fz9.m43177f(this.f32443b, this);
    }
}
