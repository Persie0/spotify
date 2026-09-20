package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f156724a;

    /* JADX INFO: renamed from: b */
    public String f156725b;

    /* JADX INFO: renamed from: c */
    public String f156726c;

    /* JADX INFO: renamed from: d */
    public int f156727d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f156728e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ bpk f156729f;

    /* JADX INFO: renamed from: g */
    public int f156730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f156729f = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f156728e = obj;
        this.f156730g |= Integer.MIN_VALUE;
        return this.f156729f.m30157w(null, this);
    }
}
