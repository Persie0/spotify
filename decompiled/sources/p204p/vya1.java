package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vya1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f246033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v0w f246034b;

    /* JADX INFO: renamed from: c */
    public int f246035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vya1(v0w v0wVar, ibk ibkVar) {
        super(ibkVar);
        this.f246034b = v0wVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246033a = obj;
        this.f246035c |= Integer.MIN_VALUE;
        return this.f246034b.m84414c(this);
    }
}
