package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class p9x extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s9x f175322b;

    /* JADX INFO: renamed from: c */
    public int f175323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9x(s9x s9xVar, ibk ibkVar) {
        super(ibkVar);
        this.f175322b = s9xVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175321a = obj;
        this.f175323c |= Integer.MIN_VALUE;
        return this.f175322b.m77598a(null, this);
    }
}
