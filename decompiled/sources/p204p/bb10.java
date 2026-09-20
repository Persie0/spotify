package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bb10 extends ibk {

    /* JADX INFO: renamed from: a */
    public k8j0 f25381a;

    /* JADX INFO: renamed from: b */
    public String f25382b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25383c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ drw f25384d;

    /* JADX INFO: renamed from: e */
    public int f25385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb10(drw drwVar, ibk ibkVar) {
        super(ibkVar);
        this.f25384d = drwVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25383c = obj;
        this.f25385e |= Integer.MIN_VALUE;
        return this.f25384d.m36740a(null, null, this);
    }
}
