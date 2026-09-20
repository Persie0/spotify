package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mv5 extends ov5 {

    /* JADX INFO: renamed from: a */
    public final List f147512a;

    public mv5(List list) {
        this.f147512a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mv5) && wj50.m88271j(this.f147512a, ((mv5) obj).f147512a);
    }

    public final int hashCode() {
        return this.f147512a.hashCode();
    }
}
