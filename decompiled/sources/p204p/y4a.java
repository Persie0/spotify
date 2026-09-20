package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class y4a {

    /* JADX INFO: renamed from: a */
    public final String f269109a;

    /* JADX INFO: renamed from: b */
    public final boolean f269110b;

    public y4a(String str, boolean z) {
        this.f269109a = str;
        this.f269110b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4a)) {
            return false;
        }
        y4a y4aVar = (y4a) obj;
        return wj50.m88271j(this.f269109a, y4aVar.f269109a) && this.f269110b == y4aVar.f269110b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269110b) + (this.f269109a.hashCode() * 31);
    }
}
