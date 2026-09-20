package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jqv extends ibk {

    /* JADX INFO: renamed from: a */
    public drj0 f115007a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f115008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lqv f115009c;

    /* JADX INFO: renamed from: d */
    public int f115010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqv(lqv lqvVar, ibk ibkVar) {
        super(ibkVar);
        this.f115009c = lqvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f115008b = obj;
        this.f115010d |= Integer.MIN_VALUE;
        return this.f115009c.m59772a(null, null, this);
    }
}
