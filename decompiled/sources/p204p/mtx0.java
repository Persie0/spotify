package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class mtx0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f147200a;

    public mtx0(ArrayList arrayList) {
        this.f147200a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m62832a() {
        return this.f147200a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mtx0) && this.f147200a.equals(((mtx0) obj).f147200a);
    }

    public final int hashCode() {
        return this.f147200a.hashCode();
    }
}
