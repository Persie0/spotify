package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o5x extends ibk {

    /* JADX INFO: renamed from: a */
    public m5x f162142a;

    /* JADX INFO: renamed from: b */
    public rlv0 f162143b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f162144c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ q5x f162145d;

    /* JADX INFO: renamed from: e */
    public int f162146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5x(q5x q5xVar, ibk ibkVar) {
        super(ibkVar);
        this.f162145d = q5xVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162144c = obj;
        this.f162146e |= Integer.MIN_VALUE;
        return this.f162145d.m72200b(null, this);
    }
}
