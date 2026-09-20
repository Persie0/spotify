package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tws extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224471a;

    /* JADX INFO: renamed from: b */
    public int f224472b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uws f224473c;

    /* JADX INFO: renamed from: d */
    public bqz0 f224474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tws(uws uwsVar, ibk ibkVar) {
        super(ibkVar);
        this.f224473c = uwsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224471a = obj;
        this.f224472b |= Integer.MIN_VALUE;
        return this.f224473c.mo15629a(null, null, this);
    }
}
