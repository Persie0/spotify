package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rws extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203401a;

    /* JADX INFO: renamed from: b */
    public int f203402b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sws f203403c;

    /* JADX INFO: renamed from: d */
    public bqz0 f203404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rws(sws swsVar, ibk ibkVar) {
        super(ibkVar);
        this.f203403c = swsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203401a = obj;
        this.f203402b |= Integer.MIN_VALUE;
        return this.f203403c.mo15629a(null, null, this);
    }
}
