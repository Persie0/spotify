package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qsi implements rsi {

    /* JADX INFO: renamed from: a */
    public final String f192106a;

    public qsi(String str) {
        this.f192106a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qsi) && wj50.m88271j(this.f192106a, ((qsi) obj).f192106a);
    }

    public final int hashCode() {
        return this.f192106a.hashCode();
    }
}
