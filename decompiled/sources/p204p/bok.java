package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f29190a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f29191b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f29192c;

    /* JADX INFO: renamed from: d */
    public int f29193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f29192c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29191b = obj;
        this.f29193d |= Integer.MIN_VALUE;
        return this.f29192c.m30145k(null, this);
    }
}
