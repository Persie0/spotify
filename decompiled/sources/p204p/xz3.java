package p204p;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class xz3 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final xz3 f267514a = new xz3();

    /* JADX WARN: Code duplicated, block: B:20:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x006e A[LOOP:0: B:5:0x0018->B:21:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[EDGE_INSN: B:24:0x0071->B:22:0x0071 BREAK  A[LOOP:0: B:5:0x0018->B:21:0x006e], SYNTHETIC] */
    public final boolean onClearTranslation(View view) {
        C1811ee c1811ee;
        eh00 eh00Var;
        m04 contentCaptureManager$ui = ((oz3) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f138507f = 1;
        w350 w350VarM60402d = contentCaptureManager$ui.m60402d();
        Object[] objArr = w350VarM60402d.f247488c;
        long[] jArr = w350VarM60402d.f247486a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            voz0 voz0Var = ((epz0) objArr[(i << 3) + i3]).f61737a.f40689d;
                            if (whg1.m88143p(voz0Var, hpz0.f93929E) != null && (c1811ee = (C1811ee) whg1.m88143p(voz0Var, toz0.f222359n)) != null && (eh00Var = (eh00) c1811ee.f58630b) != null) {
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[LOOP:0: B:5:0x0018->B:21:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[EDGE_INSN: B:24:0x0079->B:22:0x0079 BREAK  A[LOOP:0: B:5:0x0018->B:21:0x0076], SYNTHETIC] */
    public final boolean onHideTranslation(View view) {
        C1811ee c1811ee;
        gh00 gh00Var;
        m04 contentCaptureManager$ui = ((oz3) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f138507f = 1;
        w350 w350VarM60402d = contentCaptureManager$ui.m60402d();
        Object[] objArr = w350VarM60402d.f247488c;
        long[] jArr = w350VarM60402d.f247486a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            voz0 voz0Var = ((epz0) objArr[(i << 3) + i3]).f61737a.f40689d;
                            if (wj50.m88271j(whg1.m88143p(voz0Var, hpz0.f93929E), Boolean.TRUE) && (c1811ee = (C1811ee) whg1.m88143p(voz0Var, toz0.f222358m)) != null && (gh00Var = (gh00) c1811ee.f58630b) != null) {
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        C1811ee c1811ee;
        gh00 gh00Var;
        m04 contentCaptureManager$ui = ((oz3) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.f138507f = 2;
        w350 w350VarM60402d = contentCaptureManager$ui.m60402d();
        Object[] objArr = w350VarM60402d.f247488c;
        long[] jArr = w350VarM60402d.f247486a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        voz0 voz0Var = ((epz0) objArr[(i << 3) + i3]).f61737a.f40689d;
                        if (wj50.m88271j(whg1.m88143p(voz0Var, hpz0.f93929E), Boolean.FALSE) && (c1811ee = (C1811ee) whg1.m88143p(voz0Var, toz0.f222358m)) != null && (gh00Var = (gh00) c1811ee.f58630b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
