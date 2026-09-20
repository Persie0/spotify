package p204p;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class m6b {
    public static int[] _values() {
        return edb.m38551G(4);
    }

    /* JADX INFO: renamed from: a */
    public static int m60986a(int i) {
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
    public static final int m60987b(int i) {
        p8y p8yVar = p8y.f175080a;
        zn91.m96564m0();
        return edb.m38547C(i) + p8y.f175090k;
    }

    /* JADX INFO: renamed from: c */
    public static int m60988c(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("SignUp")) {
            return 1;
        }
        if (str.equals("AgeAssurance")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.genalphaauthentication.childinitiatedauthapi.ChildInitiatedAuthFlow.".concat(str));
    }

    /* JADX INFO: renamed from: d */
    public static int m60989d(gh00 gh00Var, int i, int i2) {
        return (gh00Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: e */
    public static Intent m60990e(Context context, Class cls, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra(str, str2);
        return intent;
    }

    /* JADX INFO: renamed from: f */
    public static String m60991f(cxh0 cxh0Var, float f, xq00 xq00Var, int i, xq00 xq00Var2) {
        riw0.m75615i(xq00Var, mi21.m61838v(f, cxh0Var));
        return k0e1.m54977L(i, xq00Var2);
    }

    /* JADX INFO: renamed from: g */
    public static ybs m60992g(float f, xq00 xq00Var) {
        ybs ybsVar = new ybs(f);
        xq00Var.m91793t0(ybsVar);
        return ybsVar;
    }

    /* JADX INFO: renamed from: h */
    public static yum0 m60993h(float f, xq00 xq00Var) {
        yum0 yum0VarM77645B = sam.m77645B(new ybs(f));
        xq00Var.m91793t0(yum0VarM77645B);
        return yum0VarM77645B;
    }

    /* JADX INFO: renamed from: i */
    public static c6a1 m60994i(co61 co61Var, co61 co61Var2) {
        co61Var.getClass();
        return new c6a1(co61Var2);
    }

    /* JADX INFO: renamed from: j */
    public static void m60995j(String str, String str2) {
        na6.m63971s(str + str2);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m60996k(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, hqb hqbVar, Object obj, puf pufVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(hqbVar, obj, pufVar)) {
            if (atomicReferenceFieldUpdater.get(hqbVar) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m60997l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, hqb hqbVar, o90 o90Var, Object obj) {
        while (!atomicReferenceFieldUpdater.compareAndSet(hqbVar, o90Var, obj)) {
            if (atomicReferenceFieldUpdater.get(hqbVar) != o90Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m60998m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, hqb hqbVar, puf pufVar, puf pufVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(hqbVar, pufVar, pufVar2)) {
            if (atomicReferenceFieldUpdater.get(hqbVar) != pufVar) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m60999n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, hqb hqbVar, opj0 opj0Var, Object obj) {
        while (!atomicReferenceFieldUpdater.compareAndSet(hqbVar, opj0Var, obj)) {
            if (atomicReferenceFieldUpdater.get(hqbVar) != opj0Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m61000o(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m61001p(int i) {
        if (i == 1) {
            return "SEARCH";
        }
        if (i == 2) {
            return "LYRICS_STICKERS";
        }
        if (i == 3) {
            return "GIFS";
        }
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m61002q(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m61003r(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m61004s(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "AgeAssurance";
        }
        return "SignUp";
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m61005t(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("DAILY")) {
            return 1;
        }
        if (str.equals("WEEKLY")) {
            return 2;
        }
        if (str.equals("NEVER")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.promptedplaylists.artifactpage.api.Cadence.".concat(str));
    }
}
