package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class khg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rig1 f122654b;

    /* JADX INFO: renamed from: c */
    public int f122655c;

    /* JADX INFO: renamed from: d */
    public jhc1 f122656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khg1(rig1 rig1Var, ibk ibkVar) {
        super(ibkVar);
        this.f122654b = rig1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122653a = obj;
        this.f122655c |= Integer.MIN_VALUE;
        return rig1.m75588d(this.f122654b, null, this);
    }
}
