package p204p;

import android.content.Context;
import android.net.Uri;
import com.spotify.music.R;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class hka extends dy8 {

    /* JADX INFO: renamed from: m */
    public static final long f92389m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f92390n = 0;

    /* JADX INFO: renamed from: b */
    public final xre f92391b;

    /* JADX INFO: renamed from: c */
    public final Context f92392c;

    /* JADX INFO: renamed from: d */
    public final zxx0 f92393d;

    /* JADX INFO: renamed from: e */
    public final String f92394e;

    /* JADX INFO: renamed from: f */
    public final wt80 f92395f;

    /* JADX INFO: renamed from: g */
    public final yz80 f92396g;

    /* JADX INFO: renamed from: h */
    public final t6f0 f92397h;

    /* JADX INFO: renamed from: i */
    public final nd6 f92398i;

    /* JADX INFO: renamed from: j */
    public final x74 f92399j;

    /* JADX INFO: renamed from: k */
    public final dka f92400k;

    /* JADX INFO: renamed from: l */
    public final s2c f92401l;

    static {
        hvi0 hvi0Var = cks.f39079b;
        f92389m = jwg1.m54449D(10, ils.SECONDS);
    }

    public hka(xre xreVar, Context context, zxx0 zxx0Var, String str, wt80 wt80Var, yz80 yz80Var, m57 m57Var, t6f0 t6f0Var, nd6 nd6Var, x74 x74Var) {
        super(m57Var);
        this.f92391b = xreVar;
        this.f92392c = context;
        this.f92393d = zxx0Var;
        this.f92394e = str;
        this.f92395f = wt80Var;
        this.f92396g = yz80Var;
        this.f92397h = t6f0Var;
        this.f92398i = nd6Var;
        this.f92399j = x74Var;
        this.f92400k = new dka(this, 0);
        this.f92401l = s2c.BRIDGE_TRACKS;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ac A[LOOP:0: B:28:0x00a6->B:30:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Serializable m47749n(hka hkaVar, int i, Set set, String str, ibk ibkVar) {
        aka akaVar;
        int i2;
        Set set2;
        String str2;
        int i3;
        boolean z;
        ArrayList arrayList;
        Iterator it;
        if (ibkVar instanceof aka) {
            akaVar = (aka) ibkVar;
            int i4 = akaVar.f16477g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                akaVar.f16477g = i4 - Integer.MIN_VALUE;
            } else {
                akaVar = new aka(hkaVar, ibkVar);
            }
        } else {
            akaVar = new aka(hkaVar, ibkVar);
        }
        aka akaVar2 = akaVar;
        Object objM86755t = akaVar2.f16475e;
        int i5 = akaVar2.f16477g;
        Object objMo98394apply = yuk.f276404a;
        if (i5 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarMo27555a = hkaVar.f92393d.mo27555a();
            akaVar2.f16472b = set;
            akaVar2.f16473c = str;
            akaVar2.f16471a = i;
            akaVar2.f16477g = 1;
            objM86755t = vyf1.m86755t(fizVarMo27555a, akaVar2);
            if (objM86755t != objMo98394apply) {
                i2 = i;
                set2 = set;
                str2 = str;
            }
            return (Serializable) objMo98394apply;
        }
        if (i5 == 1) {
            i2 = akaVar2.f16471a;
            String str3 = akaVar2.f16473c;
            Set set3 = akaVar2.f16472b;
            bga.m29073P(objM86755t);
            str2 = str3;
            set2 = set3;
        } else {
            if (i5 == 2) {
                z = akaVar2.f16474d;
                i3 = akaVar2.f16471a;
                bga.m29073P(objM86755t);
                t6f0 t6f0Var = hkaVar.f92397h;
                List list = ((qu80) objM86755t).f192598d;
                arrayList = new ArrayList(i6f.m49804T(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((nw80) it.next()).f159049c);
                }
                Single singleM80159a = t6f0Var.m80159a(arrayList);
                akaVar2.f16472b = null;
                akaVar2.f16473c = null;
                akaVar2.f16471a = i3;
                akaVar2.f16474d = z;
                akaVar2.f16477g = 3;
                objM86755t = zn91.m96567o(singleM80159a, akaVar2);
                if (objM86755t != objMo98394apply) {
                }
                return (Serializable) objMo98394apply;
            }
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        objMo98394apply = hkaVar.f92399j.mo98394apply((List) objM86755t);
        return (Serializable) objMo98394apply;
        boolean z2 = ((pe01) objM86755t).f176598o;
        akaVar2.f16472b = null;
        akaVar2.f16473c = null;
        akaVar2.f16471a = i2;
        akaVar2.f16474d = z2;
        akaVar2.f16477g = 2;
        objM86755t = kk40.m56684z(new gka(hkaVar, i2, z2, set2, str2, null), akaVar2);
        if (objM86755t != objMo98394apply) {
            i3 = i2;
            z = z2;
            t6f0 t6f0Var2 = hkaVar.f92397h;
            List list2 = ((qu80) objM86755t).f192598d;
            arrayList = new ArrayList(i6f.m49804T(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((nw80) it.next()).f159049c);
            }
            Single singleM80159a2 = t6f0Var2.m80159a(arrayList);
            akaVar2.f16472b = null;
            akaVar2.f16473c = null;
            akaVar2.f16471a = i3;
            akaVar2.f16474d = z;
            akaVar2.f16477g = 3;
            objM86755t = zn91.m96567o(singleM80159a2, akaVar2);
            if (objM86755t != objMo98394apply) {
                objMo98394apply = hkaVar.f92399j.mo98394apply((List) objM86755t);
            }
        }
        return (Serializable) objMo98394apply;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r7 == r4) goto L31;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m47750o(hka hkaVar, ibk ibkVar) {
        bka bkaVar;
        String queryParameter;
        if (ibkVar instanceof bka) {
            bkaVar = (bka) ibkVar;
            int i = bkaVar.f27884c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkaVar.f27884c = i - Integer.MIN_VALUE;
            } else {
                bkaVar = new bka(hkaVar, ibkVar);
            }
        } else {
            bkaVar = new bka(hkaVar, ibkVar);
        }
        Object objM47751p = bkaVar.f27882a;
        int i2 = bkaVar.f27884c;
        Object obj = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(objM47751p);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM47751p);
            }
            br50 br50Var = (br50) objM47751p;
            return new zja(hkaVar.f92392c.getString(R.string.assisted_curation_bridge_tracks_subtitle_mixing_from, br50Var.getName()), br50Var.getImageUri());
        }
        bga.m29073P(objM47751p);
        Uri uri = Uri.parse(hkaVar.f92394e);
        String queryParameter2 = uri.getQueryParameter("playlist");
        if (queryParameter2 == null || (queryParameter = uri.getQueryParameter("trackARowId")) == null) {
            return null;
        }
        bkaVar.f27884c = 1;
        objM47751p = hkaVar.m47751p(queryParameter2, queryParameter, bkaVar);
        if (objM47751p != obj) {
        }
        return obj;
        String str = (String) objM47751p;
        if (str == null) {
            return null;
        }
        Single singleM80160b = hkaVar.f92397h.m80160b(str);
        bkaVar.f27884c = 2;
        objM47751p = zn91.m96567o(singleM80160b, bkaVar);
    }

    @Override // p204p.dy8, p204p.r2c
    /* JADX INFO: renamed from: g */
    public final boolean mo37331g(List list) {
        return true;
    }

    @Override // p204p.r2c
    /* JADX INFO: renamed from: i */
    public final s2c mo25708i() {
        return this.f92401l;
    }

    @Override // p204p.dy8, p204p.r2c
    /* JADX INFO: renamed from: k */
    public final boolean mo27913k(kbz0 kbz0Var) {
        return kbz0Var.f121315b;
    }

    @Override // p204p.dy8
    /* JADX INFO: renamed from: m */
    public final a3c mo25710m() {
        return this.f92400k;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: p */
    public final Object m47751p(String str, String str2, ibk ibkVar) {
        cka ckaVar;
        if (ibkVar instanceof cka) {
            ckaVar = (cka) ibkVar;
            int i = ckaVar.f38904c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ckaVar.f38904c = i - Integer.MIN_VALUE;
            } else {
                ckaVar = new cka(this, ibkVar);
            }
        } else {
            ckaVar = new cka(this, ibkVar);
        }
        Object objM62841f = ckaVar.f38902a;
        int i2 = ckaVar.f38904c;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            b5u0 b5u0Var = new b5u0(0, 1);
            Set setSingleton = Collections.singleton(new jt80(str2));
            top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
            amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
            amp0VarM18396H.m26433D(true);
            top0VarM18421v.m81214v(amp0VarM18396H);
            st80 st80Var = new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, setSingleton, false, null, b5u0Var, null, 0, null, 474);
            ckaVar.f38904c = 1;
            objM62841f = ((mu80) this.f92395f).m62841f(str, st80Var, ckaVar);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62841f);
        }
        nw80 nw80Var = (nw80) g6f.m43745s0(((qu80) ((p2x0) objM62841f).m68971d()).f192598d);
        if (nw80Var != null) {
            return nw80Var.f159049c;
        }
        return null;
    }
}
