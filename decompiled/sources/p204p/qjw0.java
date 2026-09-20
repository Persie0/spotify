package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qjw0 implements sjw0 {

    /* JADX INFO: renamed from: a */
    public final String f189319a;

    public qjw0(String str) {
        this.f189319a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjw0) && wj50.m88271j(this.f189319a, ((qjw0) obj).f189319a);
    }

    public final int hashCode() {
        return this.f189319a.hashCode();
    }
}
