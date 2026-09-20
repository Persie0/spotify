package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bme1 {

    /* JADX INFO: renamed from: a */
    public final String f28517a;

    public bme1(String str) {
        this.f28517a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bme1) && wj50.m88271j(this.f28517a, ((bme1) obj).f28517a);
    }

    public final int hashCode() {
        return this.f28517a.hashCode();
    }
}
