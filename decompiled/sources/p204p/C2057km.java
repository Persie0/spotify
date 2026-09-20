package p204p;

/* JADX INFO: renamed from: p.km */
/* JADX INFO: loaded from: classes11.dex */
public final class C2057km extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124018a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132mm f124019b;

    /* JADX INFO: renamed from: c */
    public int f124020c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2057km(C2132mm c2132mm, fbk fbkVar) {
        super(fbkVar);
        this.f124019b = c2132mm;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124018a = obj;
        this.f124020c |= Integer.MIN_VALUE;
        return this.f124019b.m62255d(this);
    }
}
