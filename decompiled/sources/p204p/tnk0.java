package p204p;

import android.content.SharedPreferences;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class tnk0 implements unk0 {

    /* JADX INFO: renamed from: b */
    public static SharedPreferences f221996b;

    /* JADX INFO: renamed from: a */
    public static final tnk0 f221995a = new tnk0();

    /* JADX INFO: renamed from: c */
    public static final wg61 f221997c = new wg61(ori0.f168588Z0);

    /* JADX INFO: renamed from: d */
    public static final wg61 f221998d = new wg61(l3b0.f129274Z);

    /* JADX INFO: renamed from: w */
    public static unk0 m81178w() {
        return m81179x() ? (unk0) f221997c.getValue() : (unk0) f221998d.getValue();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m81179x() {
        SharedPreferences sharedPreferences = f221996b;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("ObservabilityPlatformEnabledFromRCProperty", false);
        }
        return false;
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: a */
    public final fiz mo75861a() {
        return m81178w().mo75861a();
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: b */
    public final void mo75862b(udy0 udy0Var, String str) {
        m81178w().mo75862b(udy0Var, str);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: c */
    public final void mo75863c(pa81 pa81Var, String str) {
        m81178w().mo75863c(pa81Var, str);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: e */
    public final qmk0 mo75864e(String str, vcf0 vcf0Var, eh00 eh00Var) {
        return m81178w().mo75864e(str, vcf0Var, eh00Var);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: f */
    public final jwk mo75865f(String str, vcf0 vcf0Var) {
        return m81178w().mo75865f(str, vcf0Var);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: g */
    public final udy0 mo75866g(String str, UUID uuid) {
        return m81178w().mo75866g(str, uuid);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: h */
    public final boolean mo75867h(ra81 ra81Var) {
        return m81178w().mo75867h(ra81Var);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: i */
    public final udy0 mo75868i(String str) {
        return m81178w().mo75868i(str);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: j */
    public final void mo75869j(ByteBuffer byteBuffer, long j) {
        m81178w().mo75869j(byteBuffer, j);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: k */
    public final v49 mo75870k(List list, gh00 gh00Var) {
        return m81178w().mo75870k(list, gh00Var);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: l */
    public final pa81 mo75871l(String str, Object obj, Long l) {
        return m81178w().mo75871l(str, obj, l);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: n */
    public final pa81 mo75872n(String str) {
        return m81178w().mo75872n(str);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: o */
    public final void mo75873o(wv41 wv41Var) {
        m81178w().mo75873o(wv41Var);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: q */
    public final qw00 mo75874q(String str, vcf0 vcf0Var) {
        return m81178w().mo75874q(str, vcf0Var);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: r */
    public final void mo81180r() {
        m81178w().mo81180r();
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: s */
    public final void mo75875s(String str, String str2, Map map) {
        m81178w().mo75875s(str, str2, map);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: t */
    public final udy0 mo75876t(String str) {
        return m81178w().mo75876t(str);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: u */
    public final void mo75877u(long j, long j2) {
        m81178w().mo75877u(j, j2);
    }

    @Override // p204p.unk0
    public final void unregisterObservableMetric(String str) {
        m81178w().unregisterObservableMetric(str);
    }

    @Override // p204p.unk0
    /* JADX INFO: renamed from: v */
    public final aw31 mo75878v(String str, ra81 ra81Var, Long l) {
        return m81178w().mo75878v(str, ra81Var, l);
    }
}
