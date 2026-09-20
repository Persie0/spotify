package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iz90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jz90 f107175b;

    /* JADX INFO: renamed from: c */
    public int f107176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz90(jz90 jz90Var, ibk ibkVar) {
        super(ibkVar);
        this.f107175b = jz90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107174a = obj;
        this.f107176c |= Integer.MIN_VALUE;
        this.f107175b.m54853a(null, null, this);
        return yuk.f276404a;
    }
}
