package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mh40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f143702a;

    /* JADX INFO: renamed from: b */
    public int f143703b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nh40 f143704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh40(nh40 nh40Var, ibk ibkVar) {
        super(ibkVar);
        this.f143704c = nh40Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143702a = obj;
        this.f143703b |= Integer.MIN_VALUE;
        return this.f143704c.mo15629a(null, null, this);
    }
}
