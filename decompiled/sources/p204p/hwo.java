package p204p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hwo {

    /* JADX INFO: renamed from: a */
    public final Activity f95993a;

    /* JADX INFO: renamed from: b */
    public final s2o f95994b;

    /* JADX INFO: renamed from: c */
    public final q831 f95995c;

    /* JADX INFO: renamed from: d */
    public final k5m0 f95996d;

    /* JADX INFO: renamed from: e */
    public final bb3 f95997e;

    /* JADX INFO: renamed from: f */
    public final i7k f95998f;

    /* JADX INFO: renamed from: g */
    public final v1k0 f95999g;

    public hwo(Activity activity, s2o s2oVar, q831 q831Var, k5m0 k5m0Var, bb3 bb3Var, i7k i7kVar, v1k0 v1k0Var) {
        this.f95993a = activity;
        this.f95994b = s2oVar;
        this.f95995c = q831Var;
        this.f95996d = k5m0Var;
        this.f95997e = bb3Var;
        this.f95998f = i7kVar;
        this.f95999g = v1k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m48942a(hwo hwoVar, ibk ibkVar) {
        gwo gwoVar;
        hwoVar.getClass();
        if (ibkVar instanceof gwo) {
            gwoVar = (gwo) ibkVar;
            int i = gwoVar.f85055c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gwoVar.f85055c = i - Integer.MIN_VALUE;
            } else {
                gwoVar = new gwo(hwoVar, ibkVar);
            }
        } else {
            gwoVar = new gwo(hwoVar, ibkVar);
        }
        Object objM76980u = gwoVar.f85053a;
        int i2 = gwoVar.f85055c;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            xuo xuoVar = new xuo(hwoVar, null, 1);
            gwoVar.f85055c = 1;
            objM76980u = s1h1.m76980u(2000L, xuoVar, gwoVar);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76980u);
        }
        Boolean bool = (Boolean) objM76980u;
        return qyg1.m74178H(bool != null ? bool.booleanValue() : false);
    }

    /* JADX INFO: renamed from: c */
    public static Completable m48943c(hwo hwoVar, List list, String str, List list2, List list3, String str2) {
        hwoVar.getClass();
        if (!list.isEmpty()) {
            Set set = dd41.f47702f;
            if (r46.m74726U((String) g6f.m43741q0(list)).f47709c == gn80.SHOW_SHOW) {
                return hwoVar.f95998f.m49872d((String) g6f.m43741q0(list)).onErrorReturnItem(wr11.f254243a).flatMapCompletable(new yho(hwoVar, list2, list, str, list3, str2, 1));
            }
        }
        return hwoVar.m48944b(list, str, list2, list3, str2);
    }

    /* JADX INFO: renamed from: b */
    public final Completable m48944b(List list, String str, List list2, List list3, String str2) {
        alq0 alq0Var = alq0.f16920O0;
        boolean zIsEmpty = list.isEmpty();
        s2o s2oVar = this.f95994b;
        if (zIsEmpty) {
            na6.m63957e("No item URIs passed, nothing added or removed?");
            return s2oVar.m77079O(alq0Var, false);
        }
        ArrayList arrayListM43700N0 = g6f.m43700N0(list3, list2);
        if (arrayListM43700N0.isEmpty()) {
            na6.m63957e("No added-to or removed-from URIs passed");
            return s2oVar.m77079O(alq0Var, false);
        }
        Set set = dd41.f47702f;
        boolean zM74709B = r46.m74709B((String) g6f.m43741q0(list), gn80.TRACK, gn80.SHOW_EPISODE, gn80.PODCAST_CHAPTER, gn80.CLIP, gn80.KALLAX);
        boolean z = r46.m74726U((String) g6f.m43741q0(list)).f47709c == gn80.PRERELEASE;
        boolean z2 = r46.m74726U((String) g6f.m43741q0(list)).f47709c == gn80.CONCERT;
        boolean z3 = r46.m74726U((String) g6f.m43741q0(list)).f47709c == gn80.VENUE;
        if (arrayListM43700N0.size() != 1) {
            return s2oVar.m77079O(alq0Var, false);
        }
        if (!list2.isEmpty() && zM74709B) {
            return s2oVar.m77079O(new k731((String) g6f.m43741q0(list2), new i731(str, list, str2)), false);
        }
        if (list2.isEmpty() || zM74709B) {
            if (!list3.isEmpty()) {
                return s2oVar.m77079O(new q731((String) (z ? g6f.m43741q0(list) : g6f.m43741q0(list3))), false);
            }
            na6.m63957e("Fallback, how did you get here?");
            return s2oVar.m77079O(alq0Var, false);
        }
        if (z) {
            return s2oVar.m77079O(new p731((String) g6f.m43741q0(list)), false);
        }
        if (z2) {
            return s2oVar.m77079O(new n731((String) g6f.m43741q0(list2)), false);
        }
        return z3 ? s2oVar.m77079O(new r731((String) g6f.m43741q0(list2)), false) : s2oVar.m77079O(new j731((String) g6f.m43741q0(list2)), false);
    }

    /* JADX INFO: renamed from: d */
    public final Completable m48945d(List list, List list2, List list3) {
        alq0 alq0Var = alq0.f16920O0;
        if (!((ha4) this.f95997e.f25411a.getValue()).m46911d()) {
            return CompletableEmpty.f7437a;
        }
        boolean zIsEmpty = list.isEmpty();
        s2o s2oVar = this.f95994b;
        if (zIsEmpty) {
            na6.m63957e("No item URIs passed, nothing added or removed?");
            return s2oVar.m77079O(alq0Var, false);
        }
        ArrayList arrayListM43700N0 = g6f.m43700N0(list3, list2);
        if (arrayListM43700N0.isEmpty()) {
            na6.m63957e("No added-to or removed-from URIs passed");
            return s2oVar.m77079O(alq0Var, false);
        }
        boolean zMo55547g = this.f95996d.mo55547g(this.f95993a);
        if (arrayListM43700N0.size() != 1) {
            return s2oVar.m77079O(alq0Var, zMo55547g);
        }
        if (!list2.isEmpty()) {
            return s2oVar.m77079O(new j731((String) g6f.m43741q0(list2)), zMo55547g);
        }
        if (!list3.isEmpty()) {
            return s2oVar.m77079O(new q731((String) g6f.m43741q0(list3)), zMo55547g);
        }
        na6.m63957e("Fallback, how did you get here?");
        return s2oVar.m77079O(alq0Var, zMo55547g);
    }
}
