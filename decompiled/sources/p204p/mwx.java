package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mwx {

    /* JADX INFO: renamed from: a */
    public final pwx f147892a;

    /* JADX INFO: renamed from: b */
    public final long f147893b;

    public mwx(pwx pwxVar, long j) {
        this.f147892a = pwxVar;
        this.f147893b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwx)) {
            return false;
        }
        mwx mwxVar = (mwx) obj;
        return wj50.m88271j(this.f147892a, mwxVar.f147892a) && this.f147893b == mwxVar.f147893b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f147893b) + (this.f147892a.hashCode() * 31);
    }
}
