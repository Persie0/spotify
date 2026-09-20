package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hb1 f67686b;

    /* JADX INFO: renamed from: c */
    public int f67687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb1(hb1 hb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f67686b = hb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f67685a = obj;
        this.f67687c |= Integer.MIN_VALUE;
        return hb1.m46958a(this.f67686b, this);
    }
}
