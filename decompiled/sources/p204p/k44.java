package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f119067a;

    /* JADX INFO: renamed from: b */
    public final boolean f119068b;

    /* JADX INFO: renamed from: c */
    public final boolean f119069c;

    /* JADX INFO: renamed from: d */
    public final boolean f119070d;

    /* JADX INFO: renamed from: e */
    public final boolean f119071e;

    /* JADX INFO: renamed from: f */
    public final boolean f119072f;

    /* JADX INFO: renamed from: g */
    public final int f119073g;

    /* JADX INFO: renamed from: h */
    public final int f119074h;

    /* JADX INFO: renamed from: i */
    public final j44 f119075i;

    /* JADX INFO: renamed from: j */
    public final int f119076j;

    /* JADX INFO: renamed from: k */
    public final bji f119077k;

    /* JADX INFO: renamed from: l */
    public final wg61 f119078l = new wg61(new y34(this, 9));

    public k44(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, j44 j44Var, int i4, bji bjiVar) {
        this.f119067a = i;
        this.f119068b = z;
        this.f119069c = z2;
        this.f119070d = z3;
        this.f119071e = z4;
        this.f119072f = z5;
        this.f119073g = i2;
        this.f119074h = i3;
        this.f119075i = j44Var;
        this.f119076j = i4;
        this.f119077k = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m55330a() {
        k44 k44VarM55331b = m55331b();
        return k44VarM55331b != null ? k44VarM55331b.m55330a() : this.f119067a;
    }

    /* JADX INFO: renamed from: b */
    public final k44 m55331b() {
        return (k44) this.f119078l.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m55332c() {
        k44 k44VarM55331b = m55331b();
        return k44VarM55331b != null ? k44VarM55331b.m55332c() : this.f119068b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m55333d() {
        k44 k44VarM55331b = m55331b();
        return k44VarM55331b != null ? k44VarM55331b.m55333d() : this.f119069c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m55334e() {
        k44 k44VarM55331b = m55331b();
        return k44VarM55331b != null ? k44VarM55331b.m55334e() : this.f119070d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m55335f() {
        k44 k44VarM55331b = m55331b();
        return k44VarM55331b != null ? k44VarM55331b.m55335f() : this.f119071e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m55336g() {
        k44 k44VarM55331b = m55331b();
        return k44VarM55331b != null ? k44VarM55331b.m55336g() : this.f119072f;
    }

    /* JADX INFO: renamed from: h */
    public final int m55337h() {
        k44 k44VarM55331b = m55331b();
        return k44VarM55331b != null ? k44VarM55331b.m55337h() : this.f119073g;
    }

    /* JADX INFO: renamed from: i */
    public final int m55338i() {
        k44 k44VarM55331b = m55331b();
        return k44VarM55331b != null ? k44VarM55331b.m55338i() : this.f119074h;
    }

    /* JADX INFO: renamed from: j */
    public final j44 m55339j() {
        j44 j44VarM55339j;
        k44 k44VarM55331b = m55331b();
        return (k44VarM55331b == null || (j44VarM55339j = k44VarM55331b.m55339j()) == null) ? this.f119075i : j44VarM55339j;
    }

    /* JADX INFO: renamed from: k */
    public final int m55340k() {
        k44 k44VarM55331b = m55331b();
        return k44VarM55331b != null ? k44VarM55331b.m55340k() : this.f119076j;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("affirmation_snackbar_time_window_ms", "android-feature-campfire-notification-nudges", m55330a(), 60000, 3600000);
        k8a k8aVar2 = new k8a("disable_non_essential_push_on_nudge_interaction", "android-feature-campfire-notification-nudges", m55332c());
        k8a k8aVar3 = new k8a("enable_dismiss_button_on_nudge", "android-feature-campfire-notification-nudges", m55333d());
        k8a k8aVar4 = new k8a("enable_notifications_opt_in_nudge_on_chat_list", "android-feature-campfire-notification-nudges", m55334e());
        k8a k8aVar5 = new k8a("enable_notifications_opt_in_nudge_on_chat_page", "android-feature-campfire-notification-nudges", m55335f());
        k8a k8aVar6 = new k8a("enable_notifications_opt_in_nudge_on_side_drawer", "android-feature-campfire-notification-nudges", m55336g());
        k8a k8aVar7 = new k8a("max_nudge_dismiss_count", "android-feature-campfire-notification-nudges", m55337h(), 0, 100);
        k8a k8aVar8 = new k8a("max_nudge_interaction_count", "android-feature-campfire-notification-nudges", m55338i(), 0, 100);
        String str = m55339j().f108581a;
        j44[] j44VarArrValues = j44.values();
        ArrayList arrayList = new ArrayList(j44VarArrValues.length);
        for (j44 j44Var : j44VarArrValues) {
            arrayList.add(j44Var.f108581a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, k8aVar5, k8aVar6, k8aVar7, k8aVar8, new k8a("notifications_opt_in_nudge_flow", "android-feature-campfire-notification-nudges", str, arrayList), new k8a("nudge_storage_version", "android-feature-campfire-notification-nudges", m55340k(), 1, 100));
    }
}
