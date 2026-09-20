package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mvj {

    /* JADX INFO: renamed from: a */
    public final String f147592a;

    public mvj(String str) {
        this.f147592a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvj) && wj50.m88271j(this.f147592a, ((mvj) obj).f147592a);
    }

    public final int hashCode() {
        return this.f147592a.hashCode();
    }
}
