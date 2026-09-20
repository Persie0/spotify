package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sfz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f208666a;

    /* JADX INFO: renamed from: b */
    public int f208667b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f208668c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f208668c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208666a = obj;
        this.f208667b |= Integer.MIN_VALUE;
        return this.f208668c.emit(null, this);
    }
}
