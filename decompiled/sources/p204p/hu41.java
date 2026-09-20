package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hu41 implements tu41 {

    /* JADX INFO: renamed from: a */
    public final String f95283a;

    public hu41(String str) {
        this.f95283a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu41) && wj50.m88271j(this.f95283a, ((hu41) obj).f95283a);
    }

    public final int hashCode() {
        return this.f95283a.hashCode();
    }
}
