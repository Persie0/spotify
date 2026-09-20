package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ffq extends ibk {

    /* JADX INFO: renamed from: a */
    public rui f69066a;

    /* JADX INFO: renamed from: b */
    public lwi f69067b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f69068c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hfq f69069d;

    /* JADX INFO: renamed from: e */
    public int f69070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffq(hfq hfqVar, fbk fbkVar) {
        super(fbkVar);
        this.f69069d = hfqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f69068c = obj;
        this.f69070e |= Integer.MIN_VALUE;
        return hfq.m47357d(this.f69069d, null, null, this);
    }
}
