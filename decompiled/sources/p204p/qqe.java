package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qqe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191548a;

    /* JADX INFO: renamed from: b */
    public int f191549b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f191550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqe(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f191550c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191548a = obj;
        this.f191549b |= Integer.MIN_VALUE;
        return this.f191550c.emit(null, this);
    }
}
