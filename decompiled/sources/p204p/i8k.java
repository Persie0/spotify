package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i8k extends ibk {

    /* JADX INFO: renamed from: a */
    public String f99799a;

    /* JADX INFO: renamed from: b */
    public String f99800b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f99801c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ l8k f99802d;

    /* JADX INFO: renamed from: e */
    public int f99803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8k(l8k l8kVar, ibk ibkVar) {
        super(ibkVar);
        this.f99802d = l8kVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99801c = obj;
        this.f99803e |= Integer.MIN_VALUE;
        return this.f99802d.m58481d(null, null, this);
    }
}
