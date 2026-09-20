package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class u101 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f225637a;

    /* JADX INFO: renamed from: b */
    public mb61 f225638b;

    /* JADX INFO: renamed from: c */
    public lsi0 f225639c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f225640d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ y101 f225641e;

    /* JADX INFO: renamed from: f */
    public int f225642f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u101(y101 y101Var, ibk ibkVar) {
        super(ibkVar);
        this.f225641e = y101Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f225640d = obj;
        this.f225642f |= Integer.MIN_VALUE;
        return this.f225641e.m92609b(null, this);
    }
}
