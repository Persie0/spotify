package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ndq0 implements pdq0 {

    /* JADX INFO: renamed from: a */
    public final String f152823a;

    public ndq0(String str) {
        this.f152823a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndq0) && wj50.m88271j(this.f152823a, ((ndq0) obj).f152823a);
    }

    public final int hashCode() {
        return this.f152823a.hashCode();
    }
}
