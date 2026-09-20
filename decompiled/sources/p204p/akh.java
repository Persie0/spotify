package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class akh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16535a;

    /* JADX INFO: renamed from: b */
    public int f16536b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f16537c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akh(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f16537c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16535a = obj;
        this.f16536b |= Integer.MIN_VALUE;
        return this.f16537c.emit(null, this);
    }
}
