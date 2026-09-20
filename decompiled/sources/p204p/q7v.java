package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q7v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186172a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y7v f186173b;

    /* JADX INFO: renamed from: c */
    public int f186174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7v(y7v y7vVar, ibk ibkVar) {
        super(ibkVar);
        this.f186173b = y7vVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186172a = obj;
        this.f186174c |= Integer.MIN_VALUE;
        return this.f186173b.m93006a(this);
    }
}
