package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mty0 extends nty0 {

    /* JADX INFO: renamed from: a */
    public final String f147204a;

    /* JADX INFO: renamed from: b */
    public final String f147205b;

    public mty0(String str, String str2) {
        this.f147204a = str;
        this.f147205b = str2;
    }

    @Override // p204p.nty0
    /* JADX INFO: renamed from: a */
    public final String mo59921a() {
        return this.f147204a;
    }

    @Override // p204p.nty0
    /* JADX INFO: renamed from: b */
    public final String mo59922b() {
        return this.f147205b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mty0)) {
            return false;
        }
        mty0 mty0Var = (mty0) obj;
        return wj50.m88271j(this.f147204a, mty0Var.f147204a) && wj50.m88271j(this.f147205b, mty0Var.f147205b);
    }

    public final int hashCode() {
        return this.f147205b.hashCode() + (this.f147204a.hashCode() * 31);
    }
}
