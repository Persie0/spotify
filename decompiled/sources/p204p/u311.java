package p204p;

import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class u311 implements Parcelable {
    /* JADX INFO: renamed from: c */
    public final qf40 m82261c() {
        if (this instanceof s311) {
            return ((s311) this).f205158a;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: renamed from: g */
    public final qu01 m82262g() {
        qu01 qu01Var = null;
        Object obj = null;
        qu01Var = null;
        if (!(this instanceof r311) && !equals(t311.f216688a)) {
            if (!(this instanceof s311)) {
                throw new NoWhenBranchMatchedException();
            }
            for (Object obj2 : ((s311) this).f205158a) {
                if (((qu01) obj2).f192535c == 2) {
                    obj = obj2;
                    break;
                }
            }
            qu01Var = (qu01) obj;
        }
        if (qu01Var != null) {
            return qu01Var;
        }
        throw new IllegalArgumentException("No selected share menu preview data present");
    }
}
