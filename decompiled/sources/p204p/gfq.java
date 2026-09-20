package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gfq extends ibk {

    /* JADX INFO: renamed from: a */
    public rmx0 f79433a;

    /* JADX INFO: renamed from: b */
    public String f79434b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f79435c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hfq f79436d;

    /* JADX INFO: renamed from: e */
    public int f79437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfq(hfq hfqVar, ibk ibkVar) {
        super(ibkVar);
        this.f79436d = hfqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f79435c = obj;
        this.f79437e |= Integer.MIN_VALUE;
        return this.f79436d.m47365j(null, null, this);
    }
}
