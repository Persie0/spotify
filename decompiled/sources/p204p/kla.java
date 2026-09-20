package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class kla extends hk60 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p204p.hk60
    public final Object fromJson(xl60 xl60Var) {
        if (xl60Var.mo51068B() == xl60.EnumC2579c.NULL) {
            xl60Var.mo51085t();
            return hla.BROADCAST_STATUS_UNKNOWN;
        }
        String strMo51087y = xl60Var.mo51087y();
        if (strMo51087y != null) {
            switch (strMo51087y.hashCode()) {
                case -2132336463:
                    if (strMo51087y.equals("BROADCAST_OFF")) {
                        return hla.BROADCAST_OFF;
                    }
                    break;
                case -1731353027:
                    if (strMo51087y.equals("BROADCAST_ON")) {
                        return hla.BROADCAST_ON;
                    }
                    break;
                case -899491438:
                    if (strMo51087y.equals("BROADCAST_UNAVAILABLE")) {
                        return hla.BROADCAST_UNAVAILABLE;
                    }
                    break;
                case 1532989499:
                    if (strMo51087y.equals("BROADCAST_STATUS_UNKNOWN")) {
                        return hla.BROADCAST_STATUS_UNKNOWN;
                    }
                    break;
            }
        }
        return hla.BROADCAST_STATUS_UNKNOWN;
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Object obj) {
        hla hlaVar = (hla) obj;
        int i = hlaVar == null ? -1 : jla.f113560a[hlaVar.ordinal()];
        String str = "BROADCAST_STATUS_UNKNOWN";
        if (i != -1 && i != 1) {
            if (i == 2) {
                str = "BROADCAST_UNAVAILABLE";
            } else if (i == 3) {
                str = "BROADCAST_ON";
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "BROADCAST_OFF";
            }
        }
        rm60Var.mo56887N(str);
    }
}
