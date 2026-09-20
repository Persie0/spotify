package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class v101 extends ibk {

    /* JADX INFO: renamed from: a */
    public x101 f236211a;

    /* JADX INFO: renamed from: b */
    public String f236212b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f236213c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ x101 f236214d;

    /* JADX INFO: renamed from: e */
    public int f236215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v101(x101 x101Var, ibk ibkVar) {
        super(ibkVar);
        this.f236214d = x101Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236213c = obj;
        this.f236215e |= Integer.MIN_VALUE;
        return this.f236214d.m89614a(null, null, this);
    }
}
