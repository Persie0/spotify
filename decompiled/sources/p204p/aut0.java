package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aut0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1826et f20026b;

    /* JADX INFO: renamed from: c */
    public int f20027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aut0(C1826et c1826et, fbk fbkVar) {
        super(fbkVar);
        this.f20026b = c1826et;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20025a = obj;
        this.f20027c |= Integer.MIN_VALUE;
        return this.f20026b.invoke(null, this);
    }
}
