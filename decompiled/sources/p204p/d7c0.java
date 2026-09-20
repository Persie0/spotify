package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d7c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public l6c0 f46061a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f46062b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f7c0 f46063c;

    /* JADX INFO: renamed from: d */
    public int f46064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7c0(f7c0 f7c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f46063c = f7c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46062b = obj;
        this.f46064d |= Integer.MIN_VALUE;
        return f7c0.m40964d(this.f46063c, null, this);
    }
}
