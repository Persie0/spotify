package p204p;

import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public final class a09 extends ywh0 {
    @Override // p204p.ywh0, android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).m1494d0(Status.f1840h);
                return;
            } else {
                new StringBuilder(String.valueOf(i).length() + 34);
                new Exception();
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        clg1 clg1Var = (clg1) pair.first;
        d7x0 d7x0Var = (d7x0) pair.second;
        try {
            clg1Var.m33274a(d7x0Var);
        } catch (RuntimeException e) {
            BasePendingResult.m1490j0(d7x0Var);
            throw e;
        }
    }
}
