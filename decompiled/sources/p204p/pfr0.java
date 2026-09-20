package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pfr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177132a;

    /* JADX INFO: renamed from: b */
    public int f177133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f177134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f177134c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177132a = obj;
        this.f177133b |= Integer.MIN_VALUE;
        return this.f177134c.emit(null, this);
    }
}
