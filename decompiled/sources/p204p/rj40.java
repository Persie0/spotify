package p204p;

import androidx.media3.muxer.MuxerException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class rj40 implements osi0 {

    /* JADX INFO: renamed from: a */
    public final n4i0 f199715a;

    /* JADX INFO: renamed from: b */
    public final nch1 f199716b;

    /* JADX INFO: renamed from: c */
    public final long f199717c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f199718d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public int f199719e = -1;

    public rj40(n4i0 n4i0Var, nch1 nch1Var, long j) {
        this.f199715a = n4i0Var;
        this.f199716b = nch1Var;
        this.f199717c = j;
    }

    @Override // p204p.osi0
    /* JADX INFO: renamed from: O */
    public final int mo63681O(r300 r300Var) {
        n4i0 n4i0Var = this.f199715a;
        int iMo63681O = n4i0Var.mo63681O(r300Var);
        if (def0.m35798o(r300Var.f195387p)) {
            n4i0Var.mo63682k1(new o4i0(r300Var.f195353C));
            this.f199719e = iMo63681O;
        }
        return iMo63681O;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        int i;
        long j = this.f199717c;
        if (j != -9223372036854775807L && (i = this.f199719e) != -1) {
            mo63683y0(i, ByteBuffer.allocateDirect(0), new qpa(0, j, 4));
        }
        LinkedHashSet linkedHashSet = this.f199718d;
        nch1 nch1Var = this.f199716b;
        if (nch1Var != null) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
            linkedHashSet2.clear();
            linkedHashSet2.add(new f6d0("com.spotify.transcode.id", nch1Var.f152522b.getBytes(vuc.f244913a), 0, 1));
            linkedHashSet.clear();
            linkedHashSet.addAll(linkedHashSet2);
        }
        Iterator it = linkedHashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            n4i0 n4i0Var = this.f199715a;
            if (!zHasNext) {
                n4i0Var.close();
                return;
            }
            n4i0Var.mo63682k1((s5f0) it.next());
        }
    }

    @Override // p204p.osi0
    /* JADX INFO: renamed from: k1 */
    public final void mo63682k1(s5f0 s5f0Var) {
        if (hbg1.m47045p(s5f0Var)) {
            this.f199718d.add(s5f0Var);
        }
    }

    @Override // p204p.osi0
    /* JADX INFO: renamed from: y0 */
    public final void mo63683y0(int i, ByteBuffer byteBuffer, qpa qpaVar) throws MuxerException {
        long j = this.f199717c;
        if (j != -9223372036854775807L && i == this.f199719e) {
            long j2 = qpaVar.f191248a;
            if (j2 > j) {
                Locale locale = Locale.US;
                StringBuilder sbM77254m = s571.m77254m(j2, "Skipped sample with presentation time (", ") > video duration (");
                sbM77254m.append(j);
                sbM77254m.append(")");
                yif1.m93819w0(sbM77254m.toString());
                return;
            }
        }
        this.f199715a.mo63683y0(i, byteBuffer, qpaVar);
    }
}
