package p204p;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public interface unk0 {
    /* JADX INFO: renamed from: m */
    static /* synthetic */ pa81 m83565m(unk0 unk0Var, String str, Object obj, int i) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return unk0Var.mo75871l(str, obj, null);
    }

    /* JADX INFO: renamed from: a */
    fiz mo75861a();

    /* JADX INFO: renamed from: b */
    void mo75862b(udy0 udy0Var, String str);

    /* JADX INFO: renamed from: c */
    void mo75863c(pa81 pa81Var, String str);

    /* JADX INFO: renamed from: e */
    qmk0 mo75864e(String str, vcf0 vcf0Var, eh00 eh00Var);

    /* JADX INFO: renamed from: f */
    jwk mo75865f(String str, vcf0 vcf0Var);

    /* JADX INFO: renamed from: g */
    udy0 mo75866g(String str, UUID uuid);

    /* JADX INFO: renamed from: h */
    boolean mo75867h(ra81 ra81Var);

    /* JADX INFO: renamed from: i */
    udy0 mo75868i(String str);

    /* JADX INFO: renamed from: j */
    void mo75869j(ByteBuffer byteBuffer, long j);

    /* JADX INFO: renamed from: k */
    v49 mo75870k(List list, gh00 gh00Var);

    /* JADX INFO: renamed from: l */
    pa81 mo75871l(String str, Object obj, Long l);

    /* JADX INFO: renamed from: n */
    pa81 mo75872n(String str);

    /* JADX INFO: renamed from: o */
    void mo75873o(wv41 wv41Var);

    /* JADX INFO: renamed from: q */
    qw00 mo75874q(String str, vcf0 vcf0Var);

    /* JADX INFO: renamed from: s */
    void mo75875s(String str, String str2, Map map);

    /* JADX INFO: renamed from: t */
    udy0 mo75876t(String str);

    /* JADX INFO: renamed from: u */
    void mo75877u(long j, long j2);

    void unregisterObservableMetric(String str);

    /* JADX INFO: renamed from: v */
    aw31 mo75878v(String str, ra81 ra81Var, Long l);

    /* JADX INFO: renamed from: r */
    default void mo81180r() {
    }
}
