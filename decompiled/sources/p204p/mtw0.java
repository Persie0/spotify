package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class mtw0 implements ntw0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f147196a;

    public mtw0(ArrayList arrayList) {
        this.f147196a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mtw0) && this.f147196a.equals(((mtw0) obj).f147196a);
    }

    public final int hashCode() {
        return this.f147196a.hashCode();
    }
}
