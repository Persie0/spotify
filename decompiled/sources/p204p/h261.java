package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h261 {

    /* JADX INFO: renamed from: a */
    public final String f86916a;

    public /* synthetic */ h261(String str) {
        this.f86916a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ h261 m46482a(String str) {
        return new h261(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h261) {
            return wj50.m88271j(this.f86916a, ((h261) obj).f86916a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f86916a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("SuggestionTriggerId(value=", this.f86916a, ")");
    }
}
