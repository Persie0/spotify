package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mvt implements pvt {

    /* JADX INFO: renamed from: a */
    public final i7t0 f147646a;

    /* JADX INFO: renamed from: b */
    public final Map f147647b;

    /* JADX INFO: renamed from: c */
    public final Map f147648c;

    public mvt(i7t0 i7t0Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f147646a = i7t0Var;
        this.f147647b = linkedHashMap;
        this.f147648c = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvt)) {
            return false;
        }
        mvt mvtVar = (mvt) obj;
        return wj50.m88271j(this.f147646a, mvtVar.f147646a) && wj50.m88271j(this.f147647b, mvtVar.f147647b) && wj50.m88271j(this.f147648c, mvtVar.f147648c);
    }

    public final int hashCode() {
        return this.f147648c.hashCode() + edb.m38557f(this.f147646a.hashCode() * 31, 31, this.f147647b);
    }
}
