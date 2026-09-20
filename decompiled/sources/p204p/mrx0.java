package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class mrx0 {
    public static int[] _values() {
        return edb.m38551G(40);
    }

    /* JADX INFO: renamed from: a */
    public static int m62647a(int i) {
        switch (i) {
            case 0:
                return 40;
            case 1:
            case 5:
            case 14:
            case 22:
            case 43:
            default:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            case 10:
                return 8;
            case 11:
                return 9;
            case 12:
                return 10;
            case 13:
                return 11;
            case 15:
                return 12;
            case 16:
                return 13;
            case 17:
                return 14;
            case 18:
                return 15;
            case 19:
                return 16;
            case 20:
                return 17;
            case 21:
                return 18;
            case 23:
                return 19;
            case 24:
                return 20;
            case 25:
                return 21;
            case 26:
                return 22;
            case 27:
                return 23;
            case 28:
                return 24;
            case 29:
                return 25;
            case 30:
                return 26;
            case 31:
                return 27;
            case 32:
                return 28;
            case 33:
                return 29;
            case 34:
                return 30;
            case 35:
                return 31;
            case 36:
                return 32;
            case 37:
                return 33;
            case 38:
                return 34;
            case 39:
                return 35;
            case 40:
                return 36;
            case 41:
                return 37;
            case 42:
                return 38;
            case 44:
                return 39;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m62648b(int i) {
        if (i == 1) {
            return "load_first_result_search_recents";
        }
        if (i == 2) {
            return "load_first_result_first_step_search";
        }
        if (i == 3) {
            return "load_first_result_second_step_search";
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static final String m62649c(int i) {
        return m62654h(i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m62650d(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "error";
        }
        if (i == 3) {
            return "cancelled";
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m62651e(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "failure";
        }
        if (i == 3) {
            return "exception";
        }
        if (i == 4) {
            return "unknown";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m62652f(int i) {
        if (i == 1) {
            return "hydrogen_endpoint";
        }
        if (i == 2) {
            return "natural_language_endpoint";
        }
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m62653g(int i) {
        if (i == 1) {
            return "entity-segment-context";
        }
        if (i == 2) {
            return "entity-segment-creator";
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m62654h(int i) {
        if (i == 1) {
            return "load_data";
        }
        if (i == 2) {
            return "create_content";
        }
        if (i == 3) {
            return "render_content";
        }
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m62655i(int i) {
        if (i == 1) {
            return "crossword";
        }
        if (i == 2) {
            return "crossword_overview";
        }
        if (i == 3) {
            return "cross_content";
        }
        if (i == 4) {
            return "track_versions";
        }
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static sep m62656j(float f, float f2) {
        sep sepVar = new sep(3, false);
        sepVar.m77945s(f, f2);
        return sepVar;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m62657k(AtomicReference atomicReference) {
        Object obj = q3d0.f184848b;
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m62658l(AtomicReference atomicReference, a2e1 a2e1Var) {
        while (!atomicReference.compareAndSet(null, a2e1Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m62659m(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m62660n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ojz0 ojz0Var, Object obj, List list) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ojz0Var, obj, list)) {
            if (atomicReferenceFieldUpdater.get(ojz0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m62661o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ojz0 ojz0Var, Object obj, hqb hqbVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ojz0Var, obj, hqbVar)) {
            if (atomicReferenceFieldUpdater.get(ojz0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m62662p(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ojz0 ojz0Var, List list) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ojz0Var, list, rjz0.f199926a)) {
            if (atomicReferenceFieldUpdater.get(ojz0Var) != list) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m62663q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ojz0 ojz0Var, List list, ArrayList arrayList) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ojz0Var, list, arrayList)) {
            if (atomicReferenceFieldUpdater.get(ojz0Var) != list) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m62664r(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ojz0 ojz0Var, fqb fqbVar, mjz0 mjz0Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ojz0Var, fqbVar, mjz0Var)) {
            if (atomicReferenceFieldUpdater.get(ojz0Var) != fqbVar) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m62665s(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, spz0 spz0Var, ffz0 ffz0Var, ffz0 ffz0Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(spz0Var, ffz0Var, ffz0Var2)) {
            if (atomicReferenceFieldUpdater.get(spz0Var) != ffz0Var) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m62666t(int i) {
        if (i == 1) {
            return "PLAYING";
        }
        if (i == 2) {
            return "PAUSED";
        }
        if (i == 3) {
            return "NONE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m62667u(int i) {
        if (i == 1) {
            return "SECTION_ACTIVE";
        }
        if (i == 2) {
            return "SECTION_SUGGESTED";
        }
        if (i == 3) {
            return "SECTION_UNSPECIFIED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m62668v(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("PLAYING")) {
            return 1;
        }
        if (str.equals("PAUSED")) {
            return 2;
        }
        if (str.equals("NONE")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.search.common.RowPlayState.".concat(str));
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m62669w(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("SECTION_ACTIVE")) {
            return 1;
        }
        if (str.equals("SECTION_SUGGESTED")) {
            return 2;
        }
        if (str.equals("SECTION_UNSPECIFIED")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.campfire.models.Section.".concat(str));
    }
}
