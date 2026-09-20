package p204p;

import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class er30 extends vj30 {
    @Override // p204p.vj30
    /* JADX INFO: renamed from: a */
    public final vj30 mo39768a(wj30 wj30Var) {
        if (mo33719t()) {
            return wj30Var.toBuilder();
        }
        vj30 vj30VarMo33716q = this;
        for (String str : wj30Var.keySet()) {
            Object obj = wj30Var.get(str);
            if (obj instanceof Serializable) {
                vj30VarMo33716q = vj30VarMo33716q.mo33716q(str, (Serializable) obj);
            } else if (obj instanceof Parcelable) {
                vj30VarMo33716q = vj30VarMo33716q.mo33715p(str, (Parcelable) obj);
            } else if (obj != null) {
                throw new AssertionError(dq60.m36610j(obj.getClass(), "Invalid type "));
            }
        }
        return vj30VarMo33716q;
    }

    /* JADX INFO: renamed from: t */
    public abstract boolean mo33719t();
}
