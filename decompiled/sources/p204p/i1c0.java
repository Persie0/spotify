package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i1c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f97473a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f97474b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m1c0 f97475c;

    /* JADX INFO: renamed from: d */
    public int f97476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1c0(m1c0 m1c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f97475c = m1c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97474b = obj;
        this.f97476d |= Integer.MIN_VALUE;
        return this.f97475c.m60535a(null, null, null, this);
    }
}
