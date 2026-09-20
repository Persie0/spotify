package p204p;

/* JADX INFO: renamed from: p.dt */
/* JADX INFO: loaded from: classes4.dex */
public final class C1789dt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f52678a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1826et f52679b;

    /* JADX INFO: renamed from: c */
    public int f52680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789dt(C1826et c1826et, fbk fbkVar) {
        super(fbkVar);
        this.f52679b = c1826et;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52678a = obj;
        this.f52680c |= Integer.MIN_VALUE;
        return this.f52679b.invoke(null, this);
    }
}
