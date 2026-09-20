package p204p;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class jh61 {

    /* JADX INFO: renamed from: a */
    public Message f112345a;

    /* JADX INFO: renamed from: a */
    public final void m53363a() {
        this.f112345a = null;
        ArrayList arrayList = kh61.f122535b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m53364b() {
        Message message = this.f112345a;
        message.getClass();
        message.sendToTarget();
        m53363a();
    }
}
