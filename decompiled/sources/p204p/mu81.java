package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class mu81 implements qu81 {

    /* JADX INFO: renamed from: a */
    public final UUID f147277a;

    /* JADX INFO: renamed from: b */
    public final long f147278b;

    /* JADX INFO: renamed from: c */
    public final nvw0 f147279c;

    /* JADX INFO: renamed from: d */
    public final s3x0 f147280d;

    /* JADX INFO: renamed from: e */
    public final iu81 f147281e;

    public mu81(UUID uuid, long j, nvw0 nvw0Var, s3x0 s3x0Var, iu81 iu81Var) {
        this.f147277a = uuid;
        this.f147278b = j;
        this.f147279c = nvw0Var;
        this.f147280d = s3x0Var;
        this.f147281e = iu81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu81)) {
            return false;
        }
        mu81 mu81Var = (mu81) obj;
        return wj50.m88271j(this.f147277a, mu81Var.f147277a) && this.f147278b == mu81Var.f147278b && wj50.m88271j(this.f147279c, mu81Var.f147279c) && wj50.m88271j(this.f147280d, mu81Var.f147280d) && wj50.m88271j(this.f147281e, mu81Var.f147281e);
    }

    @Override // p204p.qu81
    public final UUID getId() {
        return this.f147277a;
    }

    @Override // p204p.qu81
    public final long getTimestamp() {
        return this.f147278b;
    }

    public final int hashCode() {
        return this.f147281e.hashCode() + ((this.f147280d.hashCode() + ((this.f147279c.hashCode() + dq60.m36605e(this.f147277a.hashCode() * 31, this.f147278b, 31)) * 31)) * 31);
    }
}
