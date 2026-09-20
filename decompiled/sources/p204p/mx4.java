package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mx4 {

    /* JADX INFO: renamed from: a */
    public final long f147945a;

    /* JADX INFO: renamed from: b */
    public final long f147946b;

    /* JADX INFO: renamed from: c */
    public final long f147947c;

    public mx4(long j, long j2, long j3) {
        this.f147945a = j;
        this.f147946b = j2;
        this.f147947c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx4)) {
            return false;
        }
        mx4 mx4Var = (mx4) obj;
        long j = mx4Var.f147945a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f147945a, j) && as91.m27074b(this.f147946b, mx4Var.f147946b) && as91.m27074b(this.f147947c, mx4Var.f147947c);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f147947c) + dq60.m36605e(Long.hashCode(this.f147945a) * 31, this.f147946b, 31);
    }
}
