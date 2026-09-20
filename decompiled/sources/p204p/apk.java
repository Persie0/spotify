package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class apk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f17966b;

    /* JADX INFO: renamed from: c */
    public int f17967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apk(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f17966b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17965a = obj;
        this.f17967c |= Integer.MIN_VALUE;
        return this.f17966b.m30135J(this);
    }
}
