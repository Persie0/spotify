package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uyy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f235384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wyy0 f235385b;

    /* JADX INFO: renamed from: c */
    public int f235386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyy0(wyy0 wyy0Var, ibk ibkVar) {
        super(ibkVar);
        this.f235385b = wyy0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f235384a = obj;
        this.f235386c |= Integer.MIN_VALUE;
        return this.f235385b.m89387e(null, null, 0L, false, this);
    }
}
