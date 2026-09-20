package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q330 implements u330 {

    /* JADX INFO: renamed from: a */
    public final String f184783a;

    public q330(String str) {
        this.f184783a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q330) && wj50.m88271j(this.f184783a, ((q330) obj).f184783a);
    }

    public final int hashCode() {
        return this.f184783a.hashCode();
    }
}
