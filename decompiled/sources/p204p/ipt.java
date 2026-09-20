package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ipt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104551a;

    /* JADX INFO: renamed from: b */
    public int f104552b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpt f104553c;

    /* JADX INFO: renamed from: d */
    public bqz0 f104554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipt(jpt jptVar, ibk ibkVar) {
        super(ibkVar);
        this.f104553c = jptVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104551a = obj;
        this.f104552b |= Integer.MIN_VALUE;
        return this.f104553c.mo15629a(null, null, this);
    }
}
