package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p3j extends ibk {

    /* JADX INFO: renamed from: a */
    public w3j f173659a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f173660b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q3j f173661c;

    /* JADX INFO: renamed from: d */
    public int f173662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3j(q3j q3jVar, fbk fbkVar) {
        super(fbkVar);
        this.f173661c = q3jVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173660b = obj;
        this.f173662d |= Integer.MIN_VALUE;
        return q3j.m72122a(this.f173661c, this);
    }
}
