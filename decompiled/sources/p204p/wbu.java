package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wbu extends zbu {

    /* JADX INFO: renamed from: a */
    public final String f249853a;

    public wbu(String str) {
        this.f249853a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wbu) && wj50.m88271j(this.f249853a, ((wbu) obj).f249853a);
    }

    public final int hashCode() {
        return this.f249853a.hashCode();
    }
}
