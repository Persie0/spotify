package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cnz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40134a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dnz f40135b;

    /* JADX INFO: renamed from: c */
    public int f40136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnz(dnz dnzVar, fbk fbkVar) {
        super(fbkVar);
        this.f40135b = dnzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40134a = obj;
        this.f40136c |= Integer.MIN_VALUE;
        return dnz.m36501z0(this.f40135b, this);
    }
}
