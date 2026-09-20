package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mvc {

    /* JADX INFO: renamed from: a */
    public final String f147554a;

    public mvc(String str) {
        this.f147554a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvc) && wj50.m88271j(this.f147554a, ((mvc) obj).f147554a);
    }

    public final int hashCode() {
        return this.f147554a.hashCode();
    }
}
