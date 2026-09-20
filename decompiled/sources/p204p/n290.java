package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n290 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f149707a;

    /* JADX INFO: renamed from: b */
    public boolean f149708b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f149709c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o290 f149710d;

    /* JADX INFO: renamed from: e */
    public int f149711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n290(o290 o290Var, ibk ibkVar) {
        super(ibkVar);
        this.f149710d = o290Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f149709c = obj;
        this.f149711e |= Integer.MIN_VALUE;
        return o290.m66096a(this.f149710d, null, false, this);
    }
}
