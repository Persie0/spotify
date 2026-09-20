package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g6f0 implements sd50 {

    /* JADX INFO: renamed from: b */
    public static final g6f0 f77029b = new g6f0(0);

    /* JADX INFO: renamed from: c */
    public static final g6f0 f77030c = new g6f0(1);

    /* JADX INFO: renamed from: d */
    public static final g6f0 f77031d = new g6f0(2);

    /* JADX INFO: renamed from: e */
    public static final g6f0 f77032e = new g6f0(3);

    /* JADX INFO: renamed from: f */
    public static final g6f0 f77033f = new g6f0(4);

    /* JADX INFO: renamed from: g */
    public static final g6f0 f77034g = new g6f0(5);

    /* JADX INFO: renamed from: h */
    public static final g6f0 f77035h = new g6f0(6);

    /* JADX INFO: renamed from: i */
    public static final g6f0 f77036i = new g6f0(7);

    /* JADX INFO: renamed from: j */
    public static final g6f0 f77037j = new g6f0(8);

    /* JADX INFO: renamed from: k */
    public static final g6f0 f77038k = new g6f0(9);

    /* JADX INFO: renamed from: l */
    public static final g6f0 f77039l = new g6f0(10);

    /* JADX INFO: renamed from: m */
    public static final g6f0 f77040m = new g6f0(11);

    /* JADX INFO: renamed from: n */
    public static final g6f0 f77041n = new g6f0(12);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77042a;

    public /* synthetic */ g6f0(int i) {
        this.f77042a = i;
    }

    @Override // p204p.sd50
    public final boolean isInRange(int i) {
        h6f0 h6f0Var;
        dwi0 dwi0Var;
        ewi0 ewi0Var;
        fwi0 fwi0Var;
        gwi0 gwi0Var;
        inn0 inn0Var;
        sop0 sop0Var;
        h7t0 h7t0Var;
        switch (this.f77042a) {
            case 0:
                if (i == 0) {
                    h6f0Var = h6f0.UNKNOWN;
                } else if (i == 1) {
                    h6f0Var = h6f0.NONE;
                } else if (i != 2) {
                    h6f0Var = i != 3 ? null : h6f0.MANDATORY;
                } else {
                    h6f0Var = h6f0.ALLOWED;
                }
                return h6f0Var != null;
            case 1:
                if (i == 0) {
                    dwi0Var = dwi0.NONE;
                } else if (i == 1) {
                    dwi0Var = dwi0.CANVAS_DISABLED;
                } else if (i == 2) {
                    dwi0Var = dwi0.LOW_DISTRACTION;
                } else if (i != 3) {
                    dwi0Var = i != 4 ? null : dwi0.TRAIT_NOT_RESOLVED;
                } else {
                    dwi0Var = dwi0.DATA_SAVER;
                }
                return dwi0Var != null;
            case 2:
                if (i == 0) {
                    ewi0Var = ewi0.IOS;
                } else if (i != 1) {
                    ewi0Var = i != 2 ? null : ewi0.DESKTOP;
                } else {
                    ewi0Var = ewi0.ANDROID;
                }
                return ewi0Var != null;
            case 3:
                if (i == 0) {
                    fwi0Var = fwi0.UNSET;
                } else if (i == 1) {
                    fwi0Var = fwi0.SHOWCASE_DEFAULT;
                } else if (i == 2) {
                    fwi0Var = fwi0.SHOWCASE_VIDEO;
                } else if (i != 3) {
                    fwi0Var = i != 4 ? null : fwi0.SHOWCASE_MUSIC_VIDEO;
                } else {
                    fwi0Var = fwi0.SHOWCASE_PRERELEASE;
                }
                return fwi0Var != null;
            case 4:
                if (i != 0) {
                    gwi0Var = i != 1 ? null : gwi0.BROWSE;
                } else {
                    gwi0Var = gwi0.HOME;
                }
                return gwi0Var != null;
            case 5:
                if (i == 0) {
                    inn0Var = inn0.CLAIM_FAIL_REASON_UNSPECIFIED;
                } else if (i == 1) {
                    inn0Var = inn0.CLAIM_FAIL_REASON_ANONYMOUS;
                } else if (i != 2) {
                    inn0Var = i != 3 ? null : inn0.CLAIM_FAIL_REASON_GRANT_EXPIRED;
                } else {
                    inn0Var = inn0.CLAIM_FAIL_REASON_NO_GRANT_FOUND;
                }
                return inn0Var != null;
            case 6:
                return knn0.m56948a(i) != null;
            case 7:
                return nnn0.m65212a(i) != null;
            case 8:
                if (i != 0) {
                    sop0Var = i != 1 ? null : sop0.PENDING;
                } else {
                    sop0Var = sop0.READY;
                }
                return sop0Var != null;
            case 9:
                if (i == 0) {
                    h7t0Var = h7t0.PUBLISHED_STATE_UNSPECIFIED;
                } else if (i != 1) {
                    h7t0Var = i != 2 ? null : h7t0.PUBLISHED_STATE_PUBLISHED;
                } else {
                    h7t0Var = h7t0.PUBLISHED_STATE_NOT_PUBLISHED;
                }
                return h7t0Var != null;
            case 10:
                return vq11.m86180a(i) != null;
            case 11:
                return pr11.m70698a(i) != null;
            default:
                return sr11.m78985a(i) != null;
        }
    }
}
