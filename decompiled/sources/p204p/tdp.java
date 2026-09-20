package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tdp implements bxr {

    /* JADX INFO: renamed from: b */
    public static final tdp f219444b = new tdp(0);

    /* JADX INFO: renamed from: c */
    public static final tdp f219445c = new tdp(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f219446a;

    public /* synthetic */ tdp(int i) {
        this.f219446a = i;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f219446a) {
            case 0:
                boolean z = ((bmj) obj2).f28566b;
                return Boolean.valueOf((obj instanceof dhv) || (obj instanceof jhv) || (obj instanceof ihv) || ((obj instanceof chv) && z) || ((obj instanceof khv) && z));
            default:
                bmj bmjVar = (bmj) obj2;
                boolean z2 = bmjVar.f28567c;
                boolean z3 = bmjVar.f28566b;
                return Boolean.valueOf((obj instanceof dhv) || (obj instanceof jhv) || (obj instanceof ihv) || ((obj instanceof chv) && z2) || (((obj instanceof lhv) && ((z3 && (bmjVar.f28565a instanceof hbj)) || z2)) || ((obj instanceof khv) && (z3 || z2))));
        }
    }
}
