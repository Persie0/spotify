package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dqa {

    /* JADX INFO: renamed from: a */
    public static final vnc f51911a = new vnc(-1, null, null, 0);

    /* JADX INFO: renamed from: b */
    public static final int f51912b = fmg1.m42123P(32, 1, (12 & 8) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : 2097150, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c */
    public static final int f51913c = fmg1.m42123P(10000, 1, (12 & 8) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : 2097150, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d */
    public static final C2617yl f51914d = new C2617yl("BUFFERED", 8);

    /* JADX INFO: renamed from: e */
    public static final C2617yl f51915e = new C2617yl("SHOULD_BUFFER", 8);

    /* JADX INFO: renamed from: f */
    public static final C2617yl f51916f = new C2617yl("S_RESUMING_BY_RCV", 8);

    /* JADX INFO: renamed from: g */
    public static final C2617yl f51917g = new C2617yl("RESUMING_BY_EB", 8);

    /* JADX INFO: renamed from: h */
    public static final C2617yl f51918h = new C2617yl("POISONED", 8);

    /* JADX INFO: renamed from: i */
    public static final C2617yl f51919i = new C2617yl("DONE_RCV", 8);

    /* JADX INFO: renamed from: j */
    public static final C2617yl f51920j = new C2617yl("INTERRUPTED_SEND", 8);

    /* JADX INFO: renamed from: k */
    public static final C2617yl f51921k = new C2617yl("INTERRUPTED_RCV", 8);

    /* JADX INFO: renamed from: l */
    public static final C2617yl f51922l = new C2617yl("CHANNEL_CLOSED", 8);

    /* JADX INFO: renamed from: m */
    public static final C2617yl f51923m = new C2617yl("SUSPEND", 8);

    /* JADX INFO: renamed from: n */
    public static final C2617yl f51924n = new C2617yl("SUSPEND_NO_WAITER", 8);

    /* JADX INFO: renamed from: o */
    public static final C2617yl f51925o = new C2617yl("FAILED", 8);

    /* JADX INFO: renamed from: p */
    public static final C2617yl f51926p = new C2617yl("NO_RECEIVE_RESULT", 8);

    /* JADX INFO: renamed from: q */
    public static final C2617yl f51927q = new C2617yl("CLOSE_HANDLER_CLOSED", 8);

    /* JADX INFO: renamed from: r */
    public static final C2617yl f51928r = new C2617yl("CLOSE_HANDLER_INVOKED", 8);

    /* JADX INFO: renamed from: s */
    public static final C2617yl f51929s = new C2617yl("NO_CLOSE_CAUSE", 8);

    /* JADX INFO: renamed from: a */
    public static final boolean m36635a(fqb fqbVar, Object obj, vh00 vh00Var) {
        C2617yl c2617ylMo42412C = fqbVar.mo42412C(obj, vh00Var);
        if (c2617ylMo42412C == null) {
            return false;
        }
        fqbVar.mo42413F(c2617ylMo42412C);
        return true;
    }
}
