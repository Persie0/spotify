package p204p;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import com.spotify.externalintegration.http.HydrogenEnhancingAttributes;
import com.spotify.externalintegration.http.HydrogenExperienceResponse;
import com.spotify.externalintegration.http.HydrogenItem;
import com.spotify.externalintegration.http.HydrogenSection;
import io.reactivex.rxjava3.functions.Function;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class er3 implements vhz, Function, i5w0, i130, vd50, InterfaceC2207oa, dv40, yh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62014a;

    public /* synthetic */ er3(int i) {
        this.f62014a = i;
    }

    /* JADX INFO: renamed from: g */
    public static final int m39752g(k621 k621Var) {
        int iOrdinal = k621Var.f119632i.ordinal();
        if (iOrdinal != 3) {
            return iOrdinal != 14 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:13:0x001a, B:11:0x0014, B:8:0x0010), top: B:91:0x0003, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0158  */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static ck40 m39753h(Context context) {
        ik40 ik40VarM51783g;
        ik40 ik40Var;
        Class cls;
        Class cls2;
        Class cls3;
        Object objM56649K;
        ck40 ck40Var;
        Object objM56649K2;
        Object objM56649K3;
        synchronized (ik40.f103002h) {
            if (p2l.f173365a.contains(ik40.class)) {
                ik40VarM51783g = null;
                if (ik40VarM51783g == null) {
                    ik40VarM51783g = iw3.m51783g();
                }
                ik40Var = ik40VarM51783g;
            } else {
                try {
                    ik40VarM51783g = ik40.f103003i;
                } catch (Throwable th) {
                    p2l.m68953a(ik40.class, th);
                    ik40VarM51783g = null;
                }
                if (ik40VarM51783g == null) {
                    ik40VarM51783g = iw3.m51783g();
                }
                ik40Var = ik40VarM51783g;
            }
            throw th;
        }
        if (ik40Var == null) {
            return null;
        }
        Class clsM56640B = kk40.m56640B("com.android.billingclient.api.BillingClient");
        Class clsM56640B2 = kk40.m56640B("com.android.billingclient.api.Purchase");
        Class clsM56640B3 = kk40.m56640B("com.android.billingclient.api.Purchase$PurchasesResult");
        Class clsM56640B4 = kk40.m56640B("com.android.billingclient.api.SkuDetails");
        Class clsM56640B5 = kk40.m56640B("com.android.billingclient.api.PurchaseHistoryRecord");
        Class clsM56640B6 = kk40.m56640B("com.android.billingclient.api.SkuDetailsResponseListener");
        Class clsM56640B7 = kk40.m56640B("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (clsM56640B == null || clsM56640B3 == null || clsM56640B2 == null || clsM56640B4 == null || clsM56640B6 == null || clsM56640B5 == null || clsM56640B7 == null) {
            ck40.m33070b();
            return null;
        }
        Method methodM56644F = kk40.m56644F(clsM56640B, "queryPurchases", String.class);
        Method methodM56644F2 = kk40.m56644F(clsM56640B3, "getPurchasesList", new Class[0]);
        Method methodM56644F3 = kk40.m56644F(clsM56640B2, "getOriginalJson", new Class[0]);
        Method methodM56644F4 = kk40.m56644F(clsM56640B4, "getOriginalJson", new Class[0]);
        Method methodM56644F5 = kk40.m56644F(clsM56640B5, "getOriginalJson", new Class[0]);
        if (p2l.f173365a.contains(ik40Var)) {
            cls = null;
        } else {
            try {
                cls = (Class) ik40Var.f103006b;
            } catch (Throwable th2) {
                p2l.m68953a(ik40Var, th2);
                cls = null;
            }
        }
        Method methodM56644F6 = kk40.m56644F(clsM56640B, "querySkuDetailsAsync", cls, clsM56640B6);
        Method methodM56644F7 = kk40.m56644F(clsM56640B, "queryPurchaseHistoryAsync", String.class, clsM56640B7);
        if (methodM56644F == null || methodM56644F2 == null || methodM56644F3 == null || methodM56644F4 == null || methodM56644F5 == null || methodM56644F6 == null || methodM56644F7 == null) {
            ck40.m33070b();
            return null;
        }
        Class clsM56640B8 = kk40.m56640B("com.android.billingclient.api.BillingClient$Builder");
        Class clsM56640B9 = kk40.m56640B("com.android.billingclient.api.PurchasesUpdatedListener");
        if (clsM56640B8 != null && clsM56640B9 != null) {
            Method methodM56644F8 = kk40.m56644F(clsM56640B, "newBuilder", Context.class);
            Method methodM56644F9 = kk40.m56644F(clsM56640B8, "enablePendingPurchases", new Class[0]);
            Method methodM56644F10 = kk40.m56644F(clsM56640B8, "setListener", clsM56640B9);
            cls2 = clsM56640B4;
            Method methodM56644F11 = kk40.m56644F(clsM56640B8, "build", new Class[0]);
            if (methodM56644F8 != null && methodM56644F9 != null && methodM56644F10 != null && methodM56644F11 != null && (objM56649K2 = kk40.m56649K(clsM56640B, null, methodM56644F8, context)) != null) {
                clsM56640B = clsM56640B;
                cls3 = clsM56640B5;
                Object objM56649K4 = kk40.m56649K(clsM56640B8, objM56649K2, methodM56644F10, Proxy.newProxyInstance(clsM56640B9.getClassLoader(), new Class[]{clsM56640B9}, new ak40(0)));
                objM56649K = (objM56649K4 == null || (objM56649K3 = kk40.m56649K(clsM56640B8, objM56649K4, methodM56644F9, new Object[0])) == null) ? null : kk40.m56649K(clsM56640B8, objM56649K3, methodM56644F11, new Object[0]);
            }
            if (objM56649K == null) {
                ck40.m33070b();
                return null;
            }
            ck40Var = new ck40(objM56649K, clsM56640B, cls2, cls3, clsM56640B6, clsM56640B7, methodM56644F4, methodM56644F5, methodM56644F6, methodM56644F7, ik40Var);
            if (!p2l.f173365a.contains(ck40.class)) {
                try {
                    ck40.f38798m = ck40Var;
                } catch (Throwable th3) {
                    p2l.m68953a(ck40.class, th3);
                }
            }
            if (!p2l.f173365a.contains(ck40.class)) {
                try {
                    return ck40.f38798m;
                } catch (Throwable th4) {
                    p2l.m68953a(ck40.class, th4);
                }
            }
            return null;
        }
        cls2 = clsM56640B4;
        cls3 = clsM56640B5;
        if (objM56649K == null) {
            ck40.m33070b();
            return null;
        }
        ck40Var = new ck40(objM56649K, clsM56640B, cls2, cls3, clsM56640B6, clsM56640B7, methodM56644F4, methodM56644F5, methodM56644F6, methodM56644F7, ik40Var);
        if (!p2l.f173365a.contains(ck40.class)) {
            ck40.f38798m = ck40Var;
        }
        if (!p2l.f173365a.contains(ck40.class)) {
            return ck40.f38798m;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m39754i(pf40 pf40Var, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(pf40Var.size());
        Iterator<E> it = pf40Var.iterator();
        while (it.hasNext()) {
            b0m b0mVar = (b0m) it.next();
            Bundle bundleM27842c = b0mVar.m27842c();
            Bitmap bitmap = b0mVar.f21970d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                c95.m31855u(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleM27842c.putByteArray(b0m.f21964x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleM27842c);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    /* JADX INFO: renamed from: j */
    public static ConcurrentHashMap m39755j() {
        if (p2l.f173365a.contains(ck40.class)) {
            return null;
        }
        try {
            return ck40.f38800o;
        } catch (Throwable th) {
            p2l.m68953a(ck40.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static ConcurrentHashMap m39756k() {
        if (p2l.f173365a.contains(ck40.class)) {
            return null;
        }
        try {
            return ck40.f38802q;
        } catch (Throwable th) {
            p2l.m68953a(ck40.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static ConcurrentHashMap m39757m() {
        if (p2l.f173365a.contains(ck40.class)) {
            return null;
        }
        try {
            return ck40.f38801p;
        } catch (Throwable th) {
            p2l.m68953a(ck40.class, th);
            return null;
        }
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: a */
    public float mo39758a(float f, float f2, long j) {
        return 0.0f;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ihi) obj).f102296c == u300.MY_KALLAXES;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        fw81 fw81Var;
        switch (this.f62014a) {
            case 1:
                List<HydrogenSection> list = ((HydrogenExperienceResponse) obj).f4027a;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (HydrogenSection hydrogenSection : list) {
                    String str = hydrogenSection.f4047a;
                    List<HydrogenItem> list2 = hydrogenSection.f4048b;
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                    for (HydrogenItem hydrogenItem : list2) {
                        String str2 = hydrogenItem.uri;
                        String str3 = hydrogenItem.f4034b;
                        String str4 = hydrogenItem.f4039g;
                        String str5 = hydrogenItem.f4036d.f4030a;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = str5;
                        HydrogenEnhancingAttributes hydrogenEnhancingAttributes = hydrogenItem.enhancingAttributes;
                        arrayList2.add(new w0z0(str3, str4, str6, str2, hydrogenEnhancingAttributes != null ? hydrogenEnhancingAttributes.spotifyUrl : null, hydrogenItem.contextUri));
                    }
                    arrayList.add(new x0z0(str, arrayList2));
                }
                return arrayList;
            case 19:
                return tzk0.f225260h.get(obj);
            default:
                String str7 = ((bv81) obj).f31305a.f170451f;
                int iM38547C = edb.m38547C(2);
                if (iM38547C == 0) {
                    fw81Var = fw81.f74027b;
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fw81Var = fw81.f74026a;
                }
                return new pqm0(str7, fw81Var);
        }
    }

    @Override // p204p.i5w0
    /* JADX INFO: renamed from: b */
    public p5w0 mo39759b(h9x h9xVar) {
        if (h9xVar.equals(d9x.f46928a)) {
            return m5w0.f140304a;
        }
        if (h9xVar.equals(e9x.f57549a)) {
            return o5w0.f162141a;
        }
        return null;
    }

    @Override // p204p.i130
    /* JADX INFO: renamed from: c */
    public v2n0 mo39760c() {
        return new h130();
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        unw unwVar;
        i3s0 i3s0Var;
        switch (this.f62014a) {
            case 11:
                if (i != 0) {
                    unwVar = i != 1 ? null : unw.NO_INTERNET;
                } else {
                    unwVar = unw.FORCED_OFFLINE;
                }
                return unwVar == null ? unw.UNRECOGNIZED : unwVar;
            default:
                if (i == 0) {
                    i3s0Var = i3s0.PROFILE_EDITABLE_FEATURE_UNSPECIFIED;
                } else if (i != 1) {
                    i3s0Var = i != 2 ? null : i3s0.PROFILE_EDITABLE_FEATURE_SOCIAL_HANDLE;
                } else {
                    i3s0Var = i3s0.PROFILE_EDITABLE_FEATURE_BIO;
                }
                return i3s0Var == null ? i3s0.UNRECOGNIZED : i3s0Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m39761d(fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1700387206);
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM92060G = xtm0.m92060G(nec.m64246i(mi21.m61820d(1.0f, cxh0Var), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM92060G);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            dha.m36004a(sam.m77668g(r9g1.m75068p(mi21.m61822f(1.0f, cxh0Var), hmx0.m47993b(8)), leu.f132721a.m44635a()), xq00Var, 0);
            xq00Var.m91788r(true);
            fxh0Var = cxh0Var;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nph(this, fxh0Var, i, 4);
        }
    }

    @Override // p204p.dv40
    /* JADX INFO: renamed from: e */
    public boolean mo37044e(vux vuxVar, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((fv40) vuxVar.f245090b).mo40093d();
                Parcelable parcelable = (Parcelable) ((fv40) vuxVar.f245090b).mo40092c();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        ClipDescription description = ((fv40) vuxVar.f245090b).getDescription();
        fv40 fv40Var = (fv40) vuxVar.f245090b;
        new ClipData(description, new ClipData.Item(fv40Var.mo40090a()));
        fv40Var.getDescription();
        fv40Var.mo40091b();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        return false;
    }

    @Override // p204p.i130
    /* JADX INFO: renamed from: f */
    public v2n0 mo39762f(e130 e130Var, a130 a130Var) {
        return new h130(e130Var, a130Var);
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: l */
    public float mo39763l() {
        return 0.0f;
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: n */
    public long mo39764n(float f) {
        return 0L;
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: o */
    public float mo39765o(float f, float f2) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: p */
    public Object m39766p(rsd0 rsd0Var) {
        Bitmap bitmap;
        Uri uri = rsd0Var.f202309r;
        zb70 zb70Var = new zb70(16);
        zb70Var.m95832r(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, rsd0Var.f202292a);
        zb70Var.m95832r(MediaMetadataCompat.METADATA_KEY_TITLE, rsd0Var.f202293b);
        zb70Var.m95832r(MediaMetadataCompat.METADATA_KEY_ARTIST, rsd0Var.f202296e);
        zb70Var.m95832r(MediaMetadataCompat.METADATA_KEY_ALBUM, rsd0Var.f202295d);
        zb70Var.m95832r(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, rsd0Var.f202297f);
        zb70Var.m95831q(rsd0Var.f202300i.f192074a, MediaMetadataCompat.METADATA_KEY_DURATION);
        zb70Var.m95832r(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, rsd0Var.f202298g.toString());
        zb70Var.m95832r("com.spotify.music.extra.ART_HTTPS_URI", rsd0Var.f202308q.toString());
        zb70Var.m95832r("com.spotify.music.extra.EXTRA_EXTRACTED_COLOR_DARK_HIGH_CONTRAST_BACKGROUND_BASE", rsd0Var.f202306o);
        zb70Var.m95831q(rsd0Var.f202301j ? 1L : 0L, "android.media.IS_EXPLICIT");
        zb70Var.m95831q(rsd0Var.f202310s ? 1L : 0L, "com.spotify.music.extra.IS_19_PLUS");
        zb70Var.m95831q(rsd0Var.f202312u ? 1L : 0L, "android.media.metadata.ADVERTISEMENT");
        zb70Var.m95832r("com.spotify.music.extra.CONTEXT_SHARE_URL", rsd0Var.f202304m);
        zb70Var.m95832r("com.spotify.music.extra.CONTEXT_URI", rsd0Var.f202303l);
        zb70Var.m95832r("com.spotify.music.extra.CONTEXT_TITLE", rsd0Var.f202305n);
        zb70Var.m95832r("com.spotify.music.extra.CONTEXT_DESCRIPTION", rsd0Var.f202307p);
        zb70Var.m95831q(rsd0Var.f202302k ? 1L : 0L, MediaDescriptionCompat.EXTRA_DOWNLOAD_STATUS);
        if (!wj50.m88271j(uri, Uri.EMPTY)) {
            zb70Var.m95832r("com.spotify.music.extra.CANVAS_URI", uri.toString());
        }
        jzk jzkVar = rsd0Var.f202299h;
        if (jzkVar != null && (bitmap = jzkVar.f117743a.f106714b) != null) {
            zb70Var.m95830o(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        return new android.support.v4.media.MediaMetadataCompat((Bundle) zb70Var.f281273b);
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: q */
    public float mo39767q(long j, float f) {
        return 0.0f;
    }

    public /* synthetic */ er3(son sonVar, otn otnVar, int i) {
        this.f62014a = i;
    }

    public er3(ti5 ti5Var, l45 l45Var, iw3 iw3Var) {
        this.f62014a = 21;
    }
}
