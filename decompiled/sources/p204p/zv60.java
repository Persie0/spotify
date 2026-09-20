package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zv60 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f286627a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f286628b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aw60 f286629c;

    /* JADX INFO: renamed from: d */
    public int f286630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv60(aw60 aw60Var, ibk ibkVar) {
        super(ibkVar);
        this.f286629c = aw60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286628b = obj;
        this.f286630d |= Integer.MIN_VALUE;
        return this.f286629c.mo25864m0(0L, this);
    }
}
