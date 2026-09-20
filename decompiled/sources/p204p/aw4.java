package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class aw4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f20368a;

    /* JADX INFO: renamed from: b */
    public final boolean f20369b;

    /* JADX INFO: renamed from: c */
    public final boolean f20370c;

    /* JADX INFO: renamed from: d */
    public final boolean f20371d;

    /* JADX INFO: renamed from: e */
    public final zv4 f20372e;

    /* JADX INFO: renamed from: f */
    public final boolean f20373f;

    /* JADX INFO: renamed from: g */
    public final boolean f20374g;

    /* JADX INFO: renamed from: h */
    public final boolean f20375h;

    /* JADX INFO: renamed from: i */
    public final bji f20376i;

    /* JADX INFO: renamed from: j */
    public final wg61 f20377j = new wg61(new uu4(this, 15));

    public aw4(boolean z, boolean z2, boolean z3, boolean z4, zv4 zv4Var, boolean z5, boolean z6, boolean z7, bji bjiVar) {
        this.f20368a = z;
        this.f20369b = z2;
        this.f20370c = z3;
        this.f20371d = z4;
        this.f20372e = zv4Var;
        this.f20373f = z5;
        this.f20374g = z6;
        this.f20375h = z7;
        this.f20376i = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27276a() {
        aw4 aw4VarM27278c = m27278c();
        return aw4VarM27278c != null ? aw4VarM27278c.m27276a() : this.f20368a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m27277b() {
        aw4 aw4VarM27278c = m27278c();
        return aw4VarM27278c != null ? aw4VarM27278c.m27277b() : this.f20369b;
    }

    /* JADX INFO: renamed from: c */
    public final aw4 m27278c() {
        return (aw4) this.f20377j.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m27279d() {
        aw4 aw4VarM27278c = m27278c();
        return aw4VarM27278c != null ? aw4VarM27278c.m27279d() : this.f20370c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m27280e() {
        aw4 aw4VarM27278c = m27278c();
        return aw4VarM27278c != null ? aw4VarM27278c.m27280e() : this.f20371d;
    }

    /* JADX INFO: renamed from: f */
    public final zv4 m27281f() {
        zv4 zv4VarM27281f;
        aw4 aw4VarM27278c = m27278c();
        return (aw4VarM27278c == null || (zv4VarM27281f = aw4VarM27278c.m27281f()) == null) ? this.f20372e : zv4VarM27281f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m27282g() {
        aw4 aw4VarM27278c = m27278c();
        return aw4VarM27278c != null ? aw4VarM27278c.m27282g() : this.f20373f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m27283h() {
        aw4 aw4VarM27278c = m27278c();
        return aw4VarM27278c != null ? aw4VarM27278c.m27283h() : this.f20374g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m27284i() {
        aw4 aw4VarM27278c = m27278c();
        return aw4VarM27278c != null ? aw4VarM27278c.m27284i() : this.f20375h;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("chip_selection_enabled", "android-zephyr", m27276a());
        k8a k8aVar2 = new k8a("connect_transfer_messaging_enabled", "android-zephyr", m27277b());
        k8a k8aVar3 = new k8a(x09.f256832d, "android-zephyr", m27279d());
        k8a k8aVar4 = new k8a("opt_in_enabled", "android-zephyr", m27280e());
        String strM97088a = m27281f().m97088a();
        zv4[] zv4VarArrValues = zv4.values();
        ArrayList arrayList = new ArrayList(zv4VarArrValues.length);
        for (zv4 zv4Var : zv4VarArrValues) {
            arrayList.add(zv4Var.m97088a());
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, new k8a("speed_disclosure_and_opt_out", "android-zephyr", strM97088a, arrayList), new k8a("sync_lyrics_enabled", "android-zephyr", m27282g()), new k8a("track_context_menu_enabled", "android-zephyr", m27283h()), new k8a("validate_transitions_using_core_enabled", "android-zephyr", m27284i()));
    }
}
