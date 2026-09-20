package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sjt implements rmt {

    /* JADX INFO: renamed from: a */
    public final String f209929a;

    public sjt(String str) {
        this.f209929a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjt) && wj50.m88271j(this.f209929a, ((sjt) obj).f209929a);
    }

    public final int hashCode() {
        return this.f209929a.hashCode();
    }
}
