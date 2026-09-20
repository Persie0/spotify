package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class l4q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f129739a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o4q f129740b;

    /* JADX INFO: renamed from: c */
    public int f129741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4q(o4q o4qVar, ibk ibkVar) {
        super(ibkVar);
        this.f129740b = o4qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f129739a = obj;
        this.f129741c |= Integer.MIN_VALUE;
        return o4q.m66253g(this.f129740b, null, null, this);
    }
}
