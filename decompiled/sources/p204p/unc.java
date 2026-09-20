package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class unc {

    /* JADX INFO: renamed from: b */
    public static final tnc f232138b = new tnc();

    /* JADX INFO: renamed from: a */
    public final Object f232139a;

    public /* synthetic */ unc(Object obj) {
        this.f232139a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ unc m83543a(Object obj) {
        return new unc(obj);
    }

    /* JADX INFO: renamed from: b */
    public static final Throwable m83544b(Object obj) {
        snc sncVar = obj instanceof snc ? (snc) obj : null;
        if (sncVar != null) {
            return sncVar.f210878a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m83545c(Object obj) {
        if (obj instanceof tnc) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof unc) {
            return wj50.m88271j(this.f232139a, ((unc) obj).f232139a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f232139a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f232139a;
        if (obj instanceof snc) {
            return ((snc) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
