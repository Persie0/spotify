package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hxf1 implements d4g1 {

    /* JADX INFO: renamed from: b */
    public static final hxf1 f96216b = new hxf1(0);

    /* JADX INFO: renamed from: c */
    public static final hxf1 f96217c = new hxf1(1);

    /* JADX INFO: renamed from: d */
    public static final hxf1 f96218d = new hxf1(2);

    /* JADX INFO: renamed from: e */
    public static final hxf1 f96219e = new hxf1(3);

    /* JADX INFO: renamed from: f */
    public static final hxf1 f96220f = new hxf1(4);

    /* JADX INFO: renamed from: g */
    public static final hxf1 f96221g = new hxf1(5);

    /* JADX INFO: renamed from: h */
    public static final hxf1 f96222h = new hxf1(6);

    /* JADX INFO: renamed from: i */
    public static final hxf1 f96223i = new hxf1(7);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96224a;

    public /* synthetic */ hxf1(int i) {
        this.f96224a = i;
    }

    @Override // p204p.d4g1
    public final boolean zza(int i) {
        hgg1 hgg1Var;
        switch (this.f96224a) {
            case 0:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i) {
                    default:
                        switch (i) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                                break;
                            default:
                                return false;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
                break;
            case 2:
                return ilf1.m51013a(i) != 0;
            case 3:
                if (i == 0) {
                    hgg1Var = hgg1.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i == 1) {
                    hgg1Var = hgg1.PURCHASES_UPDATED_ACTION;
                } else if (i != 2) {
                    hgg1Var = i != 3 ? null : hgg1.ALTERNATIVE_BILLING_ACTION;
                } else {
                    hgg1Var = hgg1.LOCAL_PURCHASES_UPDATED_ACTION;
                }
                return hgg1Var != null;
            case 4:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case 5:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                return i == 0 || i == 1;
        }
    }
}
