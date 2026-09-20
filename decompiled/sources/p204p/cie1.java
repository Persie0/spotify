package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cie1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38301a;

    /* JADX INFO: renamed from: b */
    public int f38302b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f38303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cie1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f38303c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38301a = obj;
        this.f38302b |= Integer.MIN_VALUE;
        return this.f38303c.emit(null, this);
    }
}
