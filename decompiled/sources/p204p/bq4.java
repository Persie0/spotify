package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f29660a;

    /* JADX INFO: renamed from: b */
    public final boolean f29661b;

    /* JADX INFO: renamed from: c */
    public final boolean f29662c;

    /* JADX INFO: renamed from: d */
    public final boolean f29663d;

    /* JADX INFO: renamed from: e */
    public final boolean f29664e;

    /* JADX INFO: renamed from: f */
    public final zp4 f29665f;

    /* JADX INFO: renamed from: g */
    public final aq4 f29666g;

    /* JADX INFO: renamed from: h */
    public final bji f29667h;

    /* JADX INFO: renamed from: i */
    public final wg61 f29668i;

    public bq4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, zp4 zp4Var, aq4 aq4Var, bji bjiVar) {
        this.f29660a = z;
        this.f29661b = z2;
        this.f29662c = z3;
        this.f29663d = z4;
        this.f29664e = z5;
        this.f29665f = zp4Var;
        this.f29666g = aq4Var;
        this.f29667h = bjiVar;
        this.f29668i = new wg61(new kp4(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public final bq4 m30174a() {
        return (bq4) this.f29668i.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m30175b() {
        bq4 bq4VarM30174a = m30174a();
        return bq4VarM30174a != null ? bq4VarM30174a.m30175b() : this.f29660a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m30176c() {
        bq4 bq4VarM30174a = m30174a();
        return bq4VarM30174a != null ? bq4VarM30174a.m30176c() : this.f29661b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m30177d() {
        bq4 bq4VarM30174a = m30174a();
        return bq4VarM30174a != null ? bq4VarM30174a.m30177d() : this.f29662c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m30178e() {
        bq4 bq4VarM30174a = m30174a();
        return bq4VarM30174a != null ? bq4VarM30174a.m30178e() : this.f29663d;
    }

    /* JADX INFO: renamed from: f */
    public final zp4 m30179f() {
        zp4 zp4VarM30179f;
        bq4 bq4VarM30174a = m30174a();
        return (bq4VarM30174a == null || (zp4VarM30179f = bq4VarM30174a.m30179f()) == null) ? this.f29665f : zp4VarM30179f;
    }

    /* JADX INFO: renamed from: g */
    public final aq4 m30180g() {
        aq4 aq4VarM30180g;
        bq4 bq4VarM30174a = m30174a();
        return (bq4VarM30174a == null || (aq4VarM30180g = bq4VarM30174a.m30180g()) == null) ? this.f29666g : aq4VarM30180g;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m30181h() {
        bq4 bq4VarM30174a = m30174a();
        return bq4VarM30174a != null ? bq4VarM30174a.m30181h() : this.f29664e;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("enable_always_highlight_last_chip", "android-system-home-funkispage", m30175b());
        k8a k8aVar2 = new k8a("enable_assign_focus_on_scroll", "android-system-home-funkispage", m30176c());
        k8a k8aVar3 = new k8a("enable_left_aligned_selected_filter_chip_scrolling", "android-system-home-funkispage", m30177d());
        k8a k8aVar4 = new k8a("enable_page_presentation_update", "android-system-home-funkispage", m30178e());
        k8a k8aVar5 = new k8a("is_rive_animations_are_enabled_for_filter_chips", "android-system-home-funkispage", m30181h());
        String str = m30179f().f284931a;
        zp4[] zp4VarArrValues = zp4.values();
        ArrayList arrayList = new ArrayList(zp4VarArrValues.length);
        for (zp4 zp4Var : zp4VarArrValues) {
            arrayList.add(zp4Var.f284931a);
        }
        k8a k8aVar6 = new k8a("override_highlighted_chip_style", "android-system-home-funkispage", str, arrayList);
        String str2 = m30180g().f18070a;
        aq4[] aq4VarArrValues = aq4.values();
        ArrayList arrayList2 = new ArrayList(aq4VarArrValues.length);
        for (aq4 aq4Var : aq4VarArrValues) {
            arrayList2.add(aq4Var.f18070a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, k8aVar5, k8aVar6, new k8a("root_page_top_offset_adjustment", "android-system-home-funkispage", str2, arrayList2));
    }

    public bq4(bji bjiVar) {
        this(false, false, false, false, false, zp4.DISABLED, aq4.LARGE, bjiVar);
    }
}
