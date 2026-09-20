package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hok extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f93554a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f93555b;

    /* JADX INFO: renamed from: c */
    public int f93556c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f93555b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93554a = obj;
        this.f93556c |= Integer.MIN_VALUE;
        return this.f93555b.m30151q(this);
    }
}
