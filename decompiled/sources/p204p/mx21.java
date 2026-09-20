package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mx21 extends cjc {

    /* JADX INFO: renamed from: c */
    public final int f147937c;

    /* JADX INFO: renamed from: d */
    public final zxc f147938d;

    /* JADX INFO: renamed from: e */
    public final Integer f147939e;

    public mx21(int i, zxc zxcVar, Integer num) {
        this.f147937c = i;
        this.f147938d = zxcVar;
        this.f147939e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx21)) {
            return false;
        }
        mx21 mx21Var = (mx21) obj;
        return this.f147937c == mx21Var.f147937c && wj50.m88271j(this.f147938d, mx21Var.f147938d) && wj50.m88271j(this.f147939e, mx21Var.f147939e);
    }

    public final int hashCode() {
        int iHashCode = (this.f147938d.hashCode() + (Integer.hashCode(this.f147937c) * 31)) * 31;
        Integer num = this.f147939e;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
