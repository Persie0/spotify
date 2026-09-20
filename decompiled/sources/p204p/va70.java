package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class va70 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f239132a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f239133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ya70 f239134c;

    /* JADX INFO: renamed from: d */
    public int f239135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va70(ya70 ya70Var, ibk ibkVar) {
        super(ibkVar);
        this.f239134c = ya70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f239133b = obj;
        this.f239135d |= Integer.MIN_VALUE;
        return ya70.m93205d(this.f239134c, 0, this);
    }
}
