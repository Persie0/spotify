package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nv60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f158809a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ov60 f158810b;

    /* JADX INFO: renamed from: c */
    public int f158811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv60(ov60 ov60Var, ibk ibkVar) {
        super(ibkVar);
        this.f158810b = ov60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f158809a = obj;
        this.f158811c |= Integer.MIN_VALUE;
        return this.f158810b.m68124a(this);
    }
}
