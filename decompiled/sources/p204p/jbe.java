package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jbe extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f110747a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f110748b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sbe f110749c;

    /* JADX INFO: renamed from: d */
    public int f110750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbe(sbe sbeVar, ibk ibkVar) {
        super(ibkVar);
        this.f110749c = sbeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110748b = obj;
        this.f110750d |= Integer.MIN_VALUE;
        return sbe.m77723a(this.f110749c, null, false, this);
    }
}
