package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final p44 f185051a;

    /* JADX INFO: renamed from: b */
    public final boolean f185052b;

    /* JADX INFO: renamed from: c */
    public final bji f185053c;

    /* JADX INFO: renamed from: d */
    public final wg61 f185054d = new wg61(new y34(this, 14));

    public q44(p44 p44Var, boolean z, bji bjiVar) {
        this.f185051a = p44Var;
        this.f185052b = z;
        this.f185053c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final p44 m72141a() {
        p44 p44VarM72141a;
        q44 q44Var = (q44) this.f185054d.getValue();
        return (q44Var == null || (p44VarM72141a = q44Var.m72141a()) == null) ? this.f185051a : p44VarM72141a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m72142b() {
        q44 q44Var = (q44) this.f185054d.getValue();
        return q44Var != null ? q44Var.m72142b() : this.f185052b;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m72141a().f173807a;
        p44[] p44VarArrValues = p44.values();
        ArrayList arrayList = new ArrayList(p44VarArrValues.length);
        for (p44 p44Var : p44VarArrValues) {
            arrayList.add(p44Var.f173807a);
        }
        return h6f.m46715L(new k8a("create_menu_icon_placement", "android-feature-create-menu", str, arrayList), new k8a("use_sectioned_create_menu", "android-feature-create-menu", m72142b()));
    }
}
