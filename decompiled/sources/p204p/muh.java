package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class muh {

    /* JADX INFO: renamed from: a */
    public final String f147352a;

    /* JADX INFO: renamed from: b */
    public final long f147353b;

    /* JADX INFO: renamed from: c */
    public final long f147354c;

    /* JADX INFO: renamed from: d */
    public final String f147355d;

    /* JADX INFO: renamed from: e */
    public final String f147356e;

    /* JADX INFO: renamed from: f */
    public final String f147357f;

    public muh(long j, long j2, String str, String str2, String str3, String str4) {
        this.f147352a = str;
        this.f147353b = j;
        this.f147354c = j2;
        this.f147355d = str2;
        this.f147356e = str3;
        this.f147357f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muh)) {
            return false;
        }
        muh muhVar = (muh) obj;
        return wj50.m88271j(this.f147352a, muhVar.f147352a) && this.f147353b == muhVar.f147353b && this.f147354c == muhVar.f147354c && wj50.m88271j(this.f147355d, muhVar.f147355d) && wj50.m88271j(this.f147356e, muhVar.f147356e) && wj50.m88271j(this.f147357f, muhVar.f147357f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(dq60.m36605e(dq60.m36605e(this.f147352a.hashCode() * 31, this.f147353b, 31), this.f147354c, 31), 31, this.f147355d);
        String str = this.f147356e;
        return this.f147357f.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
