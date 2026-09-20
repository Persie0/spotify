package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xc90 implements sys0 {

    /* JADX INFO: renamed from: b */
    public static final xc90 f260165b = new xc90(0);

    /* JADX INFO: renamed from: c */
    public static final xc90 f260166c = new xc90(1);

    /* JADX INFO: renamed from: d */
    public static final xc90 f260167d = new xc90(2);

    /* JADX INFO: renamed from: e */
    public static final xc90 f260168e = new xc90(3);

    /* JADX INFO: renamed from: f */
    public static final xc90 f260169f = new xc90(4);

    /* JADX INFO: renamed from: g */
    public static final xc90 f260170g = new xc90(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260171a;

    public /* synthetic */ xc90(int i) {
        this.f260171a = i;
    }

    @Override // p204p.sys0
    public final iys0 create(uys0 uys0Var) {
        switch (this.f260171a) {
            case 0:
                new ze90(false, false, false, false, false, false, false, false, false, false, false, false, 6000, false, false, null, null);
                return ze90.m95965r(uys0Var);
            case 1:
                new e44(true, true, true, false, true, true, true, false, false, false, false, false, true, true, true, true, false, false, true, false, false, false, false, false, true, false, null);
                return e44.m37706B(uys0Var);
            case 2:
                new ee4(false, false, null);
                return new ee4(uys0Var.mo47707c("android-list-ux-platform-consumers-magpie:magpie_enabled", false), uys0Var.mo47707c("android-list-ux-platform-consumers-magpie:reasoning_enabled", false), null);
            case 3:
                new l54(false, false, false, false, false, false, false, null);
                return l54.m58191i(uys0Var);
            case 4:
                new b84();
                return b84.m28409c(uys0Var);
            default:
                new b84();
                return b84.m28409c(uys0Var);
        }
    }
}
