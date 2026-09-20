package p204p;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import com.spotify.concertcampaignview.p047v1.CtaType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class txo {

    /* JADX INFO: renamed from: b */
    public int f224732b;

    /* JADX INFO: renamed from: h */
    public long f224738h;

    /* JADX INFO: renamed from: j */
    public long f224740j;

    /* JADX INFO: renamed from: k */
    public boolean f224741k;

    /* JADX INFO: renamed from: a */
    public final SparseArray f224731a = new SparseArray();

    /* JADX INFO: renamed from: c */
    public q27 f224733c = q27.f184525e;

    /* JADX INFO: renamed from: d */
    public int f224734d = -1;

    /* JADX INFO: renamed from: e */
    public fdb[] f224735e = new fdb[0];

    /* JADX INFO: renamed from: f */
    public long f224736f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f224737g = -1;

    /* JADX INFO: renamed from: i */
    public long f224739i = Long.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final int m81922a(q27 q27Var, long j) throws AudioProcessor$UnhandledAudioFormatException {
        m81924c();
        m81924c();
        q27 q27Var2 = this.f224733c;
        if (q27Var.f184526a != q27Var2.f184526a || !jag1.m52834s(q27Var) || !jag1.m52834s(q27Var2)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not add source. MixerFormat=" + this.f224733c, q27Var);
        }
        long jM46332t = h0b1.m46332t(q27Var.f184526a, j - this.f224736f);
        int i = this.f224732b;
        this.f224732b = i + 1;
        this.f224731a.append(i, new sxo(this, q27Var, rnc.m75999a(q27Var.f184527b, this.f224733c.f184527b), jM46332t));
        LinkedHashMap linkedHashMap = qpo.f191349a;
        synchronized (qpo.class) {
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final fdb m81923b(long j) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(this.f224734d * this.f224733c.f184529d).order(ByteOrder.nativeOrder());
        byteBufferOrder.mark();
        return new fdb(byteBufferOrder, j, j + ((long) this.f224734d));
    }

    /* JADX INFO: renamed from: c */
    public final void m81924c() {
        c95.m31856v(!this.f224733c.equals(q27.f184525e), "Audio mixer is not configured.");
    }

    /* JADX INFO: renamed from: d */
    public final void m81925d(q27 q27Var) throws AudioProcessor$UnhandledAudioFormatException {
        c95.m31856v(this.f224733c.equals(q27.f184525e), "Audio mixer already configured.");
        if (!jag1.m52834s(q27Var)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not mix to this AudioFormat.", q27Var);
        }
        this.f224733c = q27Var;
        this.f224734d = (CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER * q27Var.f184526a) / 1000;
        this.f224736f = 0L;
        LinkedHashMap linkedHashMap = qpo.f191349a;
        synchronized (qpo.class) {
        }
        this.f224735e = new fdb[]{m81923b(0L), m81923b(this.f224734d)};
        this.f224737g = Math.min(this.f224739i, this.f224738h + ((long) this.f224734d));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m81926e() {
        m81924c();
        long j = this.f224738h;
        if (j < this.f224739i) {
            return j >= this.f224740j && this.f224731a.size() == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m81927f(ByteBuffer byteBuffer, int i) {
        ByteBuffer byteBuffer2 = byteBuffer;
        m81924c();
        if (byteBuffer2.hasRemaining()) {
            SparseArray sparseArray = this.f224731a;
            c95.m31856v(h0b1.m46321l(sparseArray, i), "Source not found.");
            sxo sxoVar = (sxo) sparseArray.get(i);
            if (sxoVar.f214949a >= this.f224737g) {
                return;
            }
            long jMin = Math.min(sxoVar.f214949a + ((long) (byteBuffer2.remaining() / sxoVar.f214950b.f184529d)), this.f224737g);
            if (sxoVar.f214951c.f200885d) {
                sxoVar.m79662a(byteBuffer2, jMin);
                return;
            }
            long j = sxoVar.f214949a;
            long j2 = this.f224738h;
            if (j < j2) {
                sxoVar.m79662a(byteBuffer2, Math.min(jMin, j2));
                if (sxoVar.f214949a == jMin) {
                    return;
                }
            }
            fdb[] fdbVarArr = this.f224735e;
            int length = fdbVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                fdb fdbVar = fdbVarArr[i2];
                long j3 = sxoVar.f214949a;
                if (j3 < fdbVar.f68420b) {
                    int i3 = ((int) (j3 - fdbVar.f68419a)) * this.f224733c.f184529d;
                    ByteBuffer byteBuffer3 = (ByteBuffer) fdbVar.f68421c;
                    byteBuffer3.position(byteBuffer3.position() + i3);
                    long jMin2 = Math.min(jMin, fdbVar.f68420b);
                    ByteBuffer byteBuffer4 = (ByteBuffer) fdbVar.f68421c;
                    q27 q27Var = this.f224733c;
                    c95.m31843i(jMin2 >= sxoVar.f214949a);
                    int i4 = (int) (jMin2 - sxoVar.f214949a);
                    q27 q27Var2 = sxoVar.f214950b;
                    rnc rncVar = sxoVar.f214951c;
                    sxoVar.f214952d.getClass();
                    jag1.m52839x(byteBuffer2, q27Var2, byteBuffer4, q27Var, rncVar, i4, true);
                    sxoVar.f214949a = jMin2;
                    ((ByteBuffer) fdbVar.f68421c).reset();
                    if (sxoVar.f214949a == jMin) {
                        break;
                    }
                }
                i2++;
                byteBuffer2 = byteBuffer;
            }
            LinkedHashMap linkedHashMap = qpo.f191349a;
            synchronized (qpo.class) {
            }
        }
    }
}
