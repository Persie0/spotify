package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n4q extends ibk {

    /* JADX INFO: renamed from: a */
    public String f150400a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f150401b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o4q f150402c;

    /* JADX INFO: renamed from: d */
    public int f150403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4q(o4q o4qVar, ibk ibkVar) {
        super(ibkVar);
        this.f150402c = o4qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150401b = obj;
        this.f150403d |= Integer.MIN_VALUE;
        return o4q.m66255i(this.f150402c, null, this);
    }
}
