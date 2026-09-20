package p204p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.notifications.models.preferences.ShowOptInMetadata;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class i97 implements InterfaceC2207oa, xxf, Function, dgw, vd50, qaq0, Init, qmk0, BiPredicate, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99922a;

    public /* synthetic */ i97(int i) {
        this.f99922a = i;
    }

    /* JADX INFO: renamed from: e */
    public static final void m49972e(Throwable th) {
        Logger.m3967c(th, "Something went wrong while fetching category.", new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public static PendingIntent m49973f(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(new ComponentName(context.getPackageName(), "com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver"));
        intent.setPackage(context.getPackageName());
        try {
            return PendingIntent.getBroadcast(context.getApplicationContext(), 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        } catch (SecurityException e) {
            Logger.m3967c(e, "Unable to create media button PendingIntent", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m49974g(wq50 wq50Var, String str) {
        Bundle bundle = new Bundle();
        if (wq50Var == null && str == null) {
            throw new IllegalArgumentException("Category details fragment cannot be instantiated without a category or a valid category key");
        }
        if (wq50Var != null) {
            bundle.putParcelable("SELECTED_ITEM", wq50Var);
        }
        if (str != null) {
            bundle.putString("SELECTED_ITEM_KEY", str);
        }
        return bundle;
    }

    @Override // p204p.qaq0
    /* JADX INFO: renamed from: a */
    public long mo26626a(c450 c450Var, long j, ko70 ko70Var, long j2) {
        return 0L;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ihi) obj).f102296c == u300.AUDIOBOOK_CHART;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i;
        switch (this.f99922a) {
            case 4:
                eyl0 eyl0Var = (eyl0) obj;
                dyl0 dyl0Var = eyl0Var instanceof dyl0 ? (dyl0) eyl0Var : null;
                tl11 tl11Var = dyl0Var != null ? (tl11) dyl0Var.f54411a : null;
                d89 d89Var = d89.f46408a;
                if (tl11Var == null) {
                    return d89Var;
                }
                xj11 xj11Var = tl11Var.f221296a;
                List list = tl11Var.f221297b;
                if (mdl.m61521a(tl11Var) && list.size() == 1) {
                    return d89Var;
                }
                h1q0 h1q0Var = (h1q0) xj11Var.f262017y.mo30169a(h1q0.class);
                String str = h1q0Var != null ? h1q0Var.f86681b : null;
                if (str != null && str.length() != 0) {
                    h1q0 h1q0Var2 = (h1q0) xj11Var.f262017y.mo30169a(h1q0.class);
                    String str2 = h1q0Var2 != null ? h1q0Var2.f86681b : null;
                    wj50.m88279p(str2);
                    return new c89(str2);
                }
                uj11 uj11Var = xj11Var.f262013u;
                if (uj11Var == uj11.f230861b || uj11Var == uj11.f230863d || uj11Var == uj11.f230860a) {
                    return new c89(((d0w) g6f.m43741q0(list)).f44069a);
                }
                uj11 uj11Var2 = uj11.f230862c;
                if (uj11Var != uj11Var2 || mdl.m61521a(tl11Var)) {
                    return (xj11Var.f262013u == uj11Var2 && mdl.m61521a(tl11Var)) ? new c89(((d0w) g6f.m43687A0(list)).f44069a) : d89Var;
                }
                return new c89(((d0w) g6f.m43741q0(list)).f44069a);
            case 9:
                s431 s431Var = (s431) obj;
                int iOrdinal = s431Var.f205428a.ordinal();
                int i2 = 3;
                if (iOrdinal == 0) {
                    i = 1;
                } else if (iOrdinal == 1) {
                    i = 2;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 3;
                }
                int iOrdinal2 = s431Var.f205430c.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 1;
                } else if (iOrdinal2 == 1) {
                    i2 = 2;
                } else if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return new vv11(i, i2);
            default:
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    return gp11.f83062b;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((ShowOptInMetadata) obj2).optedIn) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ShowOptInMetadata) it.next()).title);
                }
                return arrayList2.isEmpty() ? gp11.f83061a : new hp11(arrayList2);
        }
    }

    @Override // p204p.dgw
    /* JADX INFO: renamed from: b */
    public void mo35945b(eab eabVar) {
        if (eabVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        ini0 ini0Var;
        switch (this.f99922a) {
            case 12:
                q4m0 q4m0VarM72172a = q4m0.m72172a(i);
                return q4m0VarM72172a == null ? q4m0.UNRECOGNIZED : q4m0VarM72172a;
            case 17:
                if (i == 0) {
                    ini0Var = ini0.MV_RELATED_ASSOCIATION_RELATION_TYPE_UNKNOWN;
                } else if (i != 1) {
                    ini0Var = i != 2 ? null : ini0.MV_RELATED_ASSOCIATION_RELATION_TYPE_OFFICIAL_MIX;
                } else {
                    ini0Var = ini0.MV_RELATED_ASSOCIATION_RELATION_TYPE_UNSPECIFIED;
                }
                return ini0Var == null ? ini0.UNRECOGNIZED : ini0Var;
            default:
                cza1 cza1VarM34429a = cza1.m34429a(i);
                return cza1VarM34429a == null ? cza1.UNRECOGNIZED : cza1VarM34429a;
        }
    }

    @Override // p204p.xxf
    /* JADX INFO: renamed from: d */
    public j15 mo49975d(z601 z601Var, xq00 xq00Var) {
        xq00Var.m91771i0(-278544108);
        fyf fyfVar = u1h.f225822a;
        g15 g15Var = new g15();
        fyfVar.mo24818M(g15Var, z601Var, xq00Var, 8);
        j15 j15VarM43339o = g15Var.m43339o();
        xq00Var.m91788r(false);
        return j15VarM43339o;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((u070) obj);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return !re41.m75379a((PlayerState) obj);
    }

    public /* synthetic */ i97(Object obj, int i) {
        this.f99922a = i;
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        hwr0 hwr0Var = (hwr0) obj;
        hwr0 hwr0Var2 = (hwr0) obj2;
        wj50.m88279p(hwr0Var);
        wj50.m88279p(hwr0Var2);
        htr0 htr0Var = hwr0Var.f96027a;
        String str = htr0Var.f95135c;
        htr0 htr0Var2 = hwr0Var2.f96027a;
        return wj50.m88271j(str, htr0Var2.f95135c) && wj50.m88271j(htr0Var.f95131a, htr0Var2.f95131a) && htr0Var.f95141f == htr0Var2.f95141f && wj50.m88271j(htr0Var.f95137d, htr0Var2.f95137d) && htr0Var.f95147i == htr0Var2.f95147i && wj50.m88271j(htr0Var.f95125X, htr0Var2.f95125X) && htr0Var.f95129Z == htr0Var2.f95129Z && hwr0Var.f96028b == hwr0Var2.f96028b && hwr0Var.f96029c == hwr0Var2.f96029c && hwr0Var.f96030d == hwr0Var2.f96030d && hwr0Var.f96031e == hwr0Var2.f96031e && hwr0Var.f96034h == hwr0Var2.f96034h && hwr0Var.f96035i == hwr0Var2.f96035i && wj50.m88271j(htr0Var.f95116O0, htr0Var2.f95116O0) && wj50.m88271j(htr0Var.f95118Q0, htr0Var2.f95118Q0) && wj50.m88271j(htr0Var.f95117P0, htr0Var2.f95117P0) && wj50.m88271j(htr0Var.f95120S0, htr0Var2.f95120S0) && htr0Var.f95148i1 == htr0Var2.f95148i1 && htr0Var.f95149j1 == htr0Var2.f95149j1 && wj50.m88271j(htr0Var.f95151l1, htr0Var2.f95151l1) && htr0Var.f95122U0 == htr0Var2.f95122U0 && hwr0Var.f96036t == hwr0Var2.f96036t && hwr0Var.f96024X == hwr0Var2.f96024X && htr0Var.f95140e1 == htr0Var2.f95140e1 && htr0Var.f95142f1 == htr0Var2.f95142f1;
    }

    public /* synthetic */ i97(boolean z) {
        this.f99922a = 19;
    }

    @Override // p204p.dgw
    /* JADX INFO: renamed from: c */
    public void mo35946c(nfe nfeVar, ArrayList arrayList) {
    }
}
