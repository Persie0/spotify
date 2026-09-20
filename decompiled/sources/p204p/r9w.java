package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r9w extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s9w f197130b;

    /* JADX INFO: renamed from: c */
    public int f197131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9w(s9w s9wVar, ibk ibkVar) {
        super(ibkVar);
        this.f197130b = s9wVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197129a = obj;
        this.f197131c |= Integer.MIN_VALUE;
        return this.f197130b.m77597e(null, this);
    }
}
