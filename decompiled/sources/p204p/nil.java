package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nil implements vil {

    /* JADX INFO: renamed from: a */
    public final int f154279a;

    public nil(int i) {
        this.f154279a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nil) && this.f154279a == ((nil) obj).f154279a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f154279a);
    }
}
