package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.support.assertion.Assertion$Note;
import com.spotify.support.assertion.Assertion$RecoverableAssertionError;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class na6 {

    /* JADX INFO: renamed from: b */
    public static final na6 f151956b = new na6(new z4y(kk31.f123495a, 20));

    /* JADX INFO: renamed from: a */
    public volatile ma6 f151957a;

    private na6(ma6 ma6Var) {
        this.f151957a = ma6Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m63953a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                m63965m("The two objects(null, " + String.valueOf(obj2) + ") are not equal.");
                return;
            }
            return;
        }
        if (obj.equals(obj2)) {
            return;
        }
        m63965m("The two objects(" + String.valueOf(obj) + ", " + String.valueOf(obj2) + ") are not equal.");
    }

    /* JADX INFO: renamed from: b */
    public static void m63954b(Object obj, Object obj2) {
        if (Objects.equals(obj, obj2)) {
            return;
        }
        m63968p(dq60.m36615o("The two objects (", String.valueOf(obj), ", ", String.valueOf(obj2), ") are not equal."));
    }

    /* JADX INFO: renamed from: c */
    public static void m63955c(Object obj, Object obj2) {
        boolean zEquals;
        if (obj != null) {
            zEquals = obj.equals(obj2);
        } else {
            zEquals = obj2 == null;
        }
        if (zEquals) {
            m63965m("The two objects(" + String.valueOf(obj) + ", " + String.valueOf(obj2) + ") are equal.");
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static void m63956d(Object obj, String str) {
        if (obj == null) {
            m63965m(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m63957e(String str) {
        m63968p(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m63958f(String str, String str2) {
        m63967o(new Assertion$RecoverableAssertionError(Logger.m3968d("%s", str), str2));
    }

    /* JADX INFO: renamed from: g */
    public static void m63959g(String str, Throwable th) {
        m63967o(new Assertion$RecoverableAssertionError(str, th));
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static void m63960h(String str, boolean z) {
        if (z) {
            return;
        }
        m63965m(Logger.m3968d("%s", str));
    }

    /* JADX INFO: renamed from: i */
    public static void m63961i(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        m63965m(Logger.m3968d(str, objArr));
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static void m63962j(boolean z, String str) {
        if (z) {
            return;
        }
        m63968p(str);
    }

    /* JADX INFO: renamed from: k */
    public static void m63963k(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        m63968p(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: renamed from: l */
    private static ma6 m63964l() {
        return f151956b.f151957a;
    }

    /* JADX INFO: renamed from: m */
    public static void m63965m(String str) {
        Logger.m3966b("%s", str);
        m63966n(new AssertionError(Logger.m3968d("%s", str)));
    }

    /* JADX INFO: renamed from: n */
    private static void m63966n(AssertionError assertionError) {
        m63970r(assertionError);
        ((z4y) m63964l()).m95402p(assertionError);
        throw null;
    }

    /* JADX INFO: renamed from: o */
    private static void m63967o(Assertion$RecoverableAssertionError assertion$RecoverableAssertionError) {
        m63970r(assertion$RecoverableAssertionError);
        ((z4y) m63964l()).m95401o(assertion$RecoverableAssertionError);
    }

    /* JADX INFO: renamed from: p */
    private static void m63968p(String str) {
        m63967o(new Assertion$RecoverableAssertionError(Logger.m3968d("%s", str), (String) null));
    }

    /* JADX INFO: renamed from: q */
    public static void m63969q(Throwable th) {
        ((z4y) m63964l()).m95403q(th);
    }

    /* JADX INFO: renamed from: r */
    private static void m63970r(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!na6.class.getCanonicalName().equals(stackTraceElement.getClassName())) {
                arrayList.add(stackTraceElement);
            }
        }
        th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
    }

    /* JADX INFO: renamed from: s */
    public static void m63971s(String str) {
        m63973u(new Assertion$Note(str, null));
    }

    /* JADX INFO: renamed from: t */
    public static void m63972t(String str, Throwable th) {
        m63973u(new Assertion$Note(str, th));
    }

    /* JADX INFO: renamed from: u */
    private static void m63973u(Assertion$Note assertion$Note) {
        m63970r(assertion$Note);
        ((z4y) m63964l()).m95408x(assertion$Note);
    }

    /* JADX INFO: renamed from: v */
    public static void m63974v(Throwable th) {
        Assertion$Note assertion$Note = new Assertion$Note(th.getMessage(), null);
        assertion$Note.setStackTrace(th.getStackTrace());
        m63973u(assertion$Note);
    }

    /* JADX INFO: renamed from: w */
    public static void m63975w(ma6 ma6Var) {
        f151956b.f151957a = ma6Var;
    }
}
