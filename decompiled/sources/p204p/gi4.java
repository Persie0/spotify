package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gi4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f80042a;

    /* JADX INFO: renamed from: b */
    public final fi4 f80043b;

    /* JADX INFO: renamed from: c */
    public final bji f80044c;

    /* JADX INFO: renamed from: d */
    public final wg61 f80045d;

    public gi4(boolean z, fi4 fi4Var, bji bjiVar) {
        this.f80042a = z;
        this.f80043b = fi4Var;
        this.f80044c = bjiVar;
        this.f80045d = new wg61(new bh4(this, 19));
    }

    /* JADX INFO: renamed from: a */
    public final fi4 m44767a() {
        fi4 fi4VarM44767a;
        gi4 gi4Var = (gi4) this.f80045d.getValue();
        return (gi4Var == null || (fi4VarM44767a = gi4Var.m44767a()) == null) ? this.f80043b : fi4VarM44767a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m44768b() {
        gi4 gi4Var = (gi4) this.f80045d.getValue();
        return gi4Var != null ? gi4Var.m44768b() : this.f80042a;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("is_updated_card_ui_enabled", "android-music-quiz-card-element-impl", m44768b());
        String str = m44767a().f69770a;
        fi4[] fi4VarArrValues = fi4.values();
        ArrayList arrayList = new ArrayList(fi4VarArrValues.length);
        for (fi4 fi4Var : fi4VarArrValues) {
            arrayList.add(fi4Var.f69770a);
        }
        return h6f.m46715L(k8aVar, new k8a("tag_value", "android-music-quiz-card-element-impl", str, arrayList));
    }

    public gi4(bji bjiVar) {
        this(false, fi4.BETA, bjiVar);
    }
}
