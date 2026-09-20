package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sru0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f213381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eyi f213382b;

    /* JADX INFO: renamed from: c */
    public int f213383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sru0(eyi eyiVar, fbk fbkVar) {
        super(fbkVar);
        this.f213382b = eyiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213381a = obj;
        this.f213383c |= Integer.MIN_VALUE;
        return this.f213382b.m40318c(null, this);
    }
}
