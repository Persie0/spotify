package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zai implements gbi {

    /* JADX INFO: renamed from: a */
    public final String f281073a;

    public zai(String str) {
        this.f281073a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zai) && wj50.m88271j(this.f281073a, ((zai) obj).f281073a);
    }

    public final int hashCode() {
        return this.f281073a.hashCode();
    }
}
