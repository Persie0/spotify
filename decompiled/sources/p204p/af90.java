package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class af90 extends ibk {

    /* JADX INFO: renamed from: a */
    public ju61 f15095a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15096b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ef90 f15097c;

    /* JADX INFO: renamed from: d */
    public int f15098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af90(ef90 ef90Var, ibk ibkVar) {
        super(ibkVar);
        this.f15097c = ef90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f15096b = obj;
        this.f15098d |= Integer.MIN_VALUE;
        return this.f15097c.m38721i(null, this);
    }
}
