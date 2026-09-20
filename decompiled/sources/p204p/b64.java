package p204p;

import androidx.car.app.model.Alert;
import com.spotify.searchview.proto.AudioEpisode;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f23831a;

    /* JADX INFO: renamed from: b */
    public final boolean f23832b;

    /* JADX INFO: renamed from: c */
    public final int f23833c;

    /* JADX INFO: renamed from: d */
    public final int f23834d;

    /* JADX INFO: renamed from: e */
    public final boolean f23835e;

    /* JADX INFO: renamed from: f */
    public final int f23836f;

    /* JADX INFO: renamed from: g */
    public final boolean f23837g;

    /* JADX INFO: renamed from: h */
    public final boolean f23838h;

    /* JADX INFO: renamed from: i */
    public final bji f23839i;

    /* JADX INFO: renamed from: j */
    public final wg61 f23840j;

    public b64(boolean z, boolean z2, int i, int i2, boolean z3, int i3, boolean z4, boolean z5, bji bjiVar) {
        this.f23831a = z;
        this.f23832b = z2;
        this.f23833c = i;
        this.f23834d = i2;
        this.f23835e = z3;
        this.f23836f = i3;
        this.f23837g = z4;
        this.f23838h = z5;
        this.f23839i = bjiVar;
        this.f23840j = new wg61(new o54(this, 10));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28257a() {
        b64 b64VarM28258b = m28258b();
        return b64VarM28258b != null ? b64VarM28258b.m28257a() : this.f23831a;
    }

    /* JADX INFO: renamed from: b */
    public final b64 m28258b() {
        return (b64) this.f23840j.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m28259c() {
        b64 b64VarM28258b = m28258b();
        return b64VarM28258b != null ? b64VarM28258b.m28259c() : this.f23832b;
    }

    /* JADX INFO: renamed from: d */
    public final int m28260d() {
        b64 b64VarM28258b = m28258b();
        return b64VarM28258b != null ? b64VarM28258b.m28260d() : this.f23833c;
    }

    /* JADX INFO: renamed from: e */
    public final int m28261e() {
        b64 b64VarM28258b = m28258b();
        return b64VarM28258b != null ? b64VarM28258b.m28261e() : this.f23834d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m28262f() {
        b64 b64VarM28258b = m28258b();
        return b64VarM28258b != null ? b64VarM28258b.m28262f() : this.f23835e;
    }

    /* JADX INFO: renamed from: g */
    public final int m28263g() {
        b64 b64VarM28258b = m28258b();
        return b64VarM28258b != null ? b64VarM28258b.m28263g() : this.f23836f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m28264h() {
        b64 b64VarM28258b = m28258b();
        return b64VarM28258b != null ? b64VarM28258b.m28264h() : this.f23837g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m28265i() {
        b64 b64VarM28258b = m28258b();
        return b64VarM28258b != null ? b64VarM28258b.m28265i() : this.f23838h;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("custom_resolver_enabled", "android-feature-playlist-creation-flags", m28257a()), new k8a("euterpe_enable_pagination", "android-feature-playlist-creation-flags", m28259c()), new k8a("euterpe_menu_option_position", "android-feature-playlist-creation-flags", m28260d(), 0, 2), new k8a("euterpe_message_preference_update_debounce", "android-feature-playlist-creation-flags", m28261e(), 0, Alert.DURATION_SHOW_INDEFINITELY), new k8a("euterpe_re_edit_flow_enabled", "android-feature-playlist-creation-flags", m28262f()), new k8a("euterpe_status_update_throttle", "android-feature-playlist-creation-flags", m28263g(), 0, Alert.DURATION_SHOW_INDEFINITELY), new k8a("link_with_prepopulated_prompt_enabled", "android-feature-playlist-creation-flags", m28264h()), new k8a("us_disclaimer_enabled", "android-feature-playlist-creation-flags", m28265i()));
    }

    public b64(bji bjiVar) {
        this(false, false, 2, 3000, false, AudioEpisode.SHOW_URI_FIELD_NUMBER, true, false, bjiVar);
    }
}
