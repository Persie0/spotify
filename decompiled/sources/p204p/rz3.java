package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rz3 extends ibk {

    /* JADX INFO: renamed from: a */
    public uoi0 f204043a;

    /* JADX INFO: renamed from: b */
    public upa f204044b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f204045c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tz3 f204046d;

    /* JADX INFO: renamed from: e */
    public int f204047e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz3(tz3 tz3Var, ibk ibkVar) {
        super(ibkVar);
        this.f204046d = tz3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204045c = obj;
        this.f204047e |= Integer.MIN_VALUE;
        return this.f204046d.m82040l(this);
    }
}
