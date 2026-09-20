package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wnk extends ibk {

    /* JADX INFO: renamed from: a */
    public String f253197a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f253198b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f253199c;

    /* JADX INFO: renamed from: d */
    public int f253200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnk(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f253199c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f253198b = obj;
        this.f253200d |= Integer.MIN_VALUE;
        return this.f253199c.m30140e(null, this);
    }
}
