package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class di30 implements ei30 {

    /* JADX INFO: renamed from: a */
    public final String f49228a;

    public di30(String str) {
        this.f49228a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof di30) && wj50.m88271j(this.f49228a, ((di30) obj).f49228a);
    }

    public final int hashCode() {
        return this.f49228a.hashCode();
    }
}
