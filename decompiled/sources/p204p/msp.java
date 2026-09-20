package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class msp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146839a;

    /* JADX INFO: renamed from: b */
    public int f146840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksp f146841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msp(ksp kspVar, fbk fbkVar) {
        super(fbkVar);
        this.f146841c = kspVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146839a = obj;
        this.f146840b |= Integer.MIN_VALUE;
        return this.f146841c.emit(null, this);
    }
}
