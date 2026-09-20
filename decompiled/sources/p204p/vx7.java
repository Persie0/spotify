package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vx7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f245632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wx7 f245633b;

    /* JADX INFO: renamed from: c */
    public int f245634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx7(wx7 wx7Var, ibk ibkVar) {
        super(ibkVar);
        this.f245633b = wx7Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f245632a = obj;
        this.f245634c |= Integer.MIN_VALUE;
        return wx7.m89228a(this.f245633b, this);
    }
}
