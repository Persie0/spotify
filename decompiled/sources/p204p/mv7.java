package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mv7 {

    /* JADX INFO: renamed from: a */
    public final boolean f147526a;

    /* JADX INFO: renamed from: b */
    public final boolean f147527b;

    public mv7(boolean z, boolean z2) {
        this.f147526a = z;
        this.f147527b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv7)) {
            return false;
        }
        mv7 mv7Var = (mv7) obj;
        return this.f147526a == mv7Var.f147526a && this.f147527b == mv7Var.f147527b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147527b) + (Boolean.hashCode(this.f147526a) * 31);
    }
}
