package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ikz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103243a;

    /* JADX INFO: renamed from: b */
    public int f103244b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pox f103245c;

    /* JADX INFO: renamed from: d */
    public Object f103246d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikz(pox poxVar, fbk fbkVar) {
        super(fbkVar);
        this.f103245c = poxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103243a = obj;
        this.f103244b |= Integer.MIN_VALUE;
        return this.f103245c.collect(null, this);
    }
}
