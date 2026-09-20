package p204p;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.core.os.OperationCanceledException;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: p.rd */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2334rd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f197981b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f197982c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f197983d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f197984e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f197985f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f197986g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f197987h;

    public /* synthetic */ RunnableC2334rd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f197980a = i;
        this.f197981b = obj;
        this.f197982c = obj2;
        this.f197983d = obj3;
        this.f197984e = obj4;
        this.f197985f = obj5;
        this.f197986g = obj6;
        this.f197987h = obj7;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x00b1, B:28:0x00bd, B:35:0x00cf, B:38:0x00d6, B:43:0x00e5, B:45:0x00ed, B:52:0x0120, B:54:0x0124, B:55:0x0126, B:59:0x0135, B:63:0x0142, B:67:0x014f, B:69:0x015c, B:73:0x016e, B:74:0x0170, B:71:0x0169, B:66:0x014d, B:62:0x0140, B:58:0x0133, B:49:0x0100, B:51:0x0106), top: B:82:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0132  */
    /* JADX WARN: Code duplicated, block: B:58:0x0133 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x00b1, B:28:0x00bd, B:35:0x00cf, B:38:0x00d6, B:43:0x00e5, B:45:0x00ed, B:52:0x0120, B:54:0x0124, B:55:0x0126, B:59:0x0135, B:63:0x0142, B:67:0x014f, B:69:0x015c, B:73:0x016e, B:74:0x0170, B:71:0x0169, B:66:0x014d, B:62:0x0140, B:58:0x0133, B:49:0x0100, B:51:0x0106), top: B:82:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x013f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x00b1, B:28:0x00bd, B:35:0x00cf, B:38:0x00d6, B:43:0x00e5, B:45:0x00ed, B:52:0x0120, B:54:0x0124, B:55:0x0126, B:59:0x0135, B:63:0x0142, B:67:0x014f, B:69:0x015c, B:73:0x016e, B:74:0x0170, B:71:0x0169, B:66:0x014d, B:62:0x0140, B:58:0x0133, B:49:0x0100, B:51:0x0106), top: B:82:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x014c  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x00b1, B:28:0x00bd, B:35:0x00cf, B:38:0x00d6, B:43:0x00e5, B:45:0x00ed, B:52:0x0120, B:54:0x0124, B:55:0x0126, B:59:0x0135, B:63:0x0142, B:67:0x014f, B:69:0x015c, B:73:0x016e, B:74:0x0170, B:71:0x0169, B:66:0x014d, B:62:0x0140, B:58:0x0133, B:49:0x0100, B:51:0x0106), top: B:82:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015c A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x00b1, B:28:0x00bd, B:35:0x00cf, B:38:0x00d6, B:43:0x00e5, B:45:0x00ed, B:52:0x0120, B:54:0x0124, B:55:0x0126, B:59:0x0135, B:63:0x0142, B:67:0x014f, B:69:0x015c, B:73:0x016e, B:74:0x0170, B:71:0x0169, B:66:0x014d, B:62:0x0140, B:58:0x0133, B:49:0x0100, B:51:0x0106), top: B:82:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0169 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x00b1, B:28:0x00bd, B:35:0x00cf, B:38:0x00d6, B:43:0x00e5, B:45:0x00ed, B:52:0x0120, B:54:0x0124, B:55:0x0126, B:59:0x0135, B:63:0x0142, B:67:0x014f, B:69:0x015c, B:73:0x016e, B:74:0x0170, B:71:0x0169, B:66:0x014d, B:62:0x0140, B:58:0x0133, B:49:0x0100, B:51:0x0106), top: B:82:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x016e A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x00b1, B:28:0x00bd, B:35:0x00cf, B:38:0x00d6, B:43:0x00e5, B:45:0x00ed, B:52:0x0120, B:54:0x0124, B:55:0x0126, B:59:0x0135, B:63:0x0142, B:67:0x014f, B:69:0x015c, B:73:0x016e, B:74:0x0170, B:71:0x0169, B:66:0x014d, B:62:0x0140, B:58:0x0133, B:49:0x0100, B:51:0x0106), top: B:82:0x00b1 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        boolean z2;
        String str;
        alq0 alq0Var;
        Date date;
        long j;
        Date date2;
        switch (this.f197980a) {
            case 0:
                C2449ud c2449ud = (C2449ud) this.f197981b;
                C1893gd c1893gd = (C1893gd) this.f197982c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f197983d;
                Collection collection = (HashSet) this.f197984e;
                Collection collection2 = (HashSet) this.f197985f;
                Collection collection3 = (HashSet) this.f197986g;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) ((C2529wd) this.f197987h).f250163d;
                String str2 = (String) c2449ud.f229148c;
                int i = c2449ud.f229147b;
                Long l = (Long) c2449ud.f229151f;
                String str3 = (String) c2449ud.f229149d;
                try {
                    alq0 alq0Var2 = C2529wd.f250155f;
                    if (((C1893gd) alq0Var2.m26362d().f250162c) != null) {
                        C1893gd c1893gd2 = (C1893gd) alq0Var2.m26362d().f250162c;
                        if (c1893gd2 != null) {
                            try {
                                str = c1893gd2.f78690i;
                            } catch (Throwable th) {
                                th = th;
                                z = false;
                            }
                        } else {
                            str = null;
                        }
                        if (str == c1893gd.f78690i) {
                            if (!atomicBoolean.get() && str2 == null && i == 0) {
                                atomicBoolean2.set(false);
                                return;
                            }
                            Date date3 = c1893gd.f78682a;
                            if (c2449ud.f229147b != 0) {
                                alq0Var = alq0Var2;
                                date3 = new Date(((long) c2449ud.f229147b) * 1000);
                            } else {
                                alq0Var = alq0Var2;
                                if (c2449ud.f229150e != 0) {
                                    date = new Date((((long) c2449ud.f229150e) * 1000) + new Date().getTime());
                                    j = 1000;
                                }
                                if (str2 == null) {
                                    str2 = c1893gd.f78686e;
                                }
                                String str4 = str2;
                                String str5 = c1893gd.f78689h;
                                String str6 = c1893gd.f78690i;
                                if (atomicBoolean.get()) {
                                    collection = c1893gd.f78683b;
                                }
                                Collection collection4 = collection;
                                if (atomicBoolean.get()) {
                                    collection2 = c1893gd.f78684c;
                                }
                                Collection collection5 = collection2;
                                if (atomicBoolean.get()) {
                                    collection3 = c1893gd.f78685d;
                                }
                                Collection collection6 = collection3;
                                EnumC2568xd enumC2568xd = c1893gd.f78687f;
                                Date date4 = new Date();
                                if (l != null) {
                                    date2 = new Date(l.longValue() * j);
                                } else {
                                    date2 = c1893gd.f78691t;
                                }
                                Date date5 = date2;
                                if (str3 == null) {
                                    str3 = c1893gd.f78681X;
                                }
                                alq0Var.m26362d().m87787R(new C1893gd(str4, str5, str6, collection4, collection5, collection6, enumC2568xd, date, date4, date5, str3), true);
                                z2 = false;
                            }
                            date = date3;
                            j = 1000;
                            if (str2 == null) {
                                str2 = c1893gd.f78686e;
                            }
                            String str7 = str2;
                            String str8 = c1893gd.f78689h;
                            String str9 = c1893gd.f78690i;
                            if (atomicBoolean.get()) {
                                collection = c1893gd.f78683b;
                            }
                            Collection collection7 = collection;
                            if (atomicBoolean.get()) {
                                collection2 = c1893gd.f78684c;
                            }
                            Collection collection8 = collection2;
                            if (atomicBoolean.get()) {
                                collection3 = c1893gd.f78685d;
                            }
                            Collection collection9 = collection3;
                            EnumC2568xd enumC2568xd2 = c1893gd.f78687f;
                            Date date6 = new Date();
                            if (l != null) {
                                date2 = new Date(l.longValue() * j);
                            } else {
                                date2 = c1893gd.f78691t;
                            }
                            Date date7 = date2;
                            if (str3 == null) {
                                str3 = c1893gd.f78681X;
                            }
                            alq0Var.m26362d().m87787R(new C1893gd(str7, str8, str9, collection7, collection8, collection9, enumC2568xd2, date, date6, date7, str3), true);
                            z2 = false;
                            atomicBoolean2.set(z);
                            throw th;
                        }
                        z2 = false;
                        break;
                    } else {
                        z2 = false;
                    }
                    atomicBoolean2.set(z2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
                break;
            default:
                x340 x340Var = (x340) this.f197981b;
                ua40 ua40Var = (ua40) this.f197982c;
                Matrix matrix = (Matrix) this.f197983d;
                ua40 ua40Var2 = (ua40) this.f197984e;
                Rect rect = (Rect) this.f197985f;
                r340 r340Var = (r340) this.f197986g;
                gbb gbbVar = (gbb) this.f197987h;
                if (!x340Var.f257676Q0) {
                    gbbVar.m44212c(new OperationCanceledException("ImageAnalysis is detached"));
                    return;
                }
                u601 u601Var = new u601(ua40Var2, null, new b18(ua40Var.mo60750i1().mo27893a(), ua40Var.mo60750i1().getTimestamp(), x340Var.f257684e ? 0 : x340Var.f257681b, matrix));
                if (!rect.isEmpty()) {
                    Rect rect2 = new Rect(rect);
                    if (!rect2.intersect(0, 0, u601Var.f227193f, u601Var.f227194g)) {
                        rect2.setEmpty();
                    }
                    synchronized (u601Var.f227191d) {
                        break;
                    }
                }
                r340Var.mo36219d(u601Var);
                gbbVar.m44211b(null);
                return;
        }
    }
}
