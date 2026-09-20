package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f50678a;

    /* JADX INFO: renamed from: b */
    public final an4 f50679b;

    /* JADX INFO: renamed from: c */
    public final boolean f50680c;

    /* JADX INFO: renamed from: d */
    public final boolean f50681d;

    /* JADX INFO: renamed from: e */
    public final int f50682e;

    /* JADX INFO: renamed from: f */
    public final boolean f50683f;

    /* JADX INFO: renamed from: g */
    public final boolean f50684g;

    /* JADX INFO: renamed from: h */
    public final int f50685h;

    /* JADX INFO: renamed from: i */
    public final bn4 f50686i;

    /* JADX INFO: renamed from: j */
    public final bji f50687j;

    /* JADX INFO: renamed from: k */
    public final wg61 f50688k = new wg61(new cn4(this, 0));

    public dn4(int i, an4 an4Var, boolean z, boolean z2, int i2, boolean z3, boolean z4, int i3, bn4 bn4Var, bji bjiVar) {
        this.f50678a = i;
        this.f50679b = an4Var;
        this.f50680c = z;
        this.f50681d = z2;
        this.f50682e = i2;
        this.f50683f = z3;
        this.f50684g = z4;
        this.f50685h = i3;
        this.f50686i = bn4Var;
        this.f50687j = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final dn4 m36446a() {
        return (dn4) this.f50688k.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final int m36447b() {
        dn4 dn4VarM36446a = m36446a();
        return dn4VarM36446a != null ? dn4VarM36446a.m36447b() : this.f50678a;
    }

    /* JADX INFO: renamed from: c */
    public final an4 m36448c() {
        an4 an4VarM36448c;
        dn4 dn4VarM36446a = m36446a();
        return (dn4VarM36446a == null || (an4VarM36448c = dn4VarM36446a.m36448c()) == null) ? this.f50679b : an4VarM36448c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m36449d() {
        dn4 dn4VarM36446a = m36446a();
        return dn4VarM36446a != null ? dn4VarM36446a.m36449d() : this.f50680c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m36450e() {
        dn4 dn4VarM36446a = m36446a();
        return dn4VarM36446a != null ? dn4VarM36446a.m36450e() : this.f50681d;
    }

    /* JADX INFO: renamed from: f */
    public final int m36451f() {
        dn4 dn4VarM36446a = m36446a();
        return dn4VarM36446a != null ? dn4VarM36446a.m36451f() : this.f50682e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m36452g() {
        dn4 dn4VarM36446a = m36446a();
        return dn4VarM36446a != null ? dn4VarM36446a.m36452g() : this.f50683f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m36453h() {
        dn4 dn4VarM36446a = m36446a();
        return dn4VarM36446a != null ? dn4VarM36446a.m36453h() : this.f50684g;
    }

    /* JADX INFO: renamed from: i */
    public final int m36454i() {
        dn4 dn4VarM36446a = m36446a();
        return dn4VarM36446a != null ? dn4VarM36446a.m36454i() : this.f50685h;
    }

    /* JADX INFO: renamed from: j */
    public final bn4 m36455j() {
        bn4 bn4VarM36455j;
        dn4 dn4VarM36446a = m36446a();
        return (dn4VarM36446a == null || (bn4VarM36455j = dn4VarM36446a.m36455j()) == null) ? this.f50686i : bn4VarM36455j;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("device_proximity_time_threshold_ms", "android-proximity-detector", m36447b(), 0, 86400000);
        String str = m36448c().f17293a;
        an4[] an4VarArrValues = an4.values();
        ArrayList arrayList = new ArrayList(an4VarArrValues.length);
        for (an4 an4Var : an4VarArrValues) {
            arrayList.add(an4Var.f17293a);
        }
        k8a k8aVar2 = new k8a("device_suggestion_bottom_sheet_min_proximity_indicator", "android-proximity-detector", str, arrayList);
        k8a k8aVar3 = new k8a("enable_feature", "android-proximity-detector", m36449d());
        k8a k8aVar4 = new k8a("include_user_match_unauthenticated_devices", "android-proximity-detector", m36450e());
        k8a k8aVar5 = new k8a("on_foregrounded_rediscovery_time_threshold_ms", "android-proximity-detector", m36451f(), 0, 86400000);
        k8a k8aVar6 = new k8a("show_device_suggestion_bottom_sheet", "android-proximity-detector", m36452g());
        k8a k8aVar7 = new k8a("write_pull_playback_notification_ble_characteristic", "android-proximity-detector", m36453h());
        k8a k8aVar8 = new k8a("write_pull_playback_notification_ble_characteristic_interval_ms", "android-proximity-detector", m36454i(), 0, 86400000);
        String str2 = m36455j().f28698a;
        bn4[] bn4VarArrValues = bn4.values();
        ArrayList arrayList2 = new ArrayList(bn4VarArrValues.length);
        for (bn4 bn4Var : bn4VarArrValues) {
            arrayList2.add(bn4Var.f28698a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, k8aVar5, k8aVar6, k8aVar7, k8aVar8, new k8a("write_pull_playback_notification_min_proximity_indicator", "android-proximity-detector", str2, arrayList2));
    }
}
