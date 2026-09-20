package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s9c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public lcc1 f206922a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f206923b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t9c0 f206924c;

    /* JADX INFO: renamed from: d */
    public int f206925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9c0(t9c0 t9c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f206924c = t9c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206923b = obj;
        this.f206925d |= Integer.MIN_VALUE;
        return t9c0.m80276a(this.f206924c, null, null, null, null, this);
    }
}
