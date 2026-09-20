package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i8q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j8q f99826b;

    /* JADX INFO: renamed from: c */
    public int f99827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8q(j8q j8qVar, ibk ibkVar) {
        super(ibkVar);
        this.f99826b = j8qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99825a = obj;
        this.f99827c |= Integer.MIN_VALUE;
        return j8q.m52709b(this.f99826b, null, this);
    }
}
