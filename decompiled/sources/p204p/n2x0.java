package p204p;

import com.comscore.streaming.ContentFeedType;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class n2x0 implements Closeable {

    /* JADX INFO: renamed from: L0 */
    public final qp4 f149849L0;

    /* JADX INFO: renamed from: M0 */
    public final hw81 f149850M0;

    /* JADX INFO: renamed from: N0 */
    public b3b f149851N0;

    /* JADX INFO: renamed from: O0 */
    public final boolean f149852O0;

    /* JADX INFO: renamed from: P0 */
    public final boolean f149853P0;

    /* JADX INFO: renamed from: X */
    public final n2x0 f149854X;

    /* JADX INFO: renamed from: Y */
    public final long f149855Y;

    /* JADX INFO: renamed from: Z */
    public final long f149856Z;

    /* JADX INFO: renamed from: a */
    public final auw0 f149857a;

    /* JADX INFO: renamed from: b */
    public final r3t0 f149858b;

    /* JADX INFO: renamed from: c */
    public final String f149859c;

    /* JADX INFO: renamed from: d */
    public final int f149860d;

    /* JADX INFO: renamed from: e */
    public final dc20 f149861e;

    /* JADX INFO: renamed from: f */
    public final sn20 f149862f;

    /* JADX INFO: renamed from: g */
    public final p3x0 f149863g;

    /* JADX INFO: renamed from: h */
    public final ck31 f149864h;

    /* JADX INFO: renamed from: i */
    public final n2x0 f149865i;

    /* JADX INFO: renamed from: t */
    public final n2x0 f149866t;

    public n2x0(auw0 auw0Var, r3t0 r3t0Var, String str, int i, dc20 dc20Var, sn20 sn20Var, p3x0 p3x0Var, ck31 ck31Var, n2x0 n2x0Var, n2x0 n2x0Var2, n2x0 n2x0Var3, long j, long j2, qp4 qp4Var, hw81 hw81Var) {
        this.f149857a = auw0Var;
        this.f149858b = r3t0Var;
        this.f149859c = str;
        this.f149860d = i;
        this.f149861e = dc20Var;
        this.f149862f = sn20Var;
        this.f149863g = p3x0Var;
        this.f149864h = ck31Var;
        this.f149865i = n2x0Var;
        this.f149866t = n2x0Var2;
        this.f149854X = n2x0Var3;
        this.f149855Y = j;
        this.f149856Z = j2;
        this.f149849L0 = qp4Var;
        this.f149850M0 = hw81Var;
        boolean z = true;
        this.f149852O0 = 200 <= i && i < 300;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case ContentFeedType.EAST_HD /* 301 */:
                case ContentFeedType.WEST_HD /* 302 */:
                case ContentFeedType.EAST_SD /* 303 */:
                    break;
                default:
                    z = false;
                    break;
            }
        }
        this.f149853P0 = z;
    }

    /* JADX INFO: renamed from: a */
    public final b3b m63571a() {
        b3b b3bVar = this.f149851N0;
        if (b3bVar != null) {
            return b3bVar;
        }
        b3b b3bVar2 = b3b.f22994n;
        b3b b3bVarM95443w = z520.m95443w(this.f149862f);
        this.f149851N0 = b3bVarM95443w;
        return b3bVarM95443w;
    }

    /* JADX INFO: renamed from: c */
    public final z1x0 m63572c() {
        z1x0 z1x0Var = new z1x0();
        z1x0Var.f278424c = -1;
        z1x0Var.f278428g = p3x0.f173765a;
        z1x0Var.f278436o = hw81.f95887w0;
        z1x0Var.f278422a = this.f149857a;
        z1x0Var.f278423b = this.f149858b;
        z1x0Var.f278424c = this.f149860d;
        z1x0Var.f278425d = this.f149859c;
        z1x0Var.f278426e = this.f149861e;
        z1x0Var.f278427f = this.f149862f.m78536e();
        z1x0Var.f278428g = this.f149863g;
        z1x0Var.f278429h = this.f149864h;
        z1x0Var.f278430i = this.f149865i;
        z1x0Var.f278431j = this.f149866t;
        z1x0Var.f278432k = this.f149854X;
        z1x0Var.f278433l = this.f149855Y;
        z1x0Var.f278434m = this.f149856Z;
        z1x0Var.f278435n = this.f149849L0;
        z1x0Var.f278436o = this.f149850M0;
        return z1x0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f149863g.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f149858b + ", code=" + this.f149860d + ", message=" + this.f149859c + ", url=" + this.f149857a.f20037a + '}';
    }
}
