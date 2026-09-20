package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rpx extends ibk {

    /* JADX INFO: renamed from: a */
    public String f201655a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f201656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ spx f201657c;

    /* JADX INFO: renamed from: d */
    public int f201658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpx(spx spxVar, ibk ibkVar) {
        super(ibkVar);
        this.f201657c = spxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201656b = obj;
        this.f201658d |= Integer.MIN_VALUE;
        return this.f201657c.m78923a(null, this);
    }
}
