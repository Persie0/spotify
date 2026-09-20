package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class lq51 {
    public static int[] _values() {
        return edb.m38551G(4);
    }

    /* JADX INFO: renamed from: a */
    public static int m59695a(int i) {
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m59696b(int i) {
        if (i != 0) {
            return i != 4 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public static final int m59697c(int i) {
        return m59699e(i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m59698d(int i) {
        if (i == 1) {
            return "taste_profile_side_drawer";
        }
        if (i == 2) {
            return "taste_profile_context_menu";
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m59699e(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m59700f(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: g */
    public static int m59701g(if71 if71Var, int i, int i2) {
        return (if71Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: h */
    public static MessageTemplate m59702h(MessageResponseToken messageResponseToken) {
        return messageResponseToken.getMessageData().getFormat().getTemplate();
    }

    /* JADX INFO: renamed from: i */
    public static NoWhenBranchMatchedException m59703i(int i, xq00 xq00Var, boolean z) {
        xq00Var.m91771i0(i);
        xq00Var.m91788r(z);
        return new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j */
    public static n6f m59704j(xq00 xq00Var, boolean z, long j) {
        xq00Var.m91788r(z);
        return new n6f(j);
    }

    /* JADX INFO: renamed from: k */
    public static wum0 m59705k(long j, xq00 xq00Var) {
        wum0 wum0Var = new wum0(j);
        xq00Var.m91793t0(wum0Var);
        return wum0Var;
    }

    /* JADX INFO: renamed from: l */
    public static c4t0 m59706l(long j, bns bnsVar) {
        return bnsVar.mo30068a(new n6f(j));
    }

    /* JADX INFO: renamed from: m */
    public static o761 m59707m(ArrayList arrayList, o761 o761Var) {
        arrayList.add(o761Var);
        return new o761();
    }

    /* JADX INFO: renamed from: n */
    public static void m59708n(int i, p761 p761Var, long j, o761 o761Var) {
        o761Var.m66376a(new l28(i, p761Var, j));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m59709o(int i) {
        if (i == 1) {
            return "GPB_CHECK";
        }
        if (i == 2) {
            return "FORCE_UNSUPPORTED";
        }
        if (i == 3) {
            return "DISABLE_GPB_FOR_SAMSUNG";
        }
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m59710p(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "FOLLOW";
        }
        return "EVO";
    }
}
