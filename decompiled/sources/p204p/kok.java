package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kok extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f124808b;

    /* JADX INFO: renamed from: c */
    public int f124809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f124808b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124807a = obj;
        this.f124809c |= Integer.MIN_VALUE;
        return this.f124808b.m30154t(this);
    }
}
