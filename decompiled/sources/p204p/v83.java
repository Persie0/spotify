package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v83 extends ibk {

    /* JADX INFO: renamed from: a */
    public vn80 f238359a;

    /* JADX INFO: renamed from: b */
    public int f238360b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f238361c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ w83 f238362d;

    /* JADX INFO: renamed from: e */
    public int f238363e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v83(w83 w83Var, ibk ibkVar) {
        super(ibkVar);
        this.f238362d = w83Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f238361c = obj;
        this.f238363e |= Integer.MIN_VALUE;
        return w83.m87435a(this.f238362d, null, 0, this);
    }
}
