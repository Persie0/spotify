package p204p;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.SectionHeader;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentType;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItem;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItemsResponse;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.UserTimelineResponse;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.music.R;
import com.spotify.signup.signup.p150v2.proto.Error;
import io.reactivex.rxjava3.functions.Function;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class zz11 implements hab, Function, t6l0, t3b1, Init, dre0, k6z0 {

    /* JADX INFO: renamed from: A1 */
    public static final zz11 f287770A1;

    /* JADX INFO: renamed from: B1 */
    public static final zz11 f287771B1;

    /* JADX INFO: renamed from: C1 */
    public static final zz11 f287772C1;

    /* JADX INFO: renamed from: D1 */
    public static final zz11 f287773D1;

    /* JADX INFO: renamed from: E1 */
    public static final zz11 f287774E1;

    /* JADX INFO: renamed from: F1 */
    public static final zz11 f287775F1;

    /* JADX INFO: renamed from: G1 */
    public static final zz11 f287776G1;

    /* JADX INFO: renamed from: H1 */
    public static final zz11 f287777H1;

    /* JADX INFO: renamed from: I1 */
    public static final zz11 f287778I1;

    /* JADX INFO: renamed from: J1 */
    public static final zz11 f287779J1;

    /* JADX INFO: renamed from: K1 */
    public static final zz11 f287780K1;

    /* JADX INFO: renamed from: L0 */
    public static final zz11 f287781L0;

    /* JADX INFO: renamed from: L1 */
    public static final zz11 f287782L1;

    /* JADX INFO: renamed from: M0 */
    public static final zz11 f287783M0;

    /* JADX INFO: renamed from: M1 */
    public static final zz11 f287784M1;

    /* JADX INFO: renamed from: N0 */
    public static final zz11 f287785N0;

    /* JADX INFO: renamed from: N1 */
    public static final zz11 f287786N1;

    /* JADX INFO: renamed from: O0 */
    public static final zz11 f287787O0;

    /* JADX INFO: renamed from: O1 */
    public static final zz11 f287788O1;

    /* JADX INFO: renamed from: P0 */
    public static final zz11 f287789P0;

    /* JADX INFO: renamed from: P1 */
    public static final zz11 f287790P1;

    /* JADX INFO: renamed from: Q0 */
    public static final zz11 f287791Q0;

    /* JADX INFO: renamed from: Q1 */
    public static final zz11 f287792Q1;

    /* JADX INFO: renamed from: R0 */
    public static final zz11 f287793R0;

    /* JADX INFO: renamed from: R1 */
    public static final zz11 f287794R1;

    /* JADX INFO: renamed from: S0 */
    public static final zz11 f287795S0;

    /* JADX INFO: renamed from: S1 */
    public static final zz11 f287796S1;

    /* JADX INFO: renamed from: T0 */
    public static final zz11 f287797T0;

    /* JADX INFO: renamed from: T1 */
    public static final zz11 f287798T1;

    /* JADX INFO: renamed from: U0 */
    public static final zz11 f287799U0;

    /* JADX INFO: renamed from: U1 */
    public static final zz11 f287800U1;

    /* JADX INFO: renamed from: V0 */
    public static final zz11 f287801V0;

    /* JADX INFO: renamed from: V1 */
    public static final zz11 f287802V1;

    /* JADX INFO: renamed from: W0 */
    public static final zz11 f287803W0;

    /* JADX INFO: renamed from: W1 */
    public static final zz11 f287804W1;

    /* JADX INFO: renamed from: X */
    public static final zz11 f287805X;

    /* JADX INFO: renamed from: X0 */
    public static final zz11 f287806X0;

    /* JADX INFO: renamed from: X1 */
    public static final zz11 f287807X1;

    /* JADX INFO: renamed from: Y */
    public static final zz11 f287808Y;

    /* JADX INFO: renamed from: Y0 */
    public static final zz11 f287809Y0;

    /* JADX INFO: renamed from: Y1 */
    public static final zz11 f287810Y1;

    /* JADX INFO: renamed from: Z */
    public static final zz11 f287811Z;

    /* JADX INFO: renamed from: Z0 */
    public static final zz11 f287812Z0;

    /* JADX INFO: renamed from: Z1 */
    public static final zz11 f287813Z1;

    /* JADX INFO: renamed from: a1 */
    public static final zz11 f287814a1;

    /* JADX INFO: renamed from: a2 */
    public static final zz11 f287815a2;

    /* JADX INFO: renamed from: b1 */
    public static final zz11 f287816b1;

    /* JADX INFO: renamed from: c1 */
    public static final zz11 f287819c1;

    /* JADX INFO: renamed from: c2 */
    public static final zz11 f287820c2;

    /* JADX INFO: renamed from: d */
    public static final zz11 f287821d;

    /* JADX INFO: renamed from: d1 */
    public static final zz11 f287822d1;

    /* JADX INFO: renamed from: d2 */
    public static final zz11 f287823d2;

    /* JADX INFO: renamed from: e */
    public static final zz11 f287824e;

    /* JADX INFO: renamed from: e1 */
    public static final zz11 f287825e1;

    /* JADX INFO: renamed from: e2 */
    public static final zz11 f287826e2;

    /* JADX INFO: renamed from: f */
    public static final zz11 f287827f;

    /* JADX INFO: renamed from: f1 */
    public static final zz11 f287828f1;

    /* JADX INFO: renamed from: f2 */
    public static final zz11 f287829f2;

    /* JADX INFO: renamed from: g */
    public static final zz11 f287830g;

    /* JADX INFO: renamed from: g1 */
    public static final zz11 f287831g1;

    /* JADX INFO: renamed from: g2 */
    public static final zz11 f287832g2;

    /* JADX INFO: renamed from: h */
    public static final zz11 f287833h;

    /* JADX INFO: renamed from: h1 */
    public static final zz11 f287834h1;

    /* JADX INFO: renamed from: h2 */
    public static final zz11 f287835h2;

    /* JADX INFO: renamed from: i */
    public static final zz11 f287836i;

    /* JADX INFO: renamed from: i1 */
    public static final zz11 f287837i1;

    /* JADX INFO: renamed from: i2 */
    public static final zz11 f287838i2;

    /* JADX INFO: renamed from: j1 */
    public static final zz11 f287839j1;

    /* JADX INFO: renamed from: j2 */
    public static final zz11 f287840j2;

    /* JADX INFO: renamed from: k1 */
    public static final zz11 f287841k1;

    /* JADX INFO: renamed from: k2 */
    public static final zz11 f287842k2;

    /* JADX INFO: renamed from: l1 */
    public static final zz11 f287843l1;

    /* JADX INFO: renamed from: l2 */
    public static final zz11 f287844l2;

    /* JADX INFO: renamed from: m1 */
    public static final zz11 f287845m1;

    /* JADX INFO: renamed from: n1 */
    public static final zz11 f287846n1;

    /* JADX INFO: renamed from: o1 */
    public static final zz11 f287847o1;

    /* JADX INFO: renamed from: p1 */
    public static final zz11 f287848p1;

    /* JADX INFO: renamed from: q1 */
    public static final zz11 f287849q1;

    /* JADX INFO: renamed from: r1 */
    public static final zz11 f287850r1;

    /* JADX INFO: renamed from: s1 */
    public static final zz11 f287851s1;

    /* JADX INFO: renamed from: t */
    public static final zz11 f287852t;

    /* JADX INFO: renamed from: t1 */
    public static final zz11 f287853t1;

    /* JADX INFO: renamed from: u1 */
    public static final zz11 f287854u1;

    /* JADX INFO: renamed from: v1 */
    public static final zz11 f287855v1;

    /* JADX INFO: renamed from: w1 */
    public static final zz11 f287856w1;

    /* JADX INFO: renamed from: x1 */
    public static final zz11 f287857x1;

    /* JADX INFO: renamed from: y1 */
    public static final zz11 f287858y1;

    /* JADX INFO: renamed from: z1 */
    public static final zz11 f287859z1;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f287860a;

    /* JADX INFO: renamed from: b */
    public int f287861b;

    /* JADX INFO: renamed from: c */
    public static final String[] f287818c = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* JADX INFO: renamed from: b2 */
    public static final zz11 f287817b2 = new zz11(143, 1);

    static {
        int i = 1;
        f287821d = new zz11(0, i);
        f287824e = new zz11(8, i);
        f287827f = new zz11(9, i);
        f287830g = new zz11(11, i);
        f287833h = new zz11(12, i);
        f287836i = new zz11(13, i);
        f287852t = new zz11(14, i);
        f287805X = new zz11(15, i);
        f287808Y = new zz11(17, i);
        f287811Z = new zz11(20, i);
        f287781L0 = new zz11(42, i);
        f287783M0 = new zz11(43, i);
        f287785N0 = new zz11(45, i);
        f287787O0 = new zz11(47, i);
        f287789P0 = new zz11(48, i);
        f287791Q0 = new zz11(54, i);
        f287793R0 = new zz11(61, i);
        f287795S0 = new zz11(67, i);
        f287797T0 = new zz11(64, i);
        f287799U0 = new zz11(66, i);
        f287801V0 = new zz11(68, i);
        f287803W0 = new zz11(74, i);
        f287806X0 = new zz11(75, i);
        f287809Y0 = new zz11(79, i);
        f287812Z0 = new zz11(81, i);
        f287814a1 = new zz11(82, i);
        f287816b1 = new zz11(83, i);
        f287819c1 = new zz11(84, i);
        f287822d1 = new zz11(85, i);
        int i2 = 142;
        f287825e1 = new zz11(i2, 1);
        int i3 = 1;
        f287828f1 = new zz11(87, i3);
        f287831g1 = new zz11(88, i3);
        f287834h1 = new zz11(89, i3);
        f287837i1 = new zz11(90, i3);
        f287839j1 = new zz11(91, i3);
        f287841k1 = new zz11(93, i3);
        f287843l1 = new zz11(95, i3);
        f287845m1 = new zz11(96, i3);
        f287846n1 = new zz11(97, i3);
        f287847o1 = new zz11(98, i3);
        f287848p1 = new zz11(99, i3);
        f287849q1 = new zz11(100, i3);
        f287850r1 = new zz11(101, i3);
        f287851s1 = new zz11(102, i3);
        f287853t1 = new zz11(103, i3);
        f287854u1 = new zz11(104, i3);
        f287855v1 = new zz11(105, i3);
        f287856w1 = new zz11(Error.INVALID_COUNTRY_FIELD_NUMBER, i3);
        f287857x1 = new zz11(Error.TOO_YOUNG_FIELD_NUMBER, i3);
        f287858y1 = new zz11(108, i3);
        f287859z1 = new zz11(109, i3);
        f287770A1 = new zz11(110, i3);
        f287771B1 = new zz11(ContentType.SHORT_FORM_ON_DEMAND, i3);
        f287772C1 = new zz11(ContentType.LONG_FORM_ON_DEMAND, i3);
        f287773D1 = new zz11(ContentType.LIVE, i3);
        f287774E1 = new zz11(114, i3);
        f287775F1 = new zz11(115, i3);
        f287776G1 = new zz11(116, i3);
        f287777H1 = new zz11(117, i3);
        f287778I1 = new zz11(118, i3);
        f287779J1 = new zz11(119, i3);
        f287780K1 = new zz11(120, i3);
        f287782L1 = new zz11(ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, i3);
        f287784M1 = new zz11(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, i3);
        f287786N1 = new zz11(ContentType.USER_GENERATED_LIVE, i3);
        f287788O1 = new zz11(126, i3);
        f287790P1 = new zz11(127, i3);
        f287792Q1 = new zz11(128, i3);
        f287794R1 = new zz11(132, i3);
        f287796S1 = new zz11(133, i3);
        f287798T1 = new zz11(134, i3);
        f287800U1 = new zz11(135, i3);
        f287802V1 = new zz11(136, i3);
        f287804W1 = new zz11(137, i3);
        f287807X1 = new zz11(138, i3);
        f287810Y1 = new zz11(139, i3);
        f287813Z1 = new zz11(140, i3);
        f287815a2 = new zz11(i2, 1);
        int i4 = 2;
        f287820c2 = new zz11(0, i4);
        f287823d2 = new zz11(1, i4);
        f287826e2 = new zz11(3, i4);
        f287829f2 = new zz11(4, i4);
        f287832g2 = new zz11(5, i4);
        f287835h2 = new zz11(6, i4);
        f287838i2 = new zz11(7, i4);
        f287840j2 = new zz11(9, i4);
        f287842k2 = new zz11(10, i4);
        f287844l2 = new zz11(11, i4);
    }

    public /* synthetic */ zz11(int i) {
        this.f287860a = i;
    }

    /* JADX INFO: renamed from: j */
    public static zkq m97250j(m0a0 m0a0Var, cl8 cl8Var) {
        IOException iOException = (IOException) cl8Var.f39207c;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return null;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).f973c;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (m0a0Var.f138611e) {
            if (m0a0Var.m60451a(2)) {
                return new zkq(2, 60000L);
            }
            if (m0a0Var.m60451a(1)) {
                return new zkq(1, 300000L);
            }
            return null;
        }
        if (m0a0Var.m60451a(1)) {
            return new zkq(1, 300000L);
        }
        if (m0a0Var.m60451a(2)) {
            return new zkq(2, 60000L);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static long m97251m(cl8 cl8Var) {
        for (Throwable cause = (IOException) cl8Var.f39207c; cause != null; cause = cause.getCause()) {
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException)) {
                return -9223372036854775807L;
            }
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f971a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((cl8Var.f39206b - 1) * 1000, CrashReportManager.TIME_WINDOW);
    }

    @Override // p204p.dre0
    /* JADX INFO: renamed from: a */
    public int mo30296a() {
        return this.f287861b;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f287860a) {
            case 4:
                j390 j390Var = (j390) obj;
                int i = this.f287861b;
                nq3 nq3Var = nq3.f157113f;
                if (j390Var.f108320c) {
                    return nq3Var;
                }
                if (j390Var.f108319b) {
                    return nq3.f157110c;
                }
                int i2 = j390Var.f108318a;
                if (i2 <= (-i)) {
                    return nq3Var;
                }
                return i2 >= i ? nq3.f157111d : nq3.f157112e;
            case 9:
                int i3 = this.f287861b;
                return new w4y(i3, i3);
            case 13:
                UserTimelineResponse userTimelineResponse = (UserTimelineResponse) obj;
                int i4 = this.f287861b;
                int iM11494n = userTimelineResponse.m11494n();
                int i5 = iM11494n == 0 ? -1 : jb20.f110631a[edb.m38547C(iM11494n)];
                if (i5 != 1) {
                    return i5 != 2 ? new qq71(i4, new IllegalArgumentException("Invalid timeline status")) : new oq71(userTimelineResponse.m11496p(), i4);
                }
                return new vq71(userTimelineResponse.m11495o());
            case 14:
                return new qq71(this.f287861b, (Throwable) obj);
            case 15:
                List itemsList = ((CollectionPlatformContextItemsResponse) obj).getItemsList();
                int i6 = this.f287861b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : itemsList) {
                    if (wj50.m88271j(((CollectionPlatformContextItem) obj2).m6868p(), f710.m40936d(i6))) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CollectionPlatformContextItem) it.next()).getUri());
                }
                return g6f.m43736n1(arrayList2);
            case 28:
                lcf lcfVar = (lcf) obj;
                return lcfVar instanceof hcf ? new npt0(((hcf) lcfVar).f89783a) : new opt0(this.f287861b);
            default:
                return new x5x0(this.f287861b, (Throwable) obj);
        }
    }

    @Override // p204p.dre0
    /* JADX INFO: renamed from: b */
    public int mo30297b() {
        return 0;
    }

    @Override // p204p.dre0
    /* JADX INFO: renamed from: d */
    public boolean mo30298d() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public zz11 m97252e() {
        return new zz11(this);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    @Override // p204p.t3b1
    /* JADX INFO: renamed from: f */
    public Object mo41272f(yl60 yl60Var, float f) {
        int i;
        int iArgb;
        float f2;
        int iArgb2;
        float f3;
        float fM38735e;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        boolean z = yl60Var.mo53768p() == 1;
        if (z) {
            yl60Var.mo53759a();
        }
        while (yl60Var.mo53763h()) {
            arrayList.add(Float.valueOf((float) yl60Var.mo53765k()));
        }
        int i4 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f287861b = 2;
        }
        if (z) {
            yl60Var.mo53761e();
        }
        if (this.f287861b == -1) {
            this.f287861b = arrayList.size() / 4;
        }
        int i5 = this.f287861b;
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = this.f287861b * 4;
            if (i6 >= i) {
                break;
            }
            int i9 = i6 / 4;
            double dFloatValue = ((Float) arrayList.get(i6)).floatValue();
            int i10 = i3;
            int i11 = i6 % 4;
            if (i11 != 0) {
                if (i11 == i2) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 2) {
                    i8 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 3) {
                    iArr[i9] = Color.argb(255, i7, i8, (int) (dFloatValue * 255.0d));
                }
            } else if (i9 > 0) {
                float f4 = (float) dFloatValue;
                if (fArr[i9 - 1] >= f4) {
                    fArr[i9] = f4 + 0.01f;
                } else {
                    fArr[i9] = (float) dFloatValue;
                }
            } else {
                fArr[i9] = (float) dFloatValue;
            }
            i6++;
            i3 = i10;
            i2 = 1;
        }
        int i12 = i3;
        lq10 lq10Var = new lq10(fArr, iArr);
        if (arrayList.size() <= i) {
            return lq10Var;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i13 = i12;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i13] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i13] = ((Float) arrayList.get(i)).floatValue();
                i13++;
            }
            i++;
        }
        float[] fArrCopyOf = lq10Var.f135927a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i14 = i12;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            while (i14 < length) {
                float f5 = i16 < fArrCopyOf.length ? fArrCopyOf[i16] : Float.NaN;
                float f6 = i17 < size ? fArr2[i17] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArr4[i14] = f5;
                    i16++;
                } else if (Float.isNaN(f5) || f6 < f5) {
                    fArr4[i14] = f6;
                    i17++;
                } else {
                    fArr4[i14] = f5;
                    i16++;
                    i17++;
                    i15++;
                }
                i14++;
            }
            fArrCopyOf = i15 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i15);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i18 = i12;
        while (i18 < length2) {
            float f7 = fArrCopyOf[i18];
            int iBinarySearch = Arrays.binarySearch(fArr, f7);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f7);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f8 = fArr3[iBinarySearch2];
                if (i5 < 2 || f7 == fArr[i12]) {
                    iArgb = iArr[i12];
                } else {
                    int i19 = 1;
                    while (true) {
                        if (i19 >= i5) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f2 = fArr[i19];
                        if (f2 >= f7 || i19 == i5 - 1) {
                            break;
                        }
                        i19++;
                    }
                    if (i19 != i5 - 1 || f7 < f2) {
                        int i20 = i19 - 1;
                        float f9 = fArr[i20];
                        int iM67198v = okg1.m67198v(iArr[i20], iArr[i19], (f7 - f9) / (f2 - f9));
                        iArgb = Color.argb((int) (f8 * 255.0f), Color.red(iM67198v), Color.green(iM67198v), Color.blue(iM67198v));
                    } else {
                        iArgb = Color.argb((int) (f8 * 255.0f), Color.red(iArr[i19]), Color.green(iArr[i19]), Color.blue(iArr[i19]));
                    }
                }
                iArr2[i18] = iArgb;
            } else {
                int i21 = iArr[iBinarySearch];
                if (size < i4 || f7 <= fArr2[i12]) {
                    iArgb2 = Color.argb((int) (fArr3[i12] * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                } else {
                    int i22 = 1;
                    while (true) {
                        if (i22 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f3 = fArr2[i22];
                        if (f3 >= f7 || i22 == size - 1) {
                            break;
                        }
                        i22++;
                    }
                    if (f3 <= f7) {
                        fM38735e = fArr3[i22];
                    } else {
                        int i23 = i22 - 1;
                        float f10 = fArr2[i23];
                        fM38735e = eff0.m38735e(fArr3[i23], fArr3[i22], (f7 - f10) / (f3 - f10));
                    }
                    iArgb2 = Color.argb((int) (fM38735e * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                }
                iArr2[i18] = iArgb2;
            }
            i18++;
            i4 = 2;
        }
        return new lq10(fArrCopyOf, iArr2);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        lu90 lu90Var = (lu90) obj;
        int i = this.f287861b;
        return First.m15575c(lu90Var, (i == 0 ? -1 : mx90.f147998a[edb.m38547C(i)]) == 1 ? Effects.m15571a(new vu90(lu90Var.f137038a.f287522a.f267260c, null)) : gbu.f78413a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, p.vh00] */
    @Override // p204p.k6z0
    /* JADX INFO: renamed from: g */
    public List mo33240g(kxb kxbVar, cjh cjhVar) {
        Object objM66838g;
        int i = cjhVar.f38584a;
        st91 st91Var = cjhVar.f38585b;
        eh00 eh00Var = cjhVar.f38587d;
        SectionHeader sectionHeader = cjhVar.f38588e;
        ?? r9 = cjhVar.f38586c;
        int i2 = this.f287861b;
        ycg0 ycg0Var = new ycg0(Integer.valueOf(i), kxbVar.getId(), kxbVar.getUri(), st91Var);
        int i3 = 3;
        String str = null;
        switch (kxbVar.mo51869x().ordinal()) {
            case 0:
            case 7:
                String title = kxbVar.getTitle();
                List items = kxbVar.getItems();
                ArrayList arrayList = new ArrayList(i6f.m49804T(items, 10));
                int i4 = 0;
                for (Object obj : items) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    fxb fxbVar = (fxb) obj;
                    arrayList.add(ehg1.m38972l(fxbVar.f74314a, fxbVar.f74315b, fxbVar.f74316c, new lxb(r9, fxbVar, i4, ycg0Var, 0)));
                    i4 = i5;
                }
                objM66838g = ofg1.m66838g(title, arrayList, i2, eh00Var, sectionHeader);
                break;
            case 1:
                String title2 = kxbVar.getTitle();
                List items2 = kxbVar.getItems();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(items2, 10));
                int i6 = 0;
                for (Object obj2 : items2) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        ?? r27 = str;
                        h6f.m46722S();
                        throw r27;
                    }
                    fxb fxbVar2 = (fxb) obj2;
                    arrayList2.add(ehg1.m38972l(fxbVar2.f74314a, fxbVar2.f74315b, fxbVar2.f74316c, new lxb(r9, fxbVar2, i6, ycg0Var, 1)));
                    str = str;
                    i6 = i7;
                }
                objM66838g = ofg1.m66838g(title2, arrayList2, 2, eh00Var, sectionHeader);
                break;
            case 2:
                String title3 = kxbVar.getTitle();
                String str2 = (title3 == null || title3.length() == 0) ? null : title3;
                List items3 = kxbVar.getItems();
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(items3, 10));
                int i8 = 0;
                for (Object obj3 : items3) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    fxb fxbVar3 = (fxb) obj3;
                    arrayList3.add(ehg1.m38976p(fxbVar3.f74314a, fxbVar3.f74315b, fxbVar3.f74316c, null, Boolean.valueOf(fxbVar3.f74317d instanceof y60), zqg1.m96738m(fxbVar3.f74319f), false, false, new nxb(r9, fxbVar3, i8, ycg0Var, 0), 824));
                    i8 = i9;
                }
                objM66838g = ofg1.m66841j(str2, arrayList3, null, eh00Var, sectionHeader, 4);
                break;
            case 3:
                List items4 = kxbVar.getItems();
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(items4, 10));
                int i10 = 0;
                for (Object obj4 : items4) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    fxb fxbVar4 = (fxb) obj4;
                    arrayList4.add(ehg1.m38976p(fxbVar4.f74314a, fxbVar4.f74315b, fxbVar4.f74316c, null, Boolean.valueOf(fxbVar4.f74317d instanceof y60), zqg1.m96738m(fxbVar4.f74319f), false, false, new nxb(r9, fxbVar4, i10, ycg0Var, 1), 824));
                    i10 = i11;
                }
                objM66838g = ofg1.m66841j(null, arrayList4, null, eh00Var, sectionHeader, 4);
                break;
            case 4:
                String title4 = kxbVar.getTitle();
                if (title4 == null) {
                    title4 = "";
                }
                objM66838g = ofg1.m66841j(null, Collections.singletonList(ehg1.m38976p(new f8b(title4), null, null, null, Boolean.valueOf(!kxbVar.getItems().isEmpty()), null, false, false, new z9b((Object) r9, kxbVar, ycg0Var, 1), 958)), null, eh00Var, sectionHeader, 4);
                break;
            case 5:
                List items5 = kxbVar.getItems();
                fxb fxbVar5 = (fxb) (items5.size() > 0 ? items5.get(0) : new fxb(null, null, new y6b(str, i3), null, null, null, ContentType.USER_GENERATED_LIVE));
                objM66838g = ofg1.m66841j(null, Collections.singletonList(ehg1.m38976p(fxbVar5.f74314a, fxbVar5.f74315b, fxbVar5.f74316c, null, Boolean.valueOf(fxbVar5.f74317d instanceof y60), zqg1.m96738m(fxbVar5.f74319f), false, false, new mxb(r9, fxbVar5, ycg0Var, 1), 824)), null, eh00Var, sectionHeader, 4);
                break;
            case 6:
                String title5 = kxbVar.getTitle();
                List items6 = kxbVar.getItems();
                fxb fxbVar6 = (fxb) (items6.size() > 0 ? items6.get(0) : new fxb(null, null, new y6b(str, i3), null, null, null, ContentType.USER_GENERATED_LIVE));
                objM66838g = ofg1.m66841j(title5, Collections.singletonList(ehg1.m38976p(fxbVar6.f74314a, fxbVar6.f74315b, fxbVar6.f74316c, null, Boolean.valueOf(fxbVar6.f74317d instanceof y60), zqg1.m96738m(fxbVar6.f74319f), false, false, new mxb(r9, fxbVar6, ycg0Var, 0), 824)), null, eh00Var, sectionHeader, 4);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Collections.singletonList(objM66838g);
    }

    /* JADX INFO: renamed from: h */
    public void m97253h(rb91 rb91Var) {
        View view = rb91Var.f197534b;
        HashMap map = rb91Var.f197533a;
        Integer numValueOf = (Integer) map.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        map.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + iRound;
        int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = iRound2;
        iArr[1] = (view.getHeight() / 2) + iRound2;
        map.put("android:visibilityPropagation:center", iArr);
    }

    /* JADX INFO: renamed from: i */
    public Integer m97254i(RecyclerView recyclerView) {
        View viewM1096H;
        AbstractC0110a layoutManager = recyclerView.getLayoutManager();
        int iM1097I = layoutManager != null ? layoutManager.m1097I() : 0;
        for (int i = 0; i < iM1097I; i++) {
            if (layoutManager != null && (viewM1096H = layoutManager.m1096H(i)) != null) {
                int iM1083V = AbstractC0110a.m1083V(viewM1096H);
                if (m97259q(viewM1096H, recyclerView)) {
                    return Integer.valueOf(iM1083V);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public int m97255k(int i) {
        int i2 = this.f287861b;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: l */
    public void mo25646l(x8b x8bVar, Throwable th) {
        String str;
        int i = this.f287861b;
        StringBuilder sb = new StringBuilder("Failed to dismiss ");
        if (i != 1) {
            str = i != 2 ? "null" : "PODCAST_ONBOARDING";
        } else {
            str = "AUDIOBOOKS_ONBOARDING";
        }
        sb.append(str);
        sb.append(" - ");
        sb.append(th);
        Logger.m3966b(sb.toString(), new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    /* JADX INFO: renamed from: n */
    public long m97256n(ViewGroup viewGroup, z691 z691Var, rb91 rb91Var, rb91 rb91Var2) {
        Rect rect;
        int i;
        int iCenterY;
        int iCenterX;
        int iAbs;
        int[] iArr;
        int[] iArr2;
        Integer num;
        rb91 rb91Var3 = rb91Var;
        if (rb91Var3 == null && rb91Var2 == null) {
            return 0L;
        }
        s800 s800Var = z691Var.f279791U0;
        if (s800Var != null) {
            switch (s800Var.f206506a) {
                case 0:
                    rect = s800Var.f206507b;
                    break;
                default:
                    rect = s800Var.f206507b;
                    if (rect.isEmpty()) {
                        rect = null;
                    }
                    break;
            }
        } else {
            rect = null;
        }
        int i2 = -1;
        if (rb91Var2 != null) {
            int iIntValue = 8;
            if (rb91Var3 != null && (num = (Integer) rb91Var3.f197533a.get("android:visibilityPropagation:visibility")) != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue == 0) {
                i = -1;
            } else {
                rb91Var3 = rb91Var2;
                i = 1;
            }
        } else {
            i = -1;
        }
        int i3 = (rb91Var3 == null || (iArr2 = (int[]) rb91Var3.f197533a.get("android:visibilityPropagation:center")) == null) ? -1 : iArr2[0];
        if (rb91Var3 != null && (iArr = (int[]) rb91Var3.f197533a.get("android:visibilityPropagation:center")) != null) {
            i2 = iArr[1];
        }
        int[] iArr3 = new int[2];
        viewGroup.getLocationOnScreen(iArr3);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr3[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr3[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rect != null) {
            iCenterX = rect.centerX();
            iCenterY = rect.centerY();
        } else {
            iCenterY = (iRound2 + height) / 2;
            iCenterX = (iRound + width) / 2;
        }
        int i4 = this.f287861b;
        if (i4 == 8388611) {
            if (viewGroup.getLayoutDirection() == 1) {
                i4 = 5;
            } else {
                i4 = 3;
            }
        } else if (i4 == 8388613) {
            if (viewGroup.getLayoutDirection() == 1) {
                i4 = 3;
            } else {
                i4 = 5;
            }
        }
        if (i4 == 3) {
            iAbs = Math.abs(iCenterY - i2) + (width - i3);
        } else if (i4 == 5) {
            iAbs = Math.abs(iCenterY - i2) + (i3 - iRound);
        } else if (i4 != 48) {
            iAbs = i4 != 80 ? 0 : Math.abs(iCenterX - i3) + (i2 - iRound2);
        } else {
            iAbs = Math.abs(iCenterX - i3) + (height - i2);
        }
        float f = iAbs;
        int i5 = this.f287861b;
        float width2 = f / ((i5 == 3 || i5 == 5 || i5 == 8388611 || i5 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long j = z691Var.f279801c;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i)) / 3.0f) * width2);
    }

    /* JADX INFO: renamed from: o */
    public Object m97257o(Object obj, qr60 qr60Var) {
        return ((mq6) obj).f146194a.get(this.f287861b);
    }

    /* JADX INFO: renamed from: p */
    public ArrayList m97258p(RecyclerView recyclerView) {
        View viewM1096H;
        AbstractC0110a layoutManager = recyclerView.getLayoutManager();
        int iM1097I = layoutManager != null ? layoutManager.m1097I() : 0;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iM1097I; i++) {
            if (layoutManager != null && (viewM1096H = layoutManager.m1096H(i)) != null) {
                int iM1083V = AbstractC0110a.m1083V(viewM1096H);
                if (m97259q(viewM1096H, recyclerView)) {
                    arrayList.add(Integer.valueOf(iM1083V));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public boolean m97259q(View view, RecyclerView recyclerView) {
        return view != null && uug1.m84015i(view, recyclerView) >= this.f287861b;
    }

    /* JADX INFO: renamed from: r */
    public void m97260r(int i) {
        this.f287861b = i;
    }

    /* JADX INFO: renamed from: s */
    public void m97261s(View view, float f) {
        float measuredWidth = 1.0f - (((this.f287861b * 2) / view.getMeasuredWidth()) * f);
        view.setScaleX(measuredWidth);
        view.setScaleY(measuredWidth);
        float fMax = Math.max(0.6f, 1.0f - (f * 0.4f));
        p4c p4cVar = (p4c) view.getTag(R.id.paste_carousel_animation_info);
        if (p4cVar == null) {
            view.setAlpha(fMax);
        } else {
            p4cVar.f173890a = fMax;
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        view.setMinimumHeight(this.f287861b + swd1Var.f214650a.mo51806g(1).f53849b);
        return swd1Var;
    }

    public /* synthetic */ zz11(int i, int i2) {
        this.f287860a = i2;
        this.f287861b = i;
    }

    public zz11(zz11 zz11Var) {
        this.f287860a = 27;
        this.f287861b = zz11Var.f287861b;
    }

    public zz11(Activity activity) {
        this.f287860a = 11;
        this.f287861b = vtg1.m86386m(activity, R.attr.baseBackgroundElevatedBase, activity.getColor(R.color.npv_bg_color));
    }

    public zz11(Context context) {
        this.f287860a = 7;
        this.f287861b = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
    }

    public zz11() {
        this.f287860a = 0;
        this.f287861b = 80;
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: c */
    public void mo25640c(x8b x8bVar, o2x0 o2x0Var) {
    }
}
