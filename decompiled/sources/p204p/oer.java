package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oer extends ibk {

    /* JADX INFO: renamed from: a */
    public ddr f164512a;

    /* JADX INFO: renamed from: b */
    public Long f164513b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f164514c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uer f164515d;

    /* JADX INFO: renamed from: e */
    public int f164516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oer(uer uerVar, ibk ibkVar) {
        super(ibkVar);
        this.f164515d = uerVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f164514c = obj;
        this.f164516e |= Integer.MIN_VALUE;
        return this.f164515d.m82912c(null, null, this);
    }
}
