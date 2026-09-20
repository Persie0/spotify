package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b841 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24490a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c841 f24491b;

    /* JADX INFO: renamed from: c */
    public int f24492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b841(c841 c841Var, ibk ibkVar) {
        super(ibkVar);
        this.f24491b = c841Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24490a = obj;
        this.f24492c |= Integer.MIN_VALUE;
        return c841.m31773d(this.f24491b, this);
    }
}
