package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mx40 {

    /* JADX INFO: renamed from: a */
    public final int f147948a;

    /* JADX INFO: renamed from: b */
    public final int f147949b;

    /* JADX INFO: renamed from: c */
    public final int f147950c;

    /* JADX INFO: renamed from: d */
    public final int f147951d;

    public mx40(int i, int i2, int i3, int i4) {
        this.f147948a = i;
        this.f147949b = i2;
        this.f147950c = i3;
        this.f147951d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx40)) {
            return false;
        }
        mx40 mx40Var = (mx40) obj;
        return this.f147948a == mx40Var.f147948a && this.f147949b == mx40Var.f147949b && this.f147950c == mx40Var.f147950c && this.f147951d == mx40Var.f147951d;
    }

    public final int hashCode() {
        return (((((this.f147948a * 31) + this.f147949b) * 31) + this.f147950c) * 31) + this.f147951d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f147948a);
        sb.append(", top=");
        sb.append(this.f147949b);
        sb.append(", right=");
        sb.append(this.f147950c);
        sb.append(", bottom=");
        return edb.m38567p(sb, this.f147951d, ')');
    }
}
