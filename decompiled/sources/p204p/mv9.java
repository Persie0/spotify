package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mv9 implements nv9 {

    /* JADX INFO: renamed from: a */
    public final String f147534a;

    public mv9(String str) {
        this.f147534a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mv9) && wj50.m88271j(this.f147534a, ((mv9) obj).f147534a);
    }

    public final int hashCode() {
        return this.f147534a.hashCode();
    }
}
