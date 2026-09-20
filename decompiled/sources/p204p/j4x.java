package p204p;

import com.spotify.voiceassistants.playermodels.ParsedQueryKt;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class j4x {
    public static int[] _values() {
        return edb.m38551G(3);
    }

    /* JADX INFO: renamed from: a */
    public static final String m52403a(int i) {
        if (i == 1) {
            return "button_clicked";
        }
        if (i == 2) {
            return "card_clicked";
        }
        if (i == 3) {
            return "cta_see_all";
        }
        if (i == 4) {
            return "";
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m52404b(int i) {
        if (i == 1) {
            return "ADD";
        }
        if (i == 2) {
            return "REMOVE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m52405c(int i) {
        switch (i) {
            case 1:
                return "positive_interested";
            case 2:
                return "negative_not_interested";
            case 3:
                return "negative_repetitive";
            case 4:
                return "negative_brand";
            case 5:
                return "negative_product";
            case 6:
                return "negative_already_using";
            case 7:
                return "negative_something_else";
            case 8:
                return "report_adult_content";
            case 9:
                return "report_deceptive_misleading";
            case 10:
                return "report_dangerous_inappropriate";
            case 11:
                return "report_illegal_restricted";
            case 12:
                return "report_quality_technical";
            case 13:
                return "dsa_tapped";
            case 14:
                return "brand_survey_info_tapped";
            case 15:
                return "neutral_close_ad";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m52406d(t3x0 t3x0Var, int i, int i2) {
        return (t3x0Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: e */
    public static vum0 m52407e(int i, xq00 xq00Var) {
        vum0 vum0Var = new vum0(i);
        xq00Var.m91793t0(vum0Var);
        return vum0Var;
    }

    /* JADX INFO: renamed from: f */
    public static yum0 m52408f(w2a1 w2a1Var, zhi0 zhi0Var, xq00 xq00Var) {
        yum0 yum0Var = new yum0(w2a1Var, zhi0Var);
        xq00Var.m91793t0(yum0Var);
        return yum0Var;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m52409g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6x f6xVar, Object obj, hna0 hna0Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(f6xVar, obj, hna0Var) && atomicReferenceFieldUpdater.get(f6xVar) == obj) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m52410h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6x f6xVar, e6x e6xVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(f6xVar, null, e6xVar) && atomicReferenceFieldUpdater.get(f6xVar) == null) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m52411i(pre0 pre0Var) {
        if (pre0Var != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ boolean m52412j(AtomicReference atomicReference, AtomicReference atomicReference2) {
        while (!atomicReference.compareAndSet(null, atomicReference2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m52413k(AtomicReference atomicReference, daz dazVar) {
        while (!atomicReference.compareAndSet(null, dazVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m52414l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6x f6xVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(f6xVar, null, pmf0.f179062b)) {
            if (atomicReferenceFieldUpdater.get(f6xVar) != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m52415m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6x f6xVar, Object obj) {
        while (!atomicReferenceFieldUpdater.compareAndSet(f6xVar, obj, null)) {
            if (atomicReferenceFieldUpdater.get(f6xVar) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m52416n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6x f6xVar, Object obj, hna0 hna0Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(f6xVar, obj, hna0Var)) {
            if (atomicReferenceFieldUpdater.get(f6xVar) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m52417o(int i) {
        if (i == 1) {
            return "UPDATE";
        }
        if (i == 2) {
            return "ENABLE";
        }
        if (i == 3) {
            return "REMOVE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m52418p(int i) {
        if (i == 1) {
            return "REPLACE";
        }
        if (i == 2) {
            return "KEEP";
        }
        if (i == 3) {
            return "APPEND";
        }
        if (i == 4) {
            return "APPEND_OR_REPLACE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m52419q(int i) {
        if (i == 1) {
            return "RESUME";
        }
        if (i == 2) {
            return ParsedQueryKt.INTENT_PLAY;
        }
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m52420r(int i) {
        if (i == 1) {
            return "FACE";
        }
        if (i == 2) {
            return "BACK_BUTTON";
        }
        if (i == 3) {
            return "NONE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m52421s(int i) {
        if (i == 1) {
            return "FilterRow";
        }
        if (i == 2) {
            return "ClearButton";
        }
        if (i == 3) {
            return "PrimaryFilter";
        }
        if (i == 4) {
            return "SecondaryFilter";
        }
        if (i == 5) {
            return "MoreFilters";
        }
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m52422t(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "OK";
        }
        if (i == 3) {
            return "NOT_RESOLVED";
        }
        if (i != 4) {
            return i != 5 ? "null" : "UNAVAILABLE_FOR_LEGAL_REASONS";
        }
        return "NOT_FOUND";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m52423u(int i) {
        switch (i) {
            case 1:
                return "ARTIST";
            case 2:
                return "PLAYLIST";
            case 3:
                return "ALBUM";
            case 4:
                return "PODCAST";
            case 5:
                return "UNKNOWN";
            case 6:
                return "PODCAST_EPISODE";
            case 7:
                return "TRACK";
            default:
                return "null";
        }
    }
}
