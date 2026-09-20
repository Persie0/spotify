package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ru4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f202735a;

    /* JADX INFO: renamed from: b */
    public final boolean f202736b;

    /* JADX INFO: renamed from: c */
    public final boolean f202737c;

    /* JADX INFO: renamed from: d */
    public final boolean f202738d;

    /* JADX INFO: renamed from: e */
    public final qu4 f202739e;

    /* JADX INFO: renamed from: f */
    public final bji f202740f;

    /* JADX INFO: renamed from: g */
    public final wg61 f202741g;

    public ru4(boolean z, boolean z2, boolean z3, boolean z4, qu4 qu4Var, bji bjiVar) {
        this.f202735a = z;
        this.f202736b = z2;
        this.f202737c = z3;
        this.f202738d = z4;
        this.f202739e = qu4Var;
        this.f202740f = bjiVar;
        this.f202741g = new wg61(new zr4(this, 27));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76419a() {
        ru4 ru4Var = (ru4) this.f202741g.getValue();
        return ru4Var != null ? ru4Var.m76419a() : this.f202735a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m76420b() {
        ru4 ru4Var = (ru4) this.f202741g.getValue();
        return ru4Var != null ? ru4Var.m76420b() : this.f202736b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m76421c() {
        ru4 ru4Var = (ru4) this.f202741g.getValue();
        return ru4Var != null ? ru4Var.m76421c() : this.f202737c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m76422d() {
        ru4 ru4Var = (ru4) this.f202741g.getValue();
        return ru4Var != null ? ru4Var.m76422d() : this.f202738d;
    }

    /* JADX INFO: renamed from: e */
    public final qu4 m76423e() {
        qu4 qu4VarM76423e;
        ru4 ru4Var = (ru4) this.f202741g.getValue();
        return (ru4Var == null || (qu4VarM76423e = ru4Var.m76423e()) == null) ? this.f202739e : qu4VarM76423e;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("auto_retry_only_on_certain_status_codes", "android-watch-feed", m76419a());
        k8a k8aVar2 = new k8a("exponential_backoff_for_retries_enabled", "android-watch-feed", m76420b());
        k8a k8aVar3 = new k8a("page_request_auto_retry_enabled", "android-watch-feed", m76421c());
        k8a k8aVar4 = new k8a("restore_npv_upon_back_navigation", "android-watch-feed", m76422d());
        String str = m76423e().f192558a;
        qu4[] qu4VarArrValues = qu4.values();
        ArrayList arrayList = new ArrayList(qu4VarArrValues.length);
        for (qu4 qu4Var : qu4VarArrValues) {
            arrayList.add(qu4Var.f192558a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, new k8a("vertical_scroll_onboarding_completion_strategy", "android-watch-feed", str, arrayList));
    }

    public ru4(bji bjiVar) {
        this(false, false, false, false, qu4.DEFAULT, bjiVar);
    }
}
