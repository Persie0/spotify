package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f470 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65687a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j470 f65688b;

    /* JADX INFO: renamed from: c */
    public int f65689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f470(j470 j470Var, ibk ibkVar) {
        super(ibkVar);
        this.f65688b = j470Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65687a = obj;
        this.f65689c |= Integer.MIN_VALUE;
        return this.f65688b.m52327a(null, null, null, null, null, this);
    }
}
