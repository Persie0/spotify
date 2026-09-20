package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class muh0 {

    /* JADX INFO: renamed from: a */
    public final String f147358a;

    /* JADX INFO: renamed from: b */
    public final j6y f147359b;

    /* JADX INFO: renamed from: c */
    public final boolean f147360c = true;

    public muh0(String str, j6y j6yVar) {
        this.f147358a = str;
        this.f147359b = j6yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muh0)) {
            return false;
        }
        muh0 muh0Var = (muh0) obj;
        return wj50.m88271j(this.f147358a, muh0Var.f147358a) && wj50.m88271j(this.f147359b, muh0Var.f147359b) && this.f147360c == muh0Var.f147360c;
    }

    public final int hashCode() {
        int iHashCode = this.f147358a.hashCode() * 31;
        j6y j6yVar = this.f147359b;
        return Boolean.hashCode(this.f147360c) + ((iHashCode + (j6yVar == null ? 0 : j6yVar.hashCode())) * 31);
    }
}
