package p204p;

import android.os.Parcelable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class hc61 implements Parcelable {
    /* JADX INFO: renamed from: c */
    public final icr0 m47097c() {
        if (this instanceof zb61) {
            zb61 zb61Var = (zb61) this;
            List list = zb61Var.f281267a;
            return new fcr0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), zb61Var.f281268b);
        }
        if (this instanceof cc61) {
            cc61 cc61Var = (cc61) this;
            return new gcr0(cc61Var.f36331a, cc61Var.f36332b);
        }
        if (this instanceof fc61) {
            fc61 fc61Var = (fc61) this;
            return new hcr0(fc61Var.f68017a, fc61Var.f68018b);
        }
        if (!(this instanceof dc61)) {
            throw new NoWhenBranchMatchedException();
        }
        dc61 dc61Var = (dc61) this;
        return new gcr0(dc61Var.f47441a, dc61Var.f47442b);
    }
}
