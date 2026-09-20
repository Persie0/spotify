package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dyu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f54448a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eyi f54449b;

    /* JADX INFO: renamed from: c */
    public int f54450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyu0(eyi eyiVar, fbk fbkVar) {
        super(fbkVar);
        this.f54449b = eyiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54448a = obj;
        this.f54450c |= Integer.MIN_VALUE;
        return this.f54449b.m40317b(null, this);
    }
}
