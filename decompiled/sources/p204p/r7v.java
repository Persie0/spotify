package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r7v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f196651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y7v f196652b;

    /* JADX INFO: renamed from: c */
    public int f196653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7v(y7v y7vVar, ibk ibkVar) {
        super(ibkVar);
        this.f196652b = y7vVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196651a = obj;
        this.f196653c |= Integer.MIN_VALUE;
        return this.f196652b.m93007b(this);
    }
}
