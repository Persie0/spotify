package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q9w extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186674a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s9w f186675b;

    /* JADX INFO: renamed from: c */
    public int f186676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9w(s9w s9wVar, ibk ibkVar) {
        super(ibkVar);
        this.f186675b = s9wVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186674a = obj;
        this.f186676c |= Integer.MIN_VALUE;
        return this.f186675b.m77596d(null, this);
    }
}
