package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final h34 f98008a;

    /* JADX INFO: renamed from: b */
    public final boolean f98009b;

    /* JADX INFO: renamed from: c */
    public final bji f98010c;

    /* JADX INFO: renamed from: d */
    public final wg61 f98011d;

    public i34(h34 h34Var, boolean z, bji bjiVar) {
        this.f98008a = h34Var;
        this.f98009b = z;
        this.f98010c = bjiVar;
        this.f98011d = new wg61(new u14(this, 17));
    }

    /* JADX INFO: renamed from: a */
    public final h34 m49571a() {
        h34 h34VarM49571a;
        i34 i34Var = (i34) this.f98011d.getValue();
        return (i34Var == null || (h34VarM49571a = i34Var.m49571a()) == null) ? this.f98008a : h34VarM49571a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m49572b() {
        i34 i34Var = (i34) this.f98011d.getValue();
        return i34Var != null ? i34Var.m49572b() : this.f98009b;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m49571a().f87125a;
        h34[] h34VarArrValues = h34.values();
        ArrayList arrayList = new ArrayList(h34VarArrValues.length);
        for (h34 h34Var : h34VarArrValues) {
            arrayList.add(h34Var.f87125a);
        }
        return h6f.m46715L(new k8a("experiment", "android-entitypages-shuffleonfreeimpl", str, arrayList), new k8a("smart_shuffle_hide_new_badge_on_premium_when_upsell_was_seen_on_free", "android-entitypages-shuffleonfreeimpl", m49572b()));
    }

    public i34(bji bjiVar) {
        this(h34.LINEAR, false, bjiVar);
    }
}
