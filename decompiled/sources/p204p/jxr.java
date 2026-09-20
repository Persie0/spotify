package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jxr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f117206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fwj f117207b;

    /* JADX INFO: renamed from: c */
    public int f117208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxr(fwj fwjVar, fbk fbkVar) {
        super(fbkVar);
        this.f117207b = fwjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f117206a = obj;
        this.f117208c |= Integer.MIN_VALUE;
        return this.f117207b.emit(null, this);
    }
}
