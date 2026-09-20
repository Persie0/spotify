package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mu50 implements ou50 {

    /* JADX INFO: renamed from: a */
    public final int f147256a;

    /* JADX INFO: renamed from: b */
    public final int f147257b;

    /* JADX INFO: renamed from: c */
    public final float f147258c;

    public mu50(int i, int i2, float f) {
        this.f147256a = i;
        this.f147257b = i2;
        this.f147258c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu50)) {
            return false;
        }
        mu50 mu50Var = (mu50) obj;
        return this.f147256a == mu50Var.f147256a && this.f147257b == mu50Var.f147257b && Float.compare(this.f147258c, mu50Var.f147258c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f147258c) + mt60.m62800g(this.f147257b, Integer.hashCode(this.f147256a) * 31, 31);
    }
}
