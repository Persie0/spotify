package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dtf extends ibk {

    /* JADX INFO: renamed from: a */
    public String f52819a;

    /* JADX INFO: renamed from: b */
    public jsi0 f52820b;

    /* JADX INFO: renamed from: c */
    public int f52821c;

    /* JADX INFO: renamed from: d */
    public int f52822d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f52823e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ gtf f52824f;

    /* JADX INFO: renamed from: g */
    public int f52825g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtf(gtf gtfVar, ibk ibkVar) {
        super(ibkVar);
        this.f52824f = gtfVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52823e = obj;
        this.f52825g |= Integer.MIN_VALUE;
        return this.f52824f.m45691b(0, null, this);
    }
}
