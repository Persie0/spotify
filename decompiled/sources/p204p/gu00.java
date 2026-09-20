package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gu00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84323a;

    /* JADX INFO: renamed from: b */
    public int f84324b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f84325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu00(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f84325c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84323a = obj;
        this.f84324b |= Integer.MIN_VALUE;
        return this.f84325c.emit(null, this);
    }
}
