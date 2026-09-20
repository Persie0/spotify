package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ypz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f275097a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f275098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fei f275099c;

    /* JADX INFO: renamed from: d */
    public int f275100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypz0(fei feiVar, ibk ibkVar) {
        super(ibkVar);
        this.f275099c = feiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275098b = obj;
        this.f275100d |= Integer.MIN_VALUE;
        return this.f275099c.m41451f(null, this);
    }
}
