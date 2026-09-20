package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final boolean f147634a;

    public mvq0(boolean z) {
        this.f147634a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvq0) && this.f147634a == ((mvq0) obj).f147634a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147634a);
    }
}
