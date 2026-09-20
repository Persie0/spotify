package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rms0 implements sms0 {

    /* JADX INFO: renamed from: a */
    public final String f200613a;

    public rms0(String str) {
        this.f200613a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rms0) && wj50.m88271j(this.f200613a, ((rms0) obj).f200613a);
    }

    public final int hashCode() {
        return this.f200613a.hashCode();
    }
}
