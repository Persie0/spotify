package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cfq extends ibk {

    /* JADX INFO: renamed from: a */
    public String f37420a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f37421b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hfq f37422c;

    /* JADX INFO: renamed from: d */
    public int f37423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfq(hfq hfqVar, fbk fbkVar) {
        super(fbkVar);
        this.f37422c = hfqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f37421b = obj;
        this.f37423d |= Integer.MIN_VALUE;
        return hfq.m47356c(this.f37422c, null, this);
    }
}
