package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mvh {

    /* JADX INFO: renamed from: a */
    public final String f147584a;

    public mvh(String str) {
        this.f147584a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvh) && wj50.m88271j(this.f147584a, ((mvh) obj).f147584a);
    }

    public final int hashCode() {
        return this.f147584a.hashCode();
    }
}
