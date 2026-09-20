package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ck10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38736a;

    /* JADX INFO: renamed from: b */
    public int f38737b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f38738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck10(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f38738c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38736a = obj;
        this.f38737b |= Integer.MIN_VALUE;
        return this.f38738c.emit(null, this);
    }
}
