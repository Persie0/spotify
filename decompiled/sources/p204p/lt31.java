package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lt31 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f136690a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f136691b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qt31 f136692c;

    /* JADX INFO: renamed from: d */
    public int f136693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt31(qt31 qt31Var, ibk ibkVar) {
        super(ibkVar);
        this.f136692c = qt31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f136691b = obj;
        this.f136693d |= Integer.MIN_VALUE;
        return this.f136692c.m73792d(null, this);
    }
}
