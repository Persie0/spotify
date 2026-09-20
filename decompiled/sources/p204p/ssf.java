package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ssf extends ibk {

    /* JADX INFO: renamed from: a */
    public nsf f213590a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f213591b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tsf f213592c;

    /* JADX INFO: renamed from: d */
    public int f213593d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssf(tsf tsfVar, fbk fbkVar) {
        super(fbkVar);
        this.f213592c = tsfVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213591b = obj;
        this.f213593d |= Integer.MIN_VALUE;
        return tsf.m81415e(this.f213592c, null, this);
    }
}
