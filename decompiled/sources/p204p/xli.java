package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xli extends ibk {

    /* JADX INFO: renamed from: a */
    public qf40 f263149a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f263150b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zli f263151c;

    /* JADX INFO: renamed from: d */
    public int f263152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xli(zli zliVar, ibk ibkVar) {
        super(ibkVar);
        this.f263151c = zliVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263150b = obj;
        this.f263152d |= Integer.MIN_VALUE;
        return zli.m96381k(this.f263151c, this);
    }
}
