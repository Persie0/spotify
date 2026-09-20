package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vx60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f245626a;

    /* JADX INFO: renamed from: b */
    public int f245627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wx60 f245628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx60(wx60 wx60Var, ibk ibkVar) {
        super(ibkVar);
        this.f245628c = wx60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f245626a = obj;
        this.f245627b |= Integer.MIN_VALUE;
        return this.f245628c.mo15629a(null, null, this);
    }
}
