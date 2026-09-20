package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kov extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124914a;

    /* JADX INFO: renamed from: b */
    public int f124915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lov f124916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kov(lov lovVar, fbk fbkVar) {
        super(fbkVar);
        this.f124916c = lovVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124914a = obj;
        this.f124915b |= Integer.MIN_VALUE;
        return this.f124916c.emit(null, this);
    }
}
