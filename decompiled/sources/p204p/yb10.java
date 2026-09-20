package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yb10 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f271043a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f271044b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ac10 f271045c;

    /* JADX INFO: renamed from: d */
    public int f271046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb10(ac10 ac10Var, ibk ibkVar) {
        super(ibkVar);
        this.f271045c = ac10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271044b = obj;
        this.f271046d |= Integer.MIN_VALUE;
        return this.f271045c.m25412a(null, this);
    }
}
