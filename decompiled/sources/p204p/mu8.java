package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mu8 {

    /* JADX INFO: renamed from: a */
    public final fw8 f147266a;

    public mu8(fw8 fw8Var) {
        this.f147266a = fw8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu8) && wj50.m88271j(this.f147266a, ((mu8) obj).f147266a);
    }

    public final int hashCode() {
        fw8 fw8Var = this.f147266a;
        if (fw8Var == null) {
            return 0;
        }
        return fw8Var.hashCode();
    }
}
