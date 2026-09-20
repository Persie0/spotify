package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c041 extends ibk {

    /* JADX INFO: renamed from: a */
    public xbm f32679a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x041 f32681c;

    /* JADX INFO: renamed from: d */
    public int f32682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c041(x041 x041Var, ibk ibkVar) {
        super(ibkVar);
        this.f32681c = x041Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32680b = obj;
        this.f32682d |= Integer.MIN_VALUE;
        return this.f32681c.m89502g(null, null, null, this);
    }
}
