package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mwi {

    /* JADX INFO: renamed from: a */
    public final b591 f147796a;

    /* JADX INFO: renamed from: b */
    public final String f147797b;

    public mwi(b591 b591Var, String str) {
        this.f147796a = b591Var;
        this.f147797b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwi)) {
            return false;
        }
        mwi mwiVar = (mwi) obj;
        return wj50.m88271j(this.f147796a, mwiVar.f147796a) && wj50.m88271j(this.f147797b, mwiVar.f147797b);
    }

    public final int hashCode() {
        int iHashCode = this.f147796a.hashCode() * 31;
        String str = this.f147797b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
