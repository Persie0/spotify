package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mtc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final String f147023a;

    public mtc0(String str) {
        this.f147023a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mtc0) && wj50.m88271j(this.f147023a, ((mtc0) obj).f147023a);
    }

    public final int hashCode() {
        return this.f147023a.hashCode();
    }
}
