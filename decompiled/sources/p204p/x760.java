package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x760 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f258831a;

    /* JADX INFO: renamed from: b */
    public int f258832b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y760 f258833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x760(y760 y760Var, ibk ibkVar) {
        super(ibkVar);
        this.f258833c = y760Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f258831a = obj;
        this.f258832b |= Integer.MIN_VALUE;
        return this.f258833c.mo15629a(null, null, this);
    }
}
