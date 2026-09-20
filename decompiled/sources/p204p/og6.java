package p204p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class og6 implements vd50, cy51, v94, InterfaceC2207oa, l8a0, w1j0, Function3, Init, BiFunction, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165004a;

    public /* synthetic */ og6(int i) {
        this.f165004a = i;
    }

    /* JADX INFO: renamed from: c */
    public static final String m66863c(String str) {
        Pattern pattern = wlc0.f252512b;
        if (wlc0.f252512b.matcher(str).matches()) {
            return wl51.m88486j1(str, ":markasplayed");
        }
        throw new IllegalArgumentException("Invalid uri passed: ".concat(str));
    }

    /* JADX INFO: renamed from: e */
    public static ho91 m66864e(bo91 bo91Var, be60 be60Var, gd70 gd70Var) {
        if (!be60Var.f26287c) {
            be60Var = be60Var.m28908b(1);
        }
        int iM38547C = edb.m38547C(be60Var.f26286b);
        if (iM38547C != 0 && iM38547C != 1) {
            if (iM38547C == 2) {
                return new io91(1, gd70Var);
            }
            throw new NoWhenBranchMatchedException();
        }
        int iMo27374C = bo91Var.mo27374C();
        boolean z = true;
        if (iMo27374C != 1) {
            if (iMo27374C == 2) {
                z = false;
            } else if (iMo27374C != 3) {
                throw null;
            }
        }
        if (z) {
            return !gd70Var.mo36063C0().mo25171e().isEmpty() ? new io91(3, gd70Var) : so91.m78640k(bo91Var, be60Var);
        }
        return new io91(1, txq.m81932e(bo91Var).m50162o());
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m66865f(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Integer numValueOf = Integer.valueOf(R.color.default_endless_background);
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            numValueOf = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        Bundle bundleM50936h = ikc0.m50936h("embedded_in_bottom_sheet", z);
        if (numValueOf != null) {
            bundleM50936h.putInt("background_color_override", numValueOf.intValue());
        }
        bundleM50936h.putBoolean("hide_add_to_element", z2);
        bundleM50936h.putBoolean("navigation_allowed", z3);
        bundleM50936h.putBoolean("large_screen_layout_enabled", z4);
        return bundleM50936h;
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m66866h(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("AssistedCurationPageRouteParameters", new kg6(str, str2, fg6.f69231a));
        return bundle;
    }

    /* JADX INFO: renamed from: i */
    public static int m66867i(d0w d0wVar) {
        Integer num;
        String str = d0wVar.f44070b;
        yzv yzvVar = d0wVar.f44065B;
        if (!kgg1.m56363z(str)) {
            return 1;
        }
        yzv yzvVar2 = yzv.f277904b;
        if (!(yzvVar == yzvVar2 || yzvVar == yzv.f277903a) || (num = d0wVar.f44086r) == null || d0wVar.f44085q - num.intValue() < 30) {
            return (yzvVar == yzvVar2 || yzvVar == yzv.f277903a) ? 3 : 4;
        }
        return 2;
    }

    /* JADX INFO: renamed from: j */
    public static void m66868j(st91 st91Var) {
        gag0 gag0Var = st91Var != null ? new gag0(st91Var, 18) : null;
        if (gag0Var != null) {
            yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("cancel", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91VarM96903c.m94607a();
            new dv91("hit", 1);
            new bv91("ui_hide", 1, nau.f152117a);
            System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m66869k(String str, st91 st91Var) {
        gag0 gag0Var = st91Var != null ? new gag0(st91Var, 18) : null;
        if (gag0Var != null) {
            yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("confirm", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            yt91VarM96903c.m94607a();
            new dv91("hit", 1);
            String string = str.toString();
            if (string == null) {
                string = "";
            }
            new bv91("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", string));
            System.currentTimeMillis();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        uvf0 uvf0Var = (uvf0) obj3;
        ybv ybvVar = ((ty80) obj).f224877f;
        List list = ((t5a0) obj2).f217256b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list) {
            if (obj4 instanceof q5a0) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((q5a0) it.next()).f185488b);
        }
        Set setM43736n1 = g6f.m43736n1(arrayList2);
        return new fzw(uvf0Var.m84056b() && wrf0.m88858b(ybvVar.f271272q), ybvVar.f271256a, ybvVar.f271257b, setM43736n1);
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public /* bridge */ /* synthetic */ void mo24956K0(Object obj) {
    }

    @Override // p204p.InterfaceC1698bb
    public /* bridge */ /* synthetic */ boolean accept(Object obj) {
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        String str = (String) obj;
        qu80 qu80Var = (qu80) obj2;
        ybv ybvVar = qu80Var.f192599e;
        String str2 = ybvVar.f271257b;
        List list = qu80Var.f192598d;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (((nw80) obj3).f159061o instanceof f0w) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nw80 nw80Var = (nw80) it.next();
            f0w f0wVar = (f0w) nw80Var.f159061o;
            String str3 = nw80Var.f159049c;
            String str4 = nw80Var.f159055i;
            boolean zM65753d = nw80Var.m65753d();
            String str5 = ybvVar.f271257b;
            boolean z = nw80Var.f159057k;
            String str6 = f0wVar.f64724b;
            Iterator it2 = it;
            long j = f0wVar.f64730h;
            String strM40508a = f0wVar.m40508a(1);
            long j2 = f0wVar.f64735m;
            String strM65752c = nw80Var.m65752c();
            String strM29801l0 = "";
            if (strM65752c != null && strM65752c.length() != 0) {
                strM29801l0 = bm51.m29801l0(str, "{id}", strM65752c);
            }
            arrayList2.add(new jq50(str3, str4, strM40508a, str5, strM29801l0, str6, z, zM65753d, j, j2));
            it = it2;
            ybvVar = ybvVar;
        }
        return new oev(str2, arrayList2);
    }

    @Override // p204p.l8a0
    /* JADX INFO: renamed from: b */
    public long mo58465b() {
        return 0L;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        switch (this.f165004a) {
            case 2:
                mnn0 mnn0VarM62359a = mnn0.m62359a(i);
                return mnn0VarM62359a == null ? mnn0.UNRECOGNIZED : mnn0VarM62359a;
            default:
                nje njeVarM64606a = nje.m64606a(i);
                return njeVarM64606a == null ? nje.UNRECOGNIZED : njeVarM64606a;
        }
    }

    @Override // p204p.cy51
    /* JADX INFO: renamed from: d */
    public y7h1 mo27672d(Object obj) {
        return bga.m29102x(Boolean.TRUE);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        yxy0 yxy0Var = (yxy0) obj;
        String str = yxy0Var.f277352a;
        String strM61177l = m95.m61177l();
        vzi vziVar = yxy0Var.f277356e;
        HashSet hashSetM15571a = Effects.m15571a(new mqy0(strM61177l, true, vziVar));
        if (!(yxy0Var.f277355d instanceof e0z0)) {
            return First.m15574b(yxy0Var);
        }
        if (str.length() == 0) {
            return First.m15575c(yxy0Var, hashSetM15571a);
        }
        if (vziVar instanceof rzi) {
            return First.m15575c(yxy0Var, Effects.m15571a(new z9g1[0]));
        }
        if (vziVar instanceof pzi) {
            return First.m15575c(yxy0Var, Effects.m15571a(new vqy0(str, strM61177l, yxy0Var.f277357f.f125162e)));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Object next;
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        Uri uri = Uri.parse(dataString);
        String queryParameter = uri.getQueryParameter("session");
        Iterator it = xxm0.f267027g.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((xxm0) next).f267028a.equals(uri.getQueryParameter("source")));
        xxm0 xxm0Var = (xxm0) next;
        if (xxm0Var == null) {
            xxm0Var = xxm0.ParentalControls;
        }
        xxm0 xxm0Var2 = xxm0Var;
        return tm4.m81100x(rxm0.class, new sxm0(e301Var.f55571a, xxm0Var2, queryParameter, null, arg1.m26939g(xxm0Var2, null), xoc1.f263906I3), new xzq0(1, (boolean) (1 == true ? 1 : 0), 4));
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        if (!playerState.track().mo49279c()) {
            return false;
        }
        xf40 xf40VarMetadata = ((ContextTrack) playerState.track().mo49278b()).metadata();
        return xf40VarMetadata.containsKey(ContextTrack.Metadata.KEY_TITLE) && xf40VarMetadata.containsKey(ContextTrack.Metadata.KEY_ARTIST_NAME) && xf40VarMetadata.containsKey(ContextTrack.Metadata.KEY_ALBUM_TITLE);
    }

    public /* synthetic */ og6(Object obj, int i) {
        this.f165004a = i;
    }

    public og6(rwt0 rwt0Var) {
        this.f165004a = 29;
        rwt0Var.m76580a(UseTorchAsFlashQuirk.class);
    }

    public og6(son sonVar, otn otnVar) {
        this.f165004a = 6;
    }

    @Override // p204p.l8a0
    /* JADX INFO: renamed from: a */
    public void mo58464a() {
    }
}
