package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iok extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104238a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f104239b;

    /* JADX INFO: renamed from: c */
    public int f104240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f104239b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104238a = obj;
        this.f104240c |= Integer.MIN_VALUE;
        return this.f104239b.m30152r(this);
    }
}
