package p204p;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Gainmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.net.http.CallbackException;
import android.net.http.HttpException;
import android.net.http.InlineExecutionProhibitedException;
import android.net.http.NetworkException;
import android.net.http.QuicException;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.CronetException;

/* JADX INFO: renamed from: p.af */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1665af {
    /* JADX INFO: renamed from: A */
    public static boolean m25751A(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    /* JADX INFO: renamed from: B */
    public static final ColorSpace m25752B(z8f z8fVar) {
        if (wj50.m88271j(z8fVar, c9f.f35511v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (wj50.m88271j(z8fVar, c9f.f35512w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static void m25753C(long j, j15 j15Var, boolean z, rv70 rv70Var) {
        if (z) {
            j = twg1.m81738f(j, j15Var);
        }
        int i = (int) (4294967295L & j);
        rv70Var.invoke(new ic20(new jts[]{new i601(i, i), new mpq(ic71.m50237e(j), 0)}));
    }

    /* JADX INFO: renamed from: D */
    public static int m25754D(n480 n480Var, HandwritingGesture handwritingGesture, j871 j871Var, pec1 pec1Var, rv70 rv70Var) {
        int i;
        int i2;
        int i3;
        String string;
        eb71 eb71VarM63660d;
        eb71 eb71VarM63660d2;
        j15 j15Var = n480Var.f150241j;
        if (j15Var == null) {
            return 3;
        }
        eb71 eb71VarM63660d3 = n480Var.m63660d();
        if (!j15Var.equals(eb71VarM63660d3 != null ? eb71VarM63660d3.f57846a.f47230a.f36033a : null)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jM81749q = twg1.m81749q(n480Var, yyg1.m94899J(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (ic71.m50236d(jM81749q)) {
                return m25779j(selectGesture, rv70Var);
            }
            rv70Var.invoke(new i601((int) (jM81749q >> 32), (int) (jM81749q & 4294967295L)));
            if (j871Var != null) {
                j871Var.m52684h(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i4 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jM81749q2 = twg1.m81749q(n480Var, yyg1.m94899J(deleteGesture.getDeletionArea()), i4);
                if (ic71.m50236d(jM81749q2)) {
                    return m25779j(deleteGesture, rv70Var);
                }
                m25753C(jM81749q2, j15Var, i4 == 1, rv70Var);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i5 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jM81740h = twg1.m81740h(n480Var, yyg1.m94899J(deleteRangeGesture.getDeletionStartArea()), yyg1.m94899J(deleteRangeGesture.getDeletionEndArea()), i5);
                    if (ic71.m50236d(jM81740h)) {
                        return m25779j(deleteRangeGesture, rv70Var);
                    }
                    m25753C(jM81740h, j15Var, i5 == 1, rv70Var);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (pec1Var == null) {
                        return m25779j(joinOrSplitGesture, rv70Var);
                    }
                    long jM81746n = twg1.m81746n(joinOrSplitGesture.getJoinOrSplitPoint());
                    eb71 eb71VarM63660d4 = n480Var.m63660d();
                    int iM81748p = eb71VarM63660d4 != null ? twg1.m81748p(eb71VarM63660d4.f57846a.f47231b, jM81746n, n480Var.m63659c(), pec1Var) : -1;
                    if (iM81748p == -1 || ((eb71VarM63660d2 = n480Var.m63660d()) != null && twg1.m81742j(eb71VarM63660d2.f57846a, iM81748p))) {
                        return m25779j(joinOrSplitGesture, rv70Var);
                    }
                    long jM81744l = twg1.m81744l(iM81748p, j15Var);
                    if (!ic71.m50236d(jM81744l)) {
                        m25753C(jM81744l, j15Var, false, rv70Var);
                        return 1;
                    }
                    int i6 = (int) (jM81744l >> 32);
                    rv70Var.invoke(new ic20(new jts[]{new i601(i6, i6), new knf(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (pec1Var == null) {
                        return m25779j(insertGesture, rv70Var);
                    }
                    long jM81746n2 = twg1.m81746n(insertGesture.getInsertionPoint());
                    eb71 eb71VarM63660d5 = n480Var.m63660d();
                    int iM81748p2 = eb71VarM63660d5 != null ? twg1.m81748p(eb71VarM63660d5.f57846a.f47231b, jM81746n2, n480Var.m63659c(), pec1Var) : -1;
                    if (iM81748p2 == -1 || ((eb71VarM63660d = n480Var.m63660d()) != null && twg1.m81742j(eb71VarM63660d.f57846a, iM81748p2))) {
                        return m25779j(insertGesture, rv70Var);
                    }
                    rv70Var.invoke(new ic20(new jts[]{new i601(iM81748p2, iM81748p2), new knf(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                eb71 eb71VarM63660d6 = n480Var.m63660d();
                long jM81739g = twg1.m81739g(eb71VarM63660d6 != null ? eb71VarM63660d6.f57846a : null, twg1.m81746n(removeSpaceGesture.getStartPoint()), twg1.m81746n(removeSpaceGesture.getEndPoint()), n480Var.m63659c(), pec1Var);
                if (ic71.m50236d(jM81739g)) {
                    return m25779j(removeSpaceGesture, rv70Var);
                }
                String strM37120v = dvg1.m37120v(jM81739g, j15Var);
                r2d0 r2d0VarM85464e = vgg1.m85464e(Pattern.compile("\\s+").matcher(strM37120v), 0, strM37120v);
                if (r2d0VarM85464e == null) {
                    string = strM37120v.toString();
                    i2 = -1;
                    i = -1;
                } else {
                    int length = strM37120v.length();
                    StringBuilder sb = new StringBuilder(length);
                    i = -1;
                    int i7 = 0;
                    while (true) {
                        sb.append((CharSequence) strM37120v, i7, r2d0VarM85464e.m74521b().f278778a);
                        if (i == -1) {
                            i = r2d0VarM85464e.m74521b().f278778a;
                        }
                        i2 = r2d0VarM85464e.m74521b().f278779b + 1;
                        sb.append((CharSequence) "");
                        i3 = r2d0VarM85464e.m74521b().f278779b + 1;
                        r2d0VarM85464e = r2d0VarM85464e.m74522c();
                        if (i3 >= length || r2d0VarM85464e == null) {
                            break;
                        }
                        i7 = i3;
                    }
                    if (i3 < length) {
                        sb.append((CharSequence) strM37120v, i3, length);
                    }
                    string = sb.toString();
                }
                if (i == -1 || i2 == -1) {
                    return m25779j(removeSpaceGesture, rv70Var);
                }
                int i8 = (int) (jM81739g >> 32);
                rv70Var.invoke(new ic20(new jts[]{new i601(i8 + i, i8 + i2), new knf(string.substring(i, string.length() - (ic71.m50237e(jM81739g) - i2)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jM81740h2 = twg1.m81740h(n480Var, yyg1.m94899J(selectRangeGesture.getSelectionStartArea()), yyg1.m94899J(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (ic71.m50236d(jM81740h2)) {
                return m25779j(selectRangeGesture, rv70Var);
            }
            rv70Var.invoke(new i601((int) (jM81740h2 >> 32), (int) (jM81740h2 & 4294967295L)));
            if (j871Var != null) {
                j871Var.m52684h(true);
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: E */
    public static int m25755E(w591 w591Var, HandwritingGesture handwritingGesture, fb71 fb71Var, eh00 eh00Var, pec1 pec1Var) {
        int i;
        int i2;
        int i3;
        String string;
        db71 db71VarM41219c;
        int i4 = 0;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jM81750r = twg1.m81750r(fb71Var, yyg1.m94899J(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (ic71.m50236d(jM81750r)) {
                return m25778i(w591Var, selectGesture);
            }
            w591Var.m87240n(jM81750r);
            if (eh00Var != null) {
                eh00Var.invoke();
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                i4 = deleteGesture.getGranularity() == 1 ? 1 : 0;
                long jM81750r2 = twg1.m81750r(fb71Var, yyg1.m94899J(deleteGesture.getDeletionArea()), i4);
                if (ic71.m50236d(jM81750r2)) {
                    return m25778i(w591Var, deleteGesture);
                }
                if (i4 == 1) {
                    jM81750r2 = twg1.m81738f(jM81750r2, w591Var.m87235g());
                }
                w591.m87228m(w591Var, "", jM81750r2, false, 12);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    i4 = deleteRangeGesture.getGranularity() == 1 ? 1 : 0;
                    long jM81741i = twg1.m81741i(fb71Var, yyg1.m94899J(deleteRangeGesture.getDeletionStartArea()), yyg1.m94899J(deleteRangeGesture.getDeletionEndArea()), i4);
                    if (ic71.m50236d(jM81741i)) {
                        return m25778i(w591Var, deleteRangeGesture);
                    }
                    if (i4 == 1) {
                        jM81741i = twg1.m81738f(jM81741i, w591Var.m87235g());
                    }
                    w591.m87228m(w591Var, "", jM81741i, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (w591Var.m87232d() != w591Var.f248034a.m58500d()) {
                        return 3;
                    }
                    long jM81746n = twg1.m81746n(joinOrSplitGesture.getJoinOrSplitPoint());
                    db71 db71VarM41219c2 = fb71Var.m41219c();
                    int iM81748p = db71VarM41219c2 != null ? twg1.m81748p(db71VarM41219c2.f47231b, jM81746n, fb71Var.m41221e(), pec1Var) : -1;
                    if (iM81748p == -1 || ((db71VarM41219c = fb71Var.m41219c()) != null && twg1.m81742j(db71VarM41219c, iM81748p))) {
                        return m25778i(w591Var, joinOrSplitGesture);
                    }
                    long jM81744l = twg1.m81744l(iM81748p, w591Var.m87235g());
                    if (ic71.m50236d(jM81744l)) {
                        w591.m87228m(w591Var, " ", jM81744l, false, 12);
                        return 1;
                    }
                    w591.m87228m(w591Var, "", jM81744l, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    long jM81746n2 = twg1.m81746n(insertGesture.getInsertionPoint());
                    db71 db71VarM41219c3 = fb71Var.m41219c();
                    int iM81748p2 = db71VarM41219c3 != null ? twg1.m81748p(db71VarM41219c3.f47231b, jM81746n2, fb71Var.m41221e(), pec1Var) : -1;
                    if (iM81748p2 == -1) {
                        return m25778i(w591Var, insertGesture);
                    }
                    w591.m87228m(w591Var, insertGesture.getTextToInsert(), dvg1.m37112n(iM81748p2, iM81748p2), false, 12);
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                long jM81739g = twg1.m81739g(fb71Var.m41219c(), twg1.m81746n(removeSpaceGesture.getStartPoint()), twg1.m81746n(removeSpaceGesture.getEndPoint()), fb71Var.m41221e(), pec1Var);
                if (ic71.m50236d(jM81739g)) {
                    return m25778i(w591Var, removeSpaceGesture);
                }
                String strM37120v = dvg1.m37120v(jM81739g, w591Var.m87235g());
                r2d0 r2d0VarM85464e = vgg1.m85464e(Pattern.compile("\\s+").matcher(strM37120v), 0, strM37120v);
                if (r2d0VarM85464e == null) {
                    string = strM37120v.toString();
                    i = -1;
                    i2 = -1;
                } else {
                    int length = strM37120v.length();
                    StringBuilder sb = new StringBuilder(length);
                    i = -1;
                    while (true) {
                        sb.append((CharSequence) strM37120v, i4, r2d0VarM85464e.m74521b().f278778a);
                        if (i == -1) {
                            i = r2d0VarM85464e.m74521b().f278778a;
                        }
                        i2 = r2d0VarM85464e.m74521b().f278779b + 1;
                        sb.append((CharSequence) "");
                        i3 = r2d0VarM85464e.m74521b().f278779b + 1;
                        r2d0VarM85464e = r2d0VarM85464e.m74522c();
                        if (i3 >= length || r2d0VarM85464e == null) {
                            break;
                        }
                        i4 = i3;
                    }
                    if (i3 < length) {
                        sb.append((CharSequence) strM37120v, i3, length);
                    }
                    string = sb.toString();
                }
                if (i == -1 || i2 == -1) {
                    return m25778i(w591Var, removeSpaceGesture);
                }
                int i5 = (int) (jM81739g >> 32);
                w591.m87228m(w591Var, string.substring(i, string.length() - (ic71.m50237e(jM81739g) - i2)), dvg1.m37112n(i5 + i, i5 + i2), false, 12);
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jM81741i2 = twg1.m81741i(fb71Var, yyg1.m94899J(selectRangeGesture.getSelectionStartArea()), yyg1.m94899J(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (ic71.m50236d(jM81741i2)) {
                return m25778i(w591Var, selectRangeGesture);
            }
            w591Var.m87240n(jM81741i2);
            if (eh00Var != null) {
                eh00Var.invoke();
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m25756F(n480 n480Var, PreviewableHandwritingGesture previewableHandwritingGesture, j871 j871Var, CancellationSignal cancellationSignal) {
        j15 j15Var = n480Var.f150241j;
        if (j15Var != null) {
            eb71 eb71VarM63660d = n480Var.m63660d();
            if (j15Var.equals(eb71VarM63660d != null ? eb71VarM63660d.f57846a.f47230a.f36033a : null)) {
                boolean z = previewableHandwritingGesture instanceof SelectGesture;
                pb20 pb20Var = pb20.f175694a;
                if (z) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (j871Var != null) {
                        long jM81749q = twg1.m81749q(n480Var, yyg1.m94899J(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        n480 n480Var2 = j871Var.f109839d;
                        if (n480Var2 != null) {
                            n480Var2.m63662f(jM81749q);
                        }
                        n480 n480Var3 = j871Var.f109839d;
                        if (n480Var3 != null) {
                            n480Var3.m63661e(ic71.f100750b);
                        }
                        if (!ic71.m50236d(jM81749q)) {
                            j871Var.m52696t(false);
                            j871Var.m52693q(pb20Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (j871Var != null) {
                        long jM81749q2 = twg1.m81749q(n480Var, yyg1.m94899J(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        n480 n480Var4 = j871Var.f109839d;
                        if (n480Var4 != null) {
                            n480Var4.m63661e(jM81749q2);
                        }
                        n480 n480Var5 = j871Var.f109839d;
                        if (n480Var5 != null) {
                            n480Var5.m63662f(ic71.f100750b);
                        }
                        if (!ic71.m50236d(jM81749q2)) {
                            j871Var.m52696t(false);
                            j871Var.m52693q(pb20Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (j871Var != null) {
                        long jM81740h = twg1.m81740h(n480Var, yyg1.m94899J(selectRangeGesture.getSelectionStartArea()), yyg1.m94899J(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        n480 n480Var6 = j871Var.f109839d;
                        if (n480Var6 != null) {
                            n480Var6.m63662f(jM81740h);
                        }
                        n480 n480Var7 = j871Var.f109839d;
                        if (n480Var7 != null) {
                            n480Var7.m63661e(ic71.f100750b);
                        }
                        if (!ic71.m50236d(jM81740h)) {
                            j871Var.m52696t(false);
                            j871Var.m52693q(pb20Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (j871Var != null) {
                        long jM81740h2 = twg1.m81740h(n480Var, yyg1.m94899J(deleteRangeGesture.getDeletionStartArea()), yyg1.m94899J(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        n480 n480Var8 = j871Var.f109839d;
                        if (n480Var8 != null) {
                            n480Var8.m63661e(jM81740h2);
                        }
                        n480 n480Var9 = j871Var.f109839d;
                        if (n480Var9 != null) {
                            n480Var9.m63662f(ic71.f100750b);
                        }
                        if (!ic71.m50236d(jM81740h2)) {
                            j871Var.m52696t(false);
                            j871Var.m52693q(pb20Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new dnh(j871Var, 2));
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m25757G(w591 w591Var, PreviewableHandwritingGesture previewableHandwritingGesture, fb71 fb71Var, CancellationSignal cancellationSignal) {
        if (previewableHandwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
            m25794y(w591Var, twg1.m81750r(fb71Var, yyg1.m94899J(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
            m25794y(w591Var, twg1.m81750r(fb71Var, yyg1.m94899J(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() == 1 ? 1 : 0), 1);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
            m25794y(w591Var, twg1.m81741i(fb71Var, yyg1.m94899J(selectRangeGesture.getSelectionStartArea()), yyg1.m94899J(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
            m25794y(w591Var, twg1.m81741i(fb71Var, yyg1.m94899J(deleteRangeGesture.getDeletionStartArea()), yyg1.m94899J(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() == 1 ? 1 : 0), 1);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new dnh(w591Var, 1));
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    public static void m25758H(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e) {
            Objects.toString(pendingIntent);
            e.toString();
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m25759I(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    /* JADX INFO: renamed from: J */
    public static void m25760J(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    /* JADX INFO: renamed from: K */
    public static void m25761K(MediaRoute2Info.Builder builder, Set set) {
        builder.setDeduplicationIds(set);
    }

    /* JADX INFO: renamed from: L */
    public static void m25762L(MediaRoute2Info.Builder builder, int i) {
        builder.setType(i);
    }

    /* JADX INFO: renamed from: M */
    public static void m25763M(xd10 xd10Var, Gainmap gainmap, int i) {
        int i2 = gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8 ? 1 : 0;
        float[] gamma = gainmap.getGamma();
        int i3 = (gamma[0] == 1.0f && gamma[1] == 1.0f && gamma[2] == 1.0f) ? 1 : 0;
        int i4 = (m25773d(gamma) && m25773d(gainmap.getRatioMax()) && m25773d(gainmap.getRatioMin())) ? 1 : 0;
        xd10Var.m90404g(i2, m25770a(i, "uGainmapIsAlpha"));
        xd10Var.m90404g(i3, m25770a(i, "uNoGamma"));
        xd10Var.m90404g(i4, m25770a(i, "uSingleChannel"));
        String strM25770a = m25770a(i, "uLogRatioMin");
        float[] ratioMin = gainmap.getRatioMin();
        xd10Var.m90403f(strM25770a, new float[]{(float) Math.log(ratioMin[0]), (float) Math.log(ratioMin[1]), (float) Math.log(ratioMin[2])});
        String strM25770a2 = m25770a(i, "uLogRatioMax");
        float[] ratioMax = gainmap.getRatioMax();
        xd10Var.m90403f(strM25770a2, new float[]{(float) Math.log(ratioMax[0]), (float) Math.log(ratioMax[1]), (float) Math.log(ratioMax[2])});
        xd10Var.m90403f(m25770a(i, "uEpsilonSdr"), gainmap.getEpsilonSdr());
        xd10Var.m90403f(m25770a(i, "uEpsilonHdr"), gainmap.getEpsilonHdr());
        xd10Var.m90403f(m25770a(i, "uGainmapGamma"), gamma);
        xd10Var.m90402e(m25770a(i, "uDisplayRatioHdr"), gainmap.getDisplayRatioForFullHdr());
        xd10Var.m90402e(m25770a(i, "uDisplayRatioSdr"), gainmap.getMinDisplayRatioForHdrTransition());
        mjx0.m62033k();
    }

    /* JADX INFO: renamed from: N */
    public static void m25764N(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(h6f.m46715L(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(bk5.m29624m1(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    /* JADX INFO: renamed from: O */
    public static void m25765O(MediaRouter2 mediaRouter2, RouteListingPreference routeListingPreference) {
        mediaRouter2.setRouteListingPreference(routeListingPreference);
    }

    /* JADX INFO: renamed from: P */
    public static final void m25766P(gl8 gl8Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            gl8Var.m45101p(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m25767Q(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }

    /* JADX INFO: renamed from: R */
    public static RouteListingPreference m25768R(bnx0 bnx0Var) {
        ArrayList arrayList = new ArrayList();
        for (anx0 anx0Var : bnx0Var.f28935a) {
            arrayList.add(new RouteListingPreference.Item.Builder(anx0Var.f17514a).setFlags(anx0Var.f17516c).setSubText(anx0Var.f17517d).setCustomSubtextMessage(anx0Var.f17518e).setSelectionBehavior(anx0Var.f17515b).build());
        }
        return new RouteListingPreference.Builder().setItems(arrayList).setLinkedItemComponentName(bnx0Var.f28937c).setUseSystemOrdering(bnx0Var.f28936b).build();
    }

    /* JADX INFO: renamed from: S */
    public static CronetException m25769S(Exception exc) {
        boolean zM49676c = i4l.m49676c(exc);
        if (!zM49676c) {
            throw new IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (px3.m71354k(exc)) {
            return new gn4((QuicException) exc);
        }
        if (exc instanceof NetworkException) {
            return new oi4((NetworkException) exc, false);
        }
        if (exc instanceof CallbackException) {
            CallbackException callbackException = (CallbackException) exc;
            return new gy3(callbackException.getMessage(), callbackException.getCause());
        }
        if (!zM49676c) {
            throw new UnsupportedOperationException("Checked exception translation discrepancy", exc);
        }
        HttpException httpException = (HttpException) exc;
        return new o94(httpException.getMessage(), httpException);
    }

    /* JADX INFO: renamed from: a */
    public static String m25770a(int i, String str) {
        if (i == -1) {
            return str;
        }
        return str + i;
    }

    /* JADX INFO: renamed from: b */
    public static final void m25771b(CursorAnchorInfo.Builder builder, db71 db71Var, tiv0 tiv0Var) {
        if (tiv0Var.m80938j()) {
            return;
        }
        z6i0 z6i0Var = db71Var.f47231b;
        int i = z6i0Var.f279922f - 1;
        if (i < 0) {
            i = 0;
        }
        int iM63437n = n0e1.m63437n(z6i0Var.m95498e(tiv0Var.f220752b), 0, i);
        int iM63437n2 = n0e1.m63437n(z6i0Var.m95498e(tiv0Var.f220754d), 0, i);
        if (iM63437n > iM63437n2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(db71Var.m35536g(iM63437n), z6i0Var.m95499f(iM63437n), db71Var.m35537h(iM63437n), z6i0Var.m95495b(iM63437n));
            if (iM63437n == iM63437n2) {
                return;
            } else {
                iM63437n++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m25772c(CursorAnchorInfo.Builder builder, db71 db71Var, tiv0 tiv0Var) {
        if (tiv0Var.m80938j()) {
            return;
        }
        z6i0 z6i0Var = db71Var.f47231b;
        int i = z6i0Var.f279922f - 1;
        if (i < 0) {
            i = 0;
        }
        int iM63437n = n0e1.m63437n(z6i0Var.m95498e(tiv0Var.f220752b), 0, i);
        int iM63437n2 = n0e1.m63437n(z6i0Var.m95498e(tiv0Var.f220754d), 0, i);
        if (iM63437n > iM63437n2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(db71Var.m35536g(iM63437n), z6i0Var.m95499f(iM63437n), db71Var.m35537h(iM63437n), z6i0Var.m95495b(iM63437n));
            if (iM63437n == iM63437n2) {
                return;
            } else {
                iM63437n++;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m25773d(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        return f == f2 && f2 == fArr[2];
    }

    /* JADX INFO: renamed from: e */
    public static void m25774e(MediaRoute2Info.Builder builder, tld0 tld0Var) {
        if (tld0Var.f221451a.getBoolean("isVisibilityPublic", true)) {
            builder.setVisibilityPublic();
        } else {
            builder.setVisibilityRestricted(tld0Var.m81044a());
        }
    }

    /* JADX INFO: renamed from: f */
    public static Context m25775f(Context context, int i) {
        return context.createDeviceContext(i);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m25776g(Gainmap gainmap, Gainmap gainmap2) {
        return gainmap.getGamma() == gainmap2.getGamma() && gainmap.getRatioMax() == gainmap2.getRatioMax() && gainmap.getRatioMin() == gainmap2.getRatioMin() && gainmap.getEpsilonHdr() == gainmap2.getEpsilonHdr() && gainmap.getEpsilonSdr() == gainmap2.getEpsilonSdr() && gainmap.getDisplayRatioForFullHdr() == gainmap2.getDisplayRatioForFullHdr() && gainmap.getMinDisplayRatioForHdrTransition() == gainmap2.getMinDisplayRatioForHdrTransition() && gainmap.getGainmapContents() == gainmap2.getGainmapContents() && gainmap.getGainmapContents().getGenerationId() == gainmap2.getGainmapContents().getGenerationId();
    }

    /* JADX INFO: renamed from: h */
    public static Object m25777h(otl otlVar, Class cls) throws Exception {
        try {
            return otlVar.run();
        } catch (Exception e) {
            boolean z = e instanceof InlineExecutionProhibitedException;
            if (!z) {
                if (i4l.m49676c(e)) {
                    throw m25769S(e);
                }
                if (cls.isInstance(e)) {
                    throw e;
                }
                throw e;
            }
            if (!z) {
                throw new IllegalArgumentException("Not an Android Cronet exception", e);
            }
            if (!z) {
                throw new UnsupportedOperationException("Unchecked exception translation discrepancy", e);
            }
            org.chromium.net.InlineExecutionProhibitedException inlineExecutionProhibitedException = new org.chromium.net.InlineExecutionProhibitedException();
            inlineExecutionProhibitedException.initCause(e);
            throw inlineExecutionProhibitedException;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m25778i(w591 w591Var, HandwritingGesture handwritingGesture) {
        l971 l971Var = w591Var.f248034a;
        uw40 uw40Var = w591Var.f248035b;
        l971Var.f131023b.m80094c().m31891n();
        t571 t571Var = l971Var.f131023b;
        t571Var.f217239h = null;
        w591Var.m87243q(t571Var);
        l971.m58497a(l971Var, uw40Var, true, 1);
        l971Var.m58502f(true);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        w591.m87227l(w591Var, fallbackText, false, 12);
        return 5;
    }

    /* JADX INFO: renamed from: j */
    public static int m25779j(HandwritingGesture handwritingGesture, rv70 rv70Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        rv70Var.invoke(new knf(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: k */
    public static JobScheduler m25780k(JobScheduler jobScheduler) {
        return jobScheduler.forNamespace("androidx.work.systemjobscheduler");
    }

    /* JADX INFO: renamed from: l */
    public static AccessibilityNodeInfo.AccessibilityAction m25781l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX INFO: renamed from: m */
    public static float m25782m(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    /* JADX INFO: renamed from: n */
    public static void m25783n(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m25784o(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* JADX INFO: renamed from: p */
    public static Set m25785p(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    /* JADX INFO: renamed from: q */
    public static int m25786q(Context context) {
        return context.getDeviceId();
    }

    /* JADX INFO: renamed from: r */
    public static int m25787r(Context context) {
        return context.getDeviceId();
    }

    /* JADX INFO: renamed from: s */
    public static int[] m25788s(bb71 bb71Var, RectF rectF, int i, final nk4 nk4Var) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = new c45(new uj81(27, bb71Var.f25459f.getText(), bb71Var.m28625j()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(bb71Var.f25459f.getText(), bb71Var.f25454a);
        }
        return bb71Var.f25459f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: p.aa4
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) nk4Var.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static float m25789t(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    /* JADX INFO: renamed from: u */
    public static float m25790u(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    /* JADX INFO: renamed from: v */
    public static int m25791v(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    /* JADX INFO: renamed from: w */
    public static int m25792w(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    /* JADX INFO: renamed from: x */
    public static int m25793x(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    /* JADX INFO: renamed from: y */
    public static void m25794y(w591 w591Var, long j, int i) {
        if (ic71.m50236d(j)) {
            l971 l971Var = w591Var.f248034a;
            uw40 uw40Var = w591Var.f248035b;
            l971Var.f131023b.m80094c().m31891n();
            t571 t571Var = l971Var.f131023b;
            t571Var.f217239h = null;
            w591Var.m87243q(t571Var);
            l971.m58497a(l971Var, uw40Var, true, 1);
            l971Var.m58502f(true);
            return;
        }
        long jM87237i = w591Var.m87237i(j);
        l971 l971Var2 = w591Var.f248034a;
        uw40 uw40Var2 = w591Var.f248035b;
        l971Var2.f131023b.m80094c().m31891n();
        t571 t571Var2 = l971Var2.f131023b;
        int i2 = (int) (jM87237i >> 32);
        int i3 = (int) (jM87237i & 4294967295L);
        z2n0 z2n0Var = t571Var2.f217234c;
        if (i2 >= i3) {
            throw new IllegalArgumentException(s571.m77247f(i2, "Do not set reversed or empty range: ", i3, " > "));
        }
        t571Var2.f217239h = new pqm0(new ba71(i), new ic71(dvg1.m37112n(n0e1.m63437n(i2, 0, z2n0Var.length()), n0e1.m63437n(i3, 0, z2n0Var.length()))));
        l971.m58497a(l971Var2, uw40Var2, true, 1);
        l971Var2.m58502f(true);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m25795z(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }
}
