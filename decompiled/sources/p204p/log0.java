package p204p;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class log0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59562a(int i) {
        switch (i) {
            case 1:
                return "already_redeemed";
            case 2:
                return "input";
            case 3:
                return "invalid_code";
            case 4:
                return "loading";
            case 5:
                return "success";
            case 6:
                return "unable_to_verify";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59563b(int i) {
        if (i == 1) {
            return "card";
        }
        if (i == 2) {
            return "photo_id";
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59564c(int i) {
        if (i == 1) {
            return "manual_login";
        }
        if (i == 2) {
            return "qr_code_login";
        }
        throw null;
    }
}
