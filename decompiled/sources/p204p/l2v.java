package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l2v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f129082a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d9p f129083b;

    /* JADX INFO: renamed from: c */
    public int f129084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2v(d9p d9pVar, ibk ibkVar) {
        super(ibkVar);
        this.f129083b = d9pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f129082a = obj;
        this.f129084c |= Integer.MIN_VALUE;
        return this.f129083b.m35385f(this);
    }
}
