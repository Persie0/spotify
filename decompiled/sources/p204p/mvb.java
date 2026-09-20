package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mvb implements nvb {

    /* JADX INFO: renamed from: a */
    public final String f147551a;

    /* JADX INFO: renamed from: b */
    public final String f147552b;

    public mvb(String str, String str2) {
        this.f147551a = str;
        this.f147552b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvb)) {
            return false;
        }
        mvb mvbVar = (mvb) obj;
        return wj50.m88271j(this.f147551a, mvbVar.f147551a) && wj50.m88271j(this.f147552b, mvbVar.f147552b);
    }

    public final int hashCode() {
        return this.f147552b.hashCode() + (this.f147551a.hashCode() * 31);
    }
}
