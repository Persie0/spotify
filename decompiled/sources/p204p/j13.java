package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j13 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107630a;

    /* JADX INFO: renamed from: b */
    public int f107631b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f107632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j13(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f107632c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107630a = obj;
        this.f107631b |= Integer.MIN_VALUE;
        return this.f107632c.emit(null, this);
    }
}
