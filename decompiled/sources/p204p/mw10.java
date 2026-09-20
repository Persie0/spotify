package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mw10 {

    /* JADX INFO: renamed from: a */
    public final String f147684a;

    /* JADX INFO: renamed from: b */
    public final String f147685b;

    public mw10(String str) {
        this.f147684a = str;
        this.f147685b = s571.m77250i(str, ":ratings");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mw10) && wj50.m88271j(this.f147684a, ((mw10) obj).f147684a);
    }

    public final int hashCode() {
        return this.f147684a.hashCode();
    }
}
