package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cxj extends ibk {

    /* JADX INFO: renamed from: a */
    public String f43040a;

    /* JADX INFO: renamed from: b */
    public voc1 f43041b;

    /* JADX INFO: renamed from: c */
    public Object f43042c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f43043d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ dxj f43044e;

    /* JADX INFO: renamed from: f */
    public int f43045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxj(dxj dxjVar, ibk ibkVar) {
        super(ibkVar);
        this.f43044e = dxjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43043d = obj;
        this.f43045f |= Integer.MIN_VALUE;
        return this.f43044e.m37259d(null, null, null, this);
    }
}
