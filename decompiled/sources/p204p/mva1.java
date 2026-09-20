package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mva1 implements nva1 {

    /* JADX INFO: renamed from: a */
    public final String f147550a;

    public mva1(String str) {
        this.f147550a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mva1) && wj50.m88271j(this.f147550a, ((mva1) obj).f147550a);
    }

    public final int hashCode() {
        return this.f147550a.hashCode();
    }
}
