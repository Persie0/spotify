package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ke31 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f121785a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f121786b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ue31 f121787c;

    /* JADX INFO: renamed from: d */
    public int f121788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke31(ue31 ue31Var, ibk ibkVar) {
        super(ibkVar);
        this.f121787c = ue31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121786b = obj;
        this.f121788d |= Integer.MIN_VALUE;
        return this.f121787c.m82877a(null, null, this);
    }
}
