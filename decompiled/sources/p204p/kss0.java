package p204p;

import com.spotify.gating.dryrun.C0770a;
import com.spotify.gating.dryrun.C0771b;
import com.spotify.gating.dryrun.GatingDryRunMismatchEvent;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class kss0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f126005a;

    /* JADX INFO: renamed from: b */
    public final l54 f126006b;

    /* JADX INFO: renamed from: c */
    public final ee4 f126007c;

    /* JADX INFO: renamed from: d */
    public final yc90 f126008d;

    /* JADX INFO: renamed from: e */
    public final wg61 f126009e = new wg61(new bss0(this, 0));

    /* JADX INFO: renamed from: f */
    public final wg61 f126010f = new wg61(new nzk0(this, 20));

    /* JADX INFO: renamed from: g */
    public final wg61 f126011g = new wg61(new bss0(this, 1));

    public kss0(i4t0 i4t0Var, l54 l54Var, ee4 ee4Var, yc90 yc90Var) {
        this.f126005a = i4t0Var;
        this.f126006b = l54Var;
        this.f126007c = ee4Var;
        this.f126008d = yc90Var;
    }

    /* JADX INFO: renamed from: a */
    public static final yfy m57250a(kss0 kss0Var) {
        return (yfy) kss0Var.f126009e.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final fmu0 m57251b() {
        return (fmu0) this.f126010f.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m57252c() {
        if (!this.f126006b.m58192a()) {
            return false;
        }
        mey meyVar = (mey) ((Map) m57251b().getValue()).get(aps0.f18006a);
        key keyVar = meyVar instanceof key ? (key) meyVar : null;
        return (keyVar != null ? keyVar.f121991b : null) instanceof C2448uc;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m57253d() {
        m57258i();
        l54 l54Var = this.f126006b;
        return l54Var.m58199h() ? ((Map) m57251b().getValue()).get(aps0.f18006a) instanceof ley : l54Var.m58195d();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m57254e() {
        return m57253d() || m57252c();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m57255f() {
        return m57256g() && this.f126007c.m38643b();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m57256g() {
        m57258i();
        return this.f126006b.m58199h() ? ((Map) m57251b().getValue()).get(bps0.f29602a) instanceof ley : this.f126007c.m38642a();
    }

    /* JADX INFO: renamed from: h */
    public final ess0 m57257h() {
        return new ess0(m57251b().mo26211a(), this, 1);
    }

    /* JADX INFO: renamed from: i */
    public final void m57258i() {
        String str;
        GatingDryRunMismatchEvent.Mismatches mismatches;
        yfy yfyVar = (yfy) this.f126009e.getValue();
        Map mapM56695h0 = kkc0.m56695h0(new pqm0(bps0.f29602a, Boolean.valueOf(this.f126007c.m38642a())), new pqm0(aps0.f18006a, Boolean.valueOf(this.f126006b.m58195d())));
        mw00 mw00Var = yfyVar.f272379i;
        if (!mw00Var.f147677a || mw00Var.f147681e) {
            return;
        }
        mw00Var.f147681e = true;
        Map map = (Map) mw00Var.f147680d.invoke(g6f.m43728j1(mapM56695h0.keySet()));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapM56695h0.entrySet()) {
            sey seyVar = (sey) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z = map.get(seyVar) instanceof ley;
            if (zBooleanValue == z) {
                mismatches = null;
            } else {
                mey meyVar = (mey) map.get(seyVar);
                if (meyVar instanceof key) {
                    AbstractC1737cd abstractC1737cd = ((key) meyVar).f121991b;
                    if (abstractC1737cd instanceof C2490vc) {
                        str = "entitlement_missing";
                    } else if (abstractC1737cd instanceof C2448uc) {
                        str = "capped";
                    } else if (abstractC1737cd instanceof C2371sc) {
                        str = "age_assurance_required";
                    } else if (abstractC1737cd instanceof C2410tc) {
                        str = "blocked_by_user_setting";
                    } else if (abstractC1737cd instanceof C1700bd) {
                        str = "feature_unavailable";
                    } else if (abstractC1737cd instanceof C2567xc) {
                        str = "age_restricted";
                    } else if (abstractC1737cd instanceof C2645zc) {
                        str = "child_account";
                    } else if (abstractC1737cd instanceof C1663ad) {
                        str = "device_not_supported";
                    } else {
                        if (!(abstractC1737cd instanceof C2608yc)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "blocked_by_account_manager";
                    }
                } else {
                    str = "";
                }
                C0771b c0771bM11156r = GatingDryRunMismatchEvent.Mismatches.m11156r();
                c0771bM11156r.m11159m(seyVar.mo26728a());
                c0771bM11156r.m11162s(zBooleanValue);
                c0771bM11156r.m11161r(z);
                c0771bM11156r.m11160q(str);
                mismatches = (GatingDryRunMismatchEvent.Mismatches) c0771bM11156r.build();
            }
            if (mismatches != null) {
                arrayList.add(mismatches);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        qre0 qre0Var = mw00Var.f147678b;
        C0770a c0770aM11151p = GatingDryRunMismatchEvent.m11151p();
        c0770aM11151p.m11158q(mw00Var.f147679c);
        c0770aM11151p.m11157m(arrayList);
        qre0Var.m73616a(c0770aM11151p.build());
    }
}
