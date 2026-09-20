package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class bmr0 {

    /* JADX INFO: renamed from: a */
    public final long f28601a;

    /* JADX INFO: renamed from: b */
    public final r300 f28602b;

    /* JADX INFO: renamed from: c */
    public final List f28603c;

    /* JADX INFO: renamed from: d */
    public final String f28604d;

    /* JADX INFO: renamed from: e */
    public final String f28605e;

    /* JADX INFO: renamed from: f */
    public final long f28606f;

    /* JADX INFO: renamed from: g */
    public final long f28607g;

    /* JADX INFO: renamed from: h */
    public final long f28608h;

    /* JADX INFO: renamed from: i */
    public xra f28609i;

    /* JADX INFO: renamed from: j */
    public final wg61 f28610j;

    public bmr0(long j, r300 r300Var, List list, String str, String str2, long j2, long j3) {
        this.f28601a = j;
        this.f28602b = r300Var;
        this.f28603c = list;
        this.f28604d = str;
        this.f28605e = str2;
        this.f28606f = j2;
        this.f28607g = j2 * 1000000;
        int i = mva.f147544a;
        this.f28608h = h0b1.m46295W(j3);
        this.f28610j = new wg61(new nzk0(this, 17));
    }

    /* JADX INFO: renamed from: a */
    public final List m29886a() {
        return this.f28603c;
    }

    /* JADX INFO: renamed from: b */
    public final int m29887b() {
        String str = h0b1.f86200a;
        long j = this.f28608h;
        long j2 = this.f28607g;
        return (int) (((j + j2) - 1) / j2);
    }

    /* JADX INFO: renamed from: c */
    public final long m29888c(long j) {
        if (m29887b() == -1 || j != m29887b() - 1) {
            return this.f28606f * 1000000;
        }
        return this.f28608h - (j * this.f28607g);
    }

    /* JADX INFO: renamed from: d */
    public final int m29889d(long j) {
        int i;
        int iM29887b = m29887b();
        if (iM29887b != 0 && (i = (int) (j / this.f28607g)) >= 0) {
            return iM29887b == -1 ? i : (int) Math.min(i, iM29887b - 1);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final p5u0 m29890e(long j) {
        long j2 = j * this.f28606f;
        return new p5u0(bm51.m29801l0(bm51.m29801l0(this.f28605e, "{{profile_id}}", String.valueOf(this.f28601a)), "{{segment_timestamp}}", String.valueOf(j2)), -1L);
    }
}
