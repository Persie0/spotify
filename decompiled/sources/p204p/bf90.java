package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bf90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ef90 f26646b;

    /* JADX INFO: renamed from: c */
    public int f26647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf90(ef90 ef90Var, ibk ibkVar) {
        super(ibkVar);
        this.f26646b = ef90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26645a = obj;
        this.f26647c |= Integer.MIN_VALUE;
        return this.f26646b.m38722j(null, this);
    }
}
