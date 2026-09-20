package p204p;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public class ywh0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f276970a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywh0(Looper looper, int i, boolean z) {
        super(looper);
        this.f276970a = i;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.f276970a) {
            case 0:
                xwh0 xwh0Var = (xwh0) message.obj;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    en6 en6Var = xwh0Var.f266686a;
                    return;
                }
                en6 en6Var2 = xwh0Var.f266686a;
                Object obj = xwh0Var.f266687b[0];
                if (en6Var2.f61079d.get()) {
                    CountDownLatch countDownLatch = en6Var2.f61081f;
                    try {
                        l5f1 l5f1Var = en6Var2.f61082g;
                        if (l5f1Var.f129916h == en6Var2) {
                            SystemClock.uptimeMillis();
                            l5f1Var.f129916h = null;
                            l5f1Var.m58216b();
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        countDownLatch.countDown();
                        throw th;
                    }
                    break;
                } else {
                    CountDownLatch countDownLatch2 = en6Var2.f61081f;
                    try {
                        l5f1 l5f1Var2 = en6Var2.f61082g;
                        if (l5f1Var2.f129915g != en6Var2) {
                            if (l5f1Var2.f129916h == en6Var2) {
                                SystemClock.uptimeMillis();
                                l5f1Var2.f129916h = null;
                                l5f1Var2.m58216b();
                            }
                        } else if (!l5f1Var2.f129911c) {
                            SystemClock.uptimeMillis();
                            l5f1Var2.f129915g = null;
                            m7a0 m7a0Var = l5f1Var2.f129909a;
                            if (m7a0Var != null) {
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    m7a0Var.mo33104m(obj);
                                } else {
                                    m7a0Var.m33101j(obj);
                                }
                            }
                        }
                        countDownLatch2.countDown();
                    } catch (Throwable th2) {
                        countDownLatch2.countDown();
                        throw th2;
                    }
                }
                en6Var2.f61078c = 3;
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywh0(Looper looper, int i) {
        super(looper);
        this.f276970a = i;
        switch (i) {
            case 5:
                super(looper);
                Looper.getMainLooper();
                break;
            case 6:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywh0(Looper looper, g1g1 g1g1Var) {
        super(looper, g1g1Var);
        this.f276970a = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywh0(Looper looper, yj10 yj10Var) {
        super(looper, yj10Var);
        this.f276970a = 2;
        Looper.getMainLooper();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywh0(Looper looper, g1g1 g1g1Var, byte b) {
        super(looper, g1g1Var);
        this.f276970a = 6;
        Looper.getMainLooper();
    }

    public ywh0() {
        this.f276970a = 1;
    }
}
