package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kcu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121552a;

    /* JADX INFO: renamed from: b */
    public int f121553b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f121554c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f121554c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121552a = obj;
        this.f121553b |= Integer.MIN_VALUE;
        return this.f121554c.emit(null, this);
    }
}
