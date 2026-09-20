package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class af4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f15016a;

    /* JADX INFO: renamed from: b */
    public final int f15017b;

    /* JADX INFO: renamed from: c */
    public final int f15018c;

    /* JADX INFO: renamed from: d */
    public final boolean f15019d;

    /* JADX INFO: renamed from: e */
    public final int f15020e;

    /* JADX INFO: renamed from: f */
    public final boolean f15021f;

    /* JADX INFO: renamed from: g */
    public final int f15022g;

    /* JADX INFO: renamed from: h */
    public final int f15023h;

    /* JADX INFO: renamed from: i */
    public final bji f15024i;

    /* JADX INFO: renamed from: j */
    public final wg61 f15025j;

    public af4(boolean z, int i, int i2, boolean z2, int i3, boolean z3, int i4, int i5, bji bjiVar) {
        this.f15016a = z;
        this.f15017b = i;
        this.f15018c = i2;
        this.f15019d = z2;
        this.f15020e = i3;
        this.f15021f = z3;
        this.f15022g = i4;
        this.f15023h = i5;
        this.f15024i = bjiVar;
        this.f15025j = new wg61(new ne4(this, 12));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25798a() {
        af4 af4VarM25800c = m25800c();
        return af4VarM25800c != null ? af4VarM25800c.m25798a() : this.f15016a;
    }

    /* JADX INFO: renamed from: b */
    public final int m25799b() {
        af4 af4VarM25800c = m25800c();
        return af4VarM25800c != null ? af4VarM25800c.m25799b() : this.f15017b;
    }

    /* JADX INFO: renamed from: c */
    public final af4 m25800c() {
        return (af4) this.f15025j.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m25801d() {
        af4 af4VarM25800c = m25800c();
        return af4VarM25800c != null ? af4VarM25800c.m25801d() : this.f15018c;
    }

    /* JADX INFO: renamed from: e */
    public final int m25802e() {
        af4 af4VarM25800c = m25800c();
        return af4VarM25800c != null ? af4VarM25800c.m25802e() : this.f15020e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25803f() {
        af4 af4VarM25800c = m25800c();
        return af4VarM25800c != null ? af4VarM25800c.m25803f() : this.f15021f;
    }

    /* JADX INFO: renamed from: g */
    public final int m25804g() {
        af4 af4VarM25800c = m25800c();
        return af4VarM25800c != null ? af4VarM25800c.m25804g() : this.f15022g;
    }

    /* JADX INFO: renamed from: h */
    public final int m25805h() {
        af4 af4VarM25800c = m25800c();
        return af4VarM25800c != null ? af4VarM25800c.m25805h() : this.f15023h;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m25806i() {
        af4 af4VarM25800c = m25800c();
        return af4VarM25800c != null ? af4VarM25800c.m25806i() : this.f15019d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("chat_enabled", "android-liveroom-listening-party", m25798a()), new k8a("chat_max_messages", "android-liveroom-listening-party", m25799b(), 1, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER), new k8a("initial_message_buffer_millis", "android-liveroom-listening-party", m25801d(), 0, 10000), new k8a("is_chat_expand_button_enabled", "android-liveroom-listening-party", m25806i()), new k8a("max_live_message_delay_millis", "android-liveroom-listening-party", m25802e(), 0, 60000), new k8a("music_playback_coordination_enabled", "android-liveroom-listening-party", m25803f()), new k8a("periodic_message_buffer_millis", "android-liveroom-listening-party", m25804g(), 0, 10000), new k8a("seconds_to_rewind_live_messages", "android-liveroom-listening-party", m25805h(), 0, 300));
    }

    public af4(bji bjiVar) {
        this(false, 250, 100, true, 20000, true, 100, 120, bjiVar);
    }
}
