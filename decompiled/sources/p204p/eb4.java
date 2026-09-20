package p204p;

import com.comscore.util.log.LogLevel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f57804a;

    /* JADX INFO: renamed from: b */
    public final boolean f57805b;

    /* JADX INFO: renamed from: c */
    public final boolean f57806c;

    /* JADX INFO: renamed from: d */
    public final boolean f57807d;

    /* JADX INFO: renamed from: e */
    public final boolean f57808e;

    /* JADX INFO: renamed from: f */
    public final boolean f57809f;

    /* JADX INFO: renamed from: g */
    public final boolean f57810g;

    /* JADX INFO: renamed from: h */
    public final boolean f57811h;

    /* JADX INFO: renamed from: i */
    public final boolean f57812i;

    /* JADX INFO: renamed from: j */
    public final cb4 f57813j;

    /* JADX INFO: renamed from: k */
    public final int f57814k;

    /* JADX INFO: renamed from: l */
    public final db4 f57815l;

    /* JADX INFO: renamed from: m */
    public final boolean f57816m;

    /* JADX INFO: renamed from: n */
    public final bji f57817n;

    /* JADX INFO: renamed from: o */
    public final wg61 f57818o;

    public eb4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, cb4 cb4Var, int i, db4 db4Var, boolean z10, bji bjiVar) {
        this.f57804a = z;
        this.f57805b = z2;
        this.f57806c = z3;
        this.f57807d = z4;
        this.f57808e = z5;
        this.f57809f = z6;
        this.f57810g = z7;
        this.f57811h = z8;
        this.f57812i = z9;
        this.f57813j = cb4Var;
        this.f57814k = i;
        this.f57815l = db4Var;
        this.f57816m = z10;
        this.f57817n = bjiVar;
        this.f57818o = new wg61(new ga4(this, 17));
    }

    /* JADX INFO: renamed from: a */
    public final eb4 m38340a() {
        return (eb4) this.f57818o.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m38341b() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38341b() : this.f57804a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m38342c() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38342c() : this.f57805b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m38343d() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38343d() : this.f57806c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m38344e() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38344e() : this.f57807d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m38345f() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38345f() : this.f57808e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m38346g() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38346g() : this.f57809f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m38347h() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38347h() : this.f57810g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m38348i() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38348i() : this.f57811h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m38349j() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38349j() : this.f57812i;
    }

    /* JADX INFO: renamed from: k */
    public final cb4 m38350k() {
        cb4 cb4VarM38350k;
        eb4 eb4VarM38340a = m38340a();
        return (eb4VarM38340a == null || (cb4VarM38350k = eb4VarM38340a.m38350k()) == null) ? this.f57813j : cb4VarM38350k;
    }

    /* JADX INFO: renamed from: l */
    public final int m38351l() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38351l() : this.f57814k;
    }

    /* JADX INFO: renamed from: m */
    public final db4 m38352m() {
        db4 db4VarM38352m;
        eb4 eb4VarM38340a = m38340a();
        return (eb4VarM38340a == null || (db4VarM38352m = eb4VarM38340a.m38352m()) == null) ? this.f57815l : db4VarM38352m;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("enable_always_show_new_interaction_in_container", "android-libs-endless-feed", m38341b());
        k8a k8aVar2 = new k8a("enable_backend_personas", "android-libs-endless-feed", m38342c());
        k8a k8aVar3 = new k8a("enable_dj_feedback", "android-libs-endless-feed", m38343d());
        k8a k8aVar4 = new k8a("enable_interactivity_from_uri", "android-libs-endless-feed", m38344e());
        k8a k8aVar5 = new k8a("enable_interactivity_standalone_player", "android-libs-endless-feed", m38345f());
        k8a k8aVar6 = new k8a("enable_language_selection", "android-libs-endless-feed", m38346g());
        k8a k8aVar7 = new k8a("enable_mic_permission_dialog_pause", "android-libs-endless-feed", m38347h());
        k8a k8aVar8 = new k8a("enable_premium_upsell_dialog", "android-libs-endless-feed", m38348i());
        k8a k8aVar9 = new k8a("enable_voice_improvements", "android-libs-endless-feed", m38349j());
        String str = m38350k().f36005a;
        cb4[] cb4VarArrValues = cb4.values();
        ArrayList arrayList = new ArrayList(cb4VarArrValues.length);
        for (cb4 cb4Var : cb4VarArrValues) {
            arrayList.add(cb4Var.f36005a);
        }
        k8a k8aVar10 = new k8a("interactivity_container_dismiss_state", "android-libs-endless-feed", str, arrayList);
        k8a k8aVar11 = new k8a("interactivity_timeout_ms", "android-libs-endless-feed", m38351l(), 0, 60000);
        String str2 = m38352m().f47193a;
        db4[] db4VarArrValues = db4.values();
        ArrayList arrayList2 = new ArrayList(db4VarArrValues.length);
        int length = db4VarArrValues.length;
        int i = 0;
        while (i < length) {
            arrayList2.add(db4VarArrValues[i].f47193a);
            i++;
            k8aVar = k8aVar;
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, k8aVar5, k8aVar6, k8aVar7, k8aVar8, k8aVar9, k8aVar10, k8aVar11, new k8a("market_for_disclaimer", "android-libs-endless-feed", str2, arrayList2), new k8a("prompt_via_signal", "android-libs-endless-feed", m38353n()));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m38353n() {
        eb4 eb4VarM38340a = m38340a();
        return eb4VarM38340a != null ? eb4VarM38340a.m38353n() : this.f57816m;
    }

    public eb4(bji bjiVar) {
        this(false, false, false, false, false, false, false, false, false, cb4.ACKNOWLEDGE, LogLevel.NONE, db4.US_MARKET, false, bjiVar);
    }
}
