package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mud0 {

    /* JADX INFO: renamed from: a */
    public final long f147313a;

    public mud0(long j) {
        this.f147313a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mud0) && this.f147313a == ((mud0) obj).f147313a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f147313a);
    }
}
