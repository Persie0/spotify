package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class yf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f272115a;

    /* JADX INFO: renamed from: b */
    public final boolean f272116b;

    /* JADX INFO: renamed from: c */
    public final xf4 f272117c;

    /* JADX INFO: renamed from: d */
    public final boolean f272118d;

    /* JADX INFO: renamed from: e */
    public final boolean f272119e;

    /* JADX INFO: renamed from: f */
    public final bji f272120f;

    /* JADX INFO: renamed from: g */
    public final wg61 f272121g;

    public yf4(boolean z, boolean z2, xf4 xf4Var, boolean z3, boolean z4, bji bjiVar) {
        this.f272115a = z;
        this.f272116b = z2;
        this.f272117c = xf4Var;
        this.f272118d = z3;
        this.f272119e = z4;
        this.f272120f = bjiVar;
        this.f272121g = new wg61(new f30(this, 19));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m93539b() {
        yf4 yf4Var = (yf4) this.f272121g.getValue();
        return yf4Var != null ? yf4Var.m93539b() : this.f272115a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m93540c() {
        yf4 yf4Var = (yf4) this.f272121g.getValue();
        return yf4Var != null ? yf4Var.m93540c() : this.f272116b;
    }

    /* JADX INFO: renamed from: d */
    public final xf4 m93541d() {
        xf4 xf4VarM93541d;
        yf4 yf4Var = (yf4) this.f272121g.getValue();
        return (yf4Var == null || (xf4VarM93541d = yf4Var.m93541d()) == null) ? this.f272117c : xf4VarM93541d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m93542e() {
        yf4 yf4Var = (yf4) this.f272121g.getValue();
        return yf4Var != null ? yf4Var.m93542e() : this.f272118d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m93543f() {
        yf4 yf4Var = (yf4) this.f272121g.getValue();
        return yf4Var != null ? yf4Var.m93543f() : this.f272119e;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("continue_tts_playback_after_chat_close_enabled", "android-martini-page", m93539b());
        k8a k8aVar2 = new k8a("dj_conversation_starter_enabled", "android-martini-page", m93540c());
        String str = m93541d().f260828a;
        xf4[] xf4VarArrValues = xf4.values();
        ArrayList arrayList = new ArrayList(xf4VarArrValues.length);
        for (xf4 xf4Var : xf4VarArrValues) {
            arrayList.add(xf4Var.f260828a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, new k8a("mic_button_mode", "android-martini-page", str, arrayList), new k8a("report_bug_badge_enabled", "android-martini-page", m93542e()), new k8a("tts_toggle_enabled", "android-martini-page", m93543f()));
    }

    public yf4(bji bjiVar) {
        this(false, true, xf4.DISABLED, false, false, bjiVar);
    }
}
