package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mx50 {

    /* JADX INFO: renamed from: a */
    public final kx50 f147961a;

    /* JADX INFO: renamed from: b */
    public final dx50 f147962b;

    /* JADX INFO: renamed from: c */
    public final fx50 f147963c;

    /* JADX INFO: renamed from: d */
    public final gx50 f147964d;

    /* JADX INFO: renamed from: e */
    public final gx50 f147965e;

    public mx50(kx50 kx50Var, dx50 dx50Var, fx50 fx50Var, gx50 gx50Var) {
        this.f147961a = kx50Var;
        this.f147962b = dx50Var;
        this.f147963c = fx50Var;
        this.f147964d = gx50Var;
        this.f147965e = gx50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx50)) {
            return false;
        }
        mx50 mx50Var = (mx50) obj;
        return this.f147961a.equals(mx50Var.f147961a) && this.f147962b.equals(mx50Var.f147962b) && wj50.m88271j(this.f147963c, mx50Var.f147963c) && this.f147964d.equals(mx50Var.f147964d);
    }

    public final int hashCode() {
        int iHashCode = (this.f147962b.hashCode() + (this.f147961a.f127335a.hashCode() * 31)) * 31;
        fx50 fx50Var = this.f147963c;
        return this.f147964d.hashCode() + ((iHashCode + (fx50Var == null ? 0 : fx50Var.hashCode())) * 31);
    }
}
