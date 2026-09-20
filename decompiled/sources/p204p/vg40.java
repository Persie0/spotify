package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class vg40 {

    /* JADX INFO: renamed from: a */
    public final ljx0 f241116a;

    /* JADX INFO: renamed from: b */
    public final tgq f241117b = new tgq(19, new lub(this, 5), new tg40(this));

    public vg40(ljx0 ljx0Var) {
        this.f241116a = ljx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static final String m85391a(vg40 vg40Var, int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return "IDLE";
        }
        if (iM38547C == 1) {
            return "UPLOADING";
        }
        if (iM38547C == 2) {
            return "PROCESSING";
        }
        if (iM38547C == 3) {
            return "FAILED";
        }
        if (iM38547C == 4) {
            return "DONE";
        }
        if (iM38547C == 5) {
            return "LOCAL_ONLY";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static final int m85392b(vg40 vg40Var, String str) {
        switch (str.hashCode()) {
            case -269267423:
                if (str.equals("UPLOADING")) {
                    return 2;
                }
                break;
            case 2104194:
                if (str.equals("DONE")) {
                    return 5;
                }
                break;
            case 2242516:
                if (str.equals("IDLE")) {
                    return 1;
                }
                break;
            case 907287315:
                if (str.equals("PROCESSING")) {
                    return 3;
                }
                break;
            case 1818214432:
                if (str.equals("LOCAL_ONLY")) {
                    return 6;
                }
                break;
            case 2066319421:
                if (str.equals("FAILED")) {
                    return 4;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }
}
