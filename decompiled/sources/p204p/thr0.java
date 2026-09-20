package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class thr0 implements j2l, k2l {
    @Override // p204p.j2l
    /* JADX INFO: renamed from: a */
    public final List mo37123a() {
        Object c6x0Var;
        int iIntValue;
        try {
            c6x0Var = Integer.valueOf(((Number) mwq0.f147868e.invoke()).intValue());
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        String strValueOf = "UNKNOWN";
        if (s6x0.m77348a(c6x0Var) == null && (iIntValue = ((Number) c6x0Var).intValue()) != 0) {
            if (iIntValue == 100) {
                strValueOf = "IMPORTANCE_FOREGROUND";
            } else if (iIntValue == 125) {
                strValueOf = "IMPORTANCE_FOREGROUND_SERVICE";
            } else if (iIntValue == 200) {
                strValueOf = "IMPORTANCE_VISIBLE";
            } else if (iIntValue == 230) {
                strValueOf = "IMPORTANCE_PERCEPTIBLE";
            } else if (iIntValue == 300) {
                strValueOf = "IMPORTANCE_SERVICE";
            } else if (iIntValue == 325) {
                strValueOf = "IMPORTANCE_TOP_SLEEPING";
            } else if (iIntValue == 350) {
                strValueOf = "IMPORTANCE_CANT_SAVE_STATE";
            } else if (iIntValue != 400) {
                strValueOf = iIntValue != 1000 ? String.valueOf(iIntValue) : "IMPORTANCE_GONE";
            } else {
                strValueOf = "IMPORTANCE_CACHED";
            }
        }
        return geg1.m44518y(new p1l(strValueOf));
    }
}
