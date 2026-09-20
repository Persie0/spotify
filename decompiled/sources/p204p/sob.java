package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sob {

    /* JADX INFO: renamed from: a */
    public final String f211157a;

    public sob(String str) {
        this.f211157a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sob) && wj50.m88271j(this.f211157a, ((sob) obj).f211157a);
    }

    public final int hashCode() {
        return this.f211157a.hashCode();
    }
}
