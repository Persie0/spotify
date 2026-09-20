package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t1b0 {

    /* JADX INFO: renamed from: a */
    public final String f216210a;

    public /* synthetic */ t1b0(String str) {
        this.f216210a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1b0) {
            return wj50.m88271j(this.f216210a, ((t1b0) obj).f216210a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f216210a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("LogoutRequest(deviceId=", this.f216210a, ")");
    }
}
