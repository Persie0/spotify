package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bfw implements hfw {

    /* JADX INFO: renamed from: a */
    public final String f26796a;

    public bfw(String str) {
        this.f26796a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfw) && wj50.m88271j(this.f26796a, ((bfw) obj).f26796a);
    }

    public final int hashCode() {
        return this.f26796a.hashCode();
    }
}
