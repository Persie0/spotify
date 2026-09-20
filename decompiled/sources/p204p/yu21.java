package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class yu21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276265a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ev21 f276266b;

    /* JADX INFO: renamed from: c */
    public int f276267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu21(ev21 ev21Var, ibk ibkVar) {
        super(ibkVar);
        this.f276266b = ev21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276265a = obj;
        this.f276267c |= Integer.MIN_VALUE;
        return this.f276266b.m40081a(null, this);
    }
}
