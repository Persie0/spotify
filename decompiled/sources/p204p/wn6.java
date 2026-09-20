package p204p;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class wn6 implements sad0 {

    /* JADX INFO: renamed from: g */
    public static final ArrayDeque f253071g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public static final Object f253072h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f253073a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f253074b;

    /* JADX INFO: renamed from: c */
    public un6 f253075c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f253076d;

    /* JADX INFO: renamed from: e */
    public final fhi f253077e;

    /* JADX INFO: renamed from: f */
    public boolean f253078f;

    public wn6(MediaCodec mediaCodec, HandlerThread handlerThread) {
        fhi fhiVar = new fhi();
        this.f253073a = mediaCodec;
        this.f253074b = handlerThread;
        this.f253077e = fhiVar;
        this.f253076d = new AtomicReference();
    }

    /* JADX INFO: renamed from: d */
    public static vn6 m88578d() {
        ArrayDeque arrayDeque = f253071g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new vn6();
                }
                return (vn6) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.sad0
    /* JADX INFO: renamed from: a */
    public final void mo75461a(Bundle bundle) {
        mo75464h();
        un6 un6Var = this.f253075c;
        String str = h0b1.f86200a;
        un6Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p204p.sad0
    /* JADX INFO: renamed from: b */
    public final void mo75462b(long j, int i, int i2, int i3) {
        mo75464h();
        vn6 vn6VarM88578d = m88578d();
        vn6VarM88578d.f243002a = i;
        vn6VarM88578d.f243003b = i2;
        vn6VarM88578d.f243005d = j;
        vn6VarM88578d.f243006e = i3;
        un6 un6Var = this.f253075c;
        String str = h0b1.f86200a;
        un6Var.obtainMessage(1, vn6VarM88578d).sendToTarget();
    }

    @Override // p204p.sad0
    /* JADX INFO: renamed from: c */
    public final void mo75463c(int i, myl mylVar, long j, int i2) {
        mo75464h();
        vn6 vn6VarM88578d = m88578d();
        vn6VarM88578d.f243002a = i;
        vn6VarM88578d.f243003b = 0;
        vn6VarM88578d.f243005d = j;
        vn6VarM88578d.f243006e = i2;
        MediaCodec.CryptoInfo cryptoInfo = vn6VarM88578d.f243004c;
        cryptoInfo.numSubSamples = mylVar.f148476f;
        int[] iArr = mylVar.f148474d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = mylVar.f148475e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = mylVar.f148472b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = mylVar.f148471a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = mylVar.f148473c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(mylVar.f148477g, mylVar.f148478h));
        un6 un6Var = this.f253075c;
        String str = h0b1.f86200a;
        un6Var.obtainMessage(2, vn6VarM88578d).sendToTarget();
    }

    @Override // p204p.sad0
    public final void flush() {
        if (this.f253078f) {
            try {
                un6 un6Var = this.f253075c;
                un6Var.getClass();
                un6Var.removeCallbacksAndMessages(null);
                fhi fhiVar = this.f253077e;
                fhiVar.m41670d();
                un6 un6Var2 = this.f253075c;
                un6Var2.getClass();
                un6Var2.obtainMessage(3).sendToTarget();
                fhiVar.m41667a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // p204p.sad0
    /* JADX INFO: renamed from: h */
    public final void mo75464h() {
        RuntimeException runtimeException = (RuntimeException) this.f253076d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p204p.sad0
    public final void shutdown() {
        if (this.f253078f) {
            flush();
            this.f253074b.quit();
        }
        this.f253078f = false;
    }

    @Override // p204p.sad0
    public final void start() {
        if (this.f253078f) {
            return;
        }
        HandlerThread handlerThread = this.f253074b;
        handlerThread.start();
        this.f253075c = new un6(this, handlerThread.getLooper(), 0);
        this.f253078f = true;
    }
}
