package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z841 extends ibk {

    /* JADX INFO: renamed from: a */
    public clj f280380a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f280381b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ clj f280382c;

    /* JADX INFO: renamed from: d */
    public int f280383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z841(clj cljVar, ibk ibkVar) {
        super(ibkVar);
        this.f280382c = cljVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280381b = obj;
        this.f280383d |= Integer.MIN_VALUE;
        return clj.m33277f(this.f280382c, this);
    }
}
