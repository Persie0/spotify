package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mmp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145194a;

    /* JADX INFO: renamed from: b */
    public int f145195b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jmp f145196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmp(jmp jmpVar, fbk fbkVar) {
        super(fbkVar);
        this.f145196c = jmpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145194a = obj;
        this.f145195b |= Integer.MIN_VALUE;
        return this.f145196c.emit(null, this);
    }
}
