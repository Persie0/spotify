package p204p;

import android.content.Context;
import android.content.IntentFilter;
import android.util.LruCache;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hvg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f95714a;

    /* JADX INFO: renamed from: a */
    public static final void m48848a(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        eh00 eh00Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-461771184);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.listening_activity_carousel_add_friends, xq00Var);
            fyf fyfVar = b0g.f21911a;
            int i3 = ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 27654;
            cxh0 cxh0Var = cxh0.f43038a;
            eh00Var2 = eh00Var;
            xq00Var2 = xq00Var;
            s800.m77430d(fyfVar, eh00Var2, strM54977L, cxh0Var, 2, null, xq00Var2, i3, 32);
            fxh0Var = cxh0Var;
        } else {
            eh00Var2 = eh00Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(eh00Var2, fxh0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m48849b(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var, zxd1 zxd1Var, boolean z) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1798310074);
        int i2 = i | (xq00Var.m91770i(zxd1Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | 384 | (xq00Var.m91768h(z) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            kqi0 kqi0VarM57614i = kxf1.m57614i(new kmx(zxd1Var.f287292b, 22), Boolean.FALSE, null, xq00Var, 48, 14);
            String strM54977L = k0e1.m54977L(z ? R.string.queue_header_add_songs_button_label : R.string.title_session_modifier_group_matches, xq00Var);
            long j = leu.m58815a(xq00Var).f112824b.f138757a;
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new nf10(6, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var2 = (eh00) objM91750T;
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            peu peuVar = new peu(new t40(strM54977L), eh00Var2);
            boolean zBooleanValue = ((Boolean) kqi0VarM57614i.getValue()).booleanValue();
            fyf fyfVar = rkg.f200067a;
            cxh0 cxh0Var = cxh0.f43038a;
            qlg1.m73208m(strM54977L, j, peuVar, true, zBooleanValue, cxh0Var, false, null, fyfVar, xq00Var, 805506048, 448);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new k720(zxd1Var, eh00Var, fxh0Var2, z, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m48850c(ng70 ng70Var, mg70 mg70Var, kv91 kv91Var, xq00 xq00Var, int i) {
        Object ts40Var;
        kqi0 kqi0Var;
        yvg0 yvg0Var;
        xq00Var.m91775k0(-505270695);
        int i2 = i | (xq00Var.m91766g(ng70Var) ? 4 : 2) | (xq00Var.m91766g(mg70Var) ? 32 : 16) | (xq00Var.m91770i(kv91Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            oge0 oge0VarMo29871c = ((rmm0) xq00Var.m91774k(q6m0.f185862a)).mo29871c();
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var2 = (kqi0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = new yvg0();
                xq00Var.m91793t0(objM91750T2);
            }
            yvg0 yvg0Var2 = (yvg0) objM91750T2;
            List list = ng70Var.f153577a;
            String str = ng70Var.f153578b;
            boolean zM91770i = ((i2 & 14) == 4) | xq00Var.m91770i(kv91Var) | xq00Var.m91770i(yvg0Var2) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91770i(oge0VarMo29871c);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == ia7Var) {
                kqi0Var = kqi0Var2;
                yvg0Var = yvg0Var2;
                ts40Var = new ts40(kqi0Var, kv91Var, yvg0Var, ng70Var, mg70Var, oge0VarMo29871c, 3);
                oge0VarMo29871c = oge0VarMo29871c;
                xq00Var.m91793t0(ts40Var);
            } else {
                ts40Var = objM91750T3;
                kqi0Var = kqi0Var2;
                yvg0Var = yvg0Var2;
            }
            th00 th00Var = (th00) ts40Var;
            boolean zM91770i2 = xq00Var.m91770i(kv91Var) | xq00Var.m91770i(yvg0Var) | xq00Var.m91770i(oge0VarMo29871c);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T4 == ia7Var) {
                vvs vvsVar = new vvs(kqi0Var, kv91Var, yvg0Var, oge0VarMo29871c, 13);
                xq00Var.m91793t0(vvsVar);
                objM91750T4 = vvsVar;
            }
            fvg1.m42861d(0, str, list, (eh00) objM91750T4, th00Var, xq00Var, null);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wp50(ng70Var, mg70Var, kv91Var, i, 14);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m48851d(int i, List list, boolean z, List list2, int i2, boolean z2, wxd0 wxd0Var, boolean z3, LruCache lruCache, luk lukVar, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, eh00 eh00Var4, gh00 gh00Var, eh00 eh00Var5, gh00 gh00Var2, xq00 xq00Var, int i3) {
        boolean z4;
        boolean z5;
        xq00 xq00Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        xq00 xq00Var3 = xq00Var;
        xq00Var3.m91775k0(1891354828);
        int i8 = i3 | (xq00Var3.m91762e(edb.m38547C(i)) ? 4 : 2) | (xq00Var3.m91766g(list) ? 32 : 16) | (xq00Var3.m91768h(z) ? 256 : 128) | (xq00Var3.m91766g(list2) ? 2048 : 1024) | (xq00Var3.m91762e(i2) ? 16384 : 8192) | (xq00Var3.m91768h(z2) ? 131072 : 65536) | (xq00Var3.m91762e(wxd0Var.ordinal()) ? 1048576 : 524288) | (xq00Var3.m91768h(z3) ? 8388608 : 4194304) | (xq00Var3.m91770i(lruCache) ? 67108864 : 33554432) | (xq00Var3.m91770i(lukVar) ? 536870912 : 268435456);
        int i9 = 12582912 | (xq00Var3.m91770i(eh00Var) ? 4 : 2) | (xq00Var3.m91770i(eh00Var2) ? 32 : 16) | (xq00Var3.m91770i(eh00Var3) ? 256 : 128) | (xq00Var3.m91770i(eh00Var4) ? 2048 : 1024) | (xq00Var3.m91770i(gh00Var) ? 16384 : 8192) | (xq00Var3.m91770i(eh00Var5) ? 131072 : 65536) | (xq00Var3.m91770i(gh00Var2) ? 1048576 : 524288);
        if (xq00Var3.m91752Y(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 4793491) == 4793490) ? false : true)) {
            txu txuVar = leu.m58816b(xq00Var3).f117230b;
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61820d(1.0f, cxh0.f43038a), txuVar.f224763f, 0.0f, 2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var3, 0);
            int iHashCode = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m = xq00Var3.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var3, fxh0VarM96830A);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var3.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                xq00Var3.m91776l(c2087le);
            } else {
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var3);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var3);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var3);
            zsf1.m96833D(roh.f201266k, xq00Var3);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var3);
            if (z3) {
                xq00Var3.m91771i0(152697367);
                z4 = true;
                exg1.m40237f(wxd0Var, gh00Var2, zsf1.m96830A(new o630(d7f0.f46145P0), 0.0f, txuVar.f224761d, 1), xq00Var3, ((i8 >> 18) & 14) | ((i9 >> 15) & ContentType.LONG_FORM_ON_DEMAND));
                xq00Var3.m91788r(false);
            } else {
                z4 = true;
                xq00Var3.m91771i0(152921280);
                xq00Var3.m91788r(false);
            }
            if (i == 3) {
                xq00Var3.m91771i0(153015582);
                svg1.m79473i(k0e1.m54977L(R.string.media_picker_no_permission_title, xq00Var3), k0e1.m54977L(R.string.media_picker_no_permission_subtitle, xq00Var3), null, z2, eh00Var5, eh00Var, k0e1.m54977L(R.string.media_picker_allow_access_button, xq00Var3), xq00Var3, ((i8 >> 6) & 7168) | (57344 & (i9 >> 3)) | (458752 & (i9 << 15)), 4);
                xq00Var3 = xq00Var3;
                xq00Var3.m91788r(false);
            } else if (i == 4) {
                xq00Var3.m91771i0(153492610);
                svg1.m79473i(k0e1.m54977L(R.string.media_picker_no_permission_title, xq00Var3), k0e1.m54977L(R.string.media_picker_denied_subtitle, xq00Var3), null, z2, eh00Var5, eh00Var2, k0e1.m54977L(R.string.media_picker_go_to_settings_button, xq00Var3), xq00Var3, ((i8 >> 6) & 7168) | (57344 & (i9 >> 3)) | (458752 & (i9 << 12)), 4);
                xq00Var3 = xq00Var3;
                xq00Var3.m91788r(false);
            } else {
                if (i == 2 && list.isEmpty() && !z) {
                    xq00Var3.m91771i0(153999305);
                    svg1.m79473i(k0e1.m54977L(R.string.media_picker_partial_empty_title, xq00Var3), k0e1.m54977L(R.string.media_picker_partial_empty_subtitle, xq00Var3), null, z2, eh00Var5, eh00Var3, k0e1.m54977L(R.string.media_picker_manage_button, xq00Var3), xq00Var3, ((i8 >> 6) & 7168) | (57344 & (i9 >> 3)) | (458752 & (i9 << 9)), 4);
                    xq00Var3 = xq00Var3;
                    xq00Var3.m91788r(false);
                } else {
                    if (i == 2) {
                        xq00Var3.m91771i0(1667550857);
                        int i10 = (i8 >> 3) & 14;
                        int i11 = i8 >> 6;
                        int i12 = i8 >> 12;
                        int i13 = i10 | (i11 & ContentType.LONG_FORM_ON_DEMAND) | (i11 & 896) | (i11 & 7168) | (i12 & 57344) | (i12 & 458752);
                        int i14 = i9 << 9;
                        z5 = z4;
                        m48852e(list, list2, i2, z2, lruCache, lukVar, eh00Var4, gh00Var, eh00Var5, wxd0Var, eh00Var3, xq00Var3, i13 | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | ((i8 << 9) & 1879048192), (i9 >> 6) & 14, 0);
                        xq00Var2 = xq00Var3;
                        xq00Var2.m91788r(false);
                    } else {
                        z5 = z4;
                        xq00Var2 = xq00Var3;
                        if (!list.isEmpty() || z) {
                            xq00Var2.m91771i0(1667594204);
                            int i15 = i8 >> 6;
                            int i16 = ((i8 >> 3) & 14) | (i15 & ContentType.LONG_FORM_ON_DEMAND) | (i15 & 896) | (i15 & 7168);
                            int i17 = i8 >> 12;
                            int i18 = i16 | (57344 & i17) | (i17 & 458752);
                            int i19 = i9 << 9;
                            xq00Var3 = xq00Var2;
                            m48852e(list, list2, i2, z2, lruCache, lukVar, eh00Var4, gh00Var, eh00Var5, wxd0Var, null, xq00Var3, i18 | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | ((i8 << 9) & 1879048192), 0, 1024);
                            xq00Var3.m91788r(false);
                        } else {
                            xq00Var2.m91771i0(1667568142);
                            wxd0 wxd0Var2 = wxd0.VIDEO;
                            if (wxd0Var == wxd0Var2) {
                                i4 = 155079562;
                                i5 = R.string.media_picker_empty_videos_title;
                            } else {
                                i4 = 155170609;
                                i5 = R.string.media_picker_empty_title;
                            }
                            String strM12k = AbstractC0000a.m12k(xq00Var2, i4, i5, xq00Var2, false);
                            if (wxd0Var == wxd0Var2) {
                                i6 = 155323687;
                                i7 = R.string.media_picker_empty_videos_subtitle;
                            } else {
                                i6 = 155417710;
                                i7 = R.string.media_picker_empty_subtitle;
                            }
                            svg1.m79473i(strM12k, AbstractC0000a.m12k(xq00Var2, i6, i7, xq00Var2, false), null, z2, eh00Var5, null, null, xq00Var2, ((i8 >> 6) & 7168) | ((i9 >> 3) & 57344), 100);
                            xq00Var2.m91788r(false);
                        }
                    }
                    xq00Var3 = xq00Var2;
                }
                xq00Var3.m91788r(z5);
            }
            z5 = z4;
            xq00Var3.m91788r(z5);
        } else {
            xq00Var3.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var3.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jjd0(i, list, z, list2, i2, z2, wxd0Var, z3, lruCache, lukVar, eh00Var, eh00Var2, eh00Var3, eh00Var4, gh00Var, eh00Var5, gh00Var2, i3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m48852e(List list, List list2, int i, boolean z, LruCache lruCache, luk lukVar, eh00 eh00Var, gh00 gh00Var, eh00 eh00Var2, wxd0 wxd0Var, eh00 eh00Var3, xq00 xq00Var, int i2, int i3, int i4) {
        int i5;
        List list3;
        eh00 eh00Var4;
        int i6;
        eh00 eh00Var5;
        boolean z2;
        String strM12k;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(-1948341868);
        if ((i2 & 6) == 0) {
            i5 = (xq00Var2.m91766g(list) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            list3 = list2;
            i5 |= xq00Var2.m91766g(list3) ? 32 : 16;
        } else {
            list3 = list2;
        }
        if ((i2 & 384) == 0) {
            i5 |= xq00Var2.m91762e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= xq00Var2.m91768h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= xq00Var2.m91770i(lruCache) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= xq00Var2.m91770i(lukVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= xq00Var2.m91770i(eh00Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= xq00Var2.m91770i(gh00Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= xq00Var2.m91770i(eh00Var2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= xq00Var2.m91762e(wxd0Var.ordinal()) ? 536870912 : 268435456;
        }
        int i7 = i4 & 1024;
        if (i7 != 0) {
            eh00Var4 = eh00Var3;
            i6 = i3 | 6;
        } else {
            eh00Var4 = eh00Var3;
            if ((i3 & 6) == 0) {
                i6 = i3 | (xq00Var2.m91770i(eh00Var4) ? 4 : 2);
            } else {
                i6 = i3;
            }
        }
        if (xq00Var2.m91752Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            eh00 eh00Var6 = i7 != 0 ? null : eh00Var4;
            txu txuVar = leu.m58816b(xq00Var2).f117230b;
            kqi0 kqi0VarM77651H = sam.m77651H(eh00Var, xq00Var2);
            zs70 zs70VarM30459b = bt70.m30459b(xq00Var2);
            boolean z3 = list3.size() >= i;
            boolean zM91766g = xq00Var2.m91766g(zs70VarM30459b) | xq00Var2.m91766g(kqi0VarM77651H);
            Object objM91750T = xq00Var2.m91750T();
            if (zM91766g || objM91750T == ia7Var) {
                objM91750T = new sqc0(zs70VarM30459b, kqi0VarM77651H, (fbk) null, 4);
                xq00Var2.m91793t0(objM91750T);
            }
            hz40.m49237i(zs70VarM30459b, (th00) objM91750T, xq00Var2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            if (eh00Var6 != null) {
                xq00Var2.m91771i0(1952883453);
                e72.m38007h(wxd0Var, eh00Var6, null, xq00Var2, ((i5 >> 27) & 14) | ((i6 << 3) & ContentType.LONG_FORM_ON_DEMAND));
                z2 = false;
                xq00Var2.m91788r(false);
            } else {
                z2 = false;
                xq00Var2.m91771i0(1952982436);
                xq00Var2.m91788r(false);
            }
            if (wxd0Var == wxd0.VIDEO) {
                xq00Var2.m91771i0(1953064958);
                strM12k = k0e1.m54971F(R.plurals.media_picker_helper_text_videos, i, new Object[]{Integer.valueOf(i)}, xq00Var2);
                xq00Var2.m91788r(z2);
            } else {
                strM12k = AbstractC0000a.m12k(xq00Var2, 1953232637, R.string.media_picker_helper_text, xq00Var2, z2);
            }
            if71 if71Var = leu.m58818d(xq00Var2).f64974j;
            long j = leu.m58815a(xq00Var2).f112824b.f138758b;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            float f = txuVar.f224761d;
            float f2 = txuVar.f224758a;
            eh00 eh00Var7 = eh00Var6;
            boolean z4 = z3;
            int i8 = i5;
            ahf1.m25932d(strM12k, zsf1.m96830A(fxh0VarM61822f, 0.0f, f, 1), if71Var, j, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            xq00Var2 = xq00Var;
            hz10 hz10Var = new hz10(4);
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
            bns bnsVar = yaa0.f270858a;
            fxh0 fxh0VarM48273f = hqg1.m48273f(fxh0VarM61820d, zg70.f282511L0);
            WeakHashMap weakHashMap = cxd1.f42984x;
            j4m0 j4m0VarM96850j = zsf1.m96850j(0.0f, 0.0f, 0.0f, rfg1.m75451u(bxd1.m30815d(xq00Var2).f42989e, xq00Var2).mo29185a(), 7);
            xi5 xi5VarM29370g = bj5.m29370g(f2);
            xi5 xi5VarM29370g2 = bj5.m29370g(f2);
            boolean zM91770i = ((i8 & 14) == 4) | ((i8 & 7168) == 2048) | ((234881024 & i8) == 67108864) | ((i8 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var2.m91770i(lruCache) | xq00Var2.m91770i(lukVar) | xq00Var2.m91768h(z4) | ((i8 & 29360128) == 8388608);
            Object objM91750T2 = xq00Var2.m91750T();
            if (zM91770i || objM91750T2 == ia7Var) {
                q5s q5sVar = new q5s(z, list, eh00Var2, list2, lruCache, lukVar, z4, gh00Var);
                xq00Var2.m91793t0(q5sVar);
                objM91750T2 = q5sVar;
            }
            iyg1.m51919f(hz10Var, fxh0VarM48273f, zs70VarM30459b, j4m0VarM96850j, xi5VarM29370g2, xi5VarM29370g, null, false, null, (gh00) objM91750T2, xq00Var2, 0, 912);
            xq00Var2.m91788r(true);
            eh00Var5 = eh00Var7;
        } else {
            xq00Var2.m91757b0();
            eh00Var5 = eh00Var4;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new g0v(list, list2, i, z, lruCache, lukVar, eh00Var, gh00Var, eh00Var2, wxd0Var, eh00Var5, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m48853f(String str, String str2, akk akkVar, List list, zee0 zee0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1090987314);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(str2) ? 32 : 16) | (xq00Var.m91766g(akkVar) ? 256 : 128) | (xq00Var.m91766g(list) ? 2048 : 1024) | (xq00Var.m91770i(zee0Var) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            dgu.m35938b(eh00Var, null, null, false, false, 0.0f, false, null, false, false, null, rkk.m75772x(-1936069457, new h81(list, zee0Var, str, str2, akkVar, 27), xq00Var), xq00Var, ((i2 >> 15) & 14) | 24576, 48, 2030);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ts40(str, str2, akkVar, list, zee0Var, eh00Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m48854g(sne0 sne0Var, vne0 vne0Var, xq00 xq00Var, int i) {
        sne0 sne0Var2;
        vne0 vne0Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(1784292592);
        int i2 = (xq00Var.m91766g(sne0Var) ? 4 : 2) | i | (xq00Var.m91770i(vne0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            sne0Var2 = sne0Var;
            vne0Var2 = vne0Var;
            xq00Var2 = xq00Var;
            mif1.m61869b(vne0Var2, sne0Var2, null, null, xq00Var2, ((i2 >> 3) & 14) | ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND), 12);
        } else {
            sne0Var2 = sne0Var;
            vne0Var2 = vne0Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wwh0(sne0Var2, vne0Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final hjl m48855h(fju fjuVar, xre xreVar, y64 y64Var, agc agcVar) {
        return new hjl(hxg1.m49007t(w0v0.f246867b, new ctn0(xreVar, 23), new b6u0(15, fjuVar, y64Var)), new at5(y64Var, 2), agcVar);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m48856i(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: j */
    public static void m48857j(Context context) {
        if (o4a.m66236a() != null) {
            o4a.m66236a();
            return;
        }
        o4a o4aVar = new o4a(context);
        Set set = p2l.f173365a;
        if (!set.contains(o4a.class)) {
            try {
                if (!set.contains(o4aVar)) {
                    try {
                        aba0.m25342a((Context) o4aVar.f161600b).m25343b(o4aVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th) {
                        p2l.m68953a(o4aVar, th);
                    }
                }
            } catch (Throwable th2) {
                p2l.m68953a(o4a.class, th2);
            }
        }
        if (!p2l.f173365a.contains(o4a.class)) {
            try {
                o4a.f161598c = o4aVar;
            } catch (Throwable th3) {
                p2l.m68953a(o4a.class, th3);
            }
        }
        o4a.m66236a();
    }

    /* JADX INFO: renamed from: k */
    public static int m48858k(int i) {
        return Integer.hashCode(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m48859l(nfs nfsVar) {
        if (((exh0) nfsVar).f63770a.f63766L0) {
            wjg1.m88314D(nfsVar, 1).m30032n1();
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m48860m(ei4 ei4Var) {
        return ei4Var.m39060a();
    }

    /* JADX INFO: renamed from: n */
    public static final xyy0 m48861n(ayv ayvVar) {
        switch (ayvVar.ordinal()) {
            case 0:
                return xyy0.ENTITY_TYPE_PODCAST;
            case 1:
                return xyy0.ENTITY_TYPE_TRACK;
            case 2:
                return xyy0.ENTITY_TYPE_ALBUM;
            case 3:
                return xyy0.ENTITY_TYPE_ARTIST;
            case 4:
                return xyy0.ENTITY_TYPE_EPISODE;
            case 5:
                return xyy0.ENTITY_TYPE_AUDIOBOOK;
            case 6:
                return xyy0.ENTITY_TYPE_PLAYLIST;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
