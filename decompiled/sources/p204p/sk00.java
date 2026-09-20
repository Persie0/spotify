package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sk00 extends uk00 {

    /* JADX INFO: renamed from: a */
    public final String f209963a;

    public sk00(String str) {
        this.f209963a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sk00) && wj50.m88271j(this.f209963a, ((sk00) obj).f209963a);
    }

    public final int hashCode() {
        return this.f209963a.hashCode();
    }
}
