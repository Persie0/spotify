package p204p;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p27 {

    /* JADX INFO: renamed from: a */
    public final pf40 f173263a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f173264b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f173265c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public q27 f173266d;

    /* JADX INFO: renamed from: e */
    public q27 f173267e;

    /* JADX INFO: renamed from: f */
    public boolean f173268f;

    public p27(pf40 pf40Var) {
        this.f173263a = pf40Var;
        q27 q27Var = q27.f184525e;
        this.f173266d = q27Var;
        this.f173267e = q27Var;
        this.f173268f = false;
    }

    /* JADX INFO: renamed from: a */
    public final q27 m68881a(q27 q27Var) {
        if (q27Var.equals(q27.f184525e)) {
            throw new AudioProcessor$UnhandledAudioFormatException(q27Var);
        }
        int i = 0;
        while (true) {
            pf40 pf40Var = this.f173263a;
            if (i >= pf40Var.size()) {
                this.f173267e = q27Var;
                return q27Var;
            }
            t27 t27Var = (t27) pf40Var.get(i);
            q27 q27VarMo31668f = t27Var.mo31668f(q27Var);
            if (t27Var.isActive()) {
                c95.m31855u(!q27VarMo31668f.equals(q27.f184525e));
                q27Var = q27VarMo31668f;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m68882b(s27 s27Var) {
        ArrayList arrayList = this.f173264b;
        arrayList.clear();
        this.f173266d = this.f173267e;
        this.f173268f = false;
        int i = 0;
        while (true) {
            pf40 pf40Var = this.f173263a;
            if (i >= pf40Var.size()) {
                break;
            }
            t27 t27Var = (t27) pf40Var.get(i);
            t27Var.mo31669g(s27Var);
            if (t27Var.isActive()) {
                r27 r27Var = new r27();
                long j = s27Var.f204912a;
                r27Var.f195072a = j;
                r27Var.f195073b = s27Var.f204913b;
                r27Var.f195074c = s27Var.f204914c;
                r27Var.f195072a = t27Var.mo40331j(j);
                s27Var = r27Var.m74507e();
                arrayList.add(t27Var);
            }
            i++;
        }
        this.f173265c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= m68883c(); i2++) {
            this.f173265c[i2] = ((t27) arrayList.get(i2)).mo31667e();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m68883c() {
        return this.f173265c.length - 1;
    }

    /* JADX INFO: renamed from: d */
    public final ByteBuffer m68884d() {
        if (!m68886f()) {
            return t27.f216437a;
        }
        ByteBuffer byteBuffer = this.f173265c[m68883c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        m68887g(t27.f216437a);
        return this.f173265c[m68883c()];
    }

    /* JADX INFO: renamed from: e */
    public final boolean m68885e() {
        return this.f173268f && ((t27) this.f173264b.get(m68883c())).mo31666d() && !this.f173265c[m68883c()].hasRemaining();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p27)) {
            return false;
        }
        pf40 pf40Var = ((p27) obj).f173263a;
        pf40 pf40Var2 = this.f173263a;
        if (pf40Var2.size() != pf40Var.size()) {
            return false;
        }
        for (int i = 0; i < pf40Var2.size(); i++) {
            if (pf40Var2.get(i) != pf40Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m68886f() {
        return !this.f173264b.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public final void m68887g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= m68883c(); i++) {
                if (!this.f173265c[i].hasRemaining()) {
                    ArrayList arrayList = this.f173264b;
                    t27 t27Var = (t27) arrayList.get(i);
                    if (!t27Var.mo31666d()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f173265c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : t27.f216437a;
                        long jRemaining = byteBuffer2.remaining();
                        t27Var.mo31670h(byteBuffer2);
                        this.f173265c[i] = t27Var.mo31667e();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f173265c[i].hasRemaining();
                    } else if (!this.f173265c[i].hasRemaining() && i < m68883c()) {
                        ((t27) arrayList.get(i + 1)).mo31671i();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m68888h() {
        if (!m68886f() || this.f173268f) {
            return;
        }
        this.f173268f = true;
        ((t27) this.f173264b.get(0)).mo31671i();
    }

    public final int hashCode() {
        return this.f173263a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m68889i(ByteBuffer byteBuffer) {
        if (!m68886f() || this.f173268f) {
            return;
        }
        m68887g(byteBuffer);
    }

    /* JADX INFO: renamed from: j */
    public final void m68890j() {
        int i = 0;
        while (true) {
            pf40 pf40Var = this.f173263a;
            if (i >= pf40Var.size()) {
                this.f173264b.clear();
                this.f173265c = new ByteBuffer[0];
                q27 q27Var = q27.f184525e;
                this.f173266d = q27Var;
                this.f173267e = q27Var;
                this.f173268f = false;
                return;
            }
            t27 t27Var = (t27) pf40Var.get(i);
            t27Var.mo31669g(s27.f204911d);
            t27Var.reset();
            i++;
        }
    }
}
