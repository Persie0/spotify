package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gb90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78239a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1826et f78240b;

    /* JADX INFO: renamed from: c */
    public int f78241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb90(C1826et c1826et, fbk fbkVar) {
        super(fbkVar);
        this.f78240b = c1826et;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78239a = obj;
        this.f78241c |= Integer.MIN_VALUE;
        return this.f78240b.invoke(null, this);
    }
}
