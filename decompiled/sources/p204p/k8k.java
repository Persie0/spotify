package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k8k extends ibk {

    /* JADX INFO: renamed from: a */
    public String f120380a;

    /* JADX INFO: renamed from: b */
    public l8k f120381b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f120382c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ l8k f120383d;

    /* JADX INFO: renamed from: e */
    public int f120384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8k(l8k l8kVar, ibk ibkVar) {
        super(ibkVar);
        this.f120383d = l8kVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120382c = obj;
        this.f120384e |= Integer.MIN_VALUE;
        return this.f120383d.m58482e(null, this);
    }
}
