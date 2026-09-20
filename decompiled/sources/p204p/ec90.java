package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ec90 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f58268a;

    /* JADX INFO: renamed from: b */
    public boolean f58269b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f58270c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gc90 f58271d;

    /* JADX INFO: renamed from: e */
    public int f58272e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec90(gc90 gc90Var, ibk ibkVar) {
        super(ibkVar);
        this.f58271d = gc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58270c = obj;
        this.f58272e |= Integer.MIN_VALUE;
        return this.f58271d.m44310j(null, this, false);
    }
}
