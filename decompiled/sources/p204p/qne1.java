package p204p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qne1 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f190568a;

    /* JADX INFO: renamed from: b */
    public final int f190569b;

    /* JADX INFO: renamed from: c */
    public final int f190570c;

    /* JADX INFO: renamed from: d */
    public final boolean f190571d;

    /* JADX INFO: renamed from: e */
    public final bji f190572e;

    /* JADX INFO: renamed from: f */
    public final wg61 f190573f;

    public qne1(boolean z, int i, int i2, boolean z2, bji bjiVar) {
        this.f190568a = z;
        this.f190569b = i;
        this.f190570c = i2;
        this.f190571d = z2;
        this.f190572e = bjiVar;
        this.f190573f = new wg61(new b4e1(this, 9));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73347a() {
        qne1 qne1Var = (qne1) this.f190573f.getValue();
        return qne1Var != null ? qne1Var.m73347a() : this.f190568a;
    }

    /* JADX INFO: renamed from: b */
    public final int m73348b() {
        qne1 qne1Var = (qne1) this.f190573f.getValue();
        return qne1Var != null ? qne1Var.m73348b() : this.f190569b;
    }

    /* JADX INFO: renamed from: c */
    public final int m73349c() {
        qne1 qne1Var = (qne1) this.f190573f.getValue();
        return qne1Var != null ? qne1Var.m73349c() : this.f190570c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m73350d() {
        qne1 qne1Var = (qne1) this.f190573f.getValue();
        return qne1Var != null ? qne1Var.m73350d() : this.f190571d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a(x09.f256832d, "your-library-audiobook-progress-nudge", m73347a()), new k8a("percentage_threshold", "your-library-audiobook-progress-nudge", m73348b(), 0, 100), new k8a("time_threshold", "your-library-audiobook-progress-nudge", m73349c(), 2, Alert.DURATION_SHOW_INDEFINITELY), new k8a("use_show_esperanto_endpoint", "your-library-audiobook-progress-nudge", m73350d()));
    }

    public qne1(bji bjiVar) {
        this(false, 20, 18, false, bjiVar);
    }
}
