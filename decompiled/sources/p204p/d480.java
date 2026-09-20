package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d480 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45101a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f480 f45102b;

    /* JADX INFO: renamed from: c */
    public int f45103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d480(f480 f480Var, fbk fbkVar) {
        super(fbkVar);
        this.f45102b = f480Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45101a = obj;
        this.f45103c |= Integer.MIN_VALUE;
        return f480.m40719f(this.f45102b, null, this);
    }
}
