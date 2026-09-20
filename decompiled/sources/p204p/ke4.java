package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ke4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final ie4 f121789a;

    /* JADX INFO: renamed from: b */
    public final boolean f121790b;

    /* JADX INFO: renamed from: c */
    public final boolean f121791c;

    /* JADX INFO: renamed from: d */
    public final boolean f121792d;

    /* JADX INFO: renamed from: e */
    public final je4 f121793e;

    /* JADX INFO: renamed from: f */
    public final boolean f121794f;

    /* JADX INFO: renamed from: g */
    public final bji f121795g;

    /* JADX INFO: renamed from: h */
    public final wg61 f121796h;

    public ke4(ie4 ie4Var, boolean z, boolean z2, boolean z3, je4 je4Var, boolean z4, bji bjiVar) {
        this.f121789a = ie4Var;
        this.f121790b = z;
        this.f121791c = z2;
        this.f121792d = z3;
        this.f121793e = je4Var;
        this.f121794f = z4;
        this.f121795g = bjiVar;
        this.f121796h = new wg61(new dd4(this, 27));
    }

    /* JADX INFO: renamed from: a */
    public final ie4 m56179a() {
        ie4 ie4VarM56179a;
        ke4 ke4VarM56182d = m56182d();
        return (ke4VarM56182d == null || (ie4VarM56179a = ke4VarM56182d.m56179a()) == null) ? this.f121789a : ie4VarM56179a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m56180b() {
        ke4 ke4VarM56182d = m56182d();
        return ke4VarM56182d != null ? ke4VarM56182d.m56180b() : this.f121790b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m56181c() {
        ke4 ke4VarM56182d = m56182d();
        return ke4VarM56182d != null ? ke4VarM56182d.m56181c() : this.f121791c;
    }

    /* JADX INFO: renamed from: d */
    public final ke4 m56182d() {
        return (ke4) this.f121796h.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m56183e() {
        ke4 ke4VarM56182d = m56182d();
        return ke4VarM56182d != null ? ke4VarM56182d.m56183e() : this.f121792d;
    }

    /* JADX INFO: renamed from: f */
    public final je4 m56184f() {
        je4 je4VarM56184f;
        ke4 ke4VarM56182d = m56182d();
        return (ke4VarM56182d == null || (je4VarM56184f = ke4VarM56182d.m56184f()) == null) ? this.f121793e : je4VarM56184f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m56185g() {
        ke4 ke4VarM56182d = m56182d();
        return ke4VarM56182d != null ? ke4VarM56182d.m56185g() : this.f121794f;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m56179a().f101314a;
        ie4[] ie4VarArrValues = ie4.values();
        ArrayList arrayList = new ArrayList(ie4VarArrValues.length);
        for (ie4 ie4Var : ie4VarArrValues) {
            arrayList.add(ie4Var.f101314a);
        }
        k8a k8aVar = new k8a("chip_animation_trigger", "android-list-ux-platform-consumers-sessioncontrol-sections-chips", str, arrayList);
        k8a k8aVar2 = new k8a("chip_bar_action_enabled", "android-list-ux-platform-consumers-sessioncontrol-sections-chips", m56180b());
        k8a k8aVar3 = new k8a("chips_section_enabled", "android-list-ux-platform-consumers-sessioncontrol-sections-chips", m56181c());
        k8a k8aVar4 = new k8a("enable_animation_for_all_sets", "android-list-ux-platform-consumers-sessioncontrol-sections-chips", m56183e());
        String str2 = m56184f().f111446a;
        je4[] je4VarArrValues = je4.values();
        ArrayList arrayList2 = new ArrayList(je4VarArrValues.length);
        for (je4 je4Var : je4VarArrValues) {
            arrayList2.add(je4Var.f111446a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, new k8a("override_chip_border_style", "android-list-ux-platform-consumers-sessioncontrol-sections-chips", str2, arrayList2), new k8a("prompt_chip_enabled", "android-list-ux-platform-consumers-sessioncontrol-sections-chips", m56185g()));
    }

    public ke4(bji bjiVar) {
        this(ie4.NEVER, false, true, false, je4.NONE, false, bjiVar);
    }
}
