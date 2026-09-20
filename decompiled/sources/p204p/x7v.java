package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class x7v extends ibk {

    /* JADX INFO: renamed from: a */
    public int f258992a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f258993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y7v f258994c;

    /* JADX INFO: renamed from: d */
    public int f258995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7v(y7v y7vVar, fbk fbkVar) {
        super(fbkVar);
        this.f258994c = y7vVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f258993b = obj;
        this.f258995d |= Integer.MIN_VALUE;
        return this.f258994c.m93014i(0, this);
    }
}
