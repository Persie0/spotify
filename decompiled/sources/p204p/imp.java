package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class imp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103761a;

    /* JADX INFO: renamed from: b */
    public int f103762b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jmp f103763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imp(jmp jmpVar, fbk fbkVar) {
        super(fbkVar);
        this.f103763c = jmpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103761a = obj;
        this.f103762b |= Integer.MIN_VALUE;
        return this.f103763c.emit(null, this);
    }
}
