package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mwh implements cxh {

    /* JADX INFO: renamed from: a */
    public final String f147792a;

    /* JADX INFO: renamed from: b */
    public final String f147793b;

    /* JADX INFO: renamed from: c */
    public final String f147794c;

    /* JADX INFO: renamed from: d */
    public final String f147795d;

    public mwh(String str, String str2, String str3, String str4) {
        this.f147792a = str;
        this.f147793b = str2;
        this.f147794c = str3;
        this.f147795d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwh)) {
            return false;
        }
        mwh mwhVar = (mwh) obj;
        return wj50.m88271j(this.f147792a, mwhVar.f147792a) && wj50.m88271j(this.f147793b, mwhVar.f147793b) && wj50.m88271j(this.f147794c, mwhVar.f147794c) && wj50.m88271j(this.f147795d, mwhVar.f147795d);
    }

    public final int hashCode() {
        int iHashCode = this.f147792a.hashCode() * 31;
        String str = this.f147793b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f147794c;
        return this.f147795d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
