package p204p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Parcel;
import com.spotify.base.java.logging.Logger;
import com.spotify.destination.SectionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class hp3 implements hlc, x5q0, vd50, zd10, fum0, pqa0, InterfaceC2207oa, iuk {

    /* JADX INFO: renamed from: a */
    public static hp3 f93690a;

    public /* synthetic */ hp3() {
    }

    /* JADX INFO: renamed from: b */
    public static final String m48108b() {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(gn80.SIGNUP_EMAIL);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: c */
    public static final String m48109c() {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(gn80.LOGIN_FACEBOOK);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: d */
    public static final String m48110d() {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(gn80.LOGIN_GOOGLE);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: f */
    public static final String m48111f() {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(gn80.LOGIN_LOGIN_INTENT);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: g */
    public static final String m48112g() {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(gn80.LOGIN_NAVER);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: h */
    public static final String m48113h() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return xgg1.m90606F1().f36166c;
    }

    /* JADX INFO: renamed from: i */
    public static final String m48114i() {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(gn80.LOGIN_PHONENUMBER);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: j */
    public static final String m48115j() {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(gn80.LOGIN_SIGNUP_INTENT);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: n */
    public static ood0 m48116n(Context context, PendingIntent pendingIntent) {
        jod0 lod0Var;
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver");
        if (pendingIntent != null) {
            return new ood0(context, "spotify-media-session", componentName, pendingIntent);
        }
        Logger.m3973i("MediaSession created without a media button receiver", new Object[0]);
        MediaSession mediaSession = new MediaSession(context, "spotify-media-session");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            lod0Var = new mod0(mediaSession);
        } else {
            lod0Var = i >= 28 ? new lod0(mediaSession) : new jod0(mediaSession);
        }
        return new ood0(context, lod0Var);
    }

    /* JADX INFO: renamed from: o */
    public static long m48117o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: p */
    public static hp3 m48118p() {
        if (f93690a == null) {
            f93690a = new hp3();
        }
        return f93690a;
    }

    /* JADX INFO: renamed from: r */
    public static jf11 m48119r(eua1 eua1Var) {
        Object next;
        Iterator it = eua1Var.f62933e.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                o340 o340Var = (o340) next;
                int i = o340Var.f161281c * o340Var.f161280b;
                do {
                    Object next2 = it.next();
                    o340 o340Var2 = (o340) next2;
                    int i2 = o340Var2.f161281c * o340Var2.f161280b;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        o340 o340Var3 = (o340) next;
        String str = o340Var3 != null ? o340Var3.f161279a : null;
        if (str == null) {
            str = "";
        }
        String str2 = eua1Var.f62929a;
        String str3 = eua1Var.f62930b;
        return new jf11(str, str2, str3 != null ? str3 : "");
    }

    @Override // p204p.x5q0
    /* JADX INFO: renamed from: a */
    public y5q0 mo41258a(String str) {
        return new puq(str);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return wj50.m88271j(((ihi) obj).f102294a, "spotify:list:offline-playable:all");
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        rlw rlwVar;
        if (i == 0) {
            rlwVar = rlw.VIDEO_CODEC_FAMILY_UNKNOWN;
        } else if (i == 1) {
            rlwVar = rlw.VIDEO_CODEC_FAMILY_H264;
        } else if (i != 2) {
            rlwVar = i != 3 ? null : rlw.VIDEO_CODEC_FAMILY_AV1;
        } else {
            rlwVar = rlw.VIDEO_CODEC_FAMILY_HEVC;
        }
        return rlwVar == null ? rlw.UNRECOGNIZED : rlwVar;
    }

    @Override // p204p.fum0
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        wh10 wh10Var = new wh10(parcel);
        wh10Var.f251225a = (iqk) parcel.readParcelable(classLoader);
        return wh10Var;
    }

    /* JADX INFO: renamed from: l */
    public xzk m48120l() {
        return new xzk(10);
    }

    /* JADX INFO: renamed from: m */
    public String m48121m(String str) {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74728W(str).m35694A();
        wj50.m88279p(strM35694A);
        return strM35694A;
    }

    @Override // p204p.fum0
    public Object[] newArray(int i) {
        return new wh10[i];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: q */
    public j6z0 m48122q(qu80 qu80Var, String str, wna wnaVar) {
        boolean z;
        ybv ybvVar = qu80Var.f192599e;
        String str2 = ybvVar.f271257b;
        String str3 = ybvVar.f271256a;
        Map map = ybvVar.f271272q;
        SectionInfo sectionInfo = (SectionInfo) geg1.m44489B(map, "section_type", o8z0.f162902h);
        if (sectionInfo != null) {
            k9z0 k9z0VarM9213n = sectionInfo.m9213n();
            List<nw80> list = qu80Var.f192598d;
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (nw80 nw80Var : list) {
                    String str4 = nw80Var.f159049c;
                    String str5 = (String) nw80Var.f159053g.get("target_uri");
                    if (str5 == null) {
                        str5 = nw80Var.f159049c;
                    }
                    arrayList.add(new dr50(str4, str5));
                }
                switch (k9z0VarM9213n.ordinal()) {
                    case 0:
                    case 7:
                        break;
                    case 1:
                        String str6 = ybvVar.f271256a;
                        List<q121> list2 = ybvVar.f271281z;
                        if (list2 == null || !list2.isEmpty()) {
                            for (q121 q121Var : list2) {
                                if (wj50.m88271j(q121Var.f184163a, "next-page") && q121Var.f184164b == 1) {
                                    z = true;
                                }
                            }
                            z = false;
                        } else {
                            z = false;
                        }
                        return new r5z0(str, str6, str2, arrayList, z);
                    case 2:
                        return wnaVar == wna.PAGE_TYPE_ALL_CATEGORIES ? new q5z0(str, str3, str2, arrayList) : new p5z0(str, str3, str2, arrayList);
                    case 3:
                        String str7 = ybvVar.f271256a;
                        String str8 = (String) map.get("decision_id");
                        if (str8 == null) {
                            str8 = "";
                        }
                        return new y5z0(str, str7, str2, str8, arrayList);
                    case 4:
                        return new s5z0(str, str3, str2, arrayList);
                    case 5:
                        dr50 dr50Var = (dr50) g6f.m43745s0(arrayList);
                        if (dr50Var != null) {
                            return new v5z0(str, dr50Var.f52169a, str2, dr50Var.f52170b);
                        }
                        break;
                    case 6:
                        dr50 dr50Var2 = (dr50) g6f.m43745s0(arrayList);
                        if (dr50Var2 != null) {
                            return new w5z0(str, str3, str2, dr50Var2.f52169a);
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }

    public hp3(ip3 ip3Var) {
    }

    public hp3(son sonVar, otn otnVar) {
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: e */
    public void mo37400e(String str, String str2) {
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: k */
    public void mo37402k(String str, String str2, Throwable th) {
    }
}
