package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final u54 f247982a;

    /* JADX INFO: renamed from: b */
    public final boolean f247983b;

    /* JADX INFO: renamed from: c */
    public final boolean f247984c;

    /* JADX INFO: renamed from: d */
    public final boolean f247985d;

    /* JADX INFO: renamed from: e */
    public final boolean f247986e;

    /* JADX INFO: renamed from: f */
    public final boolean f247987f;

    /* JADX INFO: renamed from: g */
    public final boolean f247988g;

    /* JADX INFO: renamed from: h */
    public final boolean f247989h;

    /* JADX INFO: renamed from: i */
    public final fnk0 f247990i;

    /* JADX INFO: renamed from: j */
    public final bji f247991j;

    /* JADX INFO: renamed from: k */
    public final wg61 f247992k;

    /* JADX INFO: renamed from: l */
    public final wg61 f247993l;

    public w54(u54 u54Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, fnk0 fnk0Var, bji bjiVar) {
        this.f247982a = u54Var;
        this.f247983b = z;
        this.f247984c = z2;
        this.f247985d = z3;
        this.f247986e = z4;
        this.f247987f = z5;
        this.f247988g = z6;
        this.f247989h = z7;
        this.f247990i = fnk0Var;
        this.f247991j = bjiVar;
        this.f247992k = new wg61(new f30(this, 12));
        this.f247993l = new wg61(new o54(this, 5));
    }

    /* JADX INFO: renamed from: a */
    public final w54 m87217a() {
        return (w54) this.f247993l.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final u54 m87218b() {
        u54 u54VarM87218b;
        w54 w54VarM87217a = m87217a();
        return (w54VarM87217a == null || (u54VarM87218b = w54VarM87217a.m87218b()) == null) ? this.f247982a : u54VarM87218b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87219c() {
        w54 w54VarM87217a = m87217a();
        return w54VarM87217a != null ? w54VarM87217a.m87219c() : this.f247983b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m87220d() {
        w54 w54VarM87217a = m87217a();
        return w54VarM87217a != null ? w54VarM87217a.m87220d() : this.f247984c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m87221e() {
        w54 w54VarM87217a = m87217a();
        return w54VarM87217a != null ? w54VarM87217a.m87221e() : this.f247985d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m87222f() {
        w54 w54VarM87217a = m87217a();
        return w54VarM87217a != null ? w54VarM87217a.m87222f() : this.f247986e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m87223g() {
        w54 w54VarM87217a = m87217a();
        return w54VarM87217a != null ? w54VarM87217a.m87223g() : this.f247987f;
    }

    /* JADX INFO: renamed from: h */
    public final Observable m87224h() {
        if (this.f247990i != null) {
            Observable observableDistinctUntilChanged = ((Observable) this.f247992k.getValue()).map(u0o0.f225565g).distinctUntilChanged();
            wj50.m88279p(observableDistinctUntilChanged);
            return observableDistinctUntilChanged;
        }
        Observable observableJust = Observable.just(Boolean.valueOf(this.f247983b));
        wj50.m88279p(observableJust);
        return observableJust;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m87225i() {
        w54 w54VarM87217a = m87217a();
        return w54VarM87217a != null ? w54VarM87217a.m87225i() : this.f247989h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m87226j() {
        w54 w54VarM87217a = m87217a();
        return w54VarM87217a != null ? w54VarM87217a.m87226j() : this.f247988g;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m87218b().f226901a;
        u54[] u54VarArrValues = u54.values();
        ArrayList arrayList = new ArrayList(u54VarArrValues.length);
        for (u54 u54Var : u54VarArrValues) {
            arrayList.add(u54Var.f226901a);
        }
        return h6f.m46715L(new k8a("enable_group_matches_session_modifier", "android-feature-nowplaying-queue-bottom-sheet", str, arrayList), new k8a("enable_mft_plus_queue", "android-feature-nowplaying-queue-bottom-sheet", m87219c()), new k8a("enable_player_state_restrictions", "android-feature-nowplaying-queue-bottom-sheet", m87220d()), new k8a("enable_reshuffle", "android-feature-nowplaying-queue-bottom-sheet", m87221e()), new k8a("enable_track_row_element", "android-feature-nowplaying-queue-bottom-sheet", m87222f()), new k8a("enable_video_track_row", "android-feature-nowplaying-queue-bottom-sheet", m87223g()), new k8a("is_queue_peek_persistent_enabled", "android-feature-nowplaying-queue-bottom-sheet", m87226j()), new k8a("use_resolved_subtitles", "android-feature-nowplaying-queue-bottom-sheet", m87225i()));
    }

    public w54(fnk0 fnk0Var, bji bjiVar) {
        this(u54.OFF, false, false, false, false, false, false, false, fnk0Var, bjiVar);
    }
}
