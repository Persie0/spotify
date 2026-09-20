package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uxf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f234914a;

    /* JADX INFO: renamed from: b */
    public int f234915b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f234916c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wxf0 f234917d;

    /* JADX INFO: renamed from: e */
    public int f234918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxf0(wxf0 wxf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f234917d = wxf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234916c = obj;
        this.f234918e |= Integer.MIN_VALUE;
        return this.f234917d.m89242j(false, this);
    }
}
