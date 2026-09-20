package p204p;

import android.content.Context;
import android.content.Intent;
import android.icu.text.CompactDecimalFormat;
import android.icu.text.NumberFormat;
import android.os.SystemClock;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import com.spotify.player.model.PlayerError;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class t36 implements hr61, Init, iuk, ceu, i5w0, vd50, Predicate, BiFunction, wre {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216710a;

    public /* synthetic */ t36(int i) {
        this.f216710a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final int m79965a(int i) {
        mec0 mec0Var = mec0.f142663L0;
        if (i < 1) {
            i = 1;
        }
        return Integer.highestOneBit(i * 3);
    }

    /* JADX INFO: renamed from: e */
    public static final int m79966e(int i) {
        mec0 mec0Var = mec0.f142663L0;
        return Integer.numberOfLeadingZeros(i) + 1;
    }

    /* JADX INFO: renamed from: g */
    public static String m79967g(StringBuilder sb) {
        int length = sb.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (sb.charAt(0) << 18) + ((length >= 2 ? sb.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb.charAt(3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & 255);
        char c2 = (char) ((iCharAt >> 8) & 255);
        char c3 = (char) (iCharAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c);
        if (length >= 2) {
            sb2.append(c2);
        }
        if (length >= 3) {
            sb2.append(c3);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m79968i(fg8 fg8Var) {
        int iOrdinal = fg8Var.ordinal();
        if (iOrdinal == 0) {
            return "immediate";
        }
        if (iOrdinal == 1) {
            return "close";
        }
        if (iOrdinal == 2) {
            return "far";
        }
        if (iOrdinal == 3) {
            return "unknown";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j */
    public static String m79969j(long j, Locale locale) {
        if (j <= 9999) {
            return NumberFormat.getInstance(locale).format(j);
        }
        CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(locale, CompactDecimalFormat.CompactStyle.SHORT);
        compactDecimalFormat.setMaximumFractionDigits(1);
        return compactDecimalFormat.format(j);
    }

    /* JADX INFO: renamed from: p */
    public static mec0 m79970p() {
        return mec0.f142663L0;
    }

    /* JADX INFO: renamed from: q */
    public static voc1 m79971q() {
        return NowPlayingActivity.f6264u1;
    }

    /* JADX INFO: renamed from: r */
    public static dj9 m79972r(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i) {
        String strM47424a;
        hg8 hg8Var;
        String string = UUID.randomUUID().toString();
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ig8 ig8Var = (ig8) it.next();
            String str = ig8Var.f101918a;
            String str2 = ig8Var.f101918a;
            yc8 yc8Var = (yc8) linkedHashMap.get(str);
            if (yc8Var == null || (hg8Var = yc8Var.f271426c) == null) {
                int i2 = ig8Var.f101920c;
                if (i2 == 1) {
                    strM47424a = "unknown";
                } else if (i2 == 2) {
                    strM47424a = "ios_like";
                } else {
                    if (i2 != 3) {
                        throw null;
                    }
                    strM47424a = "android_like";
                }
            } else {
                strM47424a = hg8Var.m47424a();
            }
            String str3 = strM47424a;
            int i3 = yc8Var != null ? yc8Var.f271425b.f79567a : ig8Var.f101919b;
            String strM79968i = m79968i(yc8Var != null ? yc8Var.f271425b.f79568b : ig8Var.f101921d);
            Integer num = ig8Var.f101922e;
            arrayList.add(new ej9(i3, num != null ? num.intValue() : 0, str2, str3, strM79968i, (String) linkedHashMap2.get(str2)));
        }
        return new dj9(i, string, arrayList);
    }

    /* JADX INFO: renamed from: s */
    public static Intent m79973s(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NowPlayingActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("EXTRA_SHARED_ELEMENT_TRANSITION", z);
        return intent;
    }

    /* JADX INFO: renamed from: u */
    public static Next m79975u(rty0 rty0Var) {
        return Next.m15605a(bk5.m29624m1(new w3z0[]{j3z0.f108528d, new k3z0(rty0Var.f202707a, rty0Var.f202708b, (sli0) q4y.f185365c, true)}));
    }

    /* JADX INFO: renamed from: v */
    public static jm9 m79976v(long j) {
        return new jm9(5, j);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        qu80 qu80Var = (qu80) obj;
        List list = (List) obj2;
        List list2 = qu80Var.f192605k;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list2) {
            if (hashSet.add(((dfv0) obj3).f48655a)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dfv0 dfv0Var = (dfv0) it.next();
            String str = dfv0Var.f48655a;
            String str2 = dfv0Var.f48656b;
            boolean z = dfv0Var.f48661g;
            boolean z2 = dfv0Var.f48662h;
            ehf1 ehf1Var = dfv0Var.f48666l;
            boolean z3 = dfv0Var.f48659e;
            boolean z4 = dfv0Var.f48660f;
            String str3 = dfv0Var.f48657c;
            boolean z5 = dfv0Var.f48663i;
            Iterator it2 = it;
            bb81 bb81Var = new bb81(dfv0Var.f48658d, 1);
            boolean z6 = dfv0Var.f48664j;
            ArrayList arrayList3 = dfv0Var.f48665k;
            ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(new cb81((String) it3.next()));
            }
            arrayList2.add(new q5a0(new nw80(str, str, str2, z, z2, ehf1Var, new ib81(bb81Var, arrayList4, z4, z6, hto0.f95099a, false, z3, z5, str3, 0), 39162)));
            it = it2;
        }
        return new yco(list, qu80Var, arrayList2);
    }

    @Override // p204p.i5w0
    /* JADX INFO: renamed from: b */
    public p5w0 mo39759b(h9x h9xVar) {
        if (h9xVar.equals(d9x.f46928a)) {
            return n5w0.f150633a;
        }
        if (h9xVar.equals(e9x.f57549a)) {
            return o5w0.f162141a;
        }
        return null;
    }

    @Override // p204p.hr61
    /* JADX INFO: renamed from: c */
    public gh00 mo33238c() {
        return z06.f277991b1;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        cwu0 cwu0Var;
        switch (this.f216710a) {
            case 12:
                iey ieyVarM50403a = iey.m50403a(i);
                return ieyVarM50403a == null ? iey.UNRECOGNIZED : ieyVarM50403a;
            default:
                switch (i) {
                    case 0:
                        cwu0Var = cwu0.REASON_UNSPECIFIED;
                        break;
                    case 1:
                        cwu0Var = cwu0.REASON_CONTENT_SHARING;
                        break;
                    case 2:
                        cwu0Var = cwu0.REASON_COLLABORATIVE_PLAYLISTS;
                        break;
                    case 3:
                        cwu0Var = cwu0.REASON_BLENDS;
                        break;
                    case 4:
                        cwu0Var = cwu0.REASON_GROUP_SESSIONS;
                        break;
                    case 5:
                        cwu0Var = cwu0.REASON_FAMILY;
                        break;
                    case 6:
                        cwu0Var = cwu0.REASON_FOLLOWING;
                        break;
                    case 7:
                        cwu0Var = cwu0.REASON_MESSAGING;
                        break;
                    case 8:
                        cwu0Var = cwu0.REASON_WRAPPED_PARTY;
                        break;
                    default:
                        cwu0Var = null;
                        break;
                }
                return cwu0Var == null ? cwu0.UNRECOGNIZED : cwu0Var;
        }
    }

    @Override // p204p.wre
    /* JADX INFO: renamed from: d */
    public long mo66379d() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: f */
    public ArrayList m79978f(List list) {
        fk30 fk30VarMo39249e;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                fk30 fk30VarMo39249e2 = (fk30) it.next();
                ArrayList arrayListM79978f = m79978f(fk30VarMo39249e2.children());
                if (arrayListM79978f != null) {
                    fk30VarMo39249e2 = fk30VarMo39249e2.toBuilder().mo39250f(arrayListM79978f).mo39249e();
                    z = true;
                }
                if (fk30VarMo39249e2 == null) {
                    fk30VarMo39249e = null;
                } else {
                    fk30VarMo39249e = wj50.m88271j(fk30VarMo39249e2.componentId().mo29575id(), "glue2:trackCloud") ? fk30VarMo39249e2.toBuilder().mo39251g("glue2:TrackCloudExperiment", xj30.ROW.f262032a).mo39249e() : fk30VarMo39249e2;
                }
                if (fk30VarMo39249e != null) {
                    fk30VarMo39249e2 = fk30VarMo39249e;
                    z = true;
                }
                arrayList.add(fk30VarMo39249e2);
            }
            if (z) {
                return arrayList;
            }
        }
        return null;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f216710a) {
            case 1:
                return First.m15574b((pe9) obj);
            case 23:
                gkl0 gkl0Var = (gkl0) obj;
                return First.m15575c(gkl0Var, Collections.singleton(new nhl0(gkl0Var.f80828a)));
            default:
                return loq0.m59581b((pp71) obj);
        }
    }

    /* JADX INFO: renamed from: k */
    public String m79979k() {
        return UUID.randomUUID().toString();
    }

    @Override // p204p.hr61
    /* JADX INFO: renamed from: m */
    public av91 mo33246m(qq61 qq61Var, pv91 pv91Var) {
        st91 st91VarMo24361d = pv91Var.mo24361d();
        Integer numValueOf = Integer.valueOf(qq61Var.f191499b);
        String str = qq61Var.f191498a;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-tab";
        yt91VarM50626j.f276052f = "2.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276049c = numValueOf;
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM50626j.m94607a(), st91VarMo24361d, System.currentTimeMillis());
    }

    @Override // p204p.hr61
    /* JADX INFO: renamed from: n */
    public boolean mo33247n() {
        return true;
    }

    @Override // p204p.ceu
    /* JADX INFO: renamed from: o */
    public void mo28685o(geu geuVar) {
        boolean z;
        String str = (String) geuVar.f79197d;
        StringBuilder sb = (StringBuilder) geuVar.f79199f;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            z = true;
            if (!geuVar.m44526d()) {
                break;
            }
            char cM44525c = geuVar.m44525c();
            if (cM44525c >= ' ' && cM44525c <= '?') {
                sb2.append(cM44525c);
            } else {
                if (cM44525c < '@' || cM44525c > '^') {
                    k2h1.m55182o(cM44525c);
                    throw null;
                }
                sb2.append((char) (cM44525c - '@'));
            }
            geuVar.f79194a++;
            if (sb2.length() >= 4) {
                sb.append(m79967g(sb2));
                sb2.delete(0, 4);
                if (k2h1.m55186s(geuVar.f79194a, 4, str) != 4) {
                    geuVar.f79195b = 0;
                    break;
                }
            }
        }
        sb2.append((char) 31);
        try {
            int length = sb2.length();
            if (length == 0) {
                geuVar.f79195b = 0;
                return;
            }
            if (length == 1) {
                geuVar.m44527e(sb.length());
                int length2 = ((mf61) geuVar.f79200g).f142970b - sb.length();
                int length3 = (str.length() - geuVar.f79196c) - geuVar.f79194a;
                if (length3 > length2) {
                    geuVar.m44527e(sb.length() + 1);
                    length2 = ((mf61) geuVar.f79200g).f142970b - sb.length();
                }
                if (length3 <= length2 && length2 <= 2) {
                    geuVar.f79195b = 0;
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String strM79967g = m79967g(sb2);
            if (geuVar.m44526d() || i > 2) {
                z = false;
            }
            if (i <= 2) {
                geuVar.m44527e(sb.length() + i);
                if (((mf61) geuVar.f79200g).f142970b - sb.length() >= 3) {
                    geuVar.m44527e(sb.length() + strM79967g.length());
                    z = false;
                }
            }
            if (z) {
                geuVar.f79200g = null;
                geuVar.f79194a -= i;
            } else {
                sb.append(strM79967g);
            }
            geuVar.f79195b = 0;
        } catch (Throwable th) {
            geuVar.f79195b = 0;
            throw th;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        String strTrackUri = ((PlayerError) obj).trackUri();
        ef41 ef41VarM64319a = nf41.m64319a(gn80.LIVE_ROOM);
        if (ef41VarM64319a != null) {
            return new uoc1(ef41VarM64319a.f58942d).m83613a(strTrackUri);
        }
        return false;
    }

    public String toString() {
        switch (this.f216710a) {
            case 27:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t36(Object obj, int i) {
        this.f216710a = i;
    }

    public /* synthetic */ t36(son sonVar, otn otnVar, int i) {
        this.f216710a = i;
    }

    public /* synthetic */ t36(boolean z, int i) {
        this.f216710a = i;
    }
}
