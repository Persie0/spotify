package p204p;

import com.spotify.performancesdk.observationplatform.impl.SeqlockNative;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class iha implements s4l0 {

    /* JADX INFO: renamed from: a */
    public long f102215a;

    /* JADX INFO: renamed from: b */
    public long f102216b;

    /* JADX INFO: renamed from: c */
    public Object f102217c;

    /* JADX INFO: renamed from: d */
    public Object f102218d;

    public iha(ByteBuffer byteBuffer, long j) {
        this.f102217c = byteBuffer;
        this.f102215a = j;
        this.f102218d = new ReentrantLock();
        this.f102216b = Long.MIN_VALUE;
        byteBuffer.order(ByteOrder.nativeOrder());
    }

    /* JADX INFO: renamed from: a */
    public boolean m50588a(long j, LinkedHashSet linkedHashSet) {
        boolean z;
        ReentrantLock reentrantLock = (ReentrantLock) this.f102218d;
        reentrantLock.lock();
        try {
            if (j <= this.f102216b) {
                z = true;
            } else {
                boolean zM50589b = m50589b(linkedHashSet);
                this.f102216b = j;
                z = zM50589b;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m50589b(LinkedHashSet linkedHashSet) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f102217c;
        long j = this.f102215a;
        int iLoadSequenceAcquire = SeqlockNative.loadSequenceAcquire(j) | 1;
        SeqlockNative.storeSequenceRelease(j, iLoadSequenceAcquire);
        Iterator it = linkedHashSet.iterator();
        int length = 8;
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.US_ASCII);
            if (bytes.length + 4 + length > byteBuffer.capacity()) {
                byteBuffer.putInt(4, i);
                SeqlockNative.storeSequenceRelease(j, iLoadSequenceAcquire + 1);
                return z;
            }
            byteBuffer.putInt(length, bytes.length);
            int i2 = length + 4;
            byteBuffer.position(i2);
            byteBuffer.put(bytes);
            length = i2 + bytes.length;
            i++;
        }
        z = true;
        byteBuffer.putInt(4, i);
        SeqlockNative.storeSequenceRelease(j, iLoadSequenceAcquire + 1);
        return z;
    }

    @Override // p204p.s4l0
    /* JADX INFO: renamed from: c */
    public long mo50590c(d5y d5yVar) {
        long j = this.f102216b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f102216b = -1L;
        return j2;
    }

    @Override // p204p.s4l0
    /* JADX INFO: renamed from: g */
    public ddz0 mo50591g() {
        c95.m31855u(this.f102215a != -1);
        return new ra8((uez) this.f102217c, this.f102215a, 1);
    }

    @Override // p204p.s4l0
    /* JADX INFO: renamed from: h */
    public void mo50592h(long j) {
        long[] jArr = (long[]) ((tey) this.f102218d).f219808b;
        this.f102216b = jArr[h0b1.m46309f(jArr, j, true)];
    }

    public iha(int i, long j) {
        c95.m31855u(((vl3) this.f102217c) == null);
        this.f102215a = j;
        this.f102216b = j + ((long) i);
    }

    public iha(String str, byte[] bArr, long j, long j2) {
        this.f102217c = str;
        this.f102218d = bArr;
        this.f102215a = j;
        this.f102216b = j2;
    }
}
