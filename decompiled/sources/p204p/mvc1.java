package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mvc1 {

    /* JADX INFO: renamed from: a */
    public final String f147556a;

    public mvc1(String str) {
        this.f147556a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvc1) && wj50.m88271j(this.f147556a, ((mvc1) obj).f147556a);
    }

    public final int hashCode() {
        String str = this.f147556a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
