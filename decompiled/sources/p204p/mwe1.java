package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mwe1 extends nwe1 {

    /* JADX INFO: renamed from: a */
    public final boolean f147779a;

    public mwe1(boolean z) {
        this.f147779a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwe1) && this.f147779a == ((mwe1) obj).f147779a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147779a);
    }
}
