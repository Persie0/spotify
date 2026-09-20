package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class n5u extends ibk {

    /* JADX INFO: renamed from: a */
    public nyt f150616a;

    /* JADX INFO: renamed from: b */
    public qs0 f150617b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f150618c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ u5u f150619d;

    /* JADX INFO: renamed from: e */
    public int f150620e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5u(u5u u5uVar, ibk ibkVar) {
        super(ibkVar);
        this.f150619d = u5uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150618c = obj;
        this.f150620e |= Integer.MIN_VALUE;
        return u5u.m82418b(this.f150619d, null, this);
    }
}
