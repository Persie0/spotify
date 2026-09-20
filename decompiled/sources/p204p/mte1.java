package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mte1 {

    /* JADX INFO: renamed from: a */
    public final String f147060a;

    public mte1(String str) {
        this.f147060a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mte1) && wj50.m88271j(this.f147060a, ((mte1) obj).f147060a);
    }

    public final int hashCode() {
        return this.f147060a.hashCode();
    }
}
