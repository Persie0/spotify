package p204p;

import com.ravelin.core.model.Events;
import com.ravelin.core.model.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final class h2f1 {

    /* JADX INFO: renamed from: a */
    public final t1f1 f86966a;

    public h2f1(b3f1 b3f1Var) {
        this.f86966a = (t1f1) b3f1Var.f23043a.m32329b(t1f1.class);
    }

    /* JADX INFO: renamed from: a */
    public static x8b m46487a(h2f1 h2f1Var, String str, Events events) {
        Payload[] events2;
        return h2f1Var.f86966a.m79875d(str, (events == null || (events2 = events.getEvents()) == null) ? null : events2[0], "android");
    }
}
