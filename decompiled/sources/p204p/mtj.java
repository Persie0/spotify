package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mtj extends juj {

    /* JADX INFO: renamed from: a */
    public final String f147098a;

    /* JADX INFO: renamed from: b */
    public final String f147099b;

    public mtj(String str, String str2) {
        this.f147098a = str;
        this.f147099b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtj)) {
            return false;
        }
        mtj mtjVar = (mtj) obj;
        return wj50.m88271j(this.f147098a, mtjVar.f147098a) && wj50.m88271j(this.f147099b, mtjVar.f147099b);
    }

    public final int hashCode() {
        return s571.m77243b(this.f147098a.hashCode() * 31, 961, this.f147099b);
    }
}
