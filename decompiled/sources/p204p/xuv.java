package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xuv extends ibk {

    /* JADX INFO: renamed from: a */
    public zuv f266177a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f266178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zuv f266179c;

    /* JADX INFO: renamed from: d */
    public int f266180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuv(zuv zuvVar, ibk ibkVar) {
        super(ibkVar);
        this.f266179c = zuvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266178b = obj;
        this.f266180d |= Integer.MIN_VALUE;
        return this.f266179c.m97081d(null, this, false);
    }
}
