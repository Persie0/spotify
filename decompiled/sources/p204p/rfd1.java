package p204p;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.os.Bundle;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class rfd1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: L0 */
    public static final rfd1 f198593L0;

    /* JADX INFO: renamed from: M0 */
    public static final rfd1 f198594M0;

    /* JADX INFO: renamed from: N0 */
    public static final rfd1 f198595N0;

    /* JADX INFO: renamed from: O0 */
    public static final rfd1 f198596O0;

    /* JADX INFO: renamed from: P0 */
    public static final rfd1 f198597P0;

    /* JADX INFO: renamed from: Q0 */
    public static final rfd1 f198598Q0;

    /* JADX INFO: renamed from: R0 */
    public static final rfd1 f198599R0;

    /* JADX INFO: renamed from: S0 */
    public static final rfd1 f198600S0;

    /* JADX INFO: renamed from: T0 */
    public static final rfd1 f198601T0;

    /* JADX INFO: renamed from: U0 */
    public static final rfd1 f198602U0;

    /* JADX INFO: renamed from: V0 */
    public static final rfd1 f198603V0;

    /* JADX INFO: renamed from: W0 */
    public static final rfd1 f198604W0;

    /* JADX INFO: renamed from: X */
    public static final rfd1 f198605X;

    /* JADX INFO: renamed from: X0 */
    public static final rfd1 f198606X0;

    /* JADX INFO: renamed from: Y */
    public static final rfd1 f198607Y;

    /* JADX INFO: renamed from: Y0 */
    public static final rfd1 f198608Y0;

    /* JADX INFO: renamed from: Z */
    public static final rfd1 f198609Z;

    /* JADX INFO: renamed from: Z0 */
    public static final rfd1 f198610Z0;

    /* JADX INFO: renamed from: a1 */
    public static final rfd1 f198611a1;

    /* JADX INFO: renamed from: b */
    public static final rfd1 f198612b;

    /* JADX INFO: renamed from: b1 */
    public static final rfd1 f198613b1;

    /* JADX INFO: renamed from: c */
    public static final rfd1 f198614c;

    /* JADX INFO: renamed from: c1 */
    public static final rfd1 f198615c1;

    /* JADX INFO: renamed from: d */
    public static final rfd1 f198616d;

    /* JADX INFO: renamed from: e */
    public static final rfd1 f198617e;

    /* JADX INFO: renamed from: f */
    public static final rfd1 f198618f;

    /* JADX INFO: renamed from: g */
    public static final rfd1 f198619g;

    /* JADX INFO: renamed from: h */
    public static final rfd1 f198620h;

    /* JADX INFO: renamed from: i */
    public static final rfd1 f198621i;

    /* JADX INFO: renamed from: t */
    public static final rfd1 f198622t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198623a;

    static {
        int i = 0;
        f198612b = new rfd1(i, 0);
        f198614c = new rfd1(i, 1);
        f198616d = new rfd1(i, 2);
        f198617e = new rfd1(i, 3);
        f198618f = new rfd1(i, 4);
        f198619g = new rfd1(i, 5);
        f198620h = new rfd1(i, 6);
        f198621i = new rfd1(i, 7);
        f198622t = new rfd1(i, 8);
        f198605X = new rfd1(i, 9);
        f198607Y = new rfd1(i, 10);
        f198609Z = new rfd1(i, 11);
        f198593L0 = new rfd1(i, 12);
        f198594M0 = new rfd1(i, 13);
        f198595N0 = new rfd1(i, 14);
        f198596O0 = new rfd1(i, 15);
        f198597P0 = new rfd1(i, 16);
        f198598Q0 = new rfd1(i, 17);
        f198599R0 = new rfd1(i, 18);
        f198600S0 = new rfd1(i, 19);
        f198601T0 = new rfd1(i, 20);
        f198602U0 = new rfd1(i, 21);
        f198603V0 = new rfd1(i, 22);
        f198604W0 = new rfd1(i, 23);
        f198606X0 = new rfd1(i, 24);
        f198608Y0 = new rfd1(i, 25);
        f198610Z0 = new rfd1(i, 26);
        f198611a1 = new rfd1(i, 27);
        f198613b1 = new rfd1(i, 28);
        f198615c1 = new rfd1(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rfd1(int i, int i2) {
        super(i);
        this.f198623a = i2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        int i = this.f198623a;
        w2a1 w2a1Var = w2a1.f247311a;
        int i2 = 0;
        switch (i) {
            case 0:
            case 1:
                return w2a1Var;
            case 2:
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
                valueAnimatorOfFloat.setDuration(100L);
                return valueAnimatorOfFloat;
            case 3:
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                paint.setColor(-1);
                return paint;
            case 4:
                return w2a1Var;
            case 5:
                return new vzv("com.spotify.checkout.web.WebViewFragment.State", qmd1.values());
            case 6:
                return qmd1.f190203b;
            case 7:
                return new Bundle();
            case 8:
                return w2a1Var;
            case 9:
                return new mj5(w4r.f247873a, 0);
            case 10:
                return new mj5(ql51.f189738a, 0);
            case 11:
            case 12:
            case 13:
                return "";
            case 14:
                return new po31(5);
            case 15:
                return new vzv("com.spotify.fitness.workout.WorkoutProfileType", y3e1.values());
            case 16:
                top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
                bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
                bjp0VarM18365h0.m29502N();
                bjp0VarM18365h0.m29518d0();
                bjp0VarM18365h0.m29506R();
                bjp0VarM18365h0.m29495G();
                top0VarM18421v.m81215w((PlaylistDecorationPolicy) bjp0VarM18365h0.build());
                amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
                amp0VarM18396H.m26433D(true);
                amp0VarM18396H.m26440v();
                top0VarM18421v.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H.build());
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
                wj50.m88279p(playlistRequestDecorationPolicy);
                return new st80(playlistRequestDecorationPolicy, null, null, false, pt80.f181071a, a5u0.f12598a, null, 0, null, 462);
            case 17:
                jqv0 jqv0Var = qpv0.f191387a;
                return new qoy0("com.spotify.xrprojected.ui.navigation.XrDestination", jqv0Var.mo54112b(fge1.class), new up60[]{jqv0Var.mo54112b(dge1.class), jqv0Var.mo54112b(ege1.class)}, new rr60[]{new hmk0("LYRICS", dge1.INSTANCE, new Annotation[0]), new hmk0("NPV", ege1.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 18:
                return new hmk0("LYRICS", dge1.INSTANCE, new Annotation[0]);
            case 19:
                return new hmk0("NPV", ege1.INSTANCE, new Annotation[0]);
            case 20:
                return new SimpleDateFormat("yyyy", Locale.getDefault());
            case 21:
                ef41 ef41VarM64319a = nf41.m64319a(gn80.COLLECTION_YOUR_EPISODES_SETTINGS_AUTO_DOWNLOAD);
                return (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null || (str = (String) list.get(0)) == null) ? "" : str;
            case 22:
                ef41 ef41VarM64319a2 = nf41.m64319a(gn80.COLLECTION_YOUR_EPISODES_SETTINGS_REMOVE_PLAYED);
                return (ef41VarM64319a2 == null || (list2 = ef41VarM64319a2.f58941c) == null || (str2 = (String) list2.get(0)) == null) ? "" : str2;
            case 23:
                ef41 ef41VarM64319a3 = nf41.m64319a(gn80.COLLECTION_YOUR_EPISODES_SETTINGS_REMOVE_UNPLAYED);
                return (ef41VarM64319a3 == null || (list3 = ef41VarM64319a3.f58941c) == null || (str3 = (String) list3.get(0)) == null) ? "" : str3;
            case 24:
                List list4 = (List) hne1.f93317d.getValue();
                ArrayList arrayList = new ArrayList(i6f.m49804T(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((hne1) it.next()).f93326c);
                }
                return g6f.m43728j1(arrayList);
            case 25:
                hne1[] hne1VarArrValues = hne1.values();
                ArrayList arrayList2 = new ArrayList(hne1VarArrValues.length);
                int length = hne1VarArrValues.length;
                while (i2 < length) {
                    hne1 hne1Var = hne1VarArrValues[i2];
                    arrayList2.add(new pqm0(hne1Var.f93325b, hne1Var));
                    i2++;
                }
                return kkc0.m56705r0(arrayList2);
            case 26:
                hne1[] hne1VarArrValues2 = hne1.values();
                ArrayList arrayList3 = new ArrayList(hne1VarArrValues2.length);
                int length2 = hne1VarArrValues2.length;
                while (i2 < length2) {
                    hne1 hne1Var2 = hne1VarArrValues2[i2];
                    arrayList3.add(new pqm0(hne1Var2.f93326c, hne1Var2));
                    i2++;
                }
                return kkc0.m56705r0(arrayList3);
            case 27:
                hne1[] hne1VarArrValues3 = hne1.values();
                ArrayList arrayList4 = new ArrayList(hne1VarArrValues3.length);
                int length3 = hne1VarArrValues3.length;
                while (i2 < length3) {
                    hne1 hne1Var3 = hne1VarArrValues3[i2];
                    arrayList4.add(new pqm0(hne1Var3.f93326c.f121029c, hne1Var3));
                    i2++;
                }
                return kkc0.m56705r0(arrayList4);
            case 28:
                return g6f.m43728j1(bk5.m29605b1(jne1.values(), new fd11(23)));
            default:
                List list5 = (List) jne1.f114091d.getValue();
                ArrayList arrayList5 = new ArrayList(i6f.m49804T(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((jne1) it2.next()).f114100c);
                }
                return g6f.m43728j1(arrayList5);
        }
    }
}
