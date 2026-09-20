package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ba4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f25083a;

    /* JADX INFO: renamed from: b */
    public final bji f25084b;

    /* JADX INFO: renamed from: c */
    public final wg61 f25085c = new wg61(new f74(this, 28));

    public ba4(boolean z, bji bjiVar) {
        this.f25083a = z;
        this.f25084b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28557a() {
        ba4 ba4Var = (ba4) this.f25085c.getValue();
        return ba4Var != null ? ba4Var.m28557a() : this.f25083a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("is_quiz_question_reporting_enabled", "android-learning-music-quiz-gameplay", m28557a()));
    }
}
