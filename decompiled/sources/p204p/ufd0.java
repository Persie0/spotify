package p204p;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class ufd0 {

    /* JADX INFO: renamed from: g */
    public static final ufd0 f229755g;

    /* JADX INFO: renamed from: h */
    public static final String f229756h;

    /* JADX INFO: renamed from: i */
    public static final String f229757i;

    /* JADX INFO: renamed from: j */
    public static final String f229758j;

    /* JADX INFO: renamed from: k */
    public static final String f229759k;

    /* JADX INFO: renamed from: l */
    public static final String f229760l;

    /* JADX INFO: renamed from: m */
    public static final String f229761m;

    /* JADX INFO: renamed from: a */
    public final String f229762a;

    /* JADX INFO: renamed from: b */
    public final ofd0 f229763b;

    /* JADX INFO: renamed from: c */
    public final nfd0 f229764c;

    /* JADX INFO: renamed from: d */
    public final phd0 f229765d;

    /* JADX INFO: renamed from: e */
    public final ifd0 f229766e;

    /* JADX INFO: renamed from: f */
    public final pfd0 f229767f;

    static {
        gfd0 gfd0Var = new gfd0();
        kf40 kf40Var = pf40.f176960b;
        wsv0 wsv0Var = wsv0.f254763e;
        List list = Collections.EMPTY_LIST;
        wsv0 wsv0Var2 = wsv0.f254763e;
        mfd0 mfd0Var = new mfd0();
        f229755g = new ufd0("", new ifd0(gfd0Var), null, new nfd0(mfd0Var), phd0.f177558M, pfd0.f177032d);
        f229756h = Integer.toString(0, 36);
        f229757i = Integer.toString(1, 36);
        f229758j = Integer.toString(2, 36);
        f229759k = Integer.toString(3, 36);
        f229760l = Integer.toString(4, 36);
        f229761m = Integer.toString(5, 36);
    }

    public ufd0(String str, ifd0 ifd0Var, ofd0 ofd0Var, nfd0 nfd0Var, phd0 phd0Var, pfd0 pfd0Var) {
        this.f229762a = str;
        this.f229763b = ofd0Var;
        this.f229764c = nfd0Var;
        this.f229765d = phd0Var;
        this.f229766e = ifd0Var;
        this.f229767f = pfd0Var;
    }

    /* JADX INFO: renamed from: b */
    public static ufd0 m82981b(int i, Bundle bundle) {
        ifd0 ifd0Var;
        pfd0 pfd0Var;
        Map mapM90451c;
        lfd0 lfd0Var;
        efd0 efd0Var;
        wsv0 wsv0VarM53150g;
        wsv0 wsv0VarM48368n;
        ofd0 ofd0Var;
        String string = bundle.getString(f229756h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f229757i);
        nfd0 nfd0VarM64339b = bundle2 == null ? nfd0.f153322f : nfd0.m64339b(bundle2);
        Bundle bundle3 = bundle.getBundle(f229758j);
        phd0 phd0VarM69978b = bundle3 == null ? phd0.f177558M : phd0.m69978b(i, bundle3);
        Bundle bundle4 = bundle.getBundle(f229759k);
        if (bundle4 == null) {
            ifd0Var = ifd0.f101748r;
        } else {
            gfd0 gfd0Var = new gfd0();
            String str = hfd0.f90682j;
            hfd0 hfd0Var = hfd0.f90681i;
            long j = hfd0Var.f90690a;
            long j2 = hfd0Var.f90693d;
            long j3 = hfd0Var.f90691b;
            gfd0Var.m44600b(h0b1.m46295W(bundle4.getLong(str, j)));
            gfd0Var.m44599a(h0b1.m46295W(bundle4.getLong(hfd0.f90683k, hfd0Var.f90692c)));
            gfd0Var.f79336c = bundle4.getBoolean(hfd0.f90684l, hfd0Var.f90694e);
            gfd0Var.f79337d = bundle4.getBoolean(hfd0.f90685m, hfd0Var.f90695f);
            gfd0Var.f79338e = bundle4.getBoolean(hfd0.f90686n, hfd0Var.f90696g);
            gfd0Var.f79339f = bundle4.getBoolean(hfd0.f90689q, hfd0Var.f90697h);
            long j4 = bundle4.getLong(hfd0.f90687o, j3);
            if (j4 != j3) {
                gfd0Var.m44600b(j4);
            }
            long j5 = bundle4.getLong(hfd0.f90688p, j2);
            if (j5 != j2) {
                gfd0Var.m44599a(j5);
            }
            ifd0Var = new ifd0(gfd0Var);
        }
        ifd0 ifd0Var2 = ifd0Var;
        Bundle bundle5 = bundle.getBundle(f229760l);
        if (bundle5 == null) {
            pfd0Var = pfd0.f177032d;
        } else {
            d670 d670Var = new d670();
            d670Var.f45617b = (Uri) bundle5.getParcelable(pfd0.f177033e);
            d670Var.f45618c = bundle5.getString(pfd0.f177034f);
            d670Var.f45619d = h0b1.m46328p(bundle5.getBundle(pfd0.f177035g));
            pfd0Var = new pfd0(d670Var);
        }
        pfd0 pfd0Var2 = pfd0Var;
        Bundle bundle6 = bundle.getBundle(f229761m);
        if (bundle6 == null) {
            ofd0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(ofd0.f164721k);
            boolean z = false;
            if (bundle7 == null) {
                lfd0Var = null;
            } else {
                String string2 = bundle7.getString(lfd0.f132906i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(lfd0.f132907j);
                String str2 = lfd0.f132908k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    mapM90451c = btv0.f30940g;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    mapM90451c = xf40.m90451c(map);
                }
                boolean z2 = bundle7.getBoolean(lfd0.f132909l, false);
                boolean z3 = bundle7.getBoolean(lfd0.f132910m, false);
                boolean z4 = bundle7.getBoolean(lfd0.f132911n, false);
                String str4 = lfd0.f132912o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                pf40 pf40VarM69791p = pf40.m69791p(arrayList);
                byte[] byteArray = bundle7.getByteArray(lfd0.f132913p);
                kfd0 kfd0Var = new kfd0();
                kfd0Var.f122134a = uuidFromString;
                kfd0Var.f122135b = uri;
                kfd0Var.f122136c = xf40.m90451c(mapM90451c);
                kfd0Var.f122137d = z2;
                kfd0Var.f122139f = z4;
                kfd0Var.f122138e = z3;
                kfd0Var.f122140g = pf40.m69791p(pf40VarM69791p);
                kfd0Var.f122141h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                lfd0Var = new lfd0(kfd0Var);
            }
            Bundle bundle10 = bundle6.getBundle(ofd0.f164722l);
            if (bundle10 == null) {
                efd0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(efd0.f59025b);
                uri2.getClass();
                wgb0 wgb0Var = new wgb0(4, z);
                wgb0Var.f251018b = uri2;
                efd0Var = new efd0(wgb0Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(ofd0.f164723m);
            if (parcelableArrayList == null) {
                kf40 kf40Var = pf40.f176960b;
                wsv0VarM53150g = wsv0.f254763e;
            } else {
                jf40 jf40VarM69788m = pf40.m69788m();
                int i2 = 0;
                while (i2 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i2);
                    bundle11.getClass();
                    jf40VarM69788m.m28985c(new ji51(bundle11.getInt(ji51.f112665d, 0), bundle11.getInt(ji51.f112666e, 0), bundle11.getInt(ji51.f112667f, 0)));
                    i2++;
                    parcelableArrayList = parcelableArrayList;
                }
                wsv0VarM53150g = jf40VarM69788m.m53150g();
            }
            wsv0 wsv0Var = wsv0VarM53150g;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(ofd0.f164725o);
            if (parcelableArrayList2 == null) {
                kf40 kf40Var2 = pf40.f176960b;
                wsv0VarM48368n = wsv0.f254763e;
            } else {
                wsv0VarM48368n = hra.m48368n(parcelableArrayList2, new qg9(13));
            }
            wsv0 wsv0Var2 = wsv0VarM48368n;
            long j6 = bundle6.getLong(ofd0.f164726p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(ofd0.f164719i);
            uri3.getClass();
            ofd0Var = new ofd0(uri3, bundle6.getString(ofd0.f164720j), lfd0Var, efd0Var, wsv0Var, bundle6.getString(ofd0.f164724n), wsv0Var2, j6);
        }
        return new ufd0(string, ifd0Var2, ofd0Var, nfd0VarM64339b, phd0VarM69978b, pfd0Var2);
    }

    /* JADX INFO: renamed from: c */
    public static ufd0 m82982c(Uri uri) {
        ofd0 ofd0Var;
        gfd0 gfd0Var = new gfd0();
        kfd0 kfd0Var = new kfd0();
        List list = Collections.EMPTY_LIST;
        wsv0 wsv0Var = wsv0.f254763e;
        mfd0 mfd0Var = new mfd0();
        pfd0 pfd0Var = pfd0.f177032d;
        c95.m31855u(kfd0Var.f122135b == null || kfd0Var.f122134a != null);
        lfd0 lfd0Var = null;
        if (uri != null) {
            if (kfd0Var.f122134a != null) {
                lfd0Var = new lfd0(kfd0Var);
            }
            ofd0Var = new ofd0(uri, null, lfd0Var, null, list, null, wsv0Var, -9223372036854775807L);
        } else {
            ofd0Var = null;
        }
        return new ufd0("", new ifd0(gfd0Var), ofd0Var, new nfd0(mfd0Var), phd0.f177558M, pfd0Var);
    }

    /* JADX INFO: renamed from: d */
    public static ufd0 m82983d(String str) {
        ofd0 ofd0Var;
        gfd0 gfd0Var = new gfd0();
        kfd0 kfd0Var = new kfd0();
        List list = Collections.EMPTY_LIST;
        wsv0 wsv0Var = wsv0.f254763e;
        mfd0 mfd0Var = new mfd0();
        pfd0 pfd0Var = pfd0.f177032d;
        Uri uri = str == null ? null : Uri.parse(str);
        c95.m31855u(kfd0Var.f122135b == null || kfd0Var.f122134a != null);
        lfd0 lfd0Var = null;
        if (uri != null) {
            if (kfd0Var.f122134a != null) {
                lfd0Var = new lfd0(kfd0Var);
            }
            ofd0Var = new ofd0(uri, null, lfd0Var, null, list, null, wsv0Var, -9223372036854775807L);
        } else {
            ofd0Var = null;
        }
        return new ufd0("", new ifd0(gfd0Var), ofd0Var, new nfd0(mfd0Var), phd0.f177558M, pfd0Var);
    }

    /* JADX INFO: renamed from: a */
    public final ffd0 m82984a() {
        kfd0 kfd0Var;
        ffd0 ffd0Var = new ffd0();
        ffd0Var.f68979f = this.f229766e.m47339a();
        ffd0Var.f68975b = this.f229762a;
        ffd0Var.f68984k = this.f229765d;
        ffd0Var.f68985l = this.f229764c.m64340a();
        ffd0Var.f68986m = this.f229767f;
        ofd0 ofd0Var = this.f229763b;
        if (ofd0Var != null) {
            ffd0Var.f68977d = ofd0Var.f164732f;
            ffd0Var.f68976c = ofd0Var.f164728b;
            ffd0Var.f68978e = ofd0Var.f164727a;
            ffd0Var.f68981h = ofd0Var.f164731e;
            ffd0Var.f68982i = ofd0Var.f164733g;
            lfd0 lfd0Var = ofd0Var.f164729c;
            if (lfd0Var != null) {
                kfd0Var = new kfd0();
                kfd0Var.f122134a = lfd0Var.f132914a;
                kfd0Var.f122135b = lfd0Var.f132915b;
                kfd0Var.f122136c = lfd0Var.f132916c;
                kfd0Var.f122137d = lfd0Var.f132917d;
                kfd0Var.f122138e = lfd0Var.f132918e;
                kfd0Var.f122139f = lfd0Var.f132919f;
                kfd0Var.f122140g = lfd0Var.f132920g;
                kfd0Var.f122141h = lfd0Var.f132921h;
            } else {
                kfd0Var = new kfd0();
            }
            ffd0Var.f68980g = kfd0Var;
            ffd0Var.f68983j = ofd0Var.f164730d;
            ffd0Var.f68974a = ofd0Var.f164734h;
        }
        return ffd0Var;
    }

    /* JADX INFO: renamed from: e */
    public final Bundle m82985e(int i, boolean z) {
        ofd0 ofd0Var;
        Bundle bundle = new Bundle();
        String str = this.f229762a;
        if (!str.equals("")) {
            bundle.putString(f229756h, str);
        }
        nfd0 nfd0Var = nfd0.f153322f;
        nfd0 nfd0Var2 = this.f229764c;
        if (!nfd0Var2.equals(nfd0Var)) {
            bundle.putBundle(f229757i, nfd0Var2.m64341c());
        }
        phd0 phd0Var = phd0.f177558M;
        phd0 phd0Var2 = this.f229765d;
        if (!phd0Var2.equals(phd0Var)) {
            bundle.putBundle(f229758j, phd0Var2.m69980c(i));
        }
        hfd0 hfd0Var = hfd0.f90681i;
        ifd0 ifd0Var = this.f229766e;
        if (!ifd0Var.equals(hfd0Var)) {
            Bundle bundle2 = new Bundle();
            long j = ifd0Var.f90690a;
            if (j != hfd0Var.f90690a) {
                bundle2.putLong(hfd0.f90682j, j);
            }
            long j2 = ifd0Var.f90692c;
            if (j2 != hfd0Var.f90692c) {
                bundle2.putLong(hfd0.f90683k, j2);
            }
            long j3 = ifd0Var.f90691b;
            if (j3 != hfd0Var.f90691b) {
                bundle2.putLong(hfd0.f90687o, j3);
            }
            long j4 = ifd0Var.f90693d;
            if (j4 != hfd0Var.f90693d) {
                bundle2.putLong(hfd0.f90688p, j4);
            }
            boolean z2 = ifd0Var.f90694e;
            if (z2 != hfd0Var.f90694e) {
                bundle2.putBoolean(hfd0.f90684l, z2);
            }
            boolean z3 = ifd0Var.f90695f;
            if (z3 != hfd0Var.f90695f) {
                bundle2.putBoolean(hfd0.f90685m, z3);
            }
            boolean z4 = ifd0Var.f90696g;
            if (z4 != hfd0Var.f90696g) {
                bundle2.putBoolean(hfd0.f90686n, z4);
            }
            boolean z5 = ifd0Var.f90697h;
            if (z5 != hfd0Var.f90697h) {
                bundle2.putBoolean(hfd0.f90689q, z5);
            }
            bundle.putBundle(f229759k, bundle2);
        }
        pfd0 pfd0Var = pfd0.f177032d;
        pfd0 pfd0Var2 = this.f229767f;
        if (!pfd0Var2.equals(pfd0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = pfd0Var2.f177036a;
            if (uri != null) {
                bundle3.putParcelable(pfd0.f177033e, uri);
            }
            String str2 = pfd0Var2.f177037b;
            if (str2 != null) {
                bundle3.putString(pfd0.f177034f, str2);
            }
            Bundle bundle4 = pfd0Var2.f177038c;
            if (bundle4 != null) {
                bundle3.putBundle(pfd0.f177035g, bundle4);
            }
            bundle.putBundle(f229760l, bundle3);
        }
        if (z && (ofd0Var = this.f229763b) != null) {
            pf40 pf40Var = ofd0Var.f164733g;
            List list = ofd0Var.f164731e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(ofd0.f164719i, ofd0Var.f164727a);
            String str3 = ofd0Var.f164728b;
            if (str3 != null) {
                bundle5.putString(ofd0.f164720j, str3);
            }
            lfd0 lfd0Var = ofd0Var.f164729c;
            if (lfd0Var != null) {
                String str4 = ofd0.f164721k;
                pf40 pf40Var2 = lfd0Var.f132920g;
                xf40 xf40Var = lfd0Var.f132916c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(lfd0.f132906i, lfd0Var.f132914a.toString());
                Uri uri2 = lfd0Var.f132915b;
                if (uri2 != null) {
                    bundle6.putParcelable(lfd0.f132907j, uri2);
                }
                if (!xf40Var.isEmpty()) {
                    String str5 = lfd0.f132908k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : xf40Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = lfd0Var.f132917d;
                if (z6) {
                    bundle6.putBoolean(lfd0.f132909l, z6);
                }
                boolean z7 = lfd0Var.f132918e;
                if (z7) {
                    bundle6.putBoolean(lfd0.f132910m, z7);
                }
                boolean z8 = lfd0Var.f132919f;
                if (z8) {
                    bundle6.putBoolean(lfd0.f132911n, z8);
                }
                if (!pf40Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(lfd0.f132912o, new ArrayList<>(pf40Var2));
                }
                byte[] bArr = lfd0Var.f132921h;
                if (bArr != null) {
                    bundle6.putByteArray(lfd0.f132913p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            efd0 efd0Var = ofd0Var.f164730d;
            if (efd0Var != null) {
                String str6 = ofd0.f164722l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(efd0.f59025b, efd0Var.f59026a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(ofd0.f164723m, hra.m48351D(list, new qg9(11)));
            }
            String str7 = ofd0Var.f164732f;
            if (str7 != null) {
                bundle5.putString(ofd0.f164724n, str7);
            }
            if (!pf40Var.isEmpty()) {
                bundle5.putParcelableArrayList(ofd0.f164725o, hra.m48351D(pf40Var, new qg9(12)));
            }
            long j5 = ofd0Var.f164734h;
            if (j5 != -9223372036854775807L) {
                bundle5.putLong(ofd0.f164726p, j5);
            }
            bundle.putBundle(f229761m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufd0)) {
            return false;
        }
        ufd0 ufd0Var = (ufd0) obj;
        return Objects.equals(this.f229762a, ufd0Var.f229762a) && this.f229766e.equals(ufd0Var.f229766e) && Objects.equals(this.f229763b, ufd0Var.f229763b) && Objects.equals(this.f229764c, ufd0Var.f229764c) && Objects.equals(this.f229765d, ufd0Var.f229765d) && Objects.equals(this.f229767f, ufd0Var.f229767f);
    }

    public final int hashCode() {
        int iHashCode = this.f229762a.hashCode() * 31;
        ofd0 ofd0Var = this.f229763b;
        return this.f229767f.hashCode() + ((this.f229765d.hashCode() + ((this.f229766e.hashCode() + ((this.f229764c.hashCode() + ((iHashCode + (ofd0Var != null ? ofd0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
